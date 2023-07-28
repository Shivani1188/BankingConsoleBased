package in.ineuron.Banking;

import java.util.Scanner;

class Account
{
	private String name;
	private String fname;
	private String mname;
	private String mno;
	private int age;
	private String dob;
	private String atype;
	private String pwd;
	private int choice;
	private int balance=0;
	private int depositAmt;
	private int withdrawAmt;
	
	
	public void login()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		name=scan.nextLine();
		System.out.println("Enter your Password");
		pwd=scan.nextLine();
		//Db(name,pwd);
		System.out.println("-------------------------");
		System.out.println("What do you want to do?");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		choice=scan.nextInt();
		if(choice==1)
		{
			checkBalance();
			
		}
		else if(choice==2)
		{
			deposit();
		}
		else if(choice==3)
		{
			withdraw();
		}
		else if(choice==4)
		{
			thankyouMsg();
		}
		else
		{
			System.out.println("Please select the valid option");
			home();
		}
	}

	public void loginAfterRegistration(String name,String pwd)
	{
		String n1=name;
		String p1=pwd;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		name=scan.nextLine();
		System.out.println("Enter your Password");
		pwd=scan.nextLine();
		
		if(n1.equalsIgnoreCase(name)&&p1.equalsIgnoreCase(pwd))
		{
			System.out.println("-------------------------");
			System.out.println("What do you want to do?");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice=scan.nextInt();
			if(choice==1)
			{
				checkBalance();
				
			}
			else if(choice==2)
			{
				deposit();
			}
			else if(choice==3)
			{
				withdraw();
			}
			else if(choice==4)
			{
				thankyouMsg();
			}
			else
			{
				System.out.println("Please select the valid option");
				home();
			}
		}
		else
		{
			System.out.println("Please enter the valid username and password");
			//mainHome();
			mainHomeAfterRegistration(n1,p1);
		}
	}
	public void checkBalance()
	{
		balance=depositAmt;
		System.out.println("----------------------------------------");
		System.out.println(name+" your account balance is "+ balance);
		System.out.println("-----------------------------------------");
		home();
	}
	public void checkBalanceAfterWithdraw()
	{
		balance=balance-withdrawAmt;
		System.out.println("-------------------------");
		System.out.println("your balance is "+balance);
		System.out.println("--------------------------");
		home();
	}
	public void deposit()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount to be deposite");
		depositAmt=scan.nextInt();
		balance=depositAmt;
		System.out.println("--------------------------------------");
		System.out.println("Your Amount is deposited successfully");
		System.out.println("--------------------------------------");
		home();
	}
	public void withdraw()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount to be withdraw");
		int withdrawAmt=scan.nextInt();
		if(withdrawAmt<balance)
		{
			balance=balance-withdrawAmt;
			System.out.println("--------------------------");
			System.out.println("withdraw is successfull");
			System.out.println("---------------------------");
			System.out.println("your balance is "+balance);
			System.out.println("---------------------------");
			home();
		}
		else
		{
			System.out.println("-----------------------------------------------------");
			System.out.println("Sorry!you don't have sufficient balance to withdraw");
			System.out.println("Enter the valid amount to be withdraw");
			System.out.println("Your account balance is "+balance);
			System.out.println("------------------------------------------------------");
			withdraw();
		}
	}
	public void home()
	{
		int choice;
		Scanner scan=new Scanner(System.in);
		System.out.println("*****************************");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		choice=scan.nextInt();
		if(choice==1)
		{
			checkBalanceAfterWithdraw();
		}
		else if(choice==2)
		{
			deposit();
		}
		else if(choice==3)
		{
			withdraw();
		}
		else
		{
			thankyouMsg();
		}
		
	}
	public void thankyouMsg()
	{
		System.out.println("-----------------------------------");
		System.out.println("Thankyou for using our application");
		System.out.println("-----------------------------------");
		mainHome();
		
	}
	public void calculateDOB()
	{
		
	}
	public void Db(String name,String pwd)
	{
		String n1=name;
		String p1=pwd;
		
		System.out.println(n1);
		System.out.println(p1);
		
		loginAfterRegistration(n1,p1);
//		
//		this.name=name;
//		this.pwd=pwd;
//		
//		if(n1.equalsIgnoreCase(name)&&p1.equalsIgnoreCase(pwd))
//		{
//			System.out.println("Welcome "+name);
//		}
//		else
//		{
//			System.out.println("Incorrect details please login");
//			login();
//		}
		
	}
	public void database(String mname,String fname,String mno,String atype)
	{
		this.mname=mname;
		this.fname=fname;
		this.mno=mno;
		this.atype=atype;
		
	}
	public void register()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("Enter your name");
			name=scan.next();
			
			System.out.println("Enter your Mother's name");
			mname=scan.next();
			System.out.println("Enter your Father's name");
			fname=scan.next();
//			System.out.println("Enter your DOB");
//			dob=scan.nextLine();
			//calculateDOB();
			System.out.println("Enter your Mobile number");
			mno=scan.next();
			System.out.println("Enter the type of account you want to open");
			atype=scan.next();
			System.out.println("Create your Password");
			pwd=scan.next();
			
			System.out.println("Thankyou for Registering Please Login");
			mainHomeAfterRegistration(name,pwd);
			Db(name,pwd);
//			database(mname,fname,mno,atype);
		}
		else
		{
			System.out.println("Sorry!You are not eligible");
		}
	}
	
	public void mainHome()
	{
		 int choice;
		Scanner scan=new Scanner(System.in);
		System.out.println("-----WELCOME TO OUR BANK-----");
		System.out.println("1. Login");
		System.out.println("2  Register");
		System.out.println("Enter your choice");
		choice=scan.nextInt();
		
		if(choice==1)
		{
			login();
		}
		else if(choice==2)
		{
			register();
		}
		else
		{
			System.out.println("Please select the valid option");
			mainHome();
		}
	}

	public void mainHomeAfterRegistration(String name,String pwd)
	{
		String n1=name;
		String p1=pwd;
		 int choice;
		Scanner scan=new Scanner(System.in);
		System.out.println("-----WELCOME TO OUR BANK-----");
		System.out.println("1. Login");
		System.out.println("2  Register");
		System.out.println("Enter your choice");
		choice=scan.nextInt();
		
		if(choice==1)
		{
			loginAfterRegistration(n1,p1);
		}
		else if(choice==2)
		{
			register();
		}
		else
		{
			System.out.println("Please select the valid option");
			mainHome();
		}
	}
	}
public class Bank {

	public static void main(String[] args) {
		Account a=new Account();
		a.mainHome();
	}
}