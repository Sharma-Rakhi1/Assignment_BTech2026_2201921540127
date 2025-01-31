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

---

# Day 3

## Problem : Java Interface

This is a problem about Java interfaces from **Hackerrank**.

### Problem Statement

CONCEPT: A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.

You are given an interface `AdvancedArithmetic` which contains a method signature `int divisor_sum(int n)`. You need to write a class called `MyCalculator` which implements the interface.

The `divisorSum` function takes an integer as input and returns the sum of all its divisors. For example, divisors of 6 are 1, 2, 3, and 6, so `divisor_sum` should return 12. The value of `n` will be at most 1000.

### Solution

We have provided the `AdvancedArithmetic` interface and a `Main` class in the editor. In the `Main` class, we created an instance of a class called `MyCalculator`.

1. Create a class `MyCalculator` that implements the `AdvancedArithmetic` interface.
2. Implement the `divisor_sum` method in `MyCalculator` to calculate the sum of all divisors of `n` using a `for loop`.

This problem helps understand the use of interfaces and method implementation in Java.

---

# Day 4

## Problem 1: Method Overriding

This is a problem about method overriding in Java from **Hackerrank**.

### Problem Statement

CONCEPT: Overriding is the process where a subclass provides a specific implementation of a method that is already defined in its superclass.Here are it's key Points:
          1. Method Signature: The method name and parameter list must match the superclass method.
          2. @Override Annotation: Typically used to indicate that a method is being overridden.
          3. Inheritance: Allows subclasses to modify or extend the functionality of superclass methods.

The ####Task is to complete the code in your editor by writing an overridden `getNumberOfTeamMembers` method that prints the same statement as the superclass's `getNumberOfTeamMembers` method, except that it replaces `n` with `11` (the number of players on a Soccer team).

### Solution

We have provided the `Sports` class and a `Main` class in the editor. In the `Main` class, we created instances of the classes and tested the methods.

1. Create a class `Soccer` that extends `Sports`.
2. Override the `getName` method in `Soccer` to return "Soccer Class".
3. Override the `getNumberOfTeamMembers` method in `Soccer` to print "Each team has 11 players in Soccer Class".

This problem helps understand the concept of method overriding in Java.
