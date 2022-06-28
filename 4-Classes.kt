// without any properties
class Customer

// with properties'
class Contact(val id: Int, val email: String)

fun main(){
    // creating instance of classes
    val customer = Customer()
    val contact = Contact(1, "john@gmail.com")

    println(contact.id)
    contact.email = "jane@gmail.com"
}