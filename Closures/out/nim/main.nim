# Generated by Haxe 4.0.0-rc.2+175840a
# Hail to Mighty CRAXE!!!

{.experimental: "codeReordering".}

import nimboot

type 
    User = ref object of RootObj
        name : string
        email : string

    ClosureTest = ref object of RootObj

    ClosureTestStatic = object of RootObj


let ClosureTestStaticInst = ClosureTestStatic()

proc initUser(this:User, name:string, email:string) {.inline.} =
    this.name = name
    this.email = email

proc newUser(name:string, email:string) : User {.inline.} =
    result = User()
    initUser(result, name, email)

proc createAction(this:User, id:int) : proc():string =
    var locgthis = this
    return 
        proc():string = 
            return "" + locgthis.name + "_" + locgthis.email + "_" + id

proc `$`(this:User) : string {.inline.} = 
    result = "User" & $this[]

proc test(this:ClosureTestStatic, v:proc(id:int):string) : string =
    var res = v(33)
    return "Result: " + res

proc main(this:ClosureTestStatic) : void =
    var user = newUser("Batman", "batman@gmail.com")
    var action1 = user.createAction(33)
    var action2 = user.createAction(44)
    var ares1 = action1()
    var ares2 = action2()
    var res = ClosureTestStaticInst.test(
        proc(id:int):string = 
            return "" + ares1 + "_" + ares2
    )
    LogStaticInst.trace(res, "src/ClosureTest.hx", 34, "ClosureTest", "main")

proc `$`(this:ClosureTest) : string {.inline.} = 
    result = "ClosureTest" & $this[]

ClosureTestStaticInst.main()