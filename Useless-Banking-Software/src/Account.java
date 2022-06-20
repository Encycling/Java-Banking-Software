import java.util.Scanner;

public class Account {
	// Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	// Class Constructor
	Account(String cname, String cid){
		customerName = cname;
		customerID = cid;
	}
	
	// Function for depositing money
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	// Function for withdrawing money
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	// Function for showing the previous transaction
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited $" + previousTransaction);
		} else if(previousTransaction < 0){
			System.out.println("Withdrawn: $" + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured.");
		}
	}
	
	// Function for calculating interest of current funds
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years);
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, your balance will be: " + newBalance);
	}
	
	// Function for showing the main menu
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + customerName + "!");
		System.out.println("Your ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?:");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawl");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			case 'A':
				System.out.println("Balance = $" + balance);
				System.out.println();
				break;
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
			case 'D':
				getPreviousTransaction();
				System.out.println();
				break;
			case 'E':
				System.out.println("Enter how many years of accrued interest:");
				int years = scanner.nextInt();
				calculateInterest(years);
				break;
			case 'F':
				System.out.println();
				break;
				default:
					System.out.println("Invalid option, please try again.");
					break;
			}
		}while(option != 'F');
		System.out.println("Thanks for banking with us!");
		
	}
}
