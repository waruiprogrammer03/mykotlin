fun main() {

    var greeting = "Hello world"
    var firstname = "Boniface"
    var lastname = "eMobilis"

    //String Concatentation
    println(firstname + " "+lastname)
    println(firstname.plus(lastname))


    //Accessing a character in a string
    println(greeting[6])

    //Determining the index position of an element
    println(greeting.indexOf(char = 'H'))
    println(greeting.indexOf(string = "world"))

    //Size of a string
    println(greeting.length)

    //Modifying a string
    println(greeting.uppercase())

    //String Interpolation
    println("Hello there, my name is $firstname $lastname")
}


