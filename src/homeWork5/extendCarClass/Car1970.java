package homeWork5.extendCarClass;

public class Car1970 extends Car1950 {
    private String radio;
    private String seatBelt;

    public Car1970(int wheels, int seats, String carBody, String radio, String SeatBelt) {
        super(wheels, seats, carBody);
        this.radio = radio;
        this.seatBelt = SeatBelt;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String seatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(String areSeatBelt) {
        this.seatBelt = areSeatBelt;
    }
}