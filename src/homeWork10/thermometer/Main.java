package homeWork10.thermometer;

public class Main {
    public static void main(String[] args) {

        IKonverter kelvinTermometer = new Kelvin();
        IKonverter fahrenheitTermometer = new Fahrenheit();

        kelvinTermometer.convert(25);
        fahrenheitTermometer.convert(12);

    }
}
