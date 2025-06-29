public class Dataypes {
    public static void main(String[] args) {
        // This is a simple Java program that demonstrates the use of different data types
        int num1 = 3; // Integer data type
        double num2 = 4.5; // Double data type
        String message = "The sum is: "; // String data type
        byte byteValue = 10; // Byte data type
        short shortValue = 20; // Short data type
        long longValue = 100000L; // Long data type
        float floatValue = 5.5f; // Float data type
        boolean t = true;

        double sum = num1 + num2; // Adding integer and double
        System.out.println(message + sum); // Printing the result
        System.out.println("Byte value: " + byteValue); // Printing byte value
        System.out.println("Short value: " + shortValue); // Printing short value
        System.out.println("Long value: " + longValue); // Printing long value
        System.out.println("Float value: " + floatValue); // Printing float value

        //literal values
        int num = 0b1010; // Binary literal
        System.out.println("Binary literal (0b1010): " + num); // Printing binary literal
    }
}
