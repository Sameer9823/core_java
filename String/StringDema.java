public class StringDema{
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        String s3=s1.concat(s2);
        System.out.println(s3);

        String s = new String("sameer");
        System.out.println(s);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}