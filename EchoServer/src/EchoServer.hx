import AsyncSocket.Port;

class EchoServer {
	static function handleClient(client:AsyncSocket) {
		client.recvLine().addCallback((c -> {
			var dat = c.read();
			if (dat.length < 1)
				return;

			trace(dat);
			client.send(${dat});
			handleClient(client);
		}));
	}

	static function accept(server:AsyncSocket) {
		server.accept().addCallback(s -> {
			var client = s.read();
			accept(server);
			handleClient(client);
		});
	}

	public static function main() {
		var sock = AsyncSocket.create();
		sock.bindAddr(new Port(26301));
		sock.listen();
		accept(sock);

		AsyncDispatch.runForever();
	}
}
