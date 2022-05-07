package javaIsCool;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// go to my C# version for a more clear explanation of whats going on. 
		// basic crap
		String user = "coolkid9189";
		int pin = 7823;
		int pinReader;
		int cBalance = 10000;
		int choice = 0;
		
		// This useless ATM was taken from my original C# version.
		// I'm just gonna rewrite it in Java.
		// (dp stands for deposit and wd is withdrawal.)
		
		
		System.out.println("Hello, " + user);
		System.out.println("Welcome to the Useless ATM: Java Edition!");
		System.out.print("\nPlease enter your pin to continue: ");
		pinReader = scanner.nextInt();
		
		System.out.println();
		
		if(pinReader == pin) {
			
			System.out.println("Please enter one of the choices below:\n1. Depsoit\n2. withdrawal\n3. Check Current Balance");
			choice = scanner.nextInt();
			
			switch(choice) {
			// To deposit, it will add the amount of money you deposit with the balance.
			case 1:
				System.out.println("Note: The minimum amount of money you can deposit is $100.");
				System.out.print("Please enter the amount of money you would like to deposit: $");
				int dpAm = scanner.nextInt();
				System.out.println();
				int dpTotal = cBalance + dpAm;
				// If the dpAm is less than 100, it will stop the program.
				if(dpAm >= 100) {
					System.out.println("You have successfully deposited $" + dpAm + ".");
					System.out.println("You current balance is: $" + dpTotal + ".");
				}
				else {
					System.out.println("ERROR: The amount you have deposited is less than $100!\nPlease try again.");
				}
				break;
			// to withdrawal, it will subtract the balance with the withdrawal amount.
			case 2:
				System.out.println("Note: The minimum amount of money you can withdrawal is $100.");
				System.out.print("Please enter the amount of money you would like to withdrawal: $");
				int wdAm = scanner.nextInt();
				System.out.println();
				int wdTotal = cBalance - wdAm;
				// again, if les than 100, it will stop.
				if(wdAm >= 100) {
					System.out.println("You have successfully withdrawaled: $" + wdAm + ".");
					System.out.println("Your current balance is: " + wdTotal);
				}else if(wdAm >= 10001) {
					System.out.println("ERROR: The amount you have withdrawaled is more than your balance.\nPlease try again.");
				}
				else {
					System.out.println("ERROR: The amount you have withdrawaled is less than $100!\nPlease try again.");
				}
				break;
			// kinda uselss but i wanted to add it anyway
			case 3:
				System.out.println("Your current balance is: " + cBalance + ".");
				break;
				
			default:
					System.out.println("Invalid choice, please try again.");
					break;
			}
		}
		
		else {
			System.out.println("Your pin was incorrect, please try again.");
		}
		
		System.out.println("Original idea by some random tutorial\n rewritten in java by EpicGamer45#9027");
		
		// Technically not made by me.
		// There was a C# tutorial on how to do this, but I just decided
		// to re write it in Java, so its kinda my program, but the idea was from someone else.
		}
	}
