// 1.) Check for Single Even:
// Write a function that takes in an integer and returns a Boolean indicating whether or not it is even. (See if you can write this in one line!)
def even(num: Int): Boolean={        
    return num%2 == 0
}

// println(even(7))
// 2.) Check for Evens in a List:
// Write a function that returns True if there is an even number inside of a List, otherwise return False.
def check_evens(list: List[Int]): Boolean={
    var is_even = true
    for (num <- list) {
        if (num%2 != 0) {
            is_even = false
        }
    }
    return is_even
}

// println(check_evens(List(2,4)))
// 3.) Lucky Number Seven:
// Take in a list of integers and calculate their sum. However, sevens are lucky and they should be counted twice.
def lucky_sum(list: List[Int]): Int={
    var som = 0
    for (num <- list) {
        som += num
        if (num == 7) som += num
    }
    return som
}

lucky_sum(List(4,6,5))

// 4.) Can you Balance?
// Given a non-empty list of integers, return true if there is a place to split the list so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
// For example, given the list (1, 5, 3, 3) would return true, you can split it in the middle, Another example (7,3,4) would return true 3+4=7. Remember you just need to return the boolean not the split index point.
def can_balance(list: List[Int]): Boolean={
        var a = 0
        var b = 1
    for (num <- Range(0,list.length)) {
        a = list.slice(0,num).sum
        b = list.slice(num,list.length).sum
        if (a == b) return true
    }
    return false
}
println(can_balance(List(6,4,10)))

// .5) Palindrome Check
// Given a String, return a boolean indicating wheteher or not it is a palindrom (Spelled the same forwards and backwards)
def palindrome(word: String): Boolean={
    return word == word.reverse
}

palindrome("hi")