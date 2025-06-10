

class A{

    public void show() {
        System.out.println("In show of class A");
    }

}

class B extends A{
     public void show() {
        System.out.println("In show of class B");
    }
}

class C extends A{
     public void show() {
        System.out.println("In show of class c");
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


    }
}
