package homework6;

public class Calculator {

    private Operation operation;

    public Calculator(Operation operation){
        this.operation = operation;
    }

    public void doOperation(long a, long b){
        operation.calculate(a, b);
    }

}
