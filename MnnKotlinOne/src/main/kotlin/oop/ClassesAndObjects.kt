package oop

import javax.lang.model.element.Name

fun main(args: Array<String>) {

    //These are the objects
    var f1=Fruit("Mango", "yellow", "200g", 50.0)
    var f2 = Fruit("apple", "red", "50g", 60.0)
    println(f1.price)
    println(f2.color)

    var C1 = Car("Mercedes", "KDA650P", 600000000.00)
}

// This is a class
class Fruit(name: String, color:String, size: String, price: Double){
    var name:String
    var color:String
    var size:String
    var price:Double

    // Initialize the properties
    init {
        this.name = name
        this.color = color
        this.size= size
        this.price=price
    }
}

class Car(model:String, reg_no:String, price: Double){
    var model: String
    var reg_no: String
    var price: Double

    init{
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class functions
    fun accelerate(){
        println("Yeah, i can accelerate!")
    }
    fun brake(){
        println("I am a $model, i can brake!")
    }
}