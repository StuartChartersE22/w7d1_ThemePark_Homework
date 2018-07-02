package ThemePark.Attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void before(){
        playground = new Playground("Kidz Zone");
    }

    @Test
    public void canGetName(){
        assertEquals("Kidz Zone", playground.getName());
    }
}
