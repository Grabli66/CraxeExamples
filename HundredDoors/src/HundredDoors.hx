class HundredDoors {		
	static public function main() {
		findOpenLockers(100);
	}

	static function findOpenLockers(n:Int) {
		var i = 1;

		while ((i * i) <= n) {
			trace(i * i);
			i++;
		}
	}	
}
