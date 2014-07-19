import java.util.Calendar;
import java.util.GregorianCalendar;

import models.Budget;
import models.Expense;
import models.Income;

public class Main
{

	public static void main(String[] args) 
	{
		
		Budget wallet = new Budget(280);
		
		wallet.add(new Income(700, "Salary"));
		wallet.add(new Expense(50, "Eating out"));

		
		wallet.printTransactions();

	}

}
