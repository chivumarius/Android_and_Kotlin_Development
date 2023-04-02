/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                - "WHILE(){}" LOOP -
            ____________________________
            
            


    ♦ "Loops"
        → can execute a "Block of Code" 
        → as long as a "Specified Condition" 
        → is "Reached".




    ♦ The "While" Loop 
        → "Loops" through a "Block of Code" 
        → as long as a "Specified Condition" 
        → is "True".



    ♦ The "While(){}" Loop "Syntax":
    _______________________________________
        
        while (condition) {
          // Code Block to be Executed
        }
    _______________________________________


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ Kotlin Application Start Function:
fun main (){

    // ♦ EX. 1 - "INCREMENTATION": 
    // ♦ Variable:
    var x = 1

    // ♦ The "While" Loop:
    while (x <= 10) {
        println("$x")
        x++
    }

    // ♦ Adding "Line Break" or "Content" on a "New Line" ("\n"):
    println("\n While Loop is Done!")




     // ♦ EX. 2 - "DECREMENTAL"
    // ♦ Variable:
    var y = 100

    // ♦ The "While" Loop:
    while (y >= 0) {
        println("$y")
        y -= 2
    }


    // ♦ EX. 3 - "STRINGS" 
    // ♦ Variable:
    var feltTemperature = "cold"
    var roomTemperature = 10

    // ♦ The "While" Loop:
    while (feltTemperature == "cold") {
        roomTemperature++

        // ♦ Checking Condition:
        if(roomTemperature >= 20){
            feltTemperature = "comfortable"  
            println("Felt Temperature is comfortable now!")    
        }
    }   
}
