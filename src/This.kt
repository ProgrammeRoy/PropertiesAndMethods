class NewPerson{
    var firstName = ""
    var child= Child()
    fun setFirst(firstName: String){
        this.firstName = firstName
    }

    inner class Child{
        var firstName = ""
        fun printParentage(){
            println("Child ${this@Child.firstName} with parent ${this@NewPerson.firstName}")
        }
    }
}

fun main(args: Array<String>) {
    val person1 = NewPerson()
    person1.firstName="Martinez Ramirez"
    person1.child.firstName = "Roy"
    person1.child.printParentage()
}