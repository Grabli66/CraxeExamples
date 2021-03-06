typedef User = {
	var id:Int;
	var name:String;
	var email:String;
}

typedef Admin = User & {
	var id:Int;
	var name:String;
	var email:String;
	var level:Int;
}

class ClassUser {
	public var id:Int;
	public var name:String;
	public var email:String;
	public var level:Int;

	public function new(id:Int, name:String, email:String, level:Int) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
}

class TypedefTest {
	static function traceArray(arr:Array<Any>) {
		for (it in arr) {
			trace(cast(it, ClassUser));
		}
	}

	static function testAdmin(adm:Admin) {
		trace(adm.name);
	}

	static function testClassUser(user:ClassUser) {
		trace(user.name);
	}

	static function getArray(size:Int):Array<Any> {
		var arr = new Array<Any>();
		for (i in 0...size) {
			arr.push({
				id: i,
				name: "batman_" + Std.string(i),
				email: "batman@gmail.com" + Std.string(i)
			});
		}
		return arr;
	}

	public static function main() {
		var arr = getArray(1);
		var cls = new ClassUser(1, "Robin", "robin@gmail.com", 33);
		arr.push(cls);
		traceArray(arr);
		testAdmin(cls);	
		var some = arr[1];
		testClassUser(some);
		trace(arr.length);
	}
}
