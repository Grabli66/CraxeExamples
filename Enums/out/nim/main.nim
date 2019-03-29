# Generated by Haxe 4.0.0-rc.2+175840a
# Hail to Mighty CRAXE!!!

{.experimental: "codeReordering".}

import nimboot

type 
    EnumTest = ref object of RootObj


type 
    MyValueSome = object of HaxeEnum
        v : int
        s : string
        arg : HaxeArray[int]

    MyValueNone = object of HaxeEnum

    MyValueInt = object of HaxeEnum
        v : int

    MyValueFloat = object of HaxeEnum
        v : float


proc newMyValueSome(v:int, s:string, arg:HaxeArray[int]) : MyValueSome {.inline.} =
    MyValueSome(index: 3, tag: "MyValueSome", v: v, s: s, arg: arg)

proc newMyValueNone() : MyValueNone {.inline.} =
    MyValueNone(index: 0, tag: "MyValueNone")

proc newMyValueInt(v:int) : MyValueInt {.inline.} =
    MyValueInt(index: 1, tag: "MyValueInt", v: v)

proc newMyValueFloat(v:float) : MyValueFloat {.inline.} =
    MyValueFloat(index: 2, tag: "MyValueFloat", v: v)

