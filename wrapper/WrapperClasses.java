
public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = 8; // autoboxing

        int num2 = num1; // autounboxing

        System.out.println(num2);

        System.out.println(num1);

        String str = "12";

        int num3 = Integer.parseInt(str); // converting String to int


        System.out.println(num3 + 2);
    }
}
