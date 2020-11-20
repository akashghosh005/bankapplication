import java.util.Scanner;
class BankApplication {
	public static void main(String[] args){
		
		BankAccount obj=new BankAccount("XYZ","BA000");
		obj.showMenu();
		
	}
}
class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid)
	{
		customerName=cname;
		customerId=cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			previousTransaction=-amount;
		}
	}
	void getPreviousTransaction()
	{
		if(previousTransaction> 0)
		{
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction< 0)
		{
			System.out.println("Withdrawn: "+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	void showMenu()
	{
		char option='\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome "+customerName);
		System.out.println("Your ID is "+customerId);
		System.out.println("\n");
		System.out.println("A.Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. PreviousTransaction");
		System.out.println("E. exit");
		
		do
		{
			System.out.println("=======================================================================================================");
			System.out.println("Enter an option");
			System.out.println("=======================================================================================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
			     System.out.println("-------------------------------------");
				 System.out.println("Balance ="+balance);
				 System.out.println("-------------------------------------");
				  System.out.println("\n");
				  break;
			case 'B':
			     System.out.println("-------------------------------------");
				 System.out.println("Enter an amount to be deposited:");
				 System.out.println("-------------------------------------");
				 int amount =sc.nextInt();
				 deposit(amount);
				  System.out.println("\n");
				  break;
			case 'C':
			     System.out.println("-------------------------------------");
				 System.out.println("Enter an amount to withdraw");
				 System.out.println("-------------------------------------");
				 int amount2= sc.nextInt();
				 withdraw(amount2);
				  System.out.println("\n");
				  break;
			case 'D':
			     System.out.println("-------------------------------------");
				 getPreviousTransaction();
				 System.out.println("-------------------------------------");
				  System.out.println("\n");
				  break;
			case 'E':
			     System.out.println("***************************************************************************************************");
				 break;
			default:
			     System.out.println("Invalid Option!! Please enter again");
                 break;
			}
		}while(option!='e');
		System.out.println("Thank you for using our services");
	}
}

				