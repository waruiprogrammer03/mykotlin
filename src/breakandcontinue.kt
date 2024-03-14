fun main() {
    for (number in 30..40){
        if (number == 35){
            break
        }
        println(number)
    }

    //Continue statement
    for (character in 'a'..'f'){
        if (character == 'd'){
            continue
        }
        println("character is $character")

    }
}