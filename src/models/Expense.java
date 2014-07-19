package models;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Expense extends CashFlow
{
	private int amount;
	private String description;
	Calendar calendar = new GregorianCalendar();
	
	public Expense(int amount)
	{
		
		super();
		this.amount = -amount;
	}
	
	public Expense(int amount, String description)
	{
		super();
		this.amount = -amount;
		this.description = description;
	}
	
	public Expense(int amount, Calendar calendar)
	{
		super();
		this.amount = -amount;
		this.calendar = calendar;
	}
	
	public Expense(int amount, String description, Calendar calendar)
	{
		super();
		this.amount = -amount;
		this.description = description;
		this.calendar = calendar;
	}

	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = -amount;
	}
	@Override
	public String toString()
	{
		return "Expense [amount=" + amount + ", description=" + description
				+ "]";
	}

	public Calendar getCalendar()
	{
		return calendar;
	}
	public void setCalendar(Calendar calendar)
	{
		this.calendar = calendar;
	}
	
	
	
}
