//FUNCTIONS
val numbers = List(1,2,3,7)

def check(nums:List[Int]): List[Int]={
    return nums
}
println(check(numbers))

// def isPrime(num:Int): Boolean={
//     for (n <- Range(2,num)) {
//         if (num%n == 0) {
//             return false
//         }

//     }
//         return true
// }

// println(isPrime(11))
// println(isPrime(8))

// def greetName(name:String): String={
//     return s"Hello $name"
// }

// val fullgreet = greetName("Brandon")
// println(fullgreet)

// def adder(num1: Int, num2:Int): Int = {
//     return num1 + num2
// }

// adder(4,5)

// def simple(): Unit = {
//     println("simple print")
// }

// simple()

// While Loops

// import util.control.Breaks._

// var y = 0

// while (y < 10) {
//     println(s"y is currently $y")
//     println("y is still less than 10, add 1 to y")
//     y = y+1

//     if (y==3) break
// }

// var x = 0

// while(x < 5) {
//     println(s"x is currently $x")
//     println("x is still less than 5, adding 1 to x")
//     x = x+1
// }

////////////////////////////
///// GENERAL FORMAT //////
//////////////////////////
// for(item <- iterable_sequence ) {
//     do something
// }

// for (num <- Range(0,10)) {
//     if(num%2 == 0) {
//         println(num)
//     }
// }

// val names = List("John", "Abe", "Cindy", "Cat")

// for (name <- names) {
//     if (name.startsWith("C")) {
//         println(s"$name starts with a C")
//     }
// }

// val person = "George"

// if (person == "Sammy") {
//     println("welcome Sammy")
// } else if (person == "George") {
//     println("welcome George")
// } else {
//     println("What is your name ?")
// }
// AND
// println((1 == 2) && (2 == 2))
// // OR 
// println((1 == 2) || (2 == 2))
// // NOT !
// println(!(1 ==1))