package be.dsebastien.kotlin.helloworld01

// inferred return type
fun sum(a: Int, b: Int) = a+b; // short declaration

//can't call functions here
//error: expecting a top level declaration
//print sum(5,5);

fun main(args:Array<String>) {
    print(sum(5,6)) // semicolons are optional
}

// .. or why I like semicolons
fun dangerousWithoutSemicolons(a: Int, b:Int):Int {
    return a // dangerous
    + b // dead code
}

// Unit = no meaningful value
// not necessary
fun noReturn():Unit {
    print("No return");
}
