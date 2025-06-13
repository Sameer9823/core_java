

// Sealed Classes in Java
// Sealed classes allow you to control which classes can extend or implement them.

sealed class A permits B, C { // A is a sealed class that permits only B and C to extend it
    public void show() {
        System.out.println("Hello from A");
    }
}

final class B extends A {
    public void show() {
        System.out.println("Hello from B");
    }
}

final class C extends A {
    public void show() {
        System.out.println("Hello from C");
    }
}

sealed interface D permits E, F { // D is a sealed interface that permits only E and F to implement it
    void display();
}
final class E implements D {
    public void display() {
        System.out.println("Display from E");
    }
}
final class F implements D {
    public void display() {
        System.out.println("Display from F");
    }
}


public class Demo {
    public static void main(String[] args) {
        
    }
    
}
