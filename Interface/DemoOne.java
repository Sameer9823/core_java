


interface A{
    int show(int i, int j);
    
}



public class DemoOne {
    public static void main(String[] args) {
        // A obj = (i, j) -> System.out.println("jk");
        // obj.show(10, 8);

        A obj2 = (i, j) -> i+j;
        int result = obj2.show(4, 7);
        System.out.println(result);

        


        
    }
    
}
