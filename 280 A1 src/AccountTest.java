/* Prabhjit Sing h
AccountTest class
Tested by using 2 accounts, and
testing the credit and debit
methods and getting account balance */
import java.util.Scanner;

public class AccountTest {

		public static void main(String[] args) {
			Account Account1 = new Account(50.00);
			Account Account2 = new Account(-7.53);
			System.out.printf("Account 1 balance is $%.2f\n",
			Account1.get_Balance() );
			System.out.printf("Account 2 balance is $%.2f\n",
			Account2.get_Balance() );

			Scanner input1 = new Scanner(System.in);
			double depositAmount1;
			//Ask user for depositAmount1
			System.out.println("Enter deposit amount please, for account1");
			depositAmount1 = input1.nextDouble();
			System.out.println("\n Adding %.2f to the Account1 balance:\n" +depositAmount1);
			//add the deposit
			Account1.credit(depositAmount1);


			//show the recipet to the user
			System.out.println("Account balance for account1 is: $" +Account1.get_Balance());
			//debit
			System.out.println("Account 1, how much do you wish to withdraw?\n\n");

			Scanner input2 = new Scanner(System.in);
			double debitAmount1;
			debitAmount1 = input2.nextDouble();
			Account1.debit(debitAmount1);

			//account 2
			System.out.println("*******Account2*******\n");
			System.out.printf("Account 2 balance is $%.2f\n",
			Account2.get_Balance() );

			Scanner input3 = new Scanner(System.in);
			double depositAmount2;
			//Ask user for depositAmount1
			System.out.println("Enter deposit amount please, for account1");
			depositAmount2 = input3.nextDouble();
			System.out.println("\n Adding %.2f to the Account1 balance:\n" +depositAmount2);
			//add the deposit
			Account2.credit(depositAmount2);


			//show the recipet to the user
			System.out.println("Account balance for account1 is: $" +Account2.get_Balance());
			//debit
			System.out.println("Account 2, how much do you wish to withdraw?\n\n");

			Scanner input4 = new Scanner(System.in);
			double debitAmount2;
			debitAmount2 = input4.nextDouble();
			Account2.debit(debitAmount2);


		}
}
