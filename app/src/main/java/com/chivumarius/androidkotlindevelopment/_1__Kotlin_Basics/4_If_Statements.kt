/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                - "IF" STATEMENTS -
            ____________________________
            
            


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ Kotlin Application Start Function:
fun main (){
    
    // ===============================================
    // (1) EX - "INTEGER" VALUES:
    // -----------------------------------------------
    // ♦ Variables:
    var heightPerson1 = 190
    var heightPerson2 = 190

    // ♦ Condition Checked:
    if( heightPerson1 > heightPerson2){
        println("► Use raw force")
    } else if(heightPerson1 == heightPerson2){
        println("► Use your power technique 1400")
    } else {
        println("► Use technique")
    }
    // -----------------------------------------------



    // -----------------------------------------------
    // ♦ Variable:
    var age = 17

    // ♦ Condition Checked:
    if(age >= 21) {
       println("► Now you may drink in the EU!") 
    } else  if(age >= 18) {
        println("► You may vote now!") 
    } else  if(age >= 16) {
        println("► You may drive now!") 
    } else {
        println("► You are too young!") 
    }
    // -----------------------------------------------
    // ===============================================



     // ===============================================
    // (2) EX - "STRINGS" VALUES:
    var name = "Marius"

    if(name == "Marius"){
        println("► Welcom home Marius!")
    } else {
        println("► Who are you?")
    }
    // ===============================================



    
    

    // ===============================================
    // (3) EX - "BOOLEAN" VALUES:
    // -----------------------------------------------
    var isRainy = true

    if(isRainy)
        println("► It`s rainy!")
    // ==
}
