package Basics

import java.util.Scanner

fun main() {

    val sc=Scanner(System.`in`);
    var a=sc.nextInt();
    var b=sc.nextInt();

    if(a>b){
        println("$a is greater than $b");
    }else println("$b is greater than $a");
}