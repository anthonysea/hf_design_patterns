package ch3;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        this.description = "House Blend";
        this.size = size;
    }

    public double cost() {
        return .89;
    }
}
