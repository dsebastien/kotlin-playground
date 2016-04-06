package be.dsebastien.kotlin.helloworld01

// variables can be defined here

// read-only variables
val a: Int = 1;
val b = 2; // inferred type
val helloMessage: String = "Hello string";
val c = 1;

// mutable variable
var d = 5;

fun main(args: Array<String>) {
    println(a);
    println(b);
    println(helloMessage);

    // not allowed, a is read-only (val)
    // a = 2;

    d = 10;
}
