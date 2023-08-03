public class Demo9 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="IJSE";
        int myInt=11;
        char myChar='!';

        String mystr=str1+" "+str2+" "+myInt+" "+myChar; //if we used the string value in 1st thats mean final output get as a string but otherwise if we used a int value in front its worked like as a adding
        System.out.println(mystr);

        System.out.println(mystr
                            .concat(str1)
                            .concat(str2)
                            .concat(mystr)
                            .concat(myInt + "")
                            .concat(myChar +""));


    }
}
