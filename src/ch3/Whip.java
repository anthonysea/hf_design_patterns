package ch3;

// Beverage decorator class
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        double cost = beverage.cost();
        if (this.getSize() == Size.TALL) {
            cost += .5;
        } else if (this.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (this.getSize() == Size.VENTI) {
            cost += .15;
        }
        return cost;
    }
}
