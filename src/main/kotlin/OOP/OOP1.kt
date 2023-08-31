package OOP

open class Human(var name: String, var gender: String) {
    override fun toString(): String {
        return "[name='$name', gender='$gender']"
    }
}

class Student(var clss: String, var degree: String, name: String, gender: String) : Human(name, gender) {
    override fun toString():String{
        return "[name='$name', gender='$gender',class='$clss',degree='$degree']"
    }
}
fun main() {
    val x=Human("John Doe","Male");
    println(x);
    val y=Student("Eleven","HSC","Mark","Male") ;
    println(y);
}