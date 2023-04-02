/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                  - OPERATORS -
            ____________________________
            
            


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment

// ♦ Kotlin Application Start Function:
fun main (){
    
    // ===============================================
    // (V) ARITHMETIC  OPERATORS (+, -, /, %):

    // --------------------------------------------
    // (5.1) "ADDITION" OPERATOR ("+"):
    var result = 5 + 5
    println("► $result")

    // --------------------------------------------
    // (5.1) "ADDITION" OPERATOR ("+"):
    // result = result - 2
    result -= 2
    println("► $result")

    // --------------------------------------------
    // (5.3) "DIVISION" OPERATOR ("/"):
    // result = result / 2
    result /= 2
    println("► $result")

    // --------------------------------------------
    // (5.4) "MULTIPLICATION" OPERATOR ("*"):
    // result = result * 2
    result *= 2
    println("► $result")

    // --------------------------------------------
    // (5.5) "MODULUS" OPERATOR ("%"):
    //          → The "Remainder" of the "division"
    result = 15 % 2
    println("► $result")

    // --------------------------------------------
    // ♦♦ "Division Result" → as "Double" Data Type:
    val a = 5.0
    val b = 3
    val resultDouble: Double
    resultDouble = (a / b)
    println("► $resultDouble")
    // ===============================================


    // ===============================================
    // (VI) COMPARISON  OPERATORS (==, !=, <, >, <=, >=):

    // --------------------------------------------
    // (6.1) "DOUBLE EQUAL" OPERATOR ("=="):
    //          → "Compare" the "Equality" of "Two Values"
    //          → and Gives a "Boolean Result"
    val isEqual = 5 == 3
    println("► isEqual is $isEqual")

    val isEqual2 = 5 == 5
    println("► isEqual is $isEqual2")


    // --------------------------------------------
    // (6.2) "NOT EQUAL" OPERATOR ("!="):
    val isNotEqual = 5 != 5
    println("► isNotEqual is $isNotEqual")


    // --------------------------------------------
    // (6.3) "LESS THAN" OPERATOR ("<"):
    // ♦ "String Template" Expression ("String Interpolation")    
    println("► Is 5 Less than 3?  ${5 < 3}")


    // --------------------------------------------
    // (6.4) "GREATER THAN" OPERATOR (">"):
    // ♦ "String Template" Expression ("String Interpolation")   
    println("► Is 5 Greater than 3?  ${5 > 3}")
   
   
    // --------------------------------------------
    // (6.5) "LESS OR EQUAL" OPERATOR ("<="):
    // ♦ "String Template" Expression ("String Interpolation")   
    println("► Is 8 Less or Equal 8?  ${8 <= 8}")

    // --------------------------------------------
    // (6.6) "GREATER OR EQUAL" OPERATOR (">="):
    // ♦ "String Template" Expression ("String Interpolation")   
    println("► Is 6 Greater or Equal 5?  ${6 >= 5}")
    // ===============================================


    
    // ===============================================
    // (VII) ASSIGNMENT   OPERATORS (+=, -=, *=, /=, %=)

    // --------------------------------------------
    // (7.1) "ADDITION ASSIGNMENT" OPERATOR ("+="):
    //          → "Add" a "Value" to the "Same Variable"    
    var addNumber = 4
    // var addNumber = addNumber + 8
    addNumber += 8
    println("► addNumber is $addNumber")


    // --------------------------------------------
    // (7.2) "SUBSTRACTION ASSIGNMENT" OPERATOR ("-="):
    //          → "Subtract" a "Value" to the "Same Variable"    
    var subtractNumber = 9
    // var subtractNumber = subtractNumber - 7
    subtractNumber -= 7
    println("► subtractNumber is $subtractNumber")


    // --------------------------------------------
    // (7.3) "MULTIPLICATION ASSIGNMENT" OPERATOR ("*="):
    //          → "Multiply" a "Value" to the "Same Variable"    
    var multiplyNumber = 3
    // var multiplyNumber = multiplyNumber * 2
    multiplyNumber *= 2
    println("► multiplyNumber is $multiplyNumber")


    // --------------------------------------------
    // (7.4) "DIVISION ASSIGNMENT" OPERATOR ("/="):
    //          → "Dividing" a "Value" to the "Same Variable"    
    var dividingNumber = 9
    // var dividingNumber = dividingNumber / 3
    dividingNumber /= 3
    println("► dividingNumber is $dividingNumber")


    // --------------------------------------------
    // (7.5) "MODULUS ASSIGNMENT" OPERATOR ("%="):
    //          → "Remainder" of "Dividing" a "Value" to the "Same Variable"    
    var remainderOfDividingNumber = 10
    // var remainderOfDividingNumber = remainderOfDividingNumber % 3
    remainderOfDividingNumber %= 3
    println("► remainderOfDividingNumber is $remainderOfDividingNumber")
    // ===============================================

    

    
    // ===============================================
    // (VIII) INCREMENTATION & DECREMENTATION OPERATORS (++, --)

    // --------------------------------------------
    // (8.1) "INCREMENTATION" OPERATOR ("++"):
    //          → "Increasing" the "Value" of the "Variable" by "1"   
    var incrementingNumber = 30
    // var incrementingNumber = incrementingNumber + 1
    incrementingNumber++
    println("► incrementingNumber After is ${incrementingNumber++}")
    println("► incrementingNumber Before is ${++incrementingNumber}")


    // --------------------------------------------
    // (8.2) "DECREMENTATION" OPERATOR ("--"):
    //          → "Decreasing" the "Value" of the "Variable" by "1"    
    var decreasingNumber = 50
    // var decreasingNumber = decreasingNumber - 1
    decreasingNumber--
    println("► decreasingNumber After is ${decreasingNumber--}")
    println("► decreasingNumber Before is ${--decreasingNumber}")
    // ===============================================
}
