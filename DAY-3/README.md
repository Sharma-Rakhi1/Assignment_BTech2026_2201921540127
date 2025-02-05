# Day 3

## Problem 1: Java Interface

This is a problem about Java interfaces from **Hackerrank**.

### Problem Statement

CONCEPT : A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. 

You are given an interface `AdvancedArithmetic` which contains a method signature `int divisor_sum(int n)`. You need to write a class called `MyCalculator` which implements the interface.

The `divisorSum` function takes an integer as input and returns the sum of all its divisors. For example, divisors of 6 are 1, 2, 3, and 6, so `divisor_sum` should return 12. The value of `n` will be at most 1000.

### Solution

We are provided with the `AdvancedArithmetic` interface and a `Main` class in the editor. In the `Main` class, we created an instance of a class called `MyCalculator`.

1. Create a class `MyCalculator` that implements the `AdvancedArithmetic` interface.
2. Implement the `divisor_sum` method in `MyCalculator` to calculate the sum of all divisors of `n`.

This problem helps understand the use of interfaces and method implementation in Java.
