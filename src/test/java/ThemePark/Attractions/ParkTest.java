package ThemePark.Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void before(){
        park = new Park("Chillin' Area");
    }

    @Test
    public void canGetName(){
        assertEquals("Chillin' Area", park.getName());
    }


    @Test
    public void canRate(){
        park.setRating(2);
        assertEquals(2, park.getRating());
    }
}
