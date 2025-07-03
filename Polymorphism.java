
// Polymorphism in Java
// Polymorphism allows methods to do different things based on the object that it is acting upon.

// class Computer {
//     public void compute() {
//         System.out.println("Computing in Computer class");
//     }
// }

// class Laptop extends Computer {
//     public void compute() {
//         System.out.println("Computing in Laptop class");
//     }
// }


class A{
    public void show(){
        System.out.println("In show of class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In show of class B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In show of class C");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
        
        // Computer laptop = new Laptop();

    }
}
