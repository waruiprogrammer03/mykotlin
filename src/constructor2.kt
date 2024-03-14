class Dog(var name:String, var breed:String, var weight:Int){

    fun move(movement:String){
        println("The Dog is $movement")

    }

}

fun main() {
    var dog1 = Dog("Murife","Pitbull",20)
    var dog2 = Dog("Bob","German",50)
    var dog3 = Dog("Simba","bulldog",30)

    println(dog1.breed)
    dog2.move(movement = "running")
    dog1.move(movement = "walking")
}