package ThemePark.Stalls;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String owner) {
        super(name, owner, 6.60);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if(visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }
}
