package lesson7Practice.practice;

public class Main {
    public static void main(String[] args) {
        Printer printer = new LitsPrinter();
        printer.debug("Lets try debug");
        printer.eror("Lets try error");
        printer.info("Lets try info");
    }
}
