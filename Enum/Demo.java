

// enum Status {
//     ACTIVE,
//     INACTIVE,
//     PENDING
// }

enum Laptop{
    Macbook(2000), XPS(), Surface(1500);

    
    private int price;
    private Laptop() {
         price = 300;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

    
}

public class Demo {
    public static void main(String[] args) {
        // Status s[] = Status.values(); // Assigning enum value
        // for(Status status : s) {
        //     System.out.println(status + " " + status.ordinal()); // Printing enum values
        // }

        // Status s = Status.INACTIVE;
        
        // switch (s) {
        //     case ACTIVE:
        //     System.out.println("START");
        //     break;
        //     case INACTIVE:
        //     System.out.println("INACTIVE");
        //     break;
        //     case PENDING:
        //     System.out.println("PENDING");
        //     break;

        //     default:
        //     System.out.println("Done");
        //     break;
        // }





        // if(s == Status.ACTIVE)
        // {
        //     System.out.println("all good");
        // } else if(s == Status.INACTIVE){
        //     System.out.println("try again");
        // } else {
        //     System.out.println("pending");
        // }

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " " + lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " " + lap.getPrice());
        }
    }
    
}
