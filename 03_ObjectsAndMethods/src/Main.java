public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 1000);
        basket.add("Bread", 20, 1, 200);
        basket.print("Milk, Bread");
        System.out.println(basket.getTotalWeight());
        System.out.println(Basket.getTotalCostAllProducts());
        System.out.println(Basket.getTotalAmountAllProduct());
        basket.add("Milka", 40, 1, 1000);
        basket.add("Milki", 40, 1, 1000);
        System.out.println(Basket.getTotalCostAllProducts());
        System.out.println(Basket.getTotalAmountAllProduct());
        Basket basket1 = new Basket();
        basket1.add("Milk", 40, 1, 1000);
        System.out.println(Basket.getTotalCostAllProducts());
        System.out.println(Basket.getTotalAmountAllProduct());
        System.out.println(Basket.averagePriceTotalCostAllProduct());
        System.out.println(Basket.averageBasketValue());

        /*Printer printer = new Printer();
        printer.append("dljflkajdslk", "Ynljl", 10);
        printer.append("dljflkajdslk", "Ynljl", 10);
        printer.append("dljflkajdslk", "Ynljl", 10);


        System.out.println(printer.getTotalDocumentsQueued());
        printer.print("Hami");
        System.out.println(printer.getTotalDocumentsInAllTime());
        System.out.println(printer.getTotalDocumentsQueued());


*/
    }
}
