package ThemePark.Attractions;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {
    public Playground(String name) {
        super(name);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if(visitor.getAge() < 15){
            return true;
        }
        return false;
    }
}
