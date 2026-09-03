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

class PrimiumSavingAccount extends SavingsAccount {
    double PrimiumSavingRate;

    void extraInterest() {
        double interset = balance * interestRate / 100;
        balance += interset;
        System.out.println("Interest addes: " + interset + " New balance " + balance);
    }
}

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountHolderName = "john Doe";
        savingsAccount.balance = 1000.0;
        savingsAccount.interestRate = 5.0;
        savingsAccount.deposite(500.0);

        PrimiumSavingAccount primiumSavingAccount = new PrimiumSavingAccount();
        primiumSavingAccount.accountHolderName = "Akshada mune";
        primiumSavingAccount.balance = 500.0;
        primiumSavingAccount.interestRate = 5.0;
        primiumSavingAccount.deposite(500.0);

    }
}