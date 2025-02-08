package inheritance_account.logic;

public class LimitedAccount extends Account {
    private double limit;

    public LimitedAccount(double balance, double limit) {
        super(balance);
        this.limit = limit;
    }

    public void limitSet() {
        limit = getBalance() / 2;
    }

    @Override
    public void extract(double quantity) {
        if (quantity <= limit) {
            super.extract(quantity);
        } else {
            super.extract(limit);
        }
    }
}
