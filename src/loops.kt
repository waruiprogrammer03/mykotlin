fun main() {
    //While loop
    var number = 20
    while (number <=25){
        println("Number is $number")
        number++
    }

    //Decrement
    var num = 100
    while (num >= 95) {
        println("decrement is $num")
        num--
    }

    //Do..while loop
    var x = 34
    do {
        println(x)
        x++
    }while (x <= 40)

    //For loop
    var devices = arrayOf("Laptop","Phone","Tablet")
    for (device in devices){
        println("Device is $device")

    }

    var marks = arrayOf(100,72,45)
    for (mark in marks){
        println("The marks are $mark")
    }
for (mynumber in 50..60){
    println(mynumber)
}

for (Letter in 'a'..'d')
    println("Letter is $Letter")




}