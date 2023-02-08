//This function helps user to print out a hello message to the name given
fun greet(name:String){
    println("Hello $name")

}
//this function helps to print out the remainder of two devided numbers
fun Remainder(num1:Int,num2:Int):Int{
    return num1%num2

}
// function that returns the sum of any given 4 numbers
fun addition(num1: Int, num2: Int,num3:Int,num4:Int):Int{
    return num1+num2+num3+num4
}
// function that prints out an interesting fact about yourself
fun FunFact(sentence:String){
    println("Joyeuse,"+sentence)
}

fun main() {
    greet("Ada")
    var Rem = Remainder(12,6)
    println("the remainder of two numbers is:"+""+Rem)
    var sum = addition(12,34,65,87)
    println("The sum of four numbers is:"+""+sum)
    var fact = FunFact("you are soo cute")
}