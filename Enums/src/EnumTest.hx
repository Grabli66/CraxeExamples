enum MyValue {
	Int(v:Int);
	Float(v:Float);
	Some(v:Int, s:String, arg:Array<Int>);
}

class EnumTest {
	public static function main() {
		var value = MyValue.Int(33);
		trace(value);		
	}
}
