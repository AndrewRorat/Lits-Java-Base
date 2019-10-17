package homework6;

public class Division implements Operation {
    private double c;

    @Override
    public double calculate(long a, long b) {
        c = a / b;
        System.out.println("Division operation = " + c);
        return c;
    }
}