package homework6;

public class Subtraction implements Operation {
    private double c;

    @Override
    public double calculate(long a, long b) {
        c = a - b;
        System.out.println("Subtraction operation = " + c);
        return c;
    }
}