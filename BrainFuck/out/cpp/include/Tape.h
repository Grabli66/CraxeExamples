// Generated by Haxe 4.0.0-rc.2+175840a
#ifndef INCLUDED_Tape
#define INCLUDED_Tape

#ifndef HXCPP_H
#include <hxcpp.h>
#endif

HX_DECLARE_CLASS0(Tape)
HX_DECLARE_CLASS2(haxe,io,Bytes)



class HXCPP_CLASS_ATTRIBUTES Tape_obj : public hx::Object
{
	public:
		typedef hx::Object super;
		typedef Tape_obj OBJ_;
		Tape_obj();

	public:
		enum { _hx_ClassId = 0x37cfe8c2 };

		void __construct();
		inline void *operator new(size_t inSize, bool inContainer=true,const char *inName="Tape")
			{ return hx::Object::operator new(inSize,inContainer,inName); }
		inline void *operator new(size_t inSize, int extra)
			{ return hx::Object::operator new(inSize+extra,true,"Tape"); }
		static hx::ObjectPtr< Tape_obj > __new();
		static hx::ObjectPtr< Tape_obj > __alloc(hx::Ctx *_hx_ctx);
		static void * _hx_vtable;
		static Dynamic __CreateEmpty();
		static Dynamic __Create(hx::DynamicArray inArgs);
		//~Tape_obj();

		HX_DO_RTTI_ALL;
		hx::Val __Field(const ::String &inString, hx::PropertyAccess inCallProp);
		hx::Val __SetField(const ::String &inString,const hx::Val &inValue, hx::PropertyAccess inCallProp);
		void __GetFields(Array< ::String> &outFields);
		static void __register();
		void __Mark(HX_MARK_PARAMS);
		void __Visit(HX_VISIT_PARAMS);
		bool _hx_isInstanceOf(int inClassId);
		::String __ToString() const { return HX_("Tape",c2,e8,cf,37); }

		int pos;
		 ::haxe::io::Bytes tape;
		int get();
		::Dynamic get_dyn();

		void inc(int x);
		::Dynamic inc_dyn();

		void move(int x);
		::Dynamic move_dyn();

};


#endif /* INCLUDED_Tape */ 
