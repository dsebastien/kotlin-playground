package be.dsebastien.kotlin.helloworld01


fun classicalConditions(a: Int, b: Int): Int{
    if(a > b){
        return a;
    } else {
        return b;
    }
}

// can be used as an expression
fun max(a: Int, b: Int) = if (a > b) a else b

// other example
fun testMeOut(): Boolean{
    val template = "Hello world";

    return if(template.startsWith("Hello")) true else false;
}
