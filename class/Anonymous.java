class A{
    public void show() {
        System.out.println("Show method in class A");
    }
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
    }
    
}
