/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

              - "SCOPE & SHADOWING" - 
            ______________________________
          

            
    ♦ The "Kotlin Standard Library" 
        → contains several "Functions" 
        → whose "Sole Purpose "
        → is to "Execute" a "Block of Code" 
        → within the "Context" of an "Object".



    ♦ when "Calling" such a "Function" 
        → on an "Object" with a "Lambda Expression" provided, 
        → it "Forms" a "Temporary Scope".



    ♦ Through this "Scope" 
        → can be "Accessed" the "Object" 
        → "Without" its "Name". 



    ♦ Such "Functions" 
        → are Called "Scope Functions".



    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP



// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main (){
    // ♦ The Function can have an Argument when Called:
    myFunction(a= 5)

    // ♦ "No Value" can be "Reassigned" 
    //   → to "b" Variable "Outside" of its "Function":
    // b = 3
}


// ♦ The "b" Variable" → "Outside" of the "Function":
var b = 9


// ♦ "Function" with the "a" Parameter:
fun myFunction(a: Int){
    // ♦ Cannot Be Assigned a "Value" 
    //      → to the "a" "Parameter" in a "Function" 
    // a = 5

    // ♦ The "a" is a "Variable":
    var a = 4
    println("The 'a' is $a")

    // ♦ "Variables" are "Visible" only in the "Scope" of the "Function"
    // var b = a

    // ♦ Variable "Reassignment" Works
    //   → in the "Same File":
    b = 7
    println("The 'b' is $b")
}
 
