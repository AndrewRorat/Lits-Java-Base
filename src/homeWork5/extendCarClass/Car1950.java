package homeWork5.extendCarClass;

public class Car1950 {
    private int wheels;
    private int seats;
    private String carBody;

    public Car1950(int wheels, int seats, String carBody) {
        this.wheels = wheels;
        this.seats = seats;
        this.carBody = carBody;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }
}