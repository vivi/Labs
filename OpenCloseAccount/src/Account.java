
public class Account 
{
	private double balance;
	private String name;
	private long acctNum;
	private static int numAcct = 0;
	//----------------------------------------------
	//Constructor --initializes balance, owner, and account number
	//----------------------------------------------
	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAcct++;
	}
	//----------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//----------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	//----------------------------------------------
	// Adds deposit amount to balance.
	//----------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}
	//----------------------------------------------
	// Returns balance.
	//----------------------------------------------
	public double getBalance()
	{
		return balance;
	}
	//----------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//----------------------------------------------
	public String toString()
	{
		return String.format("Name: %s\nAcct #: %d\nBalance: $%.2f", name, acctNum, balance);
	}
	//----------------------------------------------
	// Deducts $10 service fee
	//----------------------------------------------
	public double chargeFee()
	{
		balance -= 10;
		return balance;
	}
	//----------------------------------------------
	// Changes the name on the account 
	//----------------------------------------------
	public String changeName(String newName)
	{
		name = newName;
		return name;
	}
	
	public static int numAccounts()
	{
		return numAcct;
	}
}
