package Ass1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Stuff extends Inventory {
/*
	double a_total = Inventory.total_a;
	double b_total = Inventory.total_b;
	double p_total = Inventory.total_p;
	double c_total = Inventory.total_c;
*/ 	
	int knt_1 = Menu.knt; 
	
	private static Scanner input_1;
	private static Scanner input_2;
	private static Scanner input_3;
	private static Scanner input_4;

	public static double term_1;

	public static double term_2;

	public static double term_3;

	public static double term_4;

	public static double total1;

	public static int counter;

	public static void ask_ID(){
		int asked_ID, break_variable = 1, done = 0; 
		double total[] = null, total1 = 0, subtotal = 0; 
		int totalarray[]; 
		double term_1 = 0, term_2 = 0, term_3= 0, term_4 =0, term_5 = 0; 
		do{
		//loop
		System.out.println("Please enter the Item ID\n");
		Scanner input = new Scanner(System.in);
		asked_ID = input.nextInt();
		
		Inventory a1 = new Inventory();
		
		
					if (asked_ID == 101) {
						System.out.println("How manny apples are there?\n");
						input_1 = new Scanner(System.in);
						
						int number_items = input_1.nextInt(); 
						
						//Inventory a1 = new Inventory();
						a1.get_apple_stock(); 
						a1.minus_stock_apple(number_items);
						term_1 = a1.get_apple_price(number_items, 0);
						
						
					}
					else if(asked_ID == 102){
						System.out.println("How manny bananas are there?\n");
						input_2 = new Scanner(System.in);
						
						int number_items = input_2.nextInt(); 
						
					//	Inventory b1 = new Inventory();
						a1.get_banana_stock(); 
						a1.minus_stock_banana(number_items);
						term_2= a1.get_banana_price(number_items, 0);
					}
					else if(asked_ID == 203){
						System.out.println("How manny soda-pops are there?\n");
						input_3 = new Scanner(System.in);
						
						int number_items = input_3.nextInt(); 
						
						//Inventory p1 = new Inventory();
						a1.get_pop_stock(); 
						a1.minus_stock_pop(number_items);
						term_3 = a1.get_pop_price(number_items, 0);
					}
					else if(asked_ID == 200){
						System.out.println("How manny chips are there?\n");
						input_4 = new Scanner(System.in);
						
						int number_items = input_4.nextInt(); 
						
						//Inventory c1 = new Inventory();
						a1.get_chip_stock(); 
						a1.minus_stock_chips(number_items);
						term_4 =a1.get_chips_price(number_items, 0);
					}
					else{
						System.out.println("ERROR!!! Wrong Item ID, please try again!!\n");
						ask_ID();
					} 
		
					double price[] = {term_1, term_2, term_3, term_4}; 
					
					for(int i=0; i<5;){
						subtotal += price[i];
					break; 
					} 
					total1 = subtotal * 0.15;
					System.out.println("Total is" +total1); 
					
					int counter = 0;
					
					counter++;
					
					System.out.println("Any items left? Press '1 ' if there are \n Press '0' if none\n"); 
					Scanner input_5 = new Scanner(System.in);
					
					break_variable = input_5.nextInt(); 
					
					
		}while(break_variable == 1); 
		
		System.out.println("Total from the get_total function\n");
		 get_total(term_1, term_2, term_3, term_4); 
		 
	}
	
	
	public static void get_total(double a_total,double b_total,double p_total, double c_total){
	
		Inventory pur1 = new Inventory();
		
		pur1.total_purchase_price(a_total, b_total, p_total, c_total); 
	
		//as for payment in cash 
		System.out.println("Please pay with cash!\n"); 
		double payment; 
		//ask for cash payment! 
		payment =   Double.parseDouble(JOptionPane.showInputDialog("Employee please enter the cash payment!\n")); 
		
		
		//now printing out the reciept for the customer 
		reciept(a_total, b_total, p_total, c_total); 
		
		
	} 
	public static void reciept(double a_total,double b_total,double p_total, double c_total){
		//priting out the reciept using all the totals 
		
		if( a_total > 0){
			System.out.println("Apples' total $" +a_total); 
			
		}
		if( b_total > 0){
			System.out.println("Banana's total $" +b_total); 
		}
		if( p_total > 0){
			System.out.println("Pop's total $" +p_total); 
		}
		if( c_total > 0){
			System.out.println("Chip's total $" +c_total); 
		}
		
		System.out.println("Hope you enjoyed your shopping experince!!!\n");
		System.out.println("Please come again!\n");  
		
		
		
		
	}

}

