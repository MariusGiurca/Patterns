package solid_i_bad_example;

public class EconomicPrinter implements ISmartDevice{

    @Override
    public void print() {
        System.out.print("EconomicPrinter: I can print");
    }

    // Interface Segregation - Violated
    @Override
    public void sendFax() {
        // it's not in scope for an EconomicPrinter
    }

    // Interface Segregation - Violated
    @Override
    public void scan() {
        // it's not in scope for a EconomicPrinter
    }
}
