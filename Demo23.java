public class Demo23 {
    public static void main(String[] args) {
        //AND &
        // OR |
        // XOR ^
        
        
        byte myByte1 =0B0000_0101;
        byte myByte2 =0B0000_0011;

        byte myResult =(byte)(myByte1&myByte2);

        System.out.println(myResult);
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myResult)));
        System.out.println("----------------------");

        byte myResult2 = (byte)(myByte1|myByte2);
        System.out.println(myResult2);
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myResult2)));
        System.out.println("----------------------");

        byte myResult3 = (byte)(myByte1^myByte2);
        System.out.println(myResult3);
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myResult3)));

    }
}
