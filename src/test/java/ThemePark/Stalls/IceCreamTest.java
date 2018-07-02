package ThemePark.Stalls;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    private IceCreamStall iceCreamStall;
    private Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Freezey Pete", "Pete");
        visitor = new Visitor(18, 150, 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Freezey Pete", iceCreamStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Pete", iceCreamStall.getOwner());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(2.80, iceCreamStall.defaultPrice(), 0.001);
    }

    @Test
    public void canGetChildsPrice(){
        visitor = new Visitor(12, 150, 200.00);
        assertEquals(1.40, iceCreamStall.priceFor(visitor), 0.001);
    }
}
