class Dog {

    String name;

    void bark() {
        System.out.println(name + " is Barking!");
    }
}

public class Main {
    public static void main(String[] args) {

        // Main obj = new Main();

        Dog obj = new Dog();
        obj.bark();
        obj.name = "Shimba";

    }
}