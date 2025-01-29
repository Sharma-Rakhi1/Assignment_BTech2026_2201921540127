import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Parent or Base class
class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}
// Child or Derived class inheriting parent class using extend keyword
class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
    void sing()
        {
            System.out.println("I am singing");
        }
}

public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk(); //object of child using parent's functionality
	  bird.fly();
          bird.sing();
	
   }
}
