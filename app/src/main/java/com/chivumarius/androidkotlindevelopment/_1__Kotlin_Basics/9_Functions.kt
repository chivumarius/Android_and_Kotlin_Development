/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                  - "FUNCTIONS" -
            ____________________________
            
            


    ♦ "Function" 
        → is a "Block of Code" 
        → which "Only Runs" 
        → when it is "Called".



    ♦ "Functions" 
        → are used to "Perform Certain Actions", 
        → and they are also known as "Methods".


    
    ♦ The "Method" 
        → is a "Function" 
        → inside a "Class".



    ♦ "Data" (Known as "Parameters")
        → can be "Passed" 
        → to a "Function".



    ♦ Kotlin "functions" 
        → are Declared 
        → using the "fun" Keyword:


    ♦ The "functions" "Syntax":
    _______________________________________
        
       fun functionName(Parameters) {
          // Code Block to be Executed 
          // when the Function is Called.
        }
    _______________________________________



    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ The "main(){}" Function 
//      → as "Entry Point" of "Application":
fun main (){
    // ♦ Calling the Function:
    myFunction()
    
    // ♦ "Result" Argument
    //   → for "Storing" the "Function Call":
    var result = addUp(5, 3)
    println("Result is $result")    
    
    // ♦ "Result2" Argument
    //   → for "Storing" the "Function Call":
    var result2 = average(5.3, 13.37)
    println("Result 2 is $result2")    
}


// ♦ Function "With Parameters" ("Input"): 
fun average(a: Double, b: Double): Double{
    // ♦ "Output"
    return (a + b)/2
} 

// ♦ Function "With Parameters" ("Input"): 
fun addUp(a: Int, b: Int): Int{
    // ♦ "Output"
    return a + b
} 


// ♦ Function "Without Parameters": 
fun myFunction (){
   println("Called from myFunction")
}