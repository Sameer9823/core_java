

class Calc{
    int add(int a, int b) {
        return a + b;
    }
    
    int sub(int a, int b) {
        return a - b;
    }
}

class Advcalc extends Calc{
    int mul(int a, int b) {
        return a * b;
    }
    
    int div(int a, int b) {
        return a / b;
    }



}

class VeryAdvanceCal extends Advcalc{
    public double power(int a, int b){
        return Math.pow(a, b);
    }
}

//---------------------------------------------



public class Inheritance {
    public static void main(String[] args) {

        VeryAdvanceCal obj = new VeryAdvanceCal();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.sub(2, 3));
        System.out.println(obj.mul(2, 3));
        System.out.println(obj.div(2, 3));
        System.out.println(obj.power(2, 3));
        
    }
    
}
