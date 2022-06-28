data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main(){
    val vandit = Person()
    
    val stringDescription = vandit.apply {
        name = "Vandit"
        age = 19
        about = "Android developer"
    }.toString()

    println(stringDescription)
}