package ThemePark.Stalls;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    private CandyFlossStall candyFlossStall;
    private Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Funtime Phil's", "Phil");
        visitor = new Visitor(18, 150, 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Funtime Phil's", candyFlossStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Phil", candyFlossStall.getOwner());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.001);
    }

    @Test
    public void canGetChildsPrice(){
        visitor = new Visitor(12, 150, 200.00);
        assertEquals(2.10, candyFlossStall.priceFor(visitor), 0.001);
    }

    @Test
    public void canRate(){
        candyFlossStall.setRating(1);
        assertEquals(1, candyFlossStall.getRating());
    }
}
