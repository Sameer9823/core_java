
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
    public static void main(String args[]){
        // This is a simple Java program that demonstrates type casting

      int a = 257;
      byte k = (byte) a;
      System.out.println(k);

      float f = 3.14f;
      int i = (int) f; // Explicit type casting from float to int
      System.out.println(i);

      //type pramotion
      byte b = 10;
      byte d = 30;
      int c = b * d; // Implicit type promotion from byte to int
      System.out.println(c);

      // Type casting between classes

      A obj = new A();
      obj.show1();
    }
}
