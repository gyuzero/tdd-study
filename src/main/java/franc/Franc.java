package franc;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.getAmount();
    }
}
