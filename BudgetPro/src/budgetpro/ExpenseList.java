package budgetpro;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpenseList implements Iterable<Expense> {
   private ArrayList <Expense> expenselist ;


    public ExpenseList() {
        this.expenselist = new ArrayList<Expense>();
    }
    public void add(Expense expense) {
        this.expenselist.add(expense);
    }
    @Override
    public Iterator <Expense> iterator (){
      return expenselist.iterator();
    }

public  Double giveTotalExpenses() {
    double total=0;
    for (Expense expense : this )
        total += expense.getAmount();
        return total;
}
public void showAllExpenses(){
        for(Expense expense : this){
            System.out.println(expense);
        }
}

}
