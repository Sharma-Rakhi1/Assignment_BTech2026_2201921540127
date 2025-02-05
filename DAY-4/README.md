# Day 4

## Problem 1: Method Overriding

This is a problem about method overriding in Java from **Hackerrank**.

### Problem Statement

CONCEPT: Overriding is the process where a subclass provides a specific implementation of a method that is already defined in its superclass.Here are it's key Points: 
          1. Method Signature: The method name and parameter list must match the superclass method. 
          2. @Override Annotation: Typically used to indicate that a method is being overridden. 
          3. Inheritance: Allows subclasses to modify or extend the functionality of superclass methods.

### Task

Complete the code in your editor by writing an overridden `getNumberOfTeamMembers` method that prints the same statement as the superclass's `getNumberOfTeamMembers` method, except that it replaces `n` with `11` (the number of players on a Soccer team).

### Solution

We have provided the `Sports` class and a `Main` class in the editor. In the `Main` class, we created instances of the classes and tested the methods.

1. Create a class `Soccer` that extends `Sports`.
2. Override the `getName` method in `Soccer` to return "Soccer Class".
3. Override the `getNumberOfTeamMembers` method in `Soccer` to print "Each team has 11 players in Soccer Class".
