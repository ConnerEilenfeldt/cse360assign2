/**
 * @author Conner Eilenfeldt
 * CSE360 85141
 * Assignment 2
 * AddingMachine adds and subtracts integers to/from a total and keeps a transaction
 * history
 */
package cse360assign2;

public class AddingMachine
{
	private int total = 0;
	private String history = "0";
	
	/**
	 * AddingMachine constructor
	 */
	public AddingMachine()
	{
		
	}
	
	/**
	 * add adds value to the total and updates transaction history
	 * @param value the value to be added
	 */
	public void add(int value)
	{
		total += value;
		history += " + " + value;
	}

	/**
	 * subtract subtracts value from the total and updates transaction history
	 * @param value the value to be subtracted
	 */
	public void subtract(int value)
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * getTotal returns the current total
	 * @return total
	 */
	public int getTotal()
	{
		return total;
	}
	
	/**
	 * toString returns the transaction history
	 * @return history
	 */
	public String toString()
	{
		return history;
	}
}
