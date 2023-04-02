/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                   - VARIABLES -
            ____________________________


            
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



    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ Kotlin Application Start Function:
fun main (){
    // ♦ Creating the "Mutable Variable":
        var myName = "Marius"
        myName = "Jeanine"

    // ♦ Creating the "Immutable Variable"
    //      → we will Receive an Error in the Code
    //    val myName = "Marius"
    //    myName = "Cristian"

    // ♦ Display "Concatenated Strings" → in the "Console":
    print("► Hello " +  myName)
}

