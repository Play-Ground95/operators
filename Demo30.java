public class Demo30 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        String result = (++a ==b)? "DEP"+(10+1):"IJSE";
        System.out.println(result);

       b= ++b> a ? (b=a+b):(a=a++ +b);
       System.out.println(b);
       System.out.println(a);
    }
}
