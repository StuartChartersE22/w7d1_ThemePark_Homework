package ThemePark.Attractions;

import ThemePark.Interfaces.Reviewable;

public abstract class Attraction implements Reviewable {

    private String name;
    private int rating;

    public Attraction(String name){
        this.name = name;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
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
