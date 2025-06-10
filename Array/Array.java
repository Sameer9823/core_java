

public class Array {
    public static void main(String[] args) {
        
        int[] number = {10, 20, 30, 40, 50};
        number[0] = 100; // Modifying the first element
        number[1] = 200; // Modifying the second element
        System.out.println(number[0]); // Accessing the first element
        System.out.println(number[1]); // Accessing the second element

        int[] numbers = new int[5]; // Declaring an array of size 5
        numbers[0] = 1; // Assigning value to the first element
        numbers[1] = 2; // Assigning value to the second element
        numbers[2] = 3; // Assigning value to the third element
        numbers[3] = 4; // Assigning value to the fourth element
        numbers[4] = 5; // Assigning value to the fifth element

        System.out.println(numbers[0]); // Accessing the first element
        System.out.println(numbers[1]); // Accessing the second element

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        //multi-dimensional array
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Accessing multi-dimensional array elements:");
        System.out.println("Element at [0][0]: " + multiArray[0][2]); // Accessing first element
        System.out.println("Multi-dimensional array:");
        for(int i = 0; i < multiArray.length; i++) {
            for(int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        for (int i[] : multiArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(); // New line after each row
        }


        // jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for(int n[]: jaggedArray) {
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println(); // New line after each row
        }

    }
    
}
