package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;
    private Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Crashing Cars", 4.50);
        visitor = new Visitor(18, 150, 200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Crashing Cars", dodgems.getName());
    }

    @Test
    public void canGetPriceForAge18Visitor(){
        assertEquals(4.50, dodgems.priceFor(visitor), 0.001);
    }


    @Test
    public void canRate(){
        dodgems.setRating(8);
        assertEquals(8, dodgems.getRating());
    }
}
