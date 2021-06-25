import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }

    @Override
    public boolean take(double amountToTake) {
        if(LocalDate.now().isAfter(lastIncome.plusMonths(1))) {
            return super.take(amountToTake);
        } else {
            System.out.println("С момента последнего попления не прошел месяц! Попробуейте через " + DAYS.between(LocalDate.now(), lastIncome) + " дней");
            return false;
        }
    }
}
