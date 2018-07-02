package ThemePark.Interfaces;

import ThemePark.Visitor;

public interface ISecurity {

    boolean isAllowed(Visitor visitor);
}
