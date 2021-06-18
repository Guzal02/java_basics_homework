public class CardAccount extends BankAccount {

    public boolean take(double amountToTake) {
        if (!(amountToTake > account)) {
            account = account - (amountToTake + (amountToTake * 0.01));
            System.out.println("Со счета списано: " + amountToTake + " у.е. Остаток доступных средств состовляет: " + account + " у.е");
        } else {
            System.out.println("Сумма на вашем счету составляет: " + account + " у.е. НЕДОСТАТОЧНО СРЕДСТВ!");
        }
        return true;
    }
}
