public class Forloopexample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int[] number = { 10, 20, 30, 40 };

        for (int n : number) {

            System.out.println(n);
        }
        // synatx :- for (iterable_type iterable_element : iterable) { }

        // even number print example

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}