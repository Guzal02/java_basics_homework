public class Movement {
    private Double expense;
    private Double income;
    private String company;

    public Movement(Double expense, Double income, String company) {
        this.expense = expense;
        this.income = income;
        this.company = company;
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
