// Generated by Haxe 4.0.0-rc.2+175840a

#pragma warning disable 109, 114, 219, 429, 168, 162
public class Type : global::haxe.lang.HxObject {
	
	public Type(global::haxe.lang.EmptyObject empty) {
	}
	
	
	public Type() {
		global::Type.__hx_ctor__Type(this);
	}
	
	
	protected static void __hx_ctor__Type(global::Type __hx_this) {
	}
	
	
	public static global::Array<object> getClassFields(global::System.Type c) {
		if (global::System.Object.ReferenceEquals(((object) (c) ), ((object) (typeof(string)) ))) {
			return new global::Array<object>(new object[]{"fromCharCode"});
		}
		
		global::Array<object> ret = new global::Array<object>(new object[]{});
		global::System.Reflection.BindingFlags this1 = global::System.Reflection.BindingFlags.Public;
		global::System.Reflection.BindingFlags this2 = ((global::System.Reflection.BindingFlags) (( ((global::System.Reflection.BindingFlags) (this1) ) | ((global::System.Reflection.BindingFlags) (global::System.Reflection.BindingFlags.Static) ) )) );
		global::System.Reflection.MemberInfo[] infos = ((global::System.Type) (c) ).GetMembers(((global::System.Reflection.BindingFlags) (this2) ));
		{
			int _g = 0;
			int _g1 = ( infos as global::System.Array ).Length;
			while (( _g < _g1 )) {
				int i = _g++;
				string name = infos[i].Name;
				if ( ! (name.StartsWith("__hx_")) ) {
					ret.push(name);
				}
				
			}
			
		}
		
		return ret;
	}
	
	
	public static bool enumEq<T>(T a, T b) {
		if (global::haxe.lang.Runtime.eq(a, default(T))) {
			return global::haxe.lang.Runtime.eq(b, default(T));
		}
		else if (global::haxe.lang.Runtime.eq(b, default(T))) {
			return false;
		}
		else {
			return a.Equals(b);
		}
		
	}
	
	
	public static int enumIndex(object e) {
		if (( e is global::System.Enum )) {
			global::System.Array values = global::System.Enum.GetValues(((global::System.Type) (((object) (e) ).GetType()) ));
			return global::System.Array.IndexOf(((global::System.Array) (values) ), ((object) (e) ));
		}
		else {
			return (((global::haxe.lang.Enum) (e) ))._hx_index;
		}
		
	}
	
	
}

