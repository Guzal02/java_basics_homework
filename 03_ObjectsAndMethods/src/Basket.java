public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private int totalWeight = 0;

    private static int totalCostAllProducts = 0;
    private static int totalAmountAllProduct = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalCostAllProducts() {
        return totalCostAllProducts;
    }

    public static int getTotalAmountAllProduct() {
        return totalAmountAllProduct;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void increaseTotalCostAllProducts(int price) {
        Basket.totalCostAllProducts = Basket.totalCostAllProducts + price;
    }

    public static void increaseTotalAmountAllProduct(int amount) {
        Basket.totalAmountAllProduct = Basket.totalAmountAllProduct + amount;
    }

    public static int averagePriceTotalCostAllProduct() {
         return totalCostAllProducts / totalAmountAllProduct;
    }
    public static int averageBasketValue() {
        return totalCostAllProducts / count;
    }


    public void add(String name, int price) {
        add(name, price, 0, 0);
    }

    public void add(String name, int price, double weight) {
        add(name, price, 0, weight);
    }

    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " - " + weight;
        totalPrice = totalPrice + count * price;
        totalWeight += weight;
        increaseTotalCostAllProducts(count * price);
        increaseTotalAmountAllProduct(count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
