class Human{
    private int age;
    private String name;


    public Human() {
        System.out.println("Default constructor called");
        this.age = 0; // Default age
        this.name = "Unknown"; // Default name
    }

    public Human(int age, String name) {
        System.out.println("Parameterized constructor called");
        this.age = age;
        this.name = name;
    }




    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



   
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Human h = new Human();

        Human h2 = new Human(30, "Alice");
        System.out.println("Age: " + h2.getAge() + ", Name: " + h2.getName());


        // h.setAge(25);
        // h.setName("John Doe");
        System.out.println("Age: " + h.getAge() + ", Name: " + h.getName());
    }
    
}
