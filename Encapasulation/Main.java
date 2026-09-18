class BankAccount {
    // balance data hiding
    private double balance;
    // AccountHoladername
    private String accountHoladername;

    public BankAccount(double balance, String accountHoladername) {
        this.balance = balance;
        this.accountHoladername = accountHoladername;
    }

    // getter mathods to access private fields
    public double getbalance() {
        return balance;
    }

    public String getAccountHoladername() {
        return accountHoladername;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite:" + amount);

        } else {
            System.out.println("Deposite amount must be positive");

        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Insufficient balance");

        }
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000, "Akshada mune");

        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("Account Holder Name" + account.getAccountHoladername());
        System.out.println("Balance: " + account.getbalance());
    }
}