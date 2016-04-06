package be.dsebastien.kotlin.helloworld01

// references must be explicitly marked as nullable when null value is possible


fun iCannotReturnNull():String {
    // illegal:
    // Null can not be a value of a non-null type
    //return null;

    return "";
}

fun iCanReturnNull():Int? {
    var retVal = Math.random().toInt();
    if(retVal > 1000000) {
        return null;
    } else{
        return retVal;
    }
}

fun main(args: Array<String>) {
    val a = iCanReturnNull();
    val b = iCanReturnNull();

    var result = 0;

    // Not allowed because a and b can be null
    // they're not Int but Int?
    //result = a + b;

    // solution: add a null check!
    // variables checked for null are automatically cast to non-nullable
    // A-W-E-S-O-M-E
    if(a != null && b != null){
        result = a + b;
    }

    println(result);
}

