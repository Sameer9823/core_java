// File: oops/Demo.java

class Calculator {
    public int add(int a, int b) {
        System.out.println("Adding the number");
        return a + b;
       
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        // int sum = num1 + num2;
        // System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);
        System.out.println("Result of addition: " + result);
        
        // This is a simple Java program that demonstrates the use of a Calculator class to add two numbers.
        // The Calculator class has a method called add that takes two integers as parameters and returns their

        Calculator calculator2 = new Calculator();
        int result2 = calculator2.add(5, 7);
        System.out.println("Result of addition: " + result2);
    }
}
