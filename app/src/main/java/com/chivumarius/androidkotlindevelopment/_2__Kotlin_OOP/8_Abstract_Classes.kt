/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

               - "ABSTRACT CLASSES" -
            ______________________________
          

            
    ♦ An "Abstract Class" 
        → cannot be "Instantiated"
        → we cannot Create "Objects" 
        → of an "Abstract Class".


    ♦ We can "Inherit Subclasses" from "Them".
    

    ♦ The "Members" ("Properties" and "Methods") 
        → of an "Abstract Class" 
        → are "Non-Abstract"
        → unless we "Explicitly Use" 
        → the "abstract" Keyword 
        → to Make them "Abstract".



    ♦ The "Differences" 
        → between "Interfaces" and "Classes"

        [1] "Interfaces"
            → Can't Hold "State"
            → Cannot Implement "More Interfaces"
              for a single "Class"
            → Does not Hold "Constructor"
            → Does not Hold "Fields"



        [2]] "Classes"
            → They have "Constructor"
            → They have "Fields"




    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP

  

// ♦ The "Abstract Class" → "Mammal{}":
abstract class Mammal(
    val name: String, 
    val origin: String,
    val weight: Double) {   // Concrete (Non Abstract) Properties

    // ♦ "Abstract Property" 
    //   → Must be "Overridden" by "Subclasses"
    abstract var maxSpeed: Double

    // ♦ "Abstract Methods" without a "Body":
    //   → Must be "Implemented" by "Subclasses"
    abstract fun run()
    abstract fun breath()

    // ♦ "Non Abstract" Method
    //   → in an "Abstract Class":
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}



// ♦ The "Human{}" Class
//    → which "Inherits" from the "Mammal{}" Abstract Class:
class Human(    name: String, 
                origin: String, 
                weight: Double,
                override var maxSpeed: Double
            ): Mammal(name, origin, weight) {

    // ♦ Override "run()" Function
    //    → from the "Mammal{}" Abstract Class:
    override fun run() {
        // "Code" → to "Run"
        println("Runs on two legs")
    }


    // ♦ Override "breath()" Function
    //    → from the "Mammal{}" Abstract Class:
    override fun breath() {
        // "Code" → to "Breath"
        println("Breath through mouth or nose")
    }
}




// ♦ The "Elephant{}" Class
//    → which "Inherits" from the "Mammal{}" Abstract Class:
class Elephant (    name: String, 
                    origin: String,
                 weight: Double,
                    override var maxSpeed: Double
                ): Mammal(name, origin, weight) {

    
    // ♦ Override "run()" Function
    //    → from the "Mammal{}" Abstract Class:
    override fun run() {
        // "Code" → to "Run"
        println("Runs on four legs")
    }


    // ♦ Override "breath()" Function
    //    → from the "Mammal{}" Abstract Class:
    override fun breath() {
        // "Code" → to "Breath"
        println("Breath through the trunk")
    }
}



// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main() {
    // ♦ Creating "Human" Object:
    val human = Human("Marius", "Romanian",
        85.0, 10.0)

    // ♦ Creating "Elephant" Object:
    val elephant = Elephant("Rosy", "India",
        5400.0, 25.0)


    // ♦ Calling the "run()" Function:
    human.run()
    elephant.run()


    // ♦ Calling the "breath()" Function:
    human.breath()
    elephant.breath()
}