package solid_i_solution;

public class AllInOnePrinter implements IPrinter, IFax, IScanner {

    @Override
    public void print() {
        System.out.println("AllInOnePrinter:I can print");
    }

    @Override
    public void sendFax() {
        System.out.println("AllInOnePrinter: I can send a fax");
    }

    @Override
    public void scan() {
        System.out.println("AllInOnePrinter: I can scan");
    }
}
