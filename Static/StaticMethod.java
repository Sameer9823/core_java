
class Mobile {

    int price;
    String name;
    static String brand;

    public void show(){
        System.out.println("Instance method called");
        System.out.println(name + " : " + price + " : " + brand);
    }

    public static void show1(){
        System.out.println("Static method called");
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.name = "Sameer";
        m.price = 45;
        Mobile.brand = "Samsung";

        Mobile m1 = new Mobile();
        m1.name = "Nokia";
        m1.price = 50;
        Mobile.brand = "Nokia";

        m.show();
        m1.show();

        // Calling static method
        Mobile.show1();
        
    }
    
}
