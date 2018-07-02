package ThemePark.Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Funtime Phil's", "Phil");
    }

    @Test
    public void canGetName(){
        assertEquals("Funtime Phil's", candyFlossStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Phil", candyFlossStall.getOwner());
    }
}
