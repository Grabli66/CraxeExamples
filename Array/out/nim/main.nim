# Generated by Haxe 4.0.0-rc.2+175840a
# Hail to Mighty CRAXE!!!

{.experimental: "codeReordering".}

import nimboot

type 
    MyType = ref object of RootObj
        id : int
        name : string

    ArrayTest = ref object of RootObj

    ArrayTestStatic = ref object of RootObj

let ArrayTestStaticInst = ArrayTestStatic()

proc newMyType(id:int, name:string) : MyType {.inline.} =
    let this = MyType()
    result = this
    this.id = id
    this.name = name

proc say(this:MyType, text:string) : void =
    LogStaticInst.trace("id: " + this.id + " name: " + this.name + " say: " + text, "src/ArrayTest.hx", 11, "MyType", "say")

proc `$`(this:MyType) : string {.inline.} = 
    result = "MyType" & $this[]

proc main(this:ArrayTestStatic) : void =
    var arr = newHaxeArray[MyType]()
    arr.push(newMyType(1, "Batman"))
    arr.push(newMyType(2, "Superman"))
    var locg = 0
    while locg < arr.length:
        var it = arr.get(locg)
        bpOperator(locg)
        it.say("GOOD")

    var arr1 = @[newMyType(1, "Batman"), newMyType(3, "Superman")]
    LogStaticInst.trace(arr1, "src/ArrayTest.hx", 26, "ArrayTest", "main")
    var arr2 = @[1, 2, 3, 4, 5]
    LogStaticInst.trace(arr2, "src/ArrayTest.hx", 29, "ArrayTest", "main")

proc `$`(this:ArrayTest) : string {.inline.} = 
    result = "ArrayTest" & $this[]

ArrayTestStaticInst.main()