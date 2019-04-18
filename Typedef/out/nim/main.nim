# Generated by Haxe 4.0.0-rc.2+175840a
# Hail to Mighty CRAXE!!!

{.experimental: "codeReordering".}

import nimboot

type 
    User = ref object of RootObj
        email:string
        id:int
        name:string

    UserAnon = object
        obj:ref RootObj
        email:ptr string
        id:ptr int
        name:ptr string

template toUserAnon(this:User):UserAnon =
    UserAnon(obj:this, email:addr this.email, id:addr this.id, name:addr this.name)

type 
    TypedefTest = ref object of RootObj

    TypedefTestStatic = object of RootObj


let TypedefTestStaticInst = TypedefTestStatic()

proc main(this:TypedefTestStatic) : void =
    var admin = toUserAnon(User(id:33, name:"Batman", email:"batman@batman.com"))
    var arr = newHaxeArray[UserAnon]()
    discard arr.push(admin)
    discard arr.push(toUserAnon(User(email:"good", id:11, name:"GOOD")))
    LogStaticInst.trace(arr, "src/TypedefTest.hx", 24, "TypedefTest", "main")

proc `$`(this:TypedefTest) : string {.inline.} = 
    result = "TypedefTest" & $this[]

TypedefTestStaticInst.main()