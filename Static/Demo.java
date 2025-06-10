

class Mobile {
    String name;
    int prise;
    static String brand;

    // Static block to initialize static variables if needed
    static {
        brand = "DefaultBrand";
        System.out.println("Static block executed. Brand initialized to: " + brand);
    }

    public void Show(){
        System.out.println(name + " : " + prise + " : " + brand);
    }
}

public class Demo {
    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.name = "sameer";
        m.prise= 45;
        Mobile.brand = "Samsung";

        Mobile m1 = new Mobile();
        m1.name = "Nokia";
        m1.prise= 45;
        Mobile.brand = "Samsung";

        m.Show();
        m1.Show();
    }
    
}
