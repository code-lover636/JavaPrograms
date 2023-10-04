/*
3. Design a class to represent a bank account
Include the following members:

Data members:

    Name of the depositor
    Account number
    Type of account
    Balance amount in the account

Methods:

    To assign initial values
    To Deposit an amount
    To withdraw an amount after checking balance
    To display the name and balance
*/

import java.util.Scanner;

class BankDetails{
	String holdernm;
	String acctype;
	long accnum;
	double bankbalance;
	void enterData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account holder name: ");
		holdernm=sc.nextLine();
		System.out.print("Enter account type: ");
		acctype=sc.nextLine();
		System.out.print("Enter account number: ");
		accnum=sc.nextInt();
		System.out.print("Enter balance amount: ");
		bankbalance=sc.nextDouble();
		System.out.println("Values Initialised");
	}
	void withdraw(double amt){
		if(amt<=bankbalance){
			bankbalance -= amt;
			System.out.println("bank balance: "+ bankbalance);
			return;
		}
		System.out.println("Insufficient balance");
	}
	void deposit(double amt){
		bankbalance += amt;
		System.out.println("bank balance: "+ bankbalance);
	}
	void display(){
		System.out.println("Account holder name: "+ holdernm);
		System.out.println("Balance amount: "+ bankbalance);
	}
}

public class Bank{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BankDetails cust1 = new BankDetails();
		cust1.enterData();
		
		System.out.print("Enter amount to be withdrawn: ");
		double amt = sc.nextDouble();
		cust1.withdraw(amt);
		System.out.print("Enter amount to be deposited: ");
		amt = sc.nextDouble();
		cust1.deposit(amt);
		cust1.display();
		sc.close();
	}
}
