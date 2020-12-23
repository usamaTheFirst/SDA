package budgetpro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        System.out.println("------- BUDGETPRO VER 1.0 -------");

        ExpenseList expenseList = new ExpenseList();
        Expense expense ;
        int choice;
do {
    System.out.println(" Press 1 to enter new expense\n Press 2 to see all expenses\n Press 3 for Total expense\n Press 0 to exit \n  ::  ");
    Scanner scanner = new Scanner(System.in);
     choice = scanner.nextInt();
    if (choice == 1){
        System.out.println("Enter details");
        scanner.nextLine();
        String details = scanner.nextLine();

        System.out.println("Enter amount");
        double amount = scanner.nextDouble();
        expense = new Expense(details,amount);
        expenseList.add(expense);
    }
    else if(choice == 2){
        expenseList.showAllExpenses();
    }
    else if ( choice == 3){
        System.out.println("Total expense : " + expenseList.giveTotalExpenses());
    }



}while (choice != 0 );

//        Expense exp = new Expense("Candy Box", 200);
//        Expense exp1 = new Expense("Kitkat", 50);
//        ExpenseList elist = new ExpenseList();
//        elist.add(exp);
//        elist.add(exp1);
//
//        System.out.println("Exp : "  + exp);
//        System.out.println("Exp1 : " +exp1);
//        System.out.println("Total price : " + elist.giveTotalExpenses());
//

    }
}
