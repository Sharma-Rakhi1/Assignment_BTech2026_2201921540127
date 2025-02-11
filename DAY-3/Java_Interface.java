import java.util.*;

//'interface' keyword used to define interface
interface AdvancedArithmetic{
  //methods of interface are implicitly public and abstract
  int divisor_sum(int n);
}

//Write your code here

//use of keyword- 'implements' unlike inheritance where 'extends' is used
class MyCalculator implements AdvancedArithmetic{
  // use of for loop to implement the method
    public int divisor_sum(int n){
        int sum =n;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

