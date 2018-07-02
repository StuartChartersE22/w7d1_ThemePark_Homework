package ThemePark.Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TabaccoTest {

    private TobaccoStall tabaccoStall;

    @Before
    public void before(){
        tabaccoStall = new TobaccoStall("Puffy Joe's", "Joe");
    }

    @Test
    public void canGetName(){
        assertEquals("Puffy Joe's", tabaccoStall.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Joe", tabaccoStall.getOwner());
    }
}
