// Generated by Haxe 4.0.0-rc.2+175840a
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Log extends haxe.lang.HxObject
{
	static
	{
		//line 60 "/home/grabli66/haxe/std/haxe/Log.hx"
		haxe.Log.trace = ( (( haxe.Log_Anon_60__Fun.__hx_current != null )) ? (haxe.Log_Anon_60__Fun.__hx_current) : (haxe.Log_Anon_60__Fun.__hx_current = ((haxe.Log_Anon_60__Fun) (new haxe.Log_Anon_60__Fun()) )) );
	}
	
	public Log(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Log()
	{
		//line 28 "/home/grabli66/haxe/std/haxe/Log.hx"
		haxe.Log.__hx_ctor_haxe_Log(this);
	}
	
	
	protected static void __hx_ctor_haxe_Log(haxe.Log __hx_this)
	{
	}
	
	
	public static java.lang.String formatOutput(java.lang.Object v, java.lang.Object infos)
	{
		//line 34 "/home/grabli66/haxe/std/haxe/Log.hx"
		java.lang.String str = haxe.root.Std.string(v);
		//line 35 "/home/grabli66/haxe/std/haxe/Log.hx"
		if (( infos == null )) 
		{
			//line 36 "/home/grabli66/haxe/std/haxe/Log.hx"
			return str;
		}
		
		//line 37 "/home/grabli66/haxe/std/haxe/Log.hx"
		java.lang.String pstr = ( ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(infos, "fileName", true)) + ":" ) + ((int) (haxe.lang.Runtime.getField_f(infos, "lineNumber", true)) ) );
		//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
		if (( ( ! (( infos == null )) ) && ( ((haxe.root.Array) (haxe.lang.Runtime.getField(infos, "customParams", true)) ) != null ) )) 
		{
			//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
			int _g = 0;
			//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
			haxe.root.Array _g1 = ((haxe.root.Array) (haxe.lang.Runtime.getField(infos, "customParams", true)) );
			//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
			while (( _g < _g1.length ))
			{
				//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
				java.lang.Object v1 = _g1.__get(_g);
				//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
				 ++ _g;
				//line 38 "/home/grabli66/haxe/std/haxe/Log.hx"
				str += ( ", " + haxe.root.Std.string(v1) );
			}
			
		}
		
		//line 39 "/home/grabli66/haxe/std/haxe/Log.hx"
		return ( ( pstr + ": " ) + str );
	}
	
	
	public static haxe.lang.Function trace;
	
}

