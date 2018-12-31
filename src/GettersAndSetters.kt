class Person{
    var firstName: String? = null
    var lastName: String? = null
    val fullname: String
        get() {
            return firstName+" "+lastName
        }
}

class Person1(val saturation: String = "Mr.", var firtName: String?, var lastName: String?){
}

fun main(args: Array<String>) {
    val person = Person()
    person.firstName = "Sam"
    person.lastName = "Smith"
    println("Person: ${person.firstName}, ${person.lastName}")

    val person1 = Person1("", "Abraham", "Lincoln")
    println("Person1: ${person1.firtName}, ${person1.lastName}")
}