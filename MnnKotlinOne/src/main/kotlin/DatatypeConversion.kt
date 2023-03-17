fun main(args: Array<String>) {
    var x = 20
    var y = 30
    println(x+y)

    // convert to string
    var a = x.toString()
    var b = y.toString()
    println(a+b)

    //convert to doubles
    var c= x.toDouble()
    var d= y.toDouble()
    println(c+d)

    //convert back to integers
    var e = a.toInt()
    var f = b.toInt()
    println(e+f)
}