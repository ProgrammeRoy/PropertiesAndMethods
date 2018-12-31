open class Human{
    private val firstName: String = "Sam"
    protected var lastName: String = "Adams"

}

class Pilot: Human(){
    fun printPilot(){
        println("Pilot's name is $lastName")
    }
}

//Visibility for default is

fun main(args: Array<String>) {

}