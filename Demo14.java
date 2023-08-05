public class Demo14 {
    public static void main(String[] args) {
        byte myByte=10; //for postive values we cannot need the 2s complement. need a bonary value of 10 and its filled in int after we can shifted from 2
        byte myByte2= (byte)(myByte<<2);
        short myShort=(short)(myByte>>2);
        
        byte myByte3 =-127;
        
        System.out.println(myByte2);
        System.out.println(myShort);

    }
}
