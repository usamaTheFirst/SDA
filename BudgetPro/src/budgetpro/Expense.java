package budgetpro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense {
    private double amount;
    private String details;
    private LocalDate expensedate;

    public Expense(String details, double amount) {
        this.amount = amount;
        this.details = details;
        this.expensedate =  LocalDate.now();

    }

    public double getAmount() {
        return amount;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-uuuu");
        String formattedDate = expensedate.format(formatter);


        return formattedDate + "," + details + "," + amount ;
    }
}
