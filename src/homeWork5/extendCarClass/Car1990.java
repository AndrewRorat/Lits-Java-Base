package homeWork5.extendCarClass;

public class Car1990 extends Car1970 {
    private String airConditioner;
    private int airBags;

    public Car1990(int wheels, int seats, String carBody, String radio,
                   String areSeatBelt, String airConditioner, int airBags) {
        super(wheels, seats, carBody, radio, areSeatBelt);
        this.airConditioner = airConditioner;
        this.airBags = airBags;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public int getAirBags() {
        return airBags;
    }

    public void setAirBags(int airBags) {
        this.airBags = airBags;
        airBags = 4;
    }
}