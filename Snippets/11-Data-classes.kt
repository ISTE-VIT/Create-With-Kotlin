data class employee(val name:String, val id:Int)

// optional parameters are declared inside class body
data class person(val name:String){
    var id:Int = 0
}

fun main(){
    val p1 = employee("vandit", 214)
    val p2 = employee("sahith", 175)
    
    val p3 = person("vandit")
    val p4 = person("sahith")
    
    println(p1 == p2)
    
    p3.id = 214
    println(p3.id)
    println(p4.id)
}