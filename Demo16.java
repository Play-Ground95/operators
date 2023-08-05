public class Demo16 {
    public static void main(String[] args) {
        byte x = 2; //0010
        int y = x << 1; //0100 =4
        y = y + x; //4+2 =6
        System.out.println(y);

        System.out.println();

        byte a = 5;             // 0101
        int b = a >>> 2;        // 01
        b = a + b;
        System.out.println(b);

    }
}
