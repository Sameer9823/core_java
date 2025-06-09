public class Loop {
    public static void main(String[] args) {
        int num = 2;
        for(int i = 1; i <= 10; i++) {
            // System.out.println(num + " * " + i + " = " + (num * i));        

        }

        for (int i = 0;i <=55; i++){
            if(i % 2 ==0){
                // System.out.println(i + " is even");
            } 
        }

        int h = 20;
        while(h <= 30) {
            // System.out.println(h);
            int j = 0;
            while(j < 2) {
                // System.out.println("Inner loop: " + j);
                j++;
            }
            h++;
        }
        // System.out.println("Loop finished" + " "  +h);

        int mm = 98;
        do {
            System.out.println("Value of mm: " + mm);
            mm++;
        } while (mm > 120);
    }

}
