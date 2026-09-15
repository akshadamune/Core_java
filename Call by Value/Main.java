
public class Main {

    public static void chnageValue(int a) {
        a = 10;
        System.out.println("Inside changevalue:" + a);

    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before changevalue:" + a); // 5
        chnageValue(a);
        System.out.println("After changeValue: " + a); // 10
    }
}