package com.example.basics

fun testing() {
    var test1 : Test1 = Test1(1, "t1")
//        test1.t1 = // can not be reassigned
    test1.t2="t2"
    print(test1)
    var test2 : Test2 = Test2(2, "t2")
//        test2.to()
}

data class Test1(val t1 : Int, var t2 : String)
class Test2(t1 : Int, t2 : String)