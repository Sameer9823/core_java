



class A {
    protected int a = 10;
    private String name = "sameer";

    public A() {
        System.out.println("Constructor of class A");
        System.out.println(a);
    }

    public void show() {
        System.out.println("In show of class A");
        System.out.println(name);
    }


    
}

 class B extends A{
    public void FBD(){
        System.out.println(a);
    }

    public void display(){
        System.out.println(a);
    }


}


public class Modifier {
    public static void main(String[] args) {
        B kfjgj = new B();
        kfjgj.display();

        kfjgj.FBD();

        kfjgj.show(); // Calls the show method from class A

        // kfjgj.name = "new name"; // This line would cause an error because 'name' is private in class A
        
        
    }
}
