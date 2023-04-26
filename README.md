# java-fundamentals

## Java Primitives and Control Flow (Lab01)

The lab provided practice for Java fundamentals with primatives, loops, conditionals, and control flow.

Created by: Dasha Burgos

Collaborated with: Raul(TA)

### Featured Tasks

1. Pluralize
    * This feature requested the creation of a method that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

2. Flipping Coin
    * This feature requested to write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

3. Command Line Clock
    * This feature requested to write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.


## Arrays, Loops, Imports, ArrayLists (Lab02)

This lab is dedicated to creating, interacting with and manipulating arrays in Java

Created By: Dasha Burgos

Collaborated With: Matt (TA)

### Featured Task

1. Rolling Dice
    * This feature requested to write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

2. Contains Duplicates
    * This feature requested write a function that would return true or false depending on if the array had dupliates.
  
3. Calculating Averages
    * This feature requested to write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

4. Arrays of Array
    * This feature requested for an array of arrays to calculate the average value for each array and return the array with the lowest average.

## Maps, File I/O, and Testing

This lab provided practice with `HashSet`, `HashMap`, and using `Path` for looking over a file. 

Created by: Dasha Burgos

### Featured Tasks

1. Maps - Analyzing Weather Data
   * Iterated over an array of arrays and find the min and max values. Also find what was not in the range of min and max and input that data in a string. Write a test for the function 
2. Tallying Election
   * Write a function that accepts a List of Strings and returns one string to show the most votes.
3. File I/O
   * Write a method that reads a file with a given `Path` and generates an error message whenever it finds a line outside the criteria

**Expectation:**

The file is expected to iterate over the file and determin if the data on that line meets criteria if not, it gives an error message. The message contains what lines have a semicolon missing. 

## Inheritance (lab06)

This lab gave insite on classes, objects, constructors, and how inheritance works in conjunction with each other. 

Collaborated with: Raul(TA) & Rey(Instructor) 

### Featured Tasks

1. Create a Class to represent a Restaurant.
      * This feature task requested that I create a class with three fields, a constructor, and tests for verificaton of funcationality.
3. Create a Class to represent Reviews.
      * This feature task requested that I create a class with three fields, a constructor, and tests for verificaton of funcationality.
4. Review a single Restaurant
      * This feature requested that a review is implemented to a restaurant.
5. Create addReview Method
      * This method will take in a Review and associate review Resturant 
6. Change Rating
      * addReview methoda should update the rating for a restaurant
      
 ## Implement (lab07)
 
 This lab allowed the creation of classes and interfaces to allow reviewing non-restaurant things, while ensuring some common functionality.
 
 Collaborated with Raul(TA) and Rey(Instructor)
 
 ### Featured Tasks
 
 1. Create a Class to represent a Shop
      * This feature task requested the creation of fields, a constructor, and test to verify functionality.
 2. Create ability to Reveiew Shop
      * This feature task requested the ability to review the Shop as well as test for functionality.
 3. Create a Cflass to represent Theaters
      * this feature task requested the creataion of fields, consturctor, and test to verify functionality.
 4. Ensure Shop and Theater are reviewable
      * This feature taskn requested the ability to review the Theater separately from everything else
