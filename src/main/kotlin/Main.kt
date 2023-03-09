fun main(){
    var mins = takes()
    println(mins)

    name("Am a girl")
    var y = make("Hello","There")
    println(y)

    val calculate = Calculator(1+1,2-4,60/2,7*8)
    println(calculate.addition)
    println(calculate.subtraction)
    println(calculate.division)
    println(calculate.multiplication)


}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun takes():Array<Int>{
   var numbers = arrayOf(24, 4, 45, 60, 2)
     println(numbers.min())
     println(numbers.max())
     println(numbers.average())
    return numbers


}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun name(detail: String){
//    var detail = "Am a girl"
    detail.split("")
    println(detail)

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun make(nam1:String, nam2:String): String{
    var x ="Hello $nam1, there $nam2"
    return x


}
//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class Calculator(var addition: Int, var subtraction: Int, var division: Int, var multiplication: Int){
    fun addition(){
        println(addition)
    }
    fun subtraction(){
        println(subtraction)
    }
    fun division(){
        println()
    }

}


