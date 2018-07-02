package ThemePark.Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Air");
    }

    @Test
    public void canGetName(){
        assertEquals("Air", rollercoaster.getName());
    }
}
