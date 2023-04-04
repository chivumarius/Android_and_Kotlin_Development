/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ____________________________        
                
                ○  KOTLIN  BASICS  ○ 
                ____________________

                  - "NULLABLES" -
            ____________________________
            
            


    ♦ The Kotlin "Nullables" Type System
        → is Aimed to "Eliminating" the "Danger" of "Null References", 
        → also known as T"he Billion Dollar Mistake".



    ♦ The only possible causes of an NPE in Kotlin are:

        [1] An Explicit Call 
            → to throw "NullPointerException()".


        [2] Usage of the "!!" Operator. 


        [3] "Data Inconsistency" 
            → with regard to "Initialization", 
            → such as when:

                ► An Uninitialized "this" Available 
                    → in a "Constructor" 
                    → is "Passed" 
                    → and U"sed Somewhere" (a "leaking this").

                ► A "Superclass Constructor" 
                    → Calls an "Open Member" 
                    → whose "Implementation" in the "Derived Class" 
                    → Uses an "Uninitialized State".





    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._1__Kotlin_Basics



// ♦ The "main(){}" Function 
//      → as "Entry Point" of "Application":
fun main (){
    // (1) Variable:
    // var name: String = "Marius"

    // ♦ We Cannot Assign "null" Value to Variable
    //      •► "Null can not be a value of a non-null type String"
    // name = null


    // (2) "Nullable" Variable (by "?"):
    var nullableName: String? = "Marius" 

    // ♦ The "?" Allows us to Assign "null" Values:
    // nullableName = null


    // ♦ Getting the "Length" of the "name" Variable:
    // var len = name.length

    // ♦ Option 1 (New) → to Access the "length" of the "null" Variable
    //      → by "?":
    var len2 = nullableName?.length
    
    // ♦ The "Use" of "Methods" → on "nullable" Variables:
    // println(nullableName?.toLowerCase())

    
    // ♦ Using the "Safe Call" Operator
    //   → Executed "Only if there is" a Variable "Value"
    nullableName?.let { println(nullableName?.toLowerCase()) }





 
    // (3) "ELVIS" OPERATOR ("?:")
    //     → for Assigning "nullable" Values 
    //     → to the "name" Variable
    // ♦ If "nullableName" Value is "Empty" 
    //   → then Use "Default Value" - "Guest"
    var name2 = nullableName ?: "Guest"
    // println("Name is $name2")

    
    
    // (4) "NOT-NULL  ASSERTION" OPERATOR ("!!")
    //     → which Converts "Any Type" 
    //     → into a "Non-Null Type"
    println(nullableName!!.toLowerCase())

//
    // (5) "SAFE  CALL" OPERATOR (Used in "Classes"):
    // val wifesAge: String? = user?.wife?.age ?: 0



    // ♦ Option 2 (Old) → to Access the "length" of the "null" Variable
    /*
        if(nullableName != null){
            // ♦ Getting the "Length" of the "nullableName" Variable:
            var len2 = nullableName.length
        } else {
            null
        }
    */
    
}
 
 