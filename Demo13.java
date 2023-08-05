public class Demo13 {
    public static void main(String[] args) {
        byte myByte=-20;
        byte myByte2= (byte)(myByte<<1); //first of all we get the binary value of -20(from2s complement) --> after we can shift in one digit -->and convert to decimal

        //EX- -20=11101100 -->after shifted= 11011000 =-40 



        short myShort=(short)(myByte<<1);
        
        System.out.println(myByte2);
        System.out.println(myShort);

        System.out.printf("%32s \n",Integer.toBinaryString(myByte));
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myByte2)));
        System.out.printf("%16s \n",Integer.toBinaryString(myShort));

        


    }
}
