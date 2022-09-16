package homeworks.lesson08HW.task3;

public class FinancialRecord {
    private int incomes;
    private int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    //доходы
    public String getFormattingIncomes() {
        return String.format("%s = %s", "доходы", this.incomes);
    }

    //расходы
    public String getFormattingOutcomes() {
        return String.format("%s %s", "расходы", this.outcomes);
    }

    @Override
    public String toString() {
        return "FinancialRecord{" +
                "incomes=" + incomes +
                ", outcomes=" + outcomes +
                '}';
    }
}
