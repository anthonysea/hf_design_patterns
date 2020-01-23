package ch3;

public class Mocha extends CondimentDecorator {
    Beverage beverage; // instance variable to hold the beverage we are wrapping

    public Mocha(Beverage beverage) {
        this.beverage = beverage; // set object to be decorated as an instance variable of the decorator (composition)
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double cost = beverage.cost();
        if (this.getSize() == Size.TALL) {
            cost += .15;
        } else if (this.getSize() == Size.GRANDE) {
            cost += .20;
        } else if (this.getSize() == Size.VENTI) {
            cost += .25;
        }
        return cost;
    }
}
