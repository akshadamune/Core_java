public class Mothods {

    // method wihtout return type

    void displyMsg() {
        System.out.println("This is a method");
        System.out.println("Wekcome Student");
    }

    // method with return type

    int add() {
        int a = 4;
        int b = 5;
        int result = a + b;
        return result;

    }

    // method with parameter type

    int add(int num1, int num2) {
        int result = num1 + num2;
        return result;

    }

    // Static method

    static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) {

        // method wihtout return type

        Mothods obj = new Mothods();
        obj.displyMsg();

        // void means nothig return
        // void we can not value inside void method

        // method with return type

        Mothods ob = new Mothods();
        System.out.println(ob.add());

        // method with parameter type

        Mothods obj1 = new Mothods();
        System.out.println(obj1.add(4, 5));
        System.out.println(obj1.add(14, 15));

        // Static method

        System.out.println(addition(4, 5));
        System.out.println(addition(14, 15));

    }
}
