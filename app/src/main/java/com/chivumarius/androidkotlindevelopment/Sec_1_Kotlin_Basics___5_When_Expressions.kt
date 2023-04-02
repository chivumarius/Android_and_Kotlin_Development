/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

             - "WHEN(){}" EXPRESSIONS -
            ____________________________
            
            


    ♦ The "When(){}" Expression
        → is a Substitute
        → for "Switch Statement"
        → from other Programming Languages
        → such as "C", "C++", "C#", "Java" and other.


    ♦ The "When(){}" Expression "Syntax":
    _______________________________________
        
        Variable = Value

        when(Variable) {
            // ► Cases
            Value -> Code to Execute
            
            // ► Default Case
            else -> Code to Execute
        }
    _______________________________________


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment

// ♦ Kotlin Application Start Function:
fun main (){
    

    // ♦ EX.1 - SEASONS:
    // ♦ Variable:
    var season = 1

    // ♦ "When(){}" Expression (as "Switch Statement"):
    when(season){
        // ► "Case 1":
        1 -> println("Spring")
        
        // ► "Case 2":
        2 -> println("Summer")
        
        // ► "Case 3":
        3 -> {
            println("Fall")
            println("Autumn")
        }
        
        // ► "Case 4":
        4 -> println("Winter")

        // ► "Default Case":
        else -> println("Invalid Season")  
    } 




    // ♦ EX.2 - MONTHS:
    // ♦ Variable:
    var month = 12

    // ♦ "When(){}" Expression (as "Switch Statement"):
    when(month){
        // ► "Case 1" → "Range of Values":
        in 3..5 -> println("Spring")
        
        // ► "Case 2" → "Range of Values":
        in 6..8 -> println("Summer")
        
        // ► "Case 3" → "Range of Values":
        in 9..11 -> println("Autumn")
        
        
        // ► "Case 4" → "More Values":
        12, 1, 2 -> println("Winter")

        // ► "Default Case":
        else -> println("Invalid Season")  
    } 


    

    // ♦ ♦ EX.3 - AGES
    // ♦ Variable:
    var age = 40

    // ♦ "When(){}" Expression (as "Switch Statement"):
    when(age){
        // ► "Case 1" 
        //    → "IF IT IS NOT" 
        //    → in the "Range of Values":
        !in 0..20 -> println("You may drink!")
        
        // ► "Case 2" → "Range of Values":
        in 18..20 -> println("You may vote now!")
        
        // ► "Case 3" → "Range of Values":
        in 16..17 -> println("You may drive now!")
        
        
        // ► "Default Case":
        else -> println("You are too young!")  
    } 



    // ♦ EX.4 - X DATA TYPE:
    // ♦ variable of "Any" Data Type (Object):
    var x: Any = 13.14

     // ♦ "When(){}" Expression (as "Switch Statement"):
     when(x){
        // ► "Case 1" 
        is Int -> println("$x is an Integer!")
        
        // ► "Case 2":
        is Double -> println("$x is an Double!")
        
        // ► "Case 3":
        is String -> println("$x is an String!")
        
        
        // ► "Default Case":
        else -> println("$x is none of the above!")
    } 
}
