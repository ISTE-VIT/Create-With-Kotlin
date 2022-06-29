fun main(){
    var mutableList = mutableListOf(1,2,3,4)
    mutableList.add(5)
    println(mutableList)

    val immutableList = listOf(1,2,3,4)
    immutableList.add(5)    // 'listOf' cannot be modified so this line will throw an error
    println(immutableList)
}