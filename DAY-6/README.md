# Day 6

## Problem : Java Override
[Visit Problem ↗](https://www.geeksforgeeks.org/problems/java-override/1?page=1&category=OOP,Class,Java-Class%20and%20Object&sortBy=submissions)

This is a problem about method overriding in Java from **GeeksforGeeks**.

### Problem Statement

CONCEPT: In any object-oriented programming language, overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, parameters or signature, and return type (or sub-type) as a method in its super-class, the method in the subclass is said to override the method in the super-class.

Consider the following parent class:

class Parent {
    void show(int p) {
        System.out.print(p + " ");
    }
    void print(int q) {
        System.out.println(q + " ");
    }
}

Also given a class named Child which inherits from Parent class:

class Child extends Parent {
    @Override
    void show(int p) {
        System.out.print(p + " ");
    }
}

### Task

Create a method named `print` (which takes one integer as input) in class Child that overrides the method `print` of the Parent class such that it prints the square of the input integer. In the main function, instances of both classes are made and all methods are called in the editor.

### Solution

1. Create a method `print(int q)` in class `Child` that overrides the method `print` in the `Parent` class.
2. Implementing the `print` method to print the square of the input integer as q*q.

This problem helps understand the concept of method overriding in Java.
