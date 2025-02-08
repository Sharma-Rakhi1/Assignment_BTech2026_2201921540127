# Day 8

## Problem : Java Instanceof Keyword
[Visit Problem ↗](https://www.hackerrank.com/challenges/java-instanceof-keyword/problem)

This is a problem about using the `instanceof` operator in Java from **Hackerrank**.

### Problem Statement

CONCEPT: The Java `instanceof` operator is used to test if the object or instance is an instance of the specified type.

In this problem, we are given three classes in the editor:  
- `Student` class  
- `Rockstar` class  
- `Hacker` class  

In the main method, is an `ArrayList` with several instances of these classes. The `count` method calculates how many instances of each type are present in the `ArrayList`. The code prints three integers: the number of instances of the `Student` class, the number of instances of the `Rockstar` class, and the number of instances of the `Hacker` class.

TASK: To complete the missing code without adding, deleting, or modifying any extra lines.

### Solution
 Writing the conditional statemetns in the count() function to count the instances using  
 -mylist.get(i)instanceof(Student)  
where mylist.get(i) is to get the ith element of list and the instanceof checks it, class name in the bracket is the class for which we are checking the list element is an instance of.  

This problem helps understand the use of the `instanceof` keyword in Java.
