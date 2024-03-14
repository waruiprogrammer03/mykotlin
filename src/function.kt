fun main() {
    //Predifined functions
    var y = Math.sqrt(169.0)
    println("The squareroot of 169.0 is $y")

    var x = Math.min(45,12)
    println("Mean value is $x")

    var z = Math.max(45,12)
    println("Max value is $z")

    var i = Math.round(67.45)
    println("Round value is $i")

    name()
    quotient(12,3)
    quotient(120,10)
    developers("Anna",23)
    

}
//User defined Functions
fun name(){
    println("Boni")
}

fun quotient(num1:Int, num2:Int){
    println(num1/num2)

}

fun developers(name:String,age:Int){
    println("$name is $age years old")

}