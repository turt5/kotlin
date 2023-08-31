package Basics

fun getAddition(a:Int, b:Int): Int {
    return a+b;
}

fun getGreeting(name:String):String{
    return "Welcome $name"
}

fun main() {
    var a=10;
    var b=22;

    println(getAddition(a,b));
    println(getGreeting("Limon"));
}