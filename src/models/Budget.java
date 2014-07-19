package models;

import java.util.ArrayList;
import java.util.List;

public class Budget
{
	private int balance;
	
	List<CashFlow> list = new ArrayList<>(); 
	
	public Budget()
	{
		
	}
	
	public Budget(int balance)
	{
		this.balance = balance;
		
	}
	
	public void add(CashFlow cashflow)
	{
		list.add(cashflow);
	}
	
	public void printTransactions()
	{
		int size = list.size();
		
		for(int i = 0; i < size; i ++)
		{
			System.out.println(list.get(i));
		}
	}
}
