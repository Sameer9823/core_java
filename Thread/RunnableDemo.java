

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Hello " + i);
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {

//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("SAMEER " + i);
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {

//             }
//         }
//     }
// }


class Counter{
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable obj1 = () -> {
            for(int i = 0;i < 10; i++){
                counter.increment();
                // System.out.println("Counter: " + counter.count);
            }
        };
        Runnable obj2 = () ->{
            for(int i = 0;i < 10; i++){
               counter.increment();
               System.out.println("Counter: " + counter.count);
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.count);
        
    }
    
}
