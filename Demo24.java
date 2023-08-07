public class Demo24 {
    public static void main(String[] args) {
        
        byte result1 = 5 & 2;
        System.out.println(result1);
        byte result2 = (byte)(-2 & 0XFF);
        System.out.println(result2);
        byte result3 =0x2 | 0xA;
        System.out.println(result3);
        byte result4 =010 ^ 4;  //zero in first digit it get as a octal number

        int x= 10;
        float f =10f;
        float result=x+f;
        System.out.println(result);
    }
}
