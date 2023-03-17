fun main(args: Array<String>) {
    // IF STATEMENT
    var age = 20
    if (age < 18){
        println("sorry, you are underage")
    }else{
        println("welcome to the party")
    }
    var weight =100
    var height =1.9
    var bmi = weight/ (height*height)
    if (bmi <=18){
        println("Underweight")

    }else if (bmi <=29){
        println("Normal weight")

    }else if (bmi <=34){
        println("Overweight")
    }else{
        println("Obese")
    }


// when statements

    var bettingNumber=3

    when(bettingNumber){
        1 ->{
            println("you lost")
        }
        2 ->{
            println("you lost")
        }
        3 ->{
            println("you won")
        }
        4 ->{
            println("you lost")
        }
        else-> {
            println("please enter a number from 1 to 4")
        }
    }
}

