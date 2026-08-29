public class Immutable {

    public static void main(String[] args) {

        // immutable

        String a = "Pranav";
        a = a.concat("Java");
        System.out.println(a);

        int b = 10;

        System.out.println(b + 10); // 20

        System.out.println(b);
    }
}
