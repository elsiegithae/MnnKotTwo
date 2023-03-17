fun main(args: Array<String>) {
    motto()
    add()
    avg(x = 200, y = 500.0, z=800.0f)
    avg(x= 500, y= 400.0, z= 800.0f)
    println(sum(12, 15))
}

fun motto(){
    println("Hello there! This is our motto.")
}

fun add(){
    var x=10
    var y=20
    var z= x+y
    println("hello, your answer is $z")
}

fun avg( x:Int, y:Double, z:Float){
    var avg=(x+y+z)/3.0
    println("Your answer is $avg")
}

fun sum(x:Int, y:Int):Int{
    var answer = x + y
    return answer
}