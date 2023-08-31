package OOP

class Intro {
    private var a=100;
    private var b=200.100;

    fun getA():Int{
        return a;
    }
    fun getB():Double{
        return b;
    }

}

fun main() {
    val intro=Intro();
    println(intro.getA())
    println(intro.getB());
}