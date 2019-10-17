package homework6;

public class Main {
    public static void main(String[] args) {

        Operation operation = new Power();

        Calculator calculator = new Calculator(operation);

        calculator.doOperation(3, 2);

    }
}
