package ThemePark;

import ThemePark.Attractions.Dodgems;
import ThemePark.Attractions.Park;
import ThemePark.Attractions.Playground;
import ThemePark.Attractions.Rollercoaster;
import ThemePark.Stalls.CandyFlossStall;
import ThemePark.Stalls.IceCreamStall;
import ThemePark.Stalls.TobaccoStall;
import org.junit.Before;

public class ThemeParkTest {

    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private Rollercoaster rollercoaster;
    private CandyFlossStall candyFlossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tabaccoStall;
    private Visitor visitor;

    private ThemePark themePark;

    @Before
    public void before(){
        visitor = new Visitor(18, 150, 200.00);
        tabaccoStall = new TobaccoStall("Puffy Joe's", "Joe");
        playground = new Playground("Kidz Zone");
        park = new Park("Chillin' Area");
        dodgems = new Dodgems("Crashing Cars", 4.50);
        rollercoaster = new Rollercoaster("Air", 8.40);
        candyFlossStall = new CandyFlossStall("Funtime Phil's", "Phil");
        iceCreamStall = new IceCreamStall("Freezey Pete", "Pete");

    }
}
