# Generated by Haxe 4.0.0-rc.2+175840a
# Hail to Mighty CRAXE!!!

{.experimental: "codeReordering".}

import nimboot

type 
    IUser = tuple[
        obj : ref RootObj, 
        name : ptr string, 
        getKey : proc () : string
    ]

converter toIUser(this:ServiceUser) : IUser = 
    return (
        obj: this, 
        name : addr this.name, 
        getKey : proc () : string = this.getKey()
    )


type 
    ServiceUser = ref object of RootObj
        name : string

    Interfaces = ref object of RootObj

    InterfacesStatic = object of RootObj


let InterfacesStaticInst = InterfacesStatic()

proc initServiceUser(this:ServiceUser) {.inline.} =
    discard

proc newServiceUser() : ServiceUser {.inline.} =
    result = ServiceUser()
    initServiceUser(result)

proc getKey(this:ServiceUser) : string =
    return "12345"

proc `$`(this:ServiceUser) : string {.inline.} = 
    result = "ServiceUser" & $this[]

proc processUser(this:InterfacesStatic, user:IUser) : void =
    var key = user.getKey()
    LogStaticInst.trace(key, "src/Interfaces.hx", 19, "Interfaces", "processUser")
    LogStaticInst.trace(user.name[], "src/Interfaces.hx", 20, "Interfaces", "processUser")

proc main(this:InterfacesStatic) : void =
    var user = newServiceUser()
    InterfacesStaticInst.processUser(user)

proc `$`(this:Interfaces) : string {.inline.} = 
    result = "Interfaces" & $this[]

InterfacesStaticInst.main()