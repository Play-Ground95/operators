public class Demo28 {
    public static void main(String[] args) {
        int x=2;
        int y=3;
        int z=4;

        boolean result1=x++ ==5|y++==3|z++==2;
        System.out.println(result1);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("----------------");


        int a=2;
        int b=3;
        int c=4;
        boolean result2=x++ ==5|y++==3|z++==2;
        System.out.println(result2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
