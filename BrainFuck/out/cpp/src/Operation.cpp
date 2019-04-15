// Generated by Haxe 4.0.0-rc.2+175840a
#include <hxcpp.h>

#ifndef INCLUDED_Operation
#include <Operation.h>
#endif

::Operation Operation_obj::Inc(int v)
{
	return hx::CreateEnum< Operation_obj >(HX_("Inc",be,c4,37,00),0,1)->_hx_init(0,v);
}

::Operation Operation_obj::Loop(::Array< ::Dynamic> v)
{
	return hx::CreateEnum< Operation_obj >(HX_("Loop",84,d2,90,32),3,1)->_hx_init(0,v);
}

::Operation Operation_obj::Move(int v)
{
	return hx::CreateEnum< Operation_obj >(HX_("Move",31,0f,3a,33),1,1)->_hx_init(0,v);
}

::Operation Operation_obj::Print;

bool Operation_obj::__GetStatic(const ::String &inName, ::Dynamic &outValue, hx::PropertyAccess inCallProp)
{
	if (inName==HX_("Inc",be,c4,37,00)) { outValue = Operation_obj::Inc_dyn(); return true; }
	if (inName==HX_("Loop",84,d2,90,32)) { outValue = Operation_obj::Loop_dyn(); return true; }
	if (inName==HX_("Move",31,0f,3a,33)) { outValue = Operation_obj::Move_dyn(); return true; }
	if (inName==HX_("Print",0d,c8,b8,5b)) { outValue = Operation_obj::Print; return true; }
	return super::__GetStatic(inName, outValue, inCallProp);
}

HX_DEFINE_CREATE_ENUM(Operation_obj)

int Operation_obj::__FindIndex(::String inName)
{
	if (inName==HX_("Inc",be,c4,37,00)) return 0;
	if (inName==HX_("Loop",84,d2,90,32)) return 3;
	if (inName==HX_("Move",31,0f,3a,33)) return 1;
	if (inName==HX_("Print",0d,c8,b8,5b)) return 2;
	return super::__FindIndex(inName);
}

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Operation_obj,Inc,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Operation_obj,Loop,return)

STATIC_HX_DEFINE_DYNAMIC_FUNC1(Operation_obj,Move,return)

int Operation_obj::__FindArgCount(::String inName)
{
	if (inName==HX_("Inc",be,c4,37,00)) return 1;
	if (inName==HX_("Loop",84,d2,90,32)) return 1;
	if (inName==HX_("Move",31,0f,3a,33)) return 1;
	if (inName==HX_("Print",0d,c8,b8,5b)) return 0;
	return super::__FindArgCount(inName);
}

hx::Val Operation_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	if (inName==HX_("Inc",be,c4,37,00)) return Inc_dyn();
	if (inName==HX_("Loop",84,d2,90,32)) return Loop_dyn();
	if (inName==HX_("Move",31,0f,3a,33)) return Move_dyn();
	if (inName==HX_("Print",0d,c8,b8,5b)) return Print;
	return super::__Field(inName,inCallProp);
}

static ::String Operation_obj_sStaticFields[] = {
	HX_("Inc",be,c4,37,00),
	HX_("Move",31,0f,3a,33),
	HX_("Print",0d,c8,b8,5b),
	HX_("Loop",84,d2,90,32),
	::String(null())
};

hx::Class Operation_obj::__mClass;

Dynamic __Create_Operation_obj() { return new Operation_obj; }

void Operation_obj::__register()
{

hx::Static(__mClass) = hx::_hx_RegisterClass(HX_("Operation",07,64,13,42), hx::TCanCast< Operation_obj >,Operation_obj_sStaticFields,0,
	&__Create_Operation_obj, &__Create,
	&super::__SGetClass(), &CreateOperation_obj, 0
#ifdef HXCPP_VISIT_ALLOCS
    , 0
#endif
#ifdef HXCPP_SCRIPTABLE
    , 0
#endif
);
	__mClass->mGetStaticField = &Operation_obj::__GetStatic;
}

void Operation_obj::__boot()
{
Print = hx::CreateConstEnum< Operation_obj >(HX_("Print",0d,c8,b8,5b),2);
}


