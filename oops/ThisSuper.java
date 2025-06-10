class A {
    public A() {
        super();
        System.out.println("Constructor of class A");
    }
    public A(int n) {
        super();
        System.out.println("Constructor of class A with parameter: " + n);
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("Constructor of class B");
    }
    public B(int n) {
        this();
        System.out.println("Constructor of class B with parameter: " + n);
    }
    public void display() {
        System.out.println("Display method in class B");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B b = new B(5);
    }
}