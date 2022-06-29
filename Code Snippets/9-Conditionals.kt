fun main(){
    
    // Conventional If-else
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    // if-else with expression
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(10, 20))
}