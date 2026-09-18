public class Main {
    public static void main(String[] args) {

        Integer a = 100; // primtive
        Integer b = 100; // Warpper class

        System.out.println(a == b);
        System.out.println(a.equals(b));

        // generics,collections we use the weapper classes
        // loops,if the perfroms is critical we dont use the wrapper classes
    }
}