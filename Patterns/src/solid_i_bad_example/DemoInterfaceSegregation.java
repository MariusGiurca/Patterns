package solid_i_bad_example;

public class DemoInterfaceSegregation {
    public static void main(String[] args){

        AllInOnePrinter allInOnePrinter =  new AllInOnePrinter();
        allInOnePrinter.print();
        allInOnePrinter.sendFax();
        allInOnePrinter.scan();

        EconomicPrinter economicPrinter = new EconomicPrinter();
        economicPrinter.print();
        economicPrinter.sendFax(); // Interface Segregation - Violated
        economicPrinter.scan(); // Interface Segregation - Violated

    }
}
