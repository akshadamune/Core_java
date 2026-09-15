interface AccounOperations {
    void deposite(double amount);

}

interface LoanOperations {
    void applyLoan(double amount);
}

class SmartAccount implements AccounOperations, LoanOperations {
    double balance = 5000;
    String accountHolderString;

    public SmartAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderString = accountHolderName;
    }

    @Override
    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite: " + amount + "New Balance: " + balance);

        } else {
            System.out.println("Deposite amount must be positive.");
        }
    }

    @Override
    public void applyLoan(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit amount must be positive.");
        } else {
            System.out.println("Loan amount must be positive.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        SmartAccount account = new SmartAccount(5000, "Akshada Mune");
        account.deposite(1000);
        account.applyLoan(1000000);

    }

}