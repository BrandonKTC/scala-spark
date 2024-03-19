// 1.) Can you figure out what method you can use to find out if the list: List(1,2,3,4,5) contains the number 3?
List(1,2,3,4,5) contains 3
// 2.) How can you add all the elements of the previous list?
List(1,2,3,4,5) sum 
// 3.) Create an Array of all the odd numbers from 0 to 15
Array.range(1,15,2)
// 4.) What are the unique elements in the list: List(2,3,1,4,5,6,6,1,2)?
List(2,3,1,4,5,6,6,1,2).toSet = Set(5, 1, 6, 2, 3, 4)
// 5.) Create a mutable map that maps together Names to Ages. It should have the following key value pairs: Sammy, 3 Frankie, 7 John, 45
val mutMap = collection.mutable.Map(("Sammy", 3), ("Frankie", 7), ("John", 45))
// Now do the following:

// 5a) Print out all the keys
mutMap.keys = Set(Sammy, Frankie, John)
// 5b) Add the key value pair ("Mike",27)
mutMap += ("Mike" -> 27)