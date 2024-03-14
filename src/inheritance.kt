//Parent class/Base class/Super class

open class Animal{
    var age = 3
    var gender = "Female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//Child class
open  class Duck:Animal(){
    var color = "White"
    fun sound(){
        println("The duck is quacking")
    }
}
 class Fish:Duck(){
     var hasScales = true
     var hasFins = true
     fun eat(){
         println("Fish is eating")
     }
 }

fun main() {
    var elephant =Animal()
    elephant.move("Walking")
    println(elephant.age)

    var duckling = Duck()
    duckling.move("Swimming")
    println(duckling.color)

    var nileparch = Fish()
}