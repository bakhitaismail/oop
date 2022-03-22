fun main() {
    var bakky = Human("Bakhita Ismail", 20, 35)
    bakky.eat(5)
    println(bakky.weight)
    var speech = "I love coding!"
    println(speech)
    bakky.birthday(1)
    println(bakky.age)
    var c = user("Trevor", "Noah", "trevornoah@gmail.com", "0711476132", "trevornoah")
    println(c.firstName)
    println(c.phoneNumber)






}
class Human(var name: String, var age: Int, var weight: Int ) {

    fun eat(foodWeight: Int): Int {
        var foodWeight = 5
        println("I am eating ${foodWeight} kgs of food")
        weight += foodWeight
        return weight
    }
    fun speak(speech: String): String {
        return speech

    }

    fun birthday(birth: Int): Int {
        age += birth
        return age
    }
}
data class user(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String) {


}