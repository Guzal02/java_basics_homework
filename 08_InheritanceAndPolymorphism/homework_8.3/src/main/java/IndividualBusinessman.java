public class IndividualBusinessman extends LegalPerson {
    private static final double PUT_FEE = 0.01;
    private static final double PUT_FEE_2 = 0.005;
    private static final double AMOUNT_PAYED_BY_THE_COMMISSION = 1000.0;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut < AMOUNT_PAYED_BY_THE_COMMISSION ?
                amountToPut - (amountToPut * PUT_FEE) : amountToPut - (amountToPut * PUT_FEE_2));
    }
}
 пш