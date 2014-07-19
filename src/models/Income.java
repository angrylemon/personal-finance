package models;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Income extends CashFlow
{
	private int amount;
	private Calendar calendar;
	private String description;
	
	public Income(int amount, String description)
	{
		calendar = new GregorianCalendar();
		this.amount = amount;
		this.description = description;
		
	}

	public Income()
	{
		super();
	}

	@Override
	public String toString()
	{
		return "Income [amount=" + amount 
				+ ", description=" + description + "]";
	}

	public Income(int amount, Calendar calendar, String description)
	{
		super();
		this.amount = amount;
		this.calendar = calendar;
		this.description = description;
	}

	public Calendar getCalendar()
	{
		return calendar;
	}

	public void setCalendar(Calendar calendar)
	{
		this.calendar = calendar;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	
}
