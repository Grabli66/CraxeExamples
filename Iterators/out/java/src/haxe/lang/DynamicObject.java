// Generated by Haxe 4.0.0-rc.3+e3df7a448
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DynamicObject extends haxe.lang.HxObject
{
	static
	{
		//line 53 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		haxe.lang.DynamicObject.__hx_toString_depth = 0;
	}
	
	public DynamicObject(haxe.lang.EmptyObject empty)
	{
		//line 42 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public DynamicObject(java.lang.String[] fields, java.lang.Object[] dynamics, java.lang.String[] fields_f, double[] dynamics_f)
	{
		//line 63 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		haxe.lang.DynamicObject.__hx_ctor_haxe_lang_DynamicObject(((haxe.lang.DynamicObject) (this) ), ((java.lang.String[]) (fields) ), ((java.lang.Object[]) (dynamics) ), ((java.lang.String[]) (fields_f) ), ((double[]) (dynamics_f) ));
	}
	
	
	public DynamicObject()
	{
		//line 55 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		haxe.lang.DynamicObject.__hx_ctor_haxe_lang_DynamicObject(((haxe.lang.DynamicObject) (this) ));
	}
	
	
	protected static void __hx_ctor_haxe_lang_DynamicObject(haxe.lang.DynamicObject __hx_this, java.lang.String[] fields, java.lang.Object[] dynamics, java.lang.String[] fields_f, double[] dynamics_f)
	{
		//line 65 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields = fields;
		//line 66 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics = dynamics;
		//line 67 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields_f = fields_f;
		//line 68 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics_f = dynamics_f;
		//line 69 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_length = fields.length;
		//line 70 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_length_f = fields_f.length;
	}
	
	
	protected static void __hx_ctor_haxe_lang_DynamicObject(haxe.lang.DynamicObject __hx_this)
	{
		//line 57 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields = new java.lang.String[0];
		//line 58 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics = new java.lang.Object[0];
		//line 59 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_fields_f = new java.lang.String[0];
		//line 60 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		__hx_this.__hx_dynamics_f = new double[0];
	}
	
	
	public static int __hx_toString_depth;
	
	public java.lang.String[] __hx_fields;
	
	public java.lang.Object[] __hx_dynamics;
	
	public java.lang.String[] __hx_fields_f;
	
	public double[] __hx_dynamics_f;
	
	public int __hx_length;
	
	public int __hx_length_f;
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 75 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 76 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 78 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeString(this.__hx_fields, this.__hx_length, res);
			//line 79 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeDynamic(this.__hx_dynamics, this.__hx_length, res);
			//line 80 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			this.__hx_length--;
			//line 81 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return true;
		}
		
		//line 83 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 84 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res1 >= 0 )) 
		{
			//line 86 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeString(this.__hx_fields_f, this.__hx_length_f, res1);
			//line 87 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			haxe.lang.FieldLookup.removeFloat(this.__hx_dynamics_f, this.__hx_length_f, res1);
			//line 88 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			this.__hx_length_f--;
			//line 89 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return true;
		}
		
		//line 91 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		return false;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 96 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 97 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 99 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics[res];
		}
		
		//line 101 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 102 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 104 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics_f[res];
		}
		
		//line 107 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (isCheck) 
		{
			//line 107 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 107 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return null;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 112 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 113 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 115 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics[res] = value;
		}
		else
		{
			//line 117 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
			//line 118 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			if (( res1 >= 0 )) 
			{
				//line 120 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				if (haxe.lang.Runtime.isDouble(value)) 
				{
					//line 122 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
					return this.__hx_dynamics_f[res1] = ((double) (haxe.lang.Runtime.toDouble(value)) );
				}
				
				//line 125 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeString(this.__hx_fields_f, this.__hx_length_f, res1);
				//line 126 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeFloat(this.__hx_dynamics_f, this.__hx_length_f, res1);
				//line 127 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				this.__hx_length_f--;
			}
			
		}
		
		//line 131 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		this.__hx_fields = haxe.lang.FieldLookup.insertString(this.__hx_fields, this.__hx_length,  ~ (res) , field);
		//line 132 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		this.__hx_dynamics = haxe.lang.FieldLookup.insertDynamic(this.__hx_dynamics, this.__hx_length,  ~ (res) , value);
		//line 133 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		this.__hx_length++;
		//line 134 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		return value;
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 139 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 140 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 142 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics_f[res];
		}
		
		//line 144 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
		//line 145 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 147 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return ((double) (haxe.lang.Runtime.toDouble(this.__hx_dynamics[res])) );
		}
		
		//line 150 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		return 0.0;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 155 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_fields_f, this.__hx_length_f);
		//line 156 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( res >= 0 )) 
		{
			//line 158 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return this.__hx_dynamics_f[res] = value;
		}
		else
		{
			//line 160 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int res1 = haxe.lang.FieldLookup.findHash(field, this.__hx_fields, this.__hx_length);
			//line 161 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			if (( res1 >= 0 )) 
			{
				//line 164 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeString(this.__hx_fields, this.__hx_length, res1);
				//line 165 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				haxe.lang.FieldLookup.removeDynamic(this.__hx_dynamics, this.__hx_length, res1);
				//line 166 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				this.__hx_length--;
			}
			
		}
		
		//line 170 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		this.__hx_fields_f = haxe.lang.FieldLookup.insertString(this.__hx_fields_f, this.__hx_length_f,  ~ (res) , field);
		//line 171 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		this.__hx_dynamics_f = haxe.lang.FieldLookup.insertFloat(this.__hx_dynamics_f, this.__hx_length_f,  ~ (res) , value);
		//line 172 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		this.__hx_length_f++;
		//line 173 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		return value;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 178 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		{
			//line 178 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 178 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int _g1 = this.__hx_length;
			//line 178 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			while (( _g < _g1 ))
			{
				//line 178 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				int i = _g++;
				//line 180 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				baseArr.push(this.__hx_fields[i]);
			}
			
		}
		
		//line 182 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		{
			//line 182 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int _g2 = 0;
			//line 182 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int _g3 = this.__hx_length_f;
			//line 182 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			while (( _g2 < _g3 ))
			{
				//line 182 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				int i1 = _g2++;
				//line 184 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				baseArr.push(this.__hx_fields_f[i1]);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 190 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (haxe.lang.Runtime.valEq(field, "toString")) 
		{
			//line 192 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return this.toString();
		}
		
		//line 194 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		haxe.lang.Function fn = ((haxe.lang.Function) (this.__hx_getField(field, false, false, false)) );
		//line 195 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( fn == null )) 
		{
			//line 197 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			throw haxe.lang.HaxeException.wrap(( ( "Cannot invoke field " + field ) + ": It does not exist" ));
		}
		
		//line 200 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		return fn.__hx_invokeDynamic(dynargs);
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 205 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( haxe.lang.DynamicObject.__hx_toString_depth >= 5 )) 
		{
			//line 206 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return "...";
		}
		
		//line 208 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		 ++ haxe.lang.DynamicObject.__hx_toString_depth;
		//line 209 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		try 
		{
			//line 210 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			java.lang.String s = this.__hx_toString();
			//line 211 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			 -- haxe.lang.DynamicObject.__hx_toString_depth;
			//line 212 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return s;
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 209 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 213 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			java.lang.Object e = ( (( catchallException instanceof haxe.lang.HaxeException )) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 214 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			 -- haxe.lang.DynamicObject.__hx_toString_depth;
			//line 215 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			throw haxe.lang.HaxeException.wrap(e);
		}
		
		
	}
	
	
	public java.lang.String __hx_toString()
	{
		//line 220 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		haxe.lang.Function ts = ((haxe.lang.Function) (this.__hx_getField("toString", false, false, false)) );
		//line 221 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if (( ts != null )) 
		{
			//line 222 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			return haxe.lang.Runtime.toString(ts.__hx_invoke0_o());
		}
		
		//line 223 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 224 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("{"));
		//line 224 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
		//line 225 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		boolean first = true;
		//line 226 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		{
			//line 226 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			int _g = 0;
			//line 226 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(this);
			//line 226 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			while (( _g < _g1.length ))
			{
				//line 226 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				java.lang.String f = _g1.__get(_g);
				//line 226 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				 ++ _g;
				//line 228 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				if (first) 
				{
					//line 229 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
					first = false;
				}
				else
				{
					//line 231 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
					ret.add(haxe.lang.Runtime.toString(","));
					//line 231 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
					java.lang.Object __temp_expr2 = ((java.lang.Object) (null) );
				}
				
				//line 232 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(" "));
				//line 232 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				java.lang.Object __temp_expr3 = ((java.lang.Object) (null) );
				//line 232 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(f));
				//line 232 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				java.lang.Object __temp_expr4 = ((java.lang.Object) (null) );
				//line 233 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				ret.add(haxe.lang.Runtime.toString(" : "));
				//line 233 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				java.lang.Object __temp_expr5 = ((java.lang.Object) (null) );
				//line 234 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				ret.add(((java.lang.Object) (haxe.root.Reflect.field(this, f)) ));
				//line 234 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
				java.lang.Object __temp_expr6 = ((java.lang.Object) (null) );
			}
			
		}
		
		//line 236 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		if ( ! (first) ) 
		{
			//line 236 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			ret.add(haxe.lang.Runtime.toString(" "));
			//line 236 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
			java.lang.Object __temp_expr7 = ((java.lang.Object) (null) );
		}
		
		//line 237 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		ret.add(haxe.lang.Runtime.toString("}"));
		//line 237 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		java.lang.Object __temp_expr8 = ((java.lang.Object) (null) );
		//line 238 "C:\\Users\\VEgorov\\AppData\\Roaming\\haxe\\versions\\4.0.0-rc.3\\std\\java\\internal\\HxObject.hx"
		return ret.toString();
	}
	
	
}


