package solid_i_solution;

public class DemoInterfaceSegregation {
    public static void main(String[] args){
        AllInOnePrinter allInOnePrinter =  new AllInOnePrinter();
        allInOnePrinter.print();
        allInOnePrinter.sendFax();
        allInOnePrinter.scan();

        EconomicPrinter economicPrinter = new EconomicPrinter();
        economicPrinter.print();
//        economicPrinter.sendFax(); // Compile error
//        economicPrinter.scan(); // Compile error

    }
}
