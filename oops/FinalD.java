
class Calc{
    public final void show(){
        System.out.println("vhbjnkl");
    }

    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

class Adv extends Calc{
    @Override
    public void show() {
        System.out.println("In show of class Adv");
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Advanced Sum: " + (a + b));
    }

}

public class FinalD {
    public static void main(String[] args) {
        // final int num = 8;
        // num = 9;
        // System.out.println(num);

        Adv calc = new Adv();
        calc.show();
        calc.add(5, 10);
    }
}
