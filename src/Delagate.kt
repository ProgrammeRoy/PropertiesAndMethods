import kotlin.properties.Delegates

//Lazy
//Obervable
//Mapped

data class NewCourse(var className: String){
    var room: String by Delegates.observable("No Room"){
        property, oldValue, newValue ->
        println("New values is $newValue")
    }
}

val scienceCourse: NewCourse by lazy {
    NewCourse("Science")
}

data class MapCourse(val map: Map<String, Any?>){
    val room: String by map
    val teacher: String by map
}

fun main(args: Array<String>) {
    val mapCourse = MapCourse(mapOf("room" to "Room 1", "teacher" to "Ms Price"))
    println(mapCourse)
}