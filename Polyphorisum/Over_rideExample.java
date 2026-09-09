class Employee {

    String name;
    double baseSalary;

    public double calculateSalary() {
        return baseSalary; // Default logic
    }

    public void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Base Salary:" + calculateSalary());
    }
}

// derive class
class FulltimeEmployee extends Employee {

    double bonus;

    @Override
    public double calculateSalary() {
        return baseSalary + bonus; // Default logic
    }
}

class ParttimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Default logic
    }
}

class TemperoryEmployee extends Employee {

    double dailyRate;
    int dailyWorked;

    @Override
    public double calculateSalary() {
        return dailyRate * dailyWorked; // Default logic
    }
}

public class Over_rideExample {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Piyush patekar";
        emp.baseSalary = 50000;
        emp.displayDetails();

        FulltimeEmployee FulltimeEmp = new FulltimeEmployee();
        FulltimeEmp.name = "Rohit";
        FulltimeEmp.baseSalary = 60000;
        FulltimeEmp.bonus = 10000;
        FulltimeEmp.displayDetails();

        ParttimeEmployee parttimeEmployee = new ParttimeEmployee();
        parttimeEmployee.name = "Akshada";
        parttimeEmployee.hourlyRate = 1000;
        parttimeEmployee.hoursWorked = 8;
        parttimeEmployee.displayDetails();

        TemperoryEmployee temperoryEmployee = new TemperoryEmployee();
        temperoryEmployee.name = "Sai";
        temperoryEmployee.dailyRate = 200;
        temperoryEmployee.dailyWorked = 4;
        temperoryEmployee.displayDetails();

    }
}