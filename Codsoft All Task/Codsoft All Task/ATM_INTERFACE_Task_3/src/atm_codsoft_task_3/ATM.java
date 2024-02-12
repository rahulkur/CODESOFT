package atm_codsoft_task_3;

import java.util.Scanner;

class BankAccount
{
	private double balance;
	public BankAccount(double initailBalance)
	{
		balance=initailBalance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposite of $ "+amount+"successful");
			
		}else
		{
			System.out.println("Invalid deposite amount");
			
		}
	}
	
	public boolean withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance -= amount;
			System.out.println("Withdrawal of $"+amount+"successful");
			return true;
		}else
		{
			System.out.println("Insufficient balance or invalid withdrawl amount");
			return false;
		}
	}
}
public class ATM
{

	private BankAccount userAccount;
	
	public ATM(BankAccount account)
	{
		userAccount=account;
	}
	
	public void displayMenu()
	{
		System.out.println("Welcome to the ATM");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		
	}
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
	    int choice;
	    do
	    {
	    	displayMenu();
	    	System.out.println("Enter your choice :");
	    	choice= scanner.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    		checkBalance();
	    		break;
	    	case 2:
	    		deposit(scanner);
	    		break;
	    	case 3:
	    		withdraw(scanner);
	    		break;
	    	case 4:
	    		System.out.println("Thank you for using the ATM !");
	    		break;
	    	default :
	    		System.out.println("Invalid choice please try again");
	  
	    		
	    	}
	    }while(choice !=4);
	    scanner.close();
	}
	
	private void checkBalance()
	{
		System.out.println("your balance is $ "+ userAccount.getBalance());
	}
	
	private void deposit(Scanner scanner)
	{
		System.out.println("Enter the amount to deposire : $");
		double amount = scanner.nextDouble();
		userAccount.deposite(amount);
	}
	
	private void withdraw(Scanner scanner)
	{
		System.out.println("Enter the amount to withdraw : $");
		double amount = scanner.nextDouble();
		if(userAccount.withdraw(amount))
		{
			
			System.out.println("please take your cash");
			
		}else
		{
			
			System.out.println("Transaction failed");
			
		}
	}
	
	public static void main(String [] args)
	{
     BankAccount account = new BankAccount(1000);
     ATM atm=new ATM(account);
     atm.run();
	
	}
}
