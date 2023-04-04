/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

    _______________________________________________________        
                
                 ○  KOTLIN  OOP  ○ 
                  ____________________

    - "CLASS MEMBERS: VARIABLES, FUNCTIONS & CONSTRUCTOR" - 
    _______________________________________________________
          

            
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
    // ♦ "Object" from a "Class" 
    //   → or "Instance" of a "Class":
    // var marius2 = Person2("Marius", "Chivu")
    var marius2 = Person2("Marius", "Chivu", 35)
    var john2 = Person2()
    
    // ♦ Reassigning Class Property Value:
    marius2.hobby = "to skateboard"
    marius2.age = 40
    println("Marius is ${marius2.age} years old!")

    john2.hobby = "play video games"
    
    // ♦ Calling the Method:
    marius2.stateHobby()
    john2.stateHobby()   


    // var johnPeterson2 = Person2(lastName = "Peterson")
}



// ♦ "Class" with the FIRST "CONSTRUCTOR MEMBER"
//   → we Create our "Own Data Type":
class Person2 (firstName: String = "John", lastName: String = "Doe"){

    // (1) "VARIABLES member" ("PROPERTIES"):
    var age: Int? = null  // ♦ That can be Null ("?"):
    var hobby: String = "watch Netflix"
    var firstName: String? = null  // ♦ That can be Null ("?"):


    // ♦ The "Initializer":
    init {
         // ♦ The Keyword "this" 
        //    → indicates "Property" of the "Class"
        this.firstName = firstName

        println("Initialized a new Person Object with " +
                "firstName = $firstName abd lastName = $lastName")
    }


    // (3) SECOND "CONSTRUCTOR MEMBER"
    // ♦ The Keyword "this" 
    //    → indicates "Parameters" of the "First Constructor"
    constructor(firstName: String, lastName: String, age: Int)
        : this(firstName, lastName){
            // ♦ The Keyword "this" 
            //    → indicates "Property" of the "Class"
            this.age = age

            println("Initialized a new Person Object with " +
            "firstName = $firstName abd lastName = $lastName and age $age")
        }


    // (2) "FUNCTION MEMBER" ("METHODS"):
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby!")  
    }
} 
