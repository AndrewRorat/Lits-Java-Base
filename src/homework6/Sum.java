package homework6;

public class Sum implements Operation {
    private double c;

    @Override
    public double calculate(long a, long b) {
        c = a + b;
        System.out.println("Sum operation = " + c);
        return c;
    }
}
