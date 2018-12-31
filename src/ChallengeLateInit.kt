/**
 * Create a class named Course that takes a className String parameter
 * Add a private lateinit variable for the Teacher's name
 * Then create a setTecherName function that sets that variable
 */
class Course(var classname: String){
    var className = classname
    lateinit var teacherName: String

    fun setTeach(name: String){
        teacherName = name
    }
}

/**
 * Add a main function, create a Course and set the teacher name
 */
fun main(args: Array<String>) {
    val course = Course("Math")
    course.setTeach("Ms. Talia")
    println("Course: ${course.className}, Teacher: ${course.teacherName}")

}