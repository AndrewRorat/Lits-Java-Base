package homework6;

public class Multiplication implements Operation {
    private double c;

    @Override
    public double calculate(long a, long b) {
        c = a * b;
        System.out.println("Multiplication operation = " + c);
        return c;
    }
}