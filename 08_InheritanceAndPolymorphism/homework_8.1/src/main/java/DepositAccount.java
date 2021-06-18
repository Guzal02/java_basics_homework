import java.util.Calendar;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount {

    Calendar lastIncome = new GregorianCalendar();
    int days = lastIncome.get(Calendar.DAY_OF_MONTH);
    int months = lastIncome.get(Calendar.MONTH);
    int years = lastIncome.get(Calendar.YEAR);

    public boolean take(double amountToTake) {
        if (!(amountToTake > account) && (days > 30 || months > 0 || years > 0)) {
            account = account - amountToTake;
            System.out.println("Со счета списано: " + amountToTake + " у.е. Остаток доступных средств состовляет: " + account + " у.е");
        } else {
            System.out.println("Сумма на вашем счету составляет: " + account + " у.е. НЕДОСТАТОЧНО СРЕДСТВ!");
        }
        return true;
    }
}
