public class CardAccount extends BankAccount {
    private static final double TAKE_FEE = 0.01;

    @Override
    public boolean take(double amountToTake) {
        double percent = amountToTake + (amountToTake * TAKE_FEE);
        return super.take(percent);
    }
}
