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

    }
}
