package ch3;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public Beverage beverage;

    public Size getSize() {
        return beverage.getSize();
    }
}
