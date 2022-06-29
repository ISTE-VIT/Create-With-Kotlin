fun main(){
    val lst = listOf(-3,-2,-1,0,1,2,3)
    val positive = lst.filter{ it > 0 }
    val negative = lst.filter{ it < 0 }
    println(positive)
    println(negative)
}