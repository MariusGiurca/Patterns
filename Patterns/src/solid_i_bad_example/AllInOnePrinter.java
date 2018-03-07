package solid_i_bad_example;

public class AllInOnePrinter implements ISmartDevice {
    @Override
    public void print() {
        System.out.println("AllInOnePrinter: I can print");
    }

    @Override
    public void sendFax() {
        System.out.println("AllInOnePrinter: I can send a Fax");
    }

    @Override
    public void scan() {
        System.out.println("AllInOnePrinter: I can scan");
    }
}
