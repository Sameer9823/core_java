

class A{
    public void show(){
        System.out.println("In show of class A");
    }

    public void config(){
        System.out.println("In config of class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In show of class B");
    }
}

public class MethodOveride {
    public static void main(String[] args) {

      

        B b = new B();
        b.show(); // Calls show of class B
        b.config();

        
    }
    
}
