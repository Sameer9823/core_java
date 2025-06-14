
record A (int age, String name) implements Cloneable{
    static int num;
    public A{
        if(age==0)
            throw new IllegalArgumentException("dvrv");

        
    }
};

class AnotherDemo {
    public static void main(String[] args) {
        A a = new A(12, "sameer");
        A b = new A(8, "sameer");

        System.out.println(a.age());
        System.out.println(a.equals(b));
    }

     
}