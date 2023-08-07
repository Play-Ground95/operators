public class Demo25 {
    public static void main(String[] args) {
        boolean flag1= 5>2; //true
        boolean flag2=10<5; //false
        boolean flag3 ="ijse".length()==4; //true

        System.out.println(flag1&flag2);
        System.out.println(flag1&flag3);
        System.out.println();

        System.out.println(flag1|flag2);
        System.out.println(flag1|flag3);
        System.out.println(flag2|false);
         System.out.println();

        System.out.println(flag1^flag2); 
        System.out.println(flag1^flag3);
        System.out.println(flag2^false);

    }
}
