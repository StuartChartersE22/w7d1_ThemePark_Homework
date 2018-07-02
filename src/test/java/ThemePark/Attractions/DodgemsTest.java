package ThemePark.Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Crashing Cars");
    }

    @Test
    public void canGetName(){
        assertEquals("Crashing Cars", dodgems.getName());
    }
}
