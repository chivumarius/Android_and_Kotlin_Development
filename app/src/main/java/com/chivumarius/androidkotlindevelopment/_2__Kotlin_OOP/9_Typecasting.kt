/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

                 - "TYPECASTING" -
            ______________________________
          

            
    


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP


import  kotlin.math.floor


// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main() {
   
    // ♦ "List of Strings":
    val stringList: List<String> = listOf(
        "Marius",
        "Andrei",
        "Cristian",
        "Jeanine"
    ) 

    // ♦ "List of Mixed Types":
    val mixedTypeList: List<Any> = listOf(
        "Marius",
        40,
        17,
        "BirthDay",
        85.0,
        "weight",
        "Kg"
    )


    // ♦ THE "OLD SOLUTION"
    // ♦ The "for(){}" Loop
    //    → with "if(){}" Statement:
    for(value in mixedTypeList) {
        
        // ♦ Condition Checks:
        if(value is Int) {
            println("Integer: $value")
        } else if(value is Double) {
            println("Double: $value with Floor value ${floor(value)}")
        } else if(value is String) {
            println("String: $value of length ${value.length} characters")
        } else {
            println("Unknown Type")
        }
    }


    // ♦ THE "SOLUTION" ACCEPTED BY "KOTLIN":
    // ♦ The "for(){}" Loop
    //    → with "when(){}" Statement:
    for(value in mixedTypeList) {
        // ♦ The "when(){}" Statement:
        when(value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${floor(value)}")
            is String -> println("String: $value of length ${value.length} characters")
            else -> println("Unknown Type")
        }
    }


    // ♦ "SMART CAST"
    val obj1: Any = "I have a dream"

    // ♦ Checking the Condition:
    if(obj1 !is String){
        println("Not a String")
    } else {
        // ♦ Object is Automatically Casted to String in this Scope
        println("Found a String of length ${obj1.length} characters")
    }



    // ♦ "EXPLICIT UNSAFE CASTING"
    //    → Using the "as" Keyword 
    //    → can go Wrong
    
    // ♦ "Object 1":
    val str1: String = obj1 as String
    println(str1.length)

    // ♦ "Object 2":
    val obj2: Any = 1337
    
    // ♦ We must make the "String Nullable" by "?"
    // val obj2: String = obj2 as String
    // println(str2)


    // ♦ "EXPLICIT SAFE CASTING"
    //    → Using the "as?" Keyword 
    
    // ♦ "Object 3":
    val obj3: Any = 1337
    
    // ♦ We make the "String Nullable" by "?"
    val str3: String? = obj3 as? String  // "Works"
    println(str3) // Prints: "null"
}