// Generated by Haxe 4.0.0-rc.2+175840a
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BrainFuck extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		{
			//line 1 "?"
			haxe.root.BrainFuck.main();
		}
	}
	
	public BrainFuck(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BrainFuck()
	{
		//line 95 "/home/grabli66/Workspace/CraxeExamples/BrainFuck/src/BrainFuck.hx"
		haxe.root.BrainFuck.__hx_ctor__BrainFuck(this);
	}
	
	
	protected static void __hx_ctor__BrainFuck(haxe.root.BrainFuck __hx_this)
	{
	}
	
	
	public static void main()
	{
		//line 97 "/home/grabli66/Workspace/CraxeExamples/BrainFuck/src/BrainFuck.hx"
		java.lang.String text = sys.io.File.getContent("code.b");
		//line 98 "/home/grabli66/Workspace/CraxeExamples/BrainFuck/src/BrainFuck.hx"
		haxe.root.Program program = new haxe.root.Program(haxe.lang.Runtime.toString(text));
		//line 99 "/home/grabli66/Workspace/CraxeExamples/BrainFuck/src/BrainFuck.hx"
		program.run();
	}
	
	
}

