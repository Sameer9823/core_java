
class A extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello " + i);
           try {
             
             Thread.sleep(10);
           } catch (Exception e) {
            
           }
        }
    }
}
class B implements Runnable {
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("SAMEER " + i);
             try {
             
             Thread.sleep(10);
           } catch (Exception e) {
            // TODO: handle exception
           }
           
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        // obj1.show();
        // obj2.show();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();



        
       
  
}}
