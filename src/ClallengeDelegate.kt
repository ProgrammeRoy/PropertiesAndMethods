import kotlin.properties.Delegates

/**
 * Copy the Course class you created in the lateinit challenge
 * and add a courseDescription String that is created with the lazy function
 * Have the returned string contain the className and the teacherName
 */
data class Course2(var nameCourse: String){
    var courseDescription: String by lazy {
        "Course $nameCourse taught by $teacherNa"
    }
    private lateinit var teacherNa: String

    var room: String by Delegates.observable("No Room"){
        property, oldValue, newValue ->
    }

}
/**
 *  add a room String variable that is an Observable, has a "No Room" initial value
 *  and prints out the new value
 */
// Your solution here


/**
 * Add a main function, create a Course and set the teacher name,
 * room and print out the courseDescription
 */
fun main(args: Array<String>) {
// Your solution here


}