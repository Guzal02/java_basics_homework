public class LegalPerson extends Client {
    private static final double TAKE_FEE = 0.01;

    @Override
    public void take(double amountToTake) {
        double percent = amountToTake + (amountToTake * TAKE_FEE);
        super.take(percent);
    }
}
