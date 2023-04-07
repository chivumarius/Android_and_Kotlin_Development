/*
▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

            ______________________________        
                
                ○  KOTLIN  OOP  ○ 
                ____________________

                 - "INTERFACES" -
            ______________________________
          

            
    ♦ "Interfaces"
        → are "Features"
        → which Allow "Expanding" 
        → the "Functionality" of the "Classes".



    ♦ Note ♦
        We Run the File
        → by pressing the "Play" Button
        → on the "Left" of the "File".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.androidkotlindevelopment._2__Kotlin_OOP

  
// ♦ The "Driveable" Interface:
interface Driveable {
    // ♦ "Property":
    val maxSpeed: Double
    
    // ♦ "Function Head":
    fun drive(): String
    
    // ♦ "Function":
    fun brake(){
        println("The drivable is braking")
    }
}



// ♦ "Super/Parent/Base Class"
//  → with "Primary Constructor"
//  → which Must Be "Opened"
//  → in Order to be "Inherited":
open class Car2(override val maxSpeed: Double, val name: String, val brand: String): Driveable {
    // ♦ Open Properties:
    open var range: Double = 0.0


    // ♦ The "extendRange()" Method:
    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }  
    

    // ♦ Override "drive()" Function from "Driveable" Interface:
    // override fun drive(): String = "driving the interface drive"
    override fun drive(): String {
        return "driving the interface drive"
    } 
         

    // ♦ The "drive()" Open Method:
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

}



// ♦ "Sub/Child Class" of "NewCar" Class:
class ECar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : Car2(maxSpeed, name, brand){
    
    // ♦ pROIERTY:
    var chargerType = "Type1"

    // ♦ Override Propery:
    override var range = batteryLife * 6

    // ♦ Override Method:
    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

     // ♦ override Function:
     override fun drive(): String {
        return "Drove $range KM on electricity"
    } 

    // ♦ override Function:
    override fun brake(){
        super.brake()
    }
}
 




// ♦ The "main(){}" Function
//      → as "Entry Point" of "Application":
fun main (){
    // ♦ Objects:
    var audiA6 = Car2(200.0, "A6", "Audi")
    var teslaS = ECar(250.0, "S-Model", "Tesla", 80.0)

    // ♦ Assigning the "Values" of the "Objects Properties":
    teslaS.chargerType = "Type2"
    // teslaS.extendRange(200.0)
    // teslaS.drive()
    
    // ♦ Calling the "brake" Function:
    teslaS.brake()
    audiA6.brake()

    // ♦ POLYMORPHISM
    // ♦ Assigning the "Values" of the "Objects Properties":
    // audiA6.drive(200.0)
    // teslaS.drive(200.0)
} 