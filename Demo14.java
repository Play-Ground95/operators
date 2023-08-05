public class Demo14 {
    public static void main(String[] args) {
        byte myByte=10;
        byte myByte2= (byte)(myByte>>2);
        short myShort=(short)(myByte>>2);
        
        byte myByte3 =-127;
        
        System.out.println(myByte2);
        System.out.println(myShort);

    }
}
