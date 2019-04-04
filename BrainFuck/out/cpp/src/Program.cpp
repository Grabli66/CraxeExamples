// Generated by Haxe 4.0.0-rc.2+175840a
#include <hxcpp.h>

#ifndef INCLUDED_Operation
#include <Operation.h>
#endif
#ifndef INCLUDED_Program
#include <Program.h>
#endif
#ifndef INCLUDED_Tape
#include <Tape.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif
#ifndef INCLUDED_haxe_io_Bytes
#include <haxe/io/Bytes.h>
#endif

HX_DEFINE_STACK_FRAME(_hx_pos_46cf8a9dbef1d247_84_new,"Program","new",0x8f391556,"Program.new","BrainFuck.hx",84,0xb976c171)
HX_LOCAL_STACK_FRAME(_hx_pos_46cf8a9dbef1d247_43_parse,"Program","parse",0xc3ce7ea9,"Program.parse","BrainFuck.hx",43,0xb976c171)
HX_LOCAL_STACK_FRAME(_hx_pos_46cf8a9dbef1d247_69_runInternal,"Program","runInternal",0x3abbf89e,"Program.runInternal","BrainFuck.hx",69,0xb976c171)
HX_LOCAL_STACK_FRAME(_hx_pos_46cf8a9dbef1d247_91_run,"Program","run",0x8f3c2c41,"Program.run","BrainFuck.hx",91,0xb976c171)

void Program_obj::__construct(::String text){
            	HX_STACKFRAME(&_hx_pos_46cf8a9dbef1d247_84_new)
HXLINE(  85)		this->pos = 0;
HXLINE(  86)		this->text = text;
HXLINE(  87)		this->ops = this->parse();
            	}

Dynamic Program_obj::__CreateEmpty() { return new Program_obj; }

void *Program_obj::_hx_vtable = 0;

Dynamic Program_obj::__Create(hx::DynamicArray inArgs)
{
	hx::ObjectPtr< Program_obj > _hx_result = new Program_obj();
	_hx_result->__construct(inArgs[0]);
	return _hx_result;
}

bool Program_obj::_hx_isInstanceOf(int inClassId) {
	return inClassId==(int)0x00000001 || inClassId==(int)0x18ff0680;
}

::Array< ::Dynamic> Program_obj::parse(){
            	HX_STACKFRAME(&_hx_pos_46cf8a9dbef1d247_43_parse)
HXLINE(  44)		::Array< ::Dynamic> res = ::Array_obj< ::Dynamic>::__new();
HXLINE(  45)		while((this->pos < this->text.length)){
HXLINE(  46)			::String c = this->text.charAt(this->pos);
HXLINE(  47)			 ::Program _hx_tmp = hx::ObjectPtr<OBJ_>(this);
HXDLIN(  47)			_hx_tmp->pos = (_hx_tmp->pos + 1);
HXLINE(  48)			::String _hx_switch_0 = c;
            			if (  (_hx_switch_0==HX_("+",2b,00,00,00)) ){
HXLINE(  50)				res->push(::Operation_obj::Inc(1));
HXDLIN(  50)				goto _hx_goto_2;
            			}
            			if (  (_hx_switch_0==HX_("-",2d,00,00,00)) ){
HXLINE(  52)				res->push(::Operation_obj::Inc(-1));
HXDLIN(  52)				goto _hx_goto_2;
            			}
            			if (  (_hx_switch_0==HX_(".",2e,00,00,00)) ){
HXLINE(  58)				res->push(::Operation_obj::Print_dyn());
HXDLIN(  58)				goto _hx_goto_2;
            			}
            			if (  (_hx_switch_0==HX_("<",3c,00,00,00)) ){
HXLINE(  56)				res->push(::Operation_obj::Move(-1));
HXDLIN(  56)				goto _hx_goto_2;
            			}
            			if (  (_hx_switch_0==HX_(">",3e,00,00,00)) ){
HXLINE(  54)				res->push(::Operation_obj::Move(1));
HXDLIN(  54)				goto _hx_goto_2;
            			}
            			if (  (_hx_switch_0==HX_("[",5b,00,00,00)) ){
HXLINE(  60)				res->push(::Operation_obj::Loop(this->parse()));
HXDLIN(  60)				goto _hx_goto_2;
            			}
            			if (  (_hx_switch_0==HX_("]",5d,00,00,00)) ){
HXLINE(  62)				return res;
HXDLIN(  62)				goto _hx_goto_2;
            			}
            			_hx_goto_2:;
            		}
HXLINE(  65)		return res;
            	}


HX_DEFINE_DYNAMIC_FUNC0(Program_obj,parse,return )

void Program_obj::runInternal(::Array< ::Dynamic> operations, ::Tape tape){
            	HX_STACKFRAME(&_hx_pos_46cf8a9dbef1d247_69_runInternal)
HXDLIN(  69)		int _g = 0;
HXDLIN(  69)		while((_g < operations->length)){
HXDLIN(  69)			 ::Operation op = operations->__get(_g).StaticCast<  ::Operation >();
HXDLIN(  69)			_g = (_g + 1);
HXLINE(  70)			switch((int)(op->_hx_getIndex())){
            				case (int)0: {
HXLINE(  71)					int v = op->_hx_getInt(0);
HXLINE(  72)					{
HXLINE(  72)						int b = ( (int)(tape->tape->b->__get(tape->pos)) );
HXDLIN(  72)						b = (b + v);
HXDLIN(  72)						tape->tape->b[tape->pos] = ( (unsigned char)(b) );
            					}
            				}
            				break;
            				case (int)1: {
HXLINE(  73)					int v1 = op->_hx_getInt(0);
HXLINE(  74)					{
HXLINE(  74)						 ::Tape tape1 = tape;
HXDLIN(  74)						tape1->pos = (tape1->pos + v1);
HXDLIN(  74)						while((tape->pos >= tape->tape->length)){
HXLINE(  74)							tape->tape = ::haxe::io::Bytes_obj::alloc((tape->tape->length * 2));
            						}
            					}
            				}
            				break;
            				case (int)2: {
HXLINE(  79)					::haxe::Log_obj::trace(tape->tape->b->__get(tape->pos),hx::SourceInfo(HX_("src/BrainFuck.hx",bc,a6,84,a3),79,HX_("Program",64,72,4a,c1),HX_("runInternal",a8,cd,f7,ea)));
            				}
            				break;
            				case (int)3: {
HXLINE(  75)					::Array< ::Dynamic> v2 = op->_hx_getObject(0).StaticCast< ::Array< ::Dynamic> >();
HXLINE(  76)					while((tape->tape->b->__get(tape->pos) > 0)){
HXLINE(  77)						this->runInternal(v2,tape);
            					}
            				}
            				break;
            			}
            		}
            	}


HX_DEFINE_DYNAMIC_FUNC2(Program_obj,runInternal,(void))

void Program_obj::run(){
            	HX_GC_STACKFRAME(&_hx_pos_46cf8a9dbef1d247_91_run)
HXDLIN(  91)		::Array< ::Dynamic> _hx_tmp = this->ops;
HXDLIN(  91)		this->runInternal(_hx_tmp, ::Tape_obj::__alloc( HX_CTX ));
            	}


HX_DEFINE_DYNAMIC_FUNC0(Program_obj,run,(void))


hx::ObjectPtr< Program_obj > Program_obj::__new(::String text) {
	hx::ObjectPtr< Program_obj > __this = new Program_obj();
	__this->__construct(text);
	return __this;
}

hx::ObjectPtr< Program_obj > Program_obj::__alloc(hx::Ctx *_hx_ctx,::String text) {
	Program_obj *__this = (Program_obj*)(hx::Ctx::alloc(_hx_ctx, sizeof(Program_obj), true, "Program"));
	*(void **)__this = Program_obj::_hx_vtable;
	__this->__construct(text);
	return __this;
}

Program_obj::Program_obj()
{
}

void Program_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Program);
	HX_MARK_MEMBER_NAME(text,"text");
	HX_MARK_MEMBER_NAME(ops,"ops");
	HX_MARK_MEMBER_NAME(pos,"pos");
	HX_MARK_END_CLASS();
}

void Program_obj::__Visit(HX_VISIT_PARAMS)
{
	HX_VISIT_MEMBER_NAME(text,"text");
	HX_VISIT_MEMBER_NAME(ops,"ops");
	HX_VISIT_MEMBER_NAME(pos,"pos");
}

hx::Val Program_obj::__Field(const ::String &inName,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"ops") ) { return hx::Val( ops ); }
		if (HX_FIELD_EQ(inName,"pos") ) { return hx::Val( pos ); }
		if (HX_FIELD_EQ(inName,"run") ) { return hx::Val( run_dyn() ); }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"text") ) { return hx::Val( text ); }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"parse") ) { return hx::Val( parse_dyn() ); }
		break;
	case 11:
		if (HX_FIELD_EQ(inName,"runInternal") ) { return hx::Val( runInternal_dyn() ); }
	}
	return super::__Field(inName,inCallProp);
}

hx::Val Program_obj::__SetField(const ::String &inName,const hx::Val &inValue,hx::PropertyAccess inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"ops") ) { ops=inValue.Cast< ::Array< ::Dynamic> >(); return inValue; }
		if (HX_FIELD_EQ(inName,"pos") ) { pos=inValue.Cast< int >(); return inValue; }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"text") ) { text=inValue.Cast< ::String >(); return inValue; }
	}
	return super::__SetField(inName,inValue,inCallProp);
}

void Program_obj::__GetFields(Array< ::String> &outFields)
{
	outFields->push(HX_("text",ad,cc,f9,4c));
	outFields->push(HX_("ops",32,9c,54,00));
	outFields->push(HX_("pos",94,5d,55,00));
	super::__GetFields(outFields);
};

#ifdef HXCPP_SCRIPTABLE
static hx::StorageInfo Program_obj_sMemberStorageInfo[] = {
	{hx::fsString,(int)offsetof(Program_obj,text),HX_("text",ad,cc,f9,4c)},
	{hx::fsObject /* ::Array< ::Dynamic> */ ,(int)offsetof(Program_obj,ops),HX_("ops",32,9c,54,00)},
	{hx::fsInt,(int)offsetof(Program_obj,pos),HX_("pos",94,5d,55,00)},
	{ hx::fsUnknown, 0, null()}
};
static hx::StaticInfo *Program_obj_sStaticStorageInfo = 0;
#endif

static ::String Program_obj_sMemberFields[] = {
	HX_("text",ad,cc,f9,4c),
	HX_("ops",32,9c,54,00),
	HX_("pos",94,5d,55,00),
	HX_("parse",33,90,55,bd),
	HX_("runInternal",a8,cd,f7,ea),
	HX_("run",4b,e7,56,00),
	::String(null()) };

hx::Class Program_obj::__mClass;

void Program_obj::__register()
{
	Program_obj _hx_dummy;
	Program_obj::_hx_vtable = *(void **)&_hx_dummy;
	hx::Static(__mClass) = new hx::Class_obj();
	__mClass->mName = HX_("Program",64,72,4a,c1);
	__mClass->mSuper = &super::__SGetClass();
	__mClass->mConstructEmpty = &__CreateEmpty;
	__mClass->mConstructArgs = &__Create;
	__mClass->mGetStaticField = &hx::Class_obj::GetNoStaticField;
	__mClass->mSetStaticField = &hx::Class_obj::SetNoStaticField;
	__mClass->mStatics = hx::Class_obj::dupFunctions(0 /* sStaticFields */);
	__mClass->mMembers = hx::Class_obj::dupFunctions(Program_obj_sMemberFields);
	__mClass->mCanCast = hx::TCanCast< Program_obj >;
#ifdef HXCPP_SCRIPTABLE
	__mClass->mMemberStorageInfo = Program_obj_sMemberStorageInfo;
#endif
#ifdef HXCPP_SCRIPTABLE
	__mClass->mStaticStorageInfo = Program_obj_sStaticStorageInfo;
#endif
	hx::_hx_RegisterClass(__mClass->mName, __mClass);
}

