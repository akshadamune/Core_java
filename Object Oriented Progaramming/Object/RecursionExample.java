public class RecursionExample {

    static void fun(int n) {

        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }

    static void fun2(int n) {

        if (n > 0) {
            System.out.println(n);
            fun2(n - 1);
        }
    }

    static void fun3(int n) {
        if (n > 0) {
            System.out.println(n);
            fun3(n - 1);
        }
    }

    public static void main(String[] args) {

        int x = 3;
        fun(x);
        fun2(x);

    }
}
