public class Nested {
    public static void main(String[] args) {
        int age = 7;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense == true) {
                System.out.println(true);
            } else {
                System.out.println("you Need License");
            }
        } else {
            System.out.println("you are underage");
        }
    }
}
