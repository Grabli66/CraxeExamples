// Generated by Haxe 4.0.0-rc.2+175840a
package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FileInput extends haxe.io.Input
{
	public FileInput(haxe.lang.EmptyObject empty)
	{
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public FileInput(java.io.RandomAccessFile f)
	{
		//line 33 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		sys.io.FileInput.__hx_ctor_sys_io_FileInput(this, f);
	}
	
	
	protected static void __hx_ctor_sys_io_FileInput(sys.io.FileInput __hx_this, java.io.RandomAccessFile f)
	{
		//line 35 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		__hx_this.f = f;
		//line 36 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		__hx_this._eof = false;
	}
	
	
	public java.io.RandomAccessFile f;
	
	public boolean _eof;
	
	public void close()
	{
		//line 41 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		try 
		{
			//line 41 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			this.f.close();
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 41 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 41 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			java.lang.Object e = ( (( catchallException instanceof haxe.lang.HaxeException )) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 41 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			throw haxe.lang.HaxeException.wrap(e);
		}
		
		
	}
	
	
	@Override public int readByte()
	{
		//line 48 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		try 
		{
			//line 48 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			return this.f.readUnsignedByte();
		}
		catch (java.io.EOFException e)
		{
			//line 51 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 52 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			this._eof = true;
			//line 53 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 57 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 57 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
	}
	
	
	@Override public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 63 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		int ret = 0;
		//line 66 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		try 
		{
			//line 66 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			ret = this.f.read(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
		}
		catch (java.io.EOFException e)
		{
			//line 69 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 70 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			this._eof = true;
			//line 71 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 75 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 75 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
		//line 78 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		if (( ret == -1 )) 
		{
			//line 79 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			this._eof = true;
			//line 80 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 83 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		return ret;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		{
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			switch (field.hashCode())
			{
				case 2930749:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("_eof")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						this._eof = haxe.lang.Runtime.toBool(((java.lang.Boolean) (value) ));
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return value;
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
				case 102:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("f")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						this.f = ((java.io.RandomAccessFile) (value) );
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return value;
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		{
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			switch (field.hashCode())
			{
				case -1140063115:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("readBytes")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
				case 102:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("f")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return this.f;
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("readByte")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
				case 2930749:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("_eof")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return this._eof;
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("close")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		{
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			int __temp_hash2 = field.hashCode();
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			switch (__temp_hash2)
			{
				case -1140063115:
				case -868060226:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (( (( ( __temp_hash2 == -1140063115 ) && field.equals("readBytes") )) || field.equals("readByte") )) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					if (field.equals("close")) 
					{
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
						this.close();
					}
					
					//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		baseArr.push("_eof");
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		baseArr.push("f");
		//line 30 "/home/grabli66/haxe/std/java/_std/sys/io/FileInput.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


