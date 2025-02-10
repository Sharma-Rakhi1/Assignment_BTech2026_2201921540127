# Day 10

## Problem 1: Java Abstract Keyword
[Visit Problem ↗](https://www.geeksforgeeks.org/problems/java-abstract-keyword/1?page=1&category=OOP,Class,Java-Class%20and%20Object&sortBy=submissions)

This is a problem about using the `abstract` keyword in Java from **GeeksforGeeks**.

### Problem Statement

CONCEPT : The `abstract` keyword is a non-access modifier in Java, applicable for classes and methods, but not variables. It is used to achieve abstraction, which is one of the pillars of Object-Oriented Programming (OOP).  

Consider the following example of an abstract class:  

```java  
abstract class A {  
    int prod;  
    abstract void m1(int p, int q);  
    void m2() {  
        System.out.println(prod);  
    }
}  
```
- Here, m1() method is abstract indicating that it's implementation must be provided in child class 
- Abstract class's instance cannot be created thus it has to be inherited and then used.

TASK : Create a class B that extends the abstract class A. Implement the m1 method in class B to calculate the product of a1 and a2 and store it in the prod variable.

### Solution  
Providing the value of multiplication of parameters in function to the variable of parent class so that it output can be print through m2() in parent class.

This problem enhances our understanding of Abstraction.
