// Generated by Haxe 4.0.0-rc.3+e3df7a448
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class User extends haxe.lang.HxObject
{
	public User(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public User(haxe.root.Array<haxe.root.Role> roles, java.lang.Object some)
	{
		//line 19 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		haxe.root.User.__hx_ctor__User(this, roles, some);
	}
	
	
	protected static void __hx_ctor__User(haxe.root.User __hx_this, haxe.root.Array<haxe.root.Role> roles, java.lang.Object some)
	{
		//line 20 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		__hx_this.roles = ((java.lang.Object) (new _Array.ArrayIterator<haxe.root.Role>(((haxe.root.Array<haxe.root.Role>) (roles) ))) );
		//line 21 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		__hx_this.some = some;
	}
	
	
	public java.lang.Object roles;
	
	public java.lang.Object some;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		{
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			switch (field.hashCode())
			{
				case 3536116:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("some")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						this.some = ((java.lang.Object) (value) );
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return value;
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
				case 108695229:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("roles")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						this.roles = ((java.lang.Object) (value) );
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return value;
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
			}
			
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		{
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			switch (field.hashCode())
			{
				case 3536116:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("some")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						this.some = ((java.lang.Object) (value) );
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return value;
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
				case 108695229:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("roles")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						this.roles = ((java.lang.Object) (value) );
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return value;
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
			}
			
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		{
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			switch (field.hashCode())
			{
				case 3536116:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("some")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return this.some;
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
				case 108695229:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("roles")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return this.roles;
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
			}
			
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		{
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			switch (field.hashCode())
			{
				case 3536116:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("some")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.some)) );
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
				case 108695229:
				{
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					if (field.equals("roles")) 
					{
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						__temp_executeDef1 = false;
						//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.roles)) );
					}
					
					//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
					break;
				}
				
				
			}
			
			//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		baseArr.push("some");
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		baseArr.push("roles");
		//line 14 "d:\\Workspace\\CraxeExamples\\Iterators\\src\\IteratorsTest.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


