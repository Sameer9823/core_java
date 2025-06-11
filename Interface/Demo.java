interface A{

    int age = 7;
    String name = "genny";

    void show();
    void config();
}

interface X{
    void display();
}
interface Y extends X {
    void config();
}

class B implements A, Y {
    public void show() {
        System.out.println("Show method in class B");
    }
    public void config() {
        System.out.println("Config method in class B");
    }
    public void display() {
        System.out.println("Display method in class B implementing interface X");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B(); // Creating an instance of class B implementing interface A
        obj.show(); // Calling show method from class B
        obj.config(); // Calling config method from class B
        Y objX = new B(); // Creating an instance of class B implementing interface X
        objX.config(); // Calling display method from class B implementing interface X
        objX.display(); // Calling config method from class B implementing interface Y

        System.out.println("Age: " + A.age + ", Name: " + A.name); // Accessing static variable from interface A
    }
    
}
