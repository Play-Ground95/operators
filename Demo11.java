public class Demo11 {
    public static void main(String[] args) {
        int x=5,a=5;
        int y=2, b=2;

        int result =++x + ++y + x++ + y;
        int result2 =++a + ++b + a++ + b;

        System.out.println(result);
        System.out.println(result2);

        //as these example we need to break the portions like as a signle portion that we called as a 'TOKEN'.
    }
}
