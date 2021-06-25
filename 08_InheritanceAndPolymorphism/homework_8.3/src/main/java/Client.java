public abstract class Client {

    private double bill;

    public double getAmount() {
        return bill;
    }

    public void put(double amountToPut) {
        if (!(amountToPut < 0)) {
            bill = bill + amountToPut;
            System.out.println("Счет пополнен на: " + amountToPut + " у.е. Остаток доступных средств состовляет: " + bill + " у.е");
        } else {
            System.out.println("Сумма на вашем счету составляет: " + bill + " у.е");
        }
    }

    public void take(double amountToTake) {
        if (!(amountToTake > bill)) {
            bill = bill - amountToTake;
            System.out.println("Со счета списано: " + amountToTake + " у.е. Остаток доступных средств состовляет: " + bill + " у.е");

        } else {
            System.out.println("Сумма на вашем счету составляет: " + bill + " у.е. НЕДОСТАТОЧНО СРЕДСТВ!");
        }
    }
}
