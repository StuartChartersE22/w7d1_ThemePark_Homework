package ThemePark.Attractions;

import ThemePark.Interfaces.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ITicketed {

    private double defaultPrice;

    public Rollercoaster(String name, double defaultPrice) {
        super(name);
        this.defaultPrice = defaultPrice;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            return this.defaultPrice*2;
        }
        return defaultPrice;
    }
}
