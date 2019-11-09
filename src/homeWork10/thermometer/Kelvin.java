package homeWork10.thermometer;

public class Kelvin implements IKonverter {
    private double degreeInCelsius, degreeInKelvin;

    public Kelvin() {
    }

    @Override
    public void convert(double degreeInCelsius) {
        degreeInKelvin = degreeInCelsius + 274.15;
        System.out.println("Temperature in Kelvin is: " + degreeInKelvin + "K");
    }
}
