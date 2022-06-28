fun main(){
    var inferredNonNull:String = "The compiler assumes Non-Null"
    inferredNonNull = null    // This will throw an error

    var Nullable:String? = "This can keep a null here"
    Nullable = null           // This will not throw an error
}