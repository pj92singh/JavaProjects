/*
Prabhjit Singh
Account class 
*/

import java.util.Scanner;

public class Account {
	//variables
	private double balance;

	//constructor
	public Account(double intial_balance){

			//check that the intial_balance is greater than 0 first.
			//if its not then it is set at 0.0
			if(intial_balance > 0.0){
				balance = intial_balance;
			}
	}
	//end of constructor

	public void credit(double amount){
		//add the amount to the balance
		balance = balance + amount;

	}

	//if person asks for balance then need
	//method for it
	public double get_Balance(){
		return balance;
	}

	//method debit
	public void debit(double amount){
		if(amount > balance){
			System.out.println("Debit amount exceeds account balance!\n");
		}
		else{
			balance = balance - amount;
			System.out.println("Money drawn successfully is $" +amount);
			System.out.println("New balance is $" +balance);
		}
	}

}
