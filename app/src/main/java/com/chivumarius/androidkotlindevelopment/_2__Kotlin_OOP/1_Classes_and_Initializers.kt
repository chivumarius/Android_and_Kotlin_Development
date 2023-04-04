/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

            - "CLASSES & INITIALIZERS" -
            ______________________________
          

            
    ♦ A "class" 
        → is a "Blueprint" 
        → of an "Object".        
    


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP



// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main (){
    // ♦ Creating the "Object" from a "Class" 
    //   → or "Instance" of a "Class":
    var marius = Person("Marius", "Chivu")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}


// ♦ By Creating a "Class"
//   → we Create our "Own Data Type":
class Person (firstName: String = "John", lastName: String = "Doe"){

    // ♦ The "Initializer":
    init {
        println("Initialized a new Person Object with " +
                "firstName = $firstName abd lastName = $lastName")
    }
}
