

class SamException extends Exception{
    public SamException(String string){
            super(string);
    }
}

class A {
    public void show() throws ClassNotFoundException
    {
        Class.forName("DemodO");
    }
}

public class DemoO {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int nums[] = new int[5];

        A obj = new A();
        
        try {
            obj.show();
            
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("something went wrong");
            e.printStackTrace();
        }



        // try {
        //    j = 18/i;
        //    if(j==0)
        //    throw new SamException("lkfvmkll");
        //    System.out.println(j);
        // } catch (SamException e) {
        //     j = 18/1;
        //     System.out.println("Default Output" + " " + e);
        // } catch (Exception e){
        //     System.out.println("Error" + " " + e.getMessage());
        // }
    }
    
}
