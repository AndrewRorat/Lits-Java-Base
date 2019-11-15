package lesson7Practice.practice;

import java.io.PrintStream;

public class LitsPrinter extends LitsPrinterAbstract<PrintStream> {

    public LitsPrinter() {
        super(System.out);
    }

    @Override
    public void eror(String msg) {
        getPrinter().println("This is error " + msg);
    }

    @Override
    public void info(String msg) {
        getPrinter().println("This is info " + msg);
    }

    @Override
    public void debug(String msg) {
        getPrinter().println("This is debug " + msg);
    }
}
