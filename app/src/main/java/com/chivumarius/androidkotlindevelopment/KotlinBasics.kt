/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

    ♦♦ "Kotlin"
        → was developed by "JetBrains" Company
        → is a Statistically Typed Programming Language,
        → 100% Interoperable with Java and Android,
        → Developed for Modern Multiplatform Applications.


    ♦♦ The keyword "var"
        → represents the abbreviation
        → of the word "Variable".
        → Its Value Can Be Overwritten
        → during the "Run Time".



    ♦♦ The keyword "val"
        → represents the abbreviation
        → of the word "Immutable Variable".
        → Its Value Cannot  Be Overwritten
        → during the "Run Time".


        
    ♦ COMMENTS:
        [1] Comment on "One Line":
            //  This is a Comment on "One Line"

        [2] Comment on "Several Lines"c
            / *
                This is a Comment on "Several Lines"
            * /

        [3] Comment that Appears in the "TODO" Tab:
            //TODO: This is a Comment that Appears in the "TODO" Tab!



    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment

// ♦ Kotlin Application Start Function:
fun main (){
    // ♦ Creating the "Mutable Variable":
    
    // ===============================================
    // (I) "STRING" DATA TYPES:
    //      → represents a Connection of "Several Characters"
    var myName = "Marius"
    myName = "Vlad"

    // ♦ Display "Concatenated Strings" → in the "Console":
    println("► Hello " +  myName)

    // STRING:
    val myString = "Hello World"
    var firstCharInString = myString[0]
    var lastCharInString = myString[myString.length - 1]
    var myLength = myString.length

    println("► First character: " + firstCharInString)
    println("► Last character: " + lastCharInString)

    //--------------------------------------------------
    // ♦ "STRING INTERPOLATION" OR "STRING TEMPLATE EXPRESSION" ("$" OR "${}"):
    //      → are "String Literals" 
    //      → that contain "Embedded Expressions":
    println("► First character is $firstCharInString and last character is $lastCharInString and tke length of string is ${myString.length}")
    // ===============================================


    // ===============================================
    // (II) "NUMBER" DATA TYPES:
    val myAge = 25

    // --------------------------------------------
    // (1) "INTEGER NUMBER" DATA TYPES:
    //    → Explicit Declaration of the Data Type:

    // (1.1) "1 Byte" = "8 bit":    
    //  Varianle Name: Type = Value
    val myByte: Byte = 12

    // (1.2) "1 Short" = "16 bit":
    val myShort: Short = 125

    // (1.3) "1 Int" = "32 bit":
    val myInt: Int = 123123123

    // (1.4) "1 Long" = "64 bit"
    val myLong: Long = 12_123_456_789_123_456

    
    // --------------------------------------------
    // (2) "FLOATING POINY NUMBER" DATA TYPES:
    //    → Explicit Declaration of the Data Type:

    // (2.1) "1 Float" = "32 bit" (Used for Games Physics):    
    val myFloat: Float = 13.14F

    
    // (2.2) "1 Double" = "64 bit" (Commonly Used):
    val myDouble: Double = 1.12345678912345678912
    // ===============================================
 
  
    // ===============================================
    // (III) "BOOLEAN" DATA TYPES:
    //          → represents logical values
    var isSunny: Boolean = true
    isSunny = false
    // ===============================================
    

    // ===============================================
    // (IV) "CHARACTER" DATA TYPES:
    var letterChar = 'A'
    var digitChar = '5'
    // ===============================================


    // ===============================================
    // (V) ARITMETIC  OPERATORS (+, -, /, %):

    // (5.1) "ADDITION" OPERATOR ("+"):
    var result = 5 + 5
    println("► " + result)

    // (5.1) "ADDITION" OPERATOR ("+"):
     result = result - 2
    // result -= 2
    println("► " + result)


    // (5.3) "DIVISION" OPERATOR ("/"):
    // result = result / 2
    result /= 2
    println("► " + result)

    // (5.4) "MULTIPLICATION" OPERATOR ("*"):
    // result = result * 2
    result *= 2
    println("► " + result)

    // (5.5) "MODULUS" OPERATOR ("%"):
    //          → The "Remainder" of the "division"
    result = 15 % 2
    println("► " + result)

    // ♦♦ "Division Result" → as "Double" Data Type:
    val a = 5.0
    val b = 3
    val resultDouble: Double
    resultDouble = (a / b)
    println("► " + resultDouble)
    // ===============================================
}