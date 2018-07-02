package ThemePark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 150, 200.00);
    }

    @Test
    public void canGetHeight(){
        assertEquals(150, visitor.getHeight());
    }
}
