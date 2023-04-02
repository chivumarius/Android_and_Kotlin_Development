/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

             - "DO {} WHILE(){}" LOOP -
            ____________________________
            
            


    ♦ "Loops"
        → can execute a "Block of Code" 
        → as long as a "Specified Condition" 
        → is "Reached".




    ♦ The "Do..While" Loop 
        → is a "Variant" of the "While" Loop. 

        → This "Loop" will "Execute" the "Code Block Once", 
        → "Before Checking" if the "Condition" is "True", 
        → then it will "Repeat" the "Loop" 
        → as long as the "Condition" is "True".




    ♦ The "Do {} While(){}" Loop "Syntax":
    _______________________________________
        
        do {
          // Code Block to be Executed
        }
        while (condition);
    _______________________________________




    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ Kotlin Application Start Function:
fun main (){
       
    // ♦ Variable:
    var x = 1

    // ♦ The "Do .. While" Loop:
    do{
        println("$x")
        x++
    } while (x <= 10)     


    // ♦ Adding "Line Break" or "Content" on a "New Line" ("\n"):
    println("\n While Loop is Done!")
}
