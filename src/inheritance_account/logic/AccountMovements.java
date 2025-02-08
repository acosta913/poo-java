package inheritance_account.logic;

import java.util.HashSet;

import inheritance_account.beans.Movements;

public class AccountMovements extends LimitedAccount {
    private HashSet<Movements> movements;

    public AccountMovements(double quantity, double limit) {
        super(quantity, limit);
        movements = new HashSet<>();
    }

    @Override
    public void extract(double quantity) {
        movements.add(new Movements(quantity, "Extraction"));
        super.extract(quantity);
    }

    @Override
    public void entry(double quantity) {
        movements.add(new Movements(quantity, "Entry"));
        super.entry(quantity);
    }

    public HashSet<Movements> getMovements() {
        return movements;
    }
}
