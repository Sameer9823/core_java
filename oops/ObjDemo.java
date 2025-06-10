


class A{
    public A(){
        System.out.println("Constructor of class A");


    }
    public void show(){
        System.out.println("In show");
    }

}

public class ObjDemo {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
    
}
