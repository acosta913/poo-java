package inheritance_account.beans;

public class Movements {
    private double quantity;
    private String type;

    public Movements(double quantity, String type) {
        this.quantity = quantity;
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
