
class A{
  public void show1(){
    System.out.println("In show1 of class A");
  }
}

class B extends A{
  public void show2(){
    System.out.println("In show2 of class B");
  }
  
  


}

public class Typecast {
    public static void main(String[] args) {
        A obj = new A();
        // obj.show1();
        // obj.show2(); // This will cause a compile-time error because show2() is not defined in class A 
        
        //upcast
        A upcastedObj = new B(); // Upcasting: B is treated as A
        upcastedObj.show1(); // Calls show1 from class A

        //DOWN CAST
        B obj1 = (B) upcastedObj; // Downcasting: A is treated as B
        obj1.show2(); // Calls show2 from class B

      
    }
    
}
