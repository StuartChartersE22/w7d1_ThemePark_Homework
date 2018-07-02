package ThemePark.Stalls;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TabaccoTest {

    private TobaccoStall tabaccoStall;
    private Visitor visitor;

    @Before
    public void before(){
        tabaccoStall = new TobaccoStall("Puffy Joe's", "Joe");
        visitor = new Visitor(18, 150, 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Puffy Joe's", tabaccoStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Joe", tabaccoStall.getOwner());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(6.60, tabaccoStall.defaultPrice(), 0.001);
    }

    @Test
    public void allows18Overs(){
        assertTrue(tabaccoStall.isAllowed(visitor));
    }
}
