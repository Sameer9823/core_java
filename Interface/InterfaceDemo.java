
abstract class Computer{
    public abstract void code();
}


class Developer{
      public void run(Computer dev) {
        dev.code(); // Calling method from Developer class
    }
}

class Desktop extends Computer {
    public void code(){
        System.out.println("Coding in Python");
    }
}

class Laptop extends Computer {
  

    @Override
    public void code() {
        // TODO Auto-generated method stub
        System.out.println("Coding in Java");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
      Computer lap = new Laptop(); // Creating an instance of Laptop
      Computer desk = new Desktop(); // Creating an instance of Desktop

      Developer dev = new Developer(); // Creating an instance of Developer
      dev.run(desk); // Calling code method on Laptop instance
    }
    
}
