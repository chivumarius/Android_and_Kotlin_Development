/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

                 - "INHERITANCE" -
            ______________________________
          

            
    ♦ "Inheritance" 
        → allows "Classes" 
        → to "Inherit" the "Features"
        → (Properties and Methods)
        → of "Another Class".



    ♦ The "Inherited Class" 
        → is Called "Super Class", 
        → "Parent Class"
        → or "Base Class"


    ♦ The "Inheriting Class" 
        → is Called a "Sub Class", 
        → "Child Class"
        → or "Derived Class"


    ♦ The "open" Keyword 
        → Allows the "Inheritance" 
        → of That "Class".


    ♦ The "sealed" Keyword 
        → does Not Allow the "Inheritance" 
        → of That "Class".


    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP

  

// ♦ "Super/Parent/Base Class"
//  → with "Primary Constructor"
//  → which Must Be "Opened"
//  → in Order to be "Inherited":
open class Car2(val name: String, val brand: String){
    // ♦ Open Properties:
    open var range: Double = 0.0


    // ♦ The "extendRange()" Method:
    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }  
    
    // ♦ The "drive()" Open Method:
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

}



// ♦ "Sub/Child Class" of "NewCar" Class:
class ECar(name: String, brand: String, batteryLife: Double): Car2(name, brand){
    
    // ♦ pROIERTY:
    var chargerType = "Type1"

    // ♦ Override Propery:
    override var range = batteryLife * 6

    // ♦ Override Method:
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

     // ♦ Method:
     fun drive(){
        println("Drove $range KM on electricity")
    }
}
 




// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main (){
    // ♦ Objects:
    var audiA6 = Car2("A6", "Audi")
    var teslaS = ECar("S-Model", "Tesla", 80.0)

    // ♦ Assigning the "Values" of the "Objects Properties":
    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)
    teslaS.drive()

    // ♦ POLYMORPHISM
    // ♦ Assigning the "Values" of the "Objects Properties":
    audiA6.drive(200.0)
    teslaS.drive(200.0)
} 