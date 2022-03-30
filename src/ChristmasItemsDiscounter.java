import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasItemsDiscounter implements Discounter {
    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.5;
    }

    @Test
    public void christmasItemsDiscounterTest() {
        assertEquals(50.495, applyDiscount(100.99));
    }


}

