import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream<Integer> stream = number.stream(); // Create a stream from the list
        // Stream<Integer> stream2 = stream.filter(n -> n % 2 == 0); // Filter even numbers
        // Stream<Integer> stream3 = stream2.map(n -> n * 2); // Double the even numbers
        // int sum = stream3.reduce(0, (n1, n2) -> n1 + n2); // Sum the doubled even numbers
        // System.out.println("Sum of doubled even numbers: " + sum); // Print the sum

        int result = number.stream()
            .filter(n -> n % 2 == 0) // Filter even numbers
            .map(n -> n * 2) // Double the even numbers
            .reduce(0, Integer::sum); // Sum the doubled even numbers
        System.out.println("Sum of doubled even numbers: " + result); // Print the sum


        
        // stream2.forEach(n -> System.out.println(n)); // Print each number in the stream
        
        // number.forEach(n -> System.out.println(n));












        // Consumer<Integer> con = (n) -> System.out.println("Number: " + n);

        // number.forEach(con); // Using Consumer to iterate through the list


        // int sum =0;
        // for(int n : number){
        // if(n % 2 == 0) {
        // n = n * 2; // Double the even number
        // sum += n; // Add to sum
        // // System.out.println("Even number: " + n);
        // }
        // }

        // System.out.println("Original List: " + sum);
    }

}
