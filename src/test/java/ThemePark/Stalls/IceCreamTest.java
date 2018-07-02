package ThemePark.Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    private IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Freezey Pete", "Pete");
    }

    @Test
    public void canGetName(){
        assertEquals("Freezey Pete", iceCreamStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Pete", iceCreamStall.getOwner());
    }
}
