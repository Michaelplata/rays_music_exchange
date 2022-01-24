package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Gear4Music", "Coppergate", 100, 139,"Bronze", InstrumentType.BRASS);
    }

    @Test
    public void hasBrand(){
        assertEquals("Gear4Music", trumpet.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Coppergate", trumpet.getModel());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(100, trumpet.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(139, trumpet.getSalePrice(), 0.0);
    }

    @Test
    public void canGetBellMaterial(){
        assertEquals("Bronze", trumpet.getBellMaterial());
    }


    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }
}
