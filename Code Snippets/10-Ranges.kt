fun main(){
    for(x in 0..3){
        print(x)
    }
    println()
    for(x in 0..4 step 2){
        print(x)
    }
    println()
    for(x in 0 until 3){
        print(x)
    }
    println()
    for(x in 3 downTo 0){
        print(x)
    }
    println()
    
    // characters are also supported
    for(x in 'a'..'d'){
        print(x)
    }
    println()
    for(x in 'z' downTo 's' step 2){
        print(x)
    }
    println()

    // useful with if-else
    val x = 2
	if (x in 1..5) {
    	print("x is in range from 1 to 5")
	}
	println()
}