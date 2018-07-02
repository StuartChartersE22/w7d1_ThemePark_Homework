package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Air", 8.40);
        visitor = new Visitor(18, 150, 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Air", rollercoaster.getName());
    }

    @Test
    public void canGetPriceForHeight150Visitor(){
        assertEquals(8.40, rollercoaster.priceFor(visitor), 0.001);
    }

    @Test
    public void canAllowVisitorOver12AndOver145(){
        assertTrue(rollercoaster.isAllowed(visitor));
    }

}
