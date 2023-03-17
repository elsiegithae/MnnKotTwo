fun main(args: Array<String>) {
    var names = arrayListOf("Karen","Tapiwa", "Ephraim", "Abdul", "Michelle")
    println(names[3])
    names.add("Elsie")
    // use for..in loop to print all the names
    for(i in 0 until (names.size-1)){
        println(names[i])
    }

    // for each loop to print all the names
    names.forEach {
        println(it)
    }
}