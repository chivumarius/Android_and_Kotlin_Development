/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

                 - "DATA CLASSES" -
            ______________________________
          

            
    ♦ A "Class" 
        → is a "Blueprint" 
        → of an "Object".        
    


    ♦ "Data Classes"
        → are "Classes" whose "Main Purpose"
        → is to "Hold Data",
        → being Marked by the "data" Keyword.



    ♦ In these Classes
        → some "Standard Functionalities"
        → and some "Utility Functions"
        → are "Mechanical Derivatives"
        → from "Data".




    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP



// ♦ "Data Class"
data class User (val id: Long, var name: String)
  


// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main (){
    // ♦ "Object1":
    val user1 = User(1, "Marius")   
    
    
    // ♦ Accessing "Data Class Properties":
    // val name = user1.name
    // println(name)
    
    
    // ♦ "Assigning" a "New Value" to the "Data Class Property":
    user1.name = "Andrei"
    


    // ♦ "Object2":
    val user2 = User(1, "Andrei")   
    
    // ♦ Comparing Objects:
    // println(user1.equals(user2))
    println(user1 == user2)
    
    // ♦ Using the "toString()" Method
    println("User Details: $user1")

    // ♦ Using the "copy()" Function
    //   → and "Changing" the "User Name":
    val updatedUser = user1.copy(name = "Marius Chivu")
    println(user1)
    println(updatedUser)
    
    
    // ♦ Getting the "Components" of the "updatedUser" Object:
    println(updatedUser.component1())
    println(updatedUser.component2())


    // ♦ Using the "Deconstruction"
    //   → will Get the "id" and "name" Properties 
    //   → from the "updatedUser" Object
    //   → and will "Store Them" 
    //   → in "Separate Variables":
    val(id, name) = updatedUser

        // ♦ Similar to:
        // val id = updatedUser.id
        // val name = updatedUser.name
        
    println("id = $id, name = $name")
}   
 


