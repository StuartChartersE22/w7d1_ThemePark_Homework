package ThemePark.Stalls;

import ThemePark.Interfaces.ITicketed;
import ThemePark.Interfaces.Reviewable;
import ThemePark.Visitor;

public abstract class Stall implements ITicketed, Reviewable {

    private String name;
    private String owner;
    private double defaultPrice;
    private int rating;

    public Stall(String name, String owner, double defaultPrice){
        this.name = name;
        this.owner = owner;
        this.defaultPrice = defaultPrice;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getOwner(){
        return this.owner;
    }

    @Override
    public double defaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 18){
            return this.defaultPrice/2;
        }
        return this.defaultPrice;
    }

    @Override
    public int getRating() {
        return this.rating;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}
