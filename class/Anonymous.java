class A{
    public void show() {
        System.out.println("Show method in class A");
    }
}

abstract class B {
    public abstract void display();

}



public class Anonymous {
    public static void main(String[] args) {
        A obj = new A()
        {            // Anonymous class extending A
            public void show() {
                System.out.println("Display method in anonymous class");
            }
        };
        obj.show(); // Calling method from class A

        B objB = new B() { // Anonymous class extending abstract class B
            public void display() {
                System.out.println("Display method in anonymous class B");
            }
        };  
        objB.display(); // Calling method from anonymous class B
        // Anonymous class implementing an interface

    }


    
}
