package ThemePark;

public class Visitor {

    private int age;
    private int height;
    private double money;


    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getHeight() {
        return this.height;
    }

    public int getAge() {
        return this.age;
    }

    public double getMoney() {
        return this.money;
    }
}
