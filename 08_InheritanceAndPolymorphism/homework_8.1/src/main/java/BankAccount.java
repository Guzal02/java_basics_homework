public class BankAccount {
    public double account;

    public double getAmount() {
        return account;
    }

    public void put(double amountToPut) {
        if (!(amountToPut < 0)) {
            account = account + amountToPut;
            System.out.println("Счет пополнен на: " + amountToPut + " у.е. Остаток доступных средств состовляет: " + account + " у.е");
        } else {
            System.out.println("Сумма на вашем счету составляет: " + account + " у.е");
        }
    }

    public boolean take(double amountToTake) {
        if (!(amountToTake > account)) {
            account = account - amountToTake;
            System.out.println("Со счета списано: " + amountToTake + " у.е. Остаток доступных средств состовляет: " + account + " у.е");
        } else {
            System.out.println("Сумма на вашем счету составляет: " + account + " у.е. НЕДОСТАТОЧНО СРЕДСТВ!");
        }
      return true;
    }

    boolean send(BankAccount receiver, double amount) {
       return receiver.take(amount);
    }
}
