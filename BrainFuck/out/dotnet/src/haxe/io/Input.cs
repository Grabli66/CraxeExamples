// Generated by Haxe 4.0.0-rc.2+175840a

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.io {
	public class Input : global::haxe.lang.HxObject {
		
		public Input(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Input() {
			global::haxe.io.Input.__hx_ctor_haxe_io_Input(this);
		}
		
		
		protected static void __hx_ctor_haxe_io_Input(global::haxe.io.Input __hx_this) {
		}
		
		
		public virtual int readByte() {
			throw global::haxe.lang.HaxeException.wrap("Not implemented");
		}
		
		
		public virtual int readBytes(global::haxe.io.Bytes s, int pos, int len) {
			int k = len;
			byte[] b = s.b;
			if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) {
				throw global::haxe.lang.HaxeException.wrap(global::haxe.io.Error.OutsideBounds);
			}
			
			try {
				while (( k > 0 )) {
					b[pos] = ((byte) (this.readByte()) );
					 ++ pos;
					 -- k;
				}
				
			}
			catch (global::System.Exception catchallException){
				global::haxe.lang.Exceptions.exception = catchallException;
				object realException = ( (( catchallException is global::haxe.lang.HaxeException )) ? (((global::haxe.lang.HaxeException) (catchallException) ).obj) : ((object) (catchallException) ) );
				if (( realException is global::haxe.io.Eof )) {
					global::haxe.io.Eof eof = ((global::haxe.io.Eof) (realException) );
				}
				else {
					throw;
				}
				
			}
			
			
			return ( len - k );
		}
		
		
		public virtual global::haxe.io.Bytes readAll(global::haxe.lang.Null<int> bufsize) {
			unchecked {
				if ( ! (bufsize.hasValue) ) {
					bufsize = new global::haxe.lang.Null<int>(16384, true);
				}
				
				global::haxe.io.Bytes buf = global::haxe.io.Bytes.alloc((bufsize).@value);
				global::haxe.io.BytesBuffer total = new global::haxe.io.BytesBuffer();
				try {
					while (true) {
						int len = this.readBytes(buf, 0, (bufsize).@value);
						if (( len == 0 )) {
							throw global::haxe.lang.HaxeException.wrap(global::haxe.io.Error.Blocked);
						}
						
						{
							if (( ( len < 0 ) || ( len > buf.length ) )) {
								throw global::haxe.lang.HaxeException.wrap(global::haxe.io.Error.OutsideBounds);
							}
							
							( total.b as global::System.IO.Stream ).Write(((byte[]) (buf.b) ), ((int) (0) ), ((int) (len) ));
						}
						
					}
					
				}
				catch (global::System.Exception catchallException){
					global::haxe.lang.Exceptions.exception = catchallException;
					object realException = ( (( catchallException is global::haxe.lang.HaxeException )) ? (((global::haxe.lang.HaxeException) (catchallException) ).obj) : ((object) (catchallException) ) );
					if (( realException is global::haxe.io.Eof )) {
						global::haxe.io.Eof e = ((global::haxe.io.Eof) (realException) );
					}
					else {
						throw;
					}
					
				}
				
				
				return total.getBytes();
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 46374763:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readAll", 46374763)) );
					}
					
					
					case 243225909:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readBytes", 243225909)) );
					}
					
					
					case 1763375486:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "readByte", 1763375486)) );
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, object[] dynargs) {
			unchecked {
				switch (hash) {
					case 46374763:
					{
						return this.readAll(global::haxe.lang.Null<object>.ofDynamic<int>(dynargs[0]));
					}
					
					
					case 243225909:
					{
						return this.readBytes(((global::haxe.io.Bytes) (dynargs[0]) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[1])) ), ((int) (global::haxe.lang.Runtime.toInt(dynargs[2])) ));
					}
					
					
					case 1763375486:
					{
						return this.readByte();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
			}
		}
		
		
	}
}


