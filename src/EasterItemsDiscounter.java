public class EasterItemsDiscounter implements Discounter {
    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.6;
    }
}
