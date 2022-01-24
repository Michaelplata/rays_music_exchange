package shop;

import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void before(){
        shop = new Shop("Gear4Music");
        guitar = new Guitar("Fender", "Ultra", 500.0, 599.0, InstrumentType.STRING, 6);
        piano = new Piano("Yamaha", "Arius", 700, 749, 61, InstrumentType.KEYBOARD);
        trumpet = new Trumpet("Gear4Music", "Coppergate", 100, 139,"Bronze", InstrumentType.BRASS);
    }

    @Test
    public void canAddItemToStock() {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(trumpet);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(trumpet);
        shop.removeFromStock(guitar);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(trumpet);
        assertEquals( 187, shop.calculateProfit(), 0.0);
    }

}
