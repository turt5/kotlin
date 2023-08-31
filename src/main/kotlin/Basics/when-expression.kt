package Basics

import java.util.Scanner

fun main() {
    //when works exactly like switch statements



    val a=12;
    val b=23;

    val sc=Scanner(System.`in`);

    val ch:Char=sc.next()[0];

    val result= when(ch){
        '+' -> a+b
        '-' -> b-a
        '*' -> a*b
        '/' -> b/a

         else -> "Wrong input given";
    }


    println(result);
}