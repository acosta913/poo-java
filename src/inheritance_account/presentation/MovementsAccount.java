package inheritance_account.presentation;

import java.util.HashSet;

import inheritance_account.beans.Movements;
import inheritance_account.logic.AccountMovements;

public class MovementsAccount {

    public void movementsAccount() {
        AccountMovements accountMovements = new AccountMovements(200, 100);
        accountMovements.entry(180);
        accountMovements.extract(30);
        System.out.println(accountMovements.getBalance());
        HashSet<Movements> movements = accountMovements.getMovements();
        for (Movements mov : movements) {
            System.out.println("Quantity: " + mov.getQuantity() + " Type: " + mov.getType());
        }
    }
}
