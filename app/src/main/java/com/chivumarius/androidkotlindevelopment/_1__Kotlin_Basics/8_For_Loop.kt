/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                 - "FOR(){}" LOOP -
            ____________________________
            
            


    ♦ "Loops"
        → can execute a "Block of Code" 
        → as long as a "Specified Condition" 
        → is "Reached".




    ♦ The "For" Loop 
        → "Iterates" through "Anything" 
        → that Provides an "Iterator". 
        
        → This is Equivalent to the "foreach" Loop 
        → in Languages like "C#". 

        → To "Loop" through "Array Elements", 
        → use the "For" Loop 
        → Together with the "in" Operator:




    ♦ The "Do {} While(){}" Loop "Syntax":
    _______________________________________
        
        for (item in collection) 
            print(item)
    _______________________________________




    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ Kotlin Application Start Function:
fun main (){
     
    // ♦ EX. 1 → OF "WRINTING" THE "FOR LOOP":
    // ♦ Range "A..Z"
    for (number in 1..10) { 
        println("$number")    
    }  
    

    
    // ♦ EX. 2 → OF "WRINTING" THE "FOR LOOP":
    // ♦ Range "A UNTIL Z"
    // •• THE SAME: 
    //    for(i in 1.until(10)){}
    for (i in 1 until 10) { 
        print("$i ")    
    } 
    

    println("\n ")  
     

    // ♦ EX. 3 → OF "WRINTING" THE "FOR LOOP":
    // ♦ Range "Z DOWNTO A"
    // •• THE SAME: 
    //    for(i in 10.downTo(1)){}
    for (i in 10 downTo 1) { 
        print("$i ")    
    } 


    println("\n ")  
     

    // ♦ EX. 4 → OF "WRINTING" THE "FOR LOOP":
    // ♦ Range "Z DOWNTO A" → with "STEP" of "2"
    // •• THE SAME: 
    //    for(i in 10.downTo(1).step(2)){}
    for (i in 10 downTo 1 step 2) { 
        print("$i ")    
    } 
}
