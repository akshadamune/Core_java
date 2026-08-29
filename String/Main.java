public class Main {

    public static void main(String[] args) {

        // StringExample.java

        String a = "Piyush";
        String b = "Piyush";
        System.out.println(a == b);

        String name1 = new String("Pranav");
        String name2 = new String("Paranav");
        System.out.println(name1 == name2); // false

        System.out.println(name1.equals(name2)); // true

        // immutable

        String a = "Pranav";
        a = a.concat("Java");
        System.out.println(a);

        int b = 10;

        System.out.println(b + 10); // 20

        System.out.println(b);

    }

}