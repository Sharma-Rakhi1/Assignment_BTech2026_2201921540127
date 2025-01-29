# Day 1 

## Problem 1: Inheritance I

This is an Inheritance problem from **Hackerrank**.

### Problem Statement

Add a `sing` method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
    I am walking
    I am flying
    I am singing


### Solution

The problem provides us with a base class `Animal` and a derived class `Bird` with methods `walk` and `fly` respectively. The objective is to add a new method `sing` in class `Bird` to print the above lines as output.

This is a basic problem to understand the concept of inheritance and how to call methods through a class object.

---

## Problem 2: Inheritance II

This is another inheritance problem on **Hackerrank**.

### Problem Statement

Add the following to the editor code where indicated:
1. A class named `Arithmetic` with a method named `add` that takes integers as parameters and returns an integer denoting their sum.
2. A class named `Adder` that inherits from a superclass named `Arithmetic`.

### Solution

This problem is designed to help us understand that even if we do not have any methods in the derived class, we can still use the methods of the base class with the object of the child class.

---

# Day 2

## Problem : Java Abstract Class

This is a problem about Java abstract classes from **Hackerrank**.

### Problem Statement

Create a class `MyBook` that extends the abstract class `Book`. Implement the `setTitle` method in `MyBook` to set the title of the book.

CONCEPT: A Java abstract class cannot be instantiated and serves as a base for subclasses. It can contain abstract methods, which are methods declared without implementation and are defined using the `abstract` keyword.

### Solution

We are provided with the abstract `Book` class and a `Main` class in the editor. In the `Main` class, we created an instance of a class called `MyBook`.

1. Create a class `MyBook` that extends `Book`.
2. Implement the `setTitle` method in `MyBook` to set the `title` attribute.
3. Use `MyBook` in the `Main` class to verify the implementation.

This problem helps understand the use of abstract classes and method implementation in Java.
