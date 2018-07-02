package ThemePark.Attractions;

import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Kidz Zone");
        visitor = new Visitor(14, 145, 10.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Kidz Zone", playground.getName());
    }

    @Test
    public void allowsVisitorsUnder15(){
        assertTrue(playground.isAllowed(visitor));
    }
}
