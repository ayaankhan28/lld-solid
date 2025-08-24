public class Demo07 {
    public static void main(String[] args) {
        System.out.println("Using BasicPrinter:");
        Printer printer = new BasicPrinter();
        printer.print("Hello from basic printer");

        System.out.println("\nUsing BasicScanner:");
        Scanner scanner = new BasicScanner();
        scanner.scan("/tmp/out");

        System.out.println("\nUsing AllInOneMachine:");
        MultiFunctionMachine allInOne = new AllInOneMachine();
        allInOne.print("Hello from all-in-one");
        allInOne.scan("/tmp/scan");
        allInOne.fax("123-456-7890");

        System.out.println("\nDemonstrating interface segregation:");
        Printer printerInterface = allInOne;
        Scanner scannerInterface = allInOne;
        FaxMachine faxInterface = allInOne;

        printerInterface.print("Using printer interface");
        scannerInterface.scan("/tmp/scan2");
        faxInterface.fax("098-765-4321");
    }
}
