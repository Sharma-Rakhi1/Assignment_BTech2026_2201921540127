# Day 7

## Problem 1: Java Method Overriding 2 (Super Keyword)
[Visit Problem ↗](https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem)

This is a problem about method overriding in Java from **Hackerrank**.

### Problem Statement

CONCEPT: When a method in a subclass overrides a method in a superclass, it is still possible to call the overridden method using the `super` keyword. If you write `super.func()` to call the function `func()`, it will call the method that was defined in the superclass.

TASK: You are given a partially completed code in the editor. Modify the code so that the code prints the following text:  
        Hello I am a motorcycle, I am a cycle with an engine.   
        My ancestor is a cycle who is a vehicle with pedals.  


### Solution

1. Modify the constructor code in class `Motorcycle` to include the `super` keyword with method to call the overridden method in the superclass.
2. The super class method will be called as 'super.define_me()'.




