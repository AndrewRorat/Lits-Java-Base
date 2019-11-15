package lesson7Practice.practice;

public abstract class LitsPrinterAbstract<T> implements Printer {
    private T printer;

    public LitsPrinterAbstract(T printer) {
        this.printer = printer;
    }

    public T getPrinter() {
        return printer;
    }

    public void setPrinter(T printer) {
        this.printer = printer;
    }
}
