class Outer {
    private int num = 10;

    class Inner {
        void display() {
            System.out.println("The value of num is : " + num);
        }
    }
}

public class Member_innerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner objInner = obj.new Inner();
        objInner.display();

    }
}