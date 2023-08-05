public class Demo12 {
    public static void main(String[] args) {
        byte myByte =10;
        byte myByte2 =(byte) (myByte<<2); //skip the two digit points of the value //but dont effect for the value's
        
        System.out.println(myByte2);
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myByte)));
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myByte2)));
        
    }
}
