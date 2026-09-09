class Parent {
    String name = "Parent";

}

class Child extends Parent {

    String name = "Child";

    public void printNames() {
        System.out.println("Child name:" + name);
        System.out.println("Parent name:" + super.name);
    }

}

class Employee {
    String company;

    Employee(String company) {
        this.company = company;
        System.out.println("Employee Constructor called");
    }

    void getDetails() {
        System.out.println(company);
    }
}

class Manager extends Employee {
    String department;

    Manager(String department, String company) {
        super(company);
        this.department = department;
        System.out.println("Manager Constructor called");
    }

    @Override
    void getDetails() {
        super.getDetails();
    }

}

public class Super_keywordExample {

    public static void main(String[] args) {

        Manger manager = new Manager("Sales", "ABC Corp")
    }

}
