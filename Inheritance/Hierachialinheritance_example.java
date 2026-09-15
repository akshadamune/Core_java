class Account {
    String accountHolderName;
    double balance;

    void deposite(double amount) {
        balance += amount;
        System.out.println("Deposite: " + amount + " New balance: " + balance);
    }
}

// Derived class
class SavingsAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interset = balance * interestRate / 100;
        balance += interset;
        System.out.println("Interest added: " + interset + " New balance " + balance);
    }
}

// Derived 2 class

class CurrentAccount extends Account {

    double overdraflimit;

    void withdraw(double amount) {
        if (balance + overdraflimit >= amount) {
            balance -= amount; // balance + balance - amount;
            System.out.println("Withdrawn: " + amount + " New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
        }
    }
}

public class Hierachialinheritance_example {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountHolderName = "Piyush Patekar";
        savingsAccount.balance = 1000.0;
        savingsAccount.interestRate = 5.0;
        savingsAccount.deposite(500.0);
        savingsAccount.applyInterest();

        CurrentAccount current = new CurrentAccount();
        current.accountHolderName = "Rohit";
        current.balance = 1000;
        current.overdraflimit = 500;
        current.deposite(500);
        current.withdraw(2800);

    }  

    // 

}
