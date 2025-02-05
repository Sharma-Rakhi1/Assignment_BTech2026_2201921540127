# Day 5

## Problem 1: Java Inheritance
[Visit Problem ↗](https://www.geeksforgeeks.org/problems/java-inheritance/1?page=1&category=OOP,Class,Java-Class%20and%20Object&sortBy=submissions)

This is a problem about Java inheritance from **GeeksforGeeks**.

### Problem Statement

CONCEPT: Inheritance is an important pillar of OOP (Object Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class.
Consider the following class `cls1`:

class cls1 {
    void add(int p, int q) {
        System.out.println(p + q);
    }
}

There is another class `cls2` which extends class `cls1`:

class cls2 extends cls1 {
    void mul(int p, int q) {
        System.out.println(p * q);
    }
}

We can create an object of class `cls2`, which can use both `mul` and `add` methods. The main function is already created in the editor and an instance of `cls2` is also made.   
The task is to add a method in class `cls2` named `task()` which will take 2 parameters as input (i.e., `a` and `b`) and print the sum of their squares (i.e., a² + b²). 

### Solution

1. Create a method `task()` in class `cls2` that takes two parameters, `a` and `b`, and prints the sum of their squares.
2. Using System.out.print() method to print the output.

This problem helps understand the concept of inheritance in Java.
