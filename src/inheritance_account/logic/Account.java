package inheritance_account.logic;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void entry(double quantity) {
        balance += quantity;
    }

    public void extract(double quantity) {
        balance -= quantity;
    }
}
