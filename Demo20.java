public class Demo20 {
    public static void main(String[] args) {
        
        int x = 5;
        int y = 2;

        boolean result = x > y;
        System.out.println(result);

        // gt   >
        // lt   <
        // gte  >= //greter than or equal
        // lte  <= //less than or equal
        System.out.println();

        System.out.println(new Dog() instanceof Dog);
        System.out.println(new Dog() instanceof Animal);
        // System.out.println(new Box() instanceof Animal);
        System.out.println(new Box() instanceof Object);
    }
}

class Animal {} //that is parent class
class Dog extends Animal {} //that was inherited by parent class. //hence that is true. dog is a animal
class Cat extends Animal {}
class Box {}
