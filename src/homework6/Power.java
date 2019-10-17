package homework6;

public class Power implements Operation {

    @Override
    public double calculate(long a, long b) {
        double result = 1;
        for (int i =1; i<=b; i++){
            result = result*a;

        }
        System.out.println("Power operation = " + result);
        return result;
    }
}