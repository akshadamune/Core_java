interface MyInterface {
    public void sayHello();

}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            public void sayHello() {
                System.out.println("Hello witbout Lambda Expression");
            }
        };

        obj.sayHello();

        // Use Lambda Expression

        MyInterface obj2 = () -> {
            System.out.println("Hello with using Lambda Expression");
        };
        obj2.sayHello();
    }
}