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

package com.chivumarius.androidkotlindevelopment

// ♦ Kotlin Application Start Function:
fun main (){
    // ♦ Variables:
    var heightPerson1 = 170
    var heightPerson2 = 190

    // ♦ Condition:
    if( heightPerson1 > heightPerson2){
        println("Use raw force")
    } else if(heightPerson1 == heightPerson2){
        println("Use your power technique 1400")
    } else {
        println("Use technique")
    }

}
