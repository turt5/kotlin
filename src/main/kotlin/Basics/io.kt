package Basics

import java.util.Scanner

fun main() {
//    println("==========Welcome==========")
    println("Enter two int numbers seperated by Line:");
    val intNum= readln().toInt();
    val intNum2= readln().toInt();


    println(intNum);
    println(intNum2);

    // alternative ways:

    val sc=Scanner(System.`in`);

    println("Enter a double num: ");
    val dn=sc.nextDouble();

    println(dn);

}