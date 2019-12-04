package homeWork10.thermometer;

public class Fahrenheit implements IKonverter {
    private double degreeInCelsius, degreeInFahrenheit;

    public Fahrenheit() {
    }

    @Override
    public void convert(double degreeInCelsius) {
        degreeInFahrenheit = degreeInCelsius * 1.8 + 32;
        System.out.println("Temperature in Fahrenheit is: " + degreeInFahrenheit + "F");
    }
}
