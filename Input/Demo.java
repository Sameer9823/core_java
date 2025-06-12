import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        // int num = System.in.read();

        // System.out.println(num.);
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        

        // BufferedReader bf = null;
        try {
            // System.out.println(num.);
            // InputStreamReader in = new InputStreamReader(System.in);
            // bf = new BufferedReader(in);
            
        } 
        finally{
            // bf.close();
        }

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
        {
                // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num + 2);
        }


        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num + 2);

        // bf.close();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num3 = sc.nextInt();
        int result = num + num3;
        System.out.println(result);

    }
    
}
