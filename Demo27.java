public class Demo27 {
    public static void main(String[] args) {
        int x=5;
        int y=2;

        boolean result1 = ++x ==5 & ++y <5;
        System.out.println(result1);

        int a =5;
        int b=2;

        boolean result2 =++a == 5 && ++b <5;
        System.out.println(result2);
        System.out.println(a);
        System.out.println(b);
    }
}
