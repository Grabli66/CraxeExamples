// Generated by Haxe 4.0.0-rc.2+175840a
#include <hxcpp.h>

#ifndef INCLUDED_Std
#include <Std.h>
#endif
#ifndef INCLUDED_TypedefTest
#include <TypedefTest.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif

HX_LOCAL_STACK_FRAME(_hx_pos_c4ce5d24597ecc98_21_test,"TypedefTest","test",0x3cc50943,"TypedefTest.test","TypedefTest.hx",21,0x1fc4cdc1)
HX_LOCAL_STACK_FRAME(_hx_pos_c4ce5d24597ecc98_26_main,"TypedefTest","main",0x3821792a,"TypedefTest.main","TypedefTest.hx",26,0x1fc4cdc1)

void TypedefTest_obj::__construct() { }

Dynamic TypedefTest_obj::__CreateEmpty() { return new TypedefTest_obj; }

void *TypedefTest_obj::_hx_vtable = 0;

Dynamic TypedefTest_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< TypedefTest_obj > _hx_result = new TypedefTest_obj();
	_hx_result->__construct();
	return _hx_result;
}

bool TypedefTest_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x48999739;
}

void TypedefTest_obj::test(::Array< ::Dynamic> arr){
            	HX_STACKFRAME(&_hx_pos_c4ce5d24597ecc98_21_test)
HXDLIN(  21)		int _g = 0;
HXDLIN(  21)		while((_g < arr->length)){
HXDLIN(  21)			 ::Dynamic it = arr->__get(_g);
HXDLIN(  21)			_g = (_g + 1);
HXLINE(  22)			::haxe::Log_obj::trace( ::Dynamic(it->__Field(HX_("name",4b,72,ff,48),hx::paccDynamic)),hx::SourceInfo(HX_("src/TypedefTest.hx",cc,db,0e,15),22,HX_("TypedefTest",1d,c5,d2,99),HX_("test",52,c8,f9,4c)));
            		}
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(TypedefTest_obj,test,(void))

void TypedefTest_obj::main(){
            	HX_STACKFRAME(&_hx_pos_c4ce5d24597ecc98_26_main)
HXLINE(  46)		::Array< ::Dynamic> arr = ::Array_obj< ::Dynamic>::__new();
HXLINE(  47)		{
HXLINE(  47)			int _g = 0;
HXDLIN(  47)			while((_g < 1000000)){
HXLINE(  47)				_g = (_g + 1);
HXDLIN(  47)				int i = (_g - 1);
HXLINE(  50)				::String _hx_tmp = (::Std_obj::string(i) + HX_("GOOD",3d,5d,2a,2f));
HXLINE(  48)				arr->push( ::Dynamic(hx::Anon_obj::Create(3)
            					->setFixed(0,HX_("id",db,5b,00,00),i)
            					->setFixed(1,HX_("name",4b,72,ff,48),_hx_tmp)
            					->setFixed(2,HX_("email",1c,cf,ce,6f),(::Std_obj::string(i) + HX_("batman",e5,6b,d7,55)))));
            			}
            		}
HXLINE(  55)		 ::Dynamic s = arr->__get(100);
HXLINE(  56)		::haxe::Log_obj::trace( ::Dynamic(s->__Field(HX_("id",db,5b,00,00),hx::paccDynamic)),hx::SourceInfo(HX_("src/TypedefTest.hx",cc,db,0e,15),56,HX_("TypedefTest",1d,c5,d2,99),HX_("main",39,38,56,48)));
HXLINE(  58)		::haxe::Log_obj::trace(arr->length,hx::SourceInfo(HX_("src/TypedefTest.hx",cc,db,0e,15),58,HX_("TypedefTest",1d,c5,d2,99),HX_("main",39,38,56,48)));
            	}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(TypedefTest_obj,main,(void))


TypedefTest_obj::TypedefTest_obj()
{
}

bool TypedefTest_obj::__GetStatic(const ::String &inName, Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 4:
		if (HX_FIELD_EQ(inName,"test") ) { outValue = test_dyn(); return true; }
		if (HX_FIELD_EQ(inName,"main") ) { outValue = main_dyn(); return true; }
	}
	return false;
}

#ifdef HXCPP_SCRIPTABLE
static hx::StorageInfo *TypedefTest_obj_sMemberStorageInfo = 0;
static hx::StaticInfo *TypedefTest_obj_sStaticStorageInfo = 0;
#endif

hx::Class TypedefTest_obj::__mClass;

static ::String TypedefTest_obj_sStaticFields[] = {
	HX_("test",52,c8,f9,4c),
	HX_("main",39,38,56,48),
	::String(null())
};

void TypedefTest_obj::__register()
{
	TypedefTest_obj _hx_dummy;
	TypedefTest_obj::_hx_vtable = *(void **)&_hx_dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_("TypedefTest",1d,c5,d2,99);
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &TypedefTest_obj::__GetStatic;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mStatics = hx::Class_obj::dupFunctions(TypedefTest_obj_sStaticFields);
	__mClass->mMembers = hx::Class_obj::dupFunctions(0 /* sMemberFields */);
	__mClass->mCanCast = hx::TCanCast< TypedefTest_obj >;
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = TypedefTest_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = TypedefTest_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}
