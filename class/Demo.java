class A{

    int age;

    public void show() {
        System.out.println("Age: " + age);
    }
    class B{
    public void display() {
        System.out.println("Display method in class B");    

    }
    

}
    static class C{
        public void print() {
            System.out.println("Print method in static class C");
        }
    }
   

}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.age = 25; // Setting age
        obj.show(); // Calling method from class A

        A.B objB = obj.new B(); // Creating an instance of inner class B
        objB.display(); // Calling method from inner class B

        A.C obj2 = new A.C(); // Creating an instance of static class C
        obj2.print(); // Calling method from static class C
    }
}
