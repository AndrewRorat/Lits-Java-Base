package homeWork5.extendCarClass;

public class Car2019 extends Car2010 {
    private boolean isFlying;

    public Car2019(int wheels, int seats, String carBody, String radio, String areSeatBelt,
                   String airConditioner, int airBags, String screen, String navigation, boolean isFlying) {
        super(wheels, seats, carBody, radio, areSeatBelt, airConditioner, airBags, screen, navigation);
        this.isFlying = isFlying;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}