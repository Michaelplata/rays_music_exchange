package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Ultra", 500.0, 599.0, InstrumentType.STRING, 6);
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Ultra", guitar.getModel());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(500, guitar.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(599, guitar.getSalePrice(), 0.0);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }
}
