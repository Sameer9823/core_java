
abstract class Car{
    public abstract void driver();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class Wagon extends Car{
    @Override
    public void driver() {
        System.out.println("Driving the Wagon");
    }

  
}

class Plane extends Wagon{
    

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}

public class Abstractema {
    public static void main(String[] args) {
        Plane car = new Plane();
        car.driver();
        car.playMusic();
        car.fly();


        // Example of using a method that might be abstract in a real scenario
        // If we had an abstract class, we would need to implement the abstract methods in a subclass.
        // For now, this is just a simple demonstration of method calls.
        
    }
}
