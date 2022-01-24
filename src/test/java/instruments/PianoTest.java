package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", "Arius", 700, 749, 61, InstrumentType.KEYBOARD );
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Arius", piano.getModel());
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(700, piano.getPurchasePrice(), 0.0);
    }

    @Test
    public void canGetSalePrice(){
        assertEquals(749, piano.getSalePrice(), 0.0);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }
}
