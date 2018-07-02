package ThemePark.Attractions;

import ThemePark.Interfaces.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double defaultPrice;

    public Dodgems(String name, double defaultPrice){
        super(name);
        this.defaultPrice = defaultPrice;
    }

    @Override
    public double defaultPrice() {
        return defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return this.defaultPrice/2;
        }
        return defaultPrice;
    }
}
