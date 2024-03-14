class person{

    //Attributes/Properties
    var name = "Tacy"
    var age = 21
    var gender = "Female"

    //Behaviour/Method
    fun walk(){
        println("Person is walking")
    }
}

fun main() {
    var doctor = person()
    println(doctor.name)

    doctor.walk()
}