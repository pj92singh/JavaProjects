package Ass1; 
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Menu extends Stuff{
	public static int knt;
	public static void main(String[] args) {
		//variables 
		int item, item_counter=0, item_copies = 1;
		double total=0, payment=0; 
	/* This java program using inheriteance with 2 other classes to 
	 * make the compelte POS program! The customer can arrive to the system
	 * and then cashier who is signed in can start the sale process
	 *  (this option begins when tehe cashier presses '1')
	 * If there is not customer, the cashier can wait until one arrives.
	 * (This option begins when they press '2') 
	 * Or if the shift is over they can press '3' to exit the program
	 * 
	 * The inventory is subtracted as the cashier provides the 
	 * amount of the same item purchased. 
	 * The price is calculated as such and the total is given with the 
	 * tax caluclated.
	 * 
	 * Next the cashier can ask for CASH payment ONLY!! No other payment-
	 * method is accepted yet! 
	 * 
	 * Then the reciept is printed and a new sale process can begin!
	 * 
	 */
		
		
		
		
		//start with the menu option 
		intro_menu(); 
		
		

	}
	
	public static void intro_menu(){
		
        String emp_name;
        

        //Start the menu 
		System.out.println("Welcome to the automatic Cashier!\n");
        //Ask for employee to sign in!
        emp_name =  JOptionPane.showInputDialog("Employee please enter your name!\n"); 
        System.out.println("Welcome\t" +emp_name);

        //setting a limit for quick customer check out!
        System.out.println("To provide a quick checkout experince, there is a limit of 100 items per customer & we only take in cash!\n Thank you!\n");
	
        intro_menu1(); 
	}
        public static void intro_menu1(){
        	int asked_items, job_done = 0, sale_start;
        	
            //start a new sale
		 //sale_start = JOptionPane.showInputDialog("Start new sale?\n Type 'Y' for yes"); 
        System.out.println("1)Start new sale?\n Type '1' for yes or type '2' for no\n or type '3' to exit the POS program!\n" );
 		Scanner input_start = new Scanner(System.in);
 		sale_start = input_start.nextInt();
			if(sale_start == 1){		
				
				//jump to next method
		        //using what_item to start scanning them
		        //then obtaining the price 
		        what_item(job_done);
		        job_done = 1; 
					//code went there 
								    	}
										
								     
				
		
			
			//if no sale
			else if(sale_start == 2){
				System.out.println("Please wait for a customer to arrive\n"); 
				intro_menu1(); 
			}
			//if 3 is chosen to exit the pos program 
			else if(sale_start == 3){
				System.exit(1); 
			} 
			
	}
	public static int what_item(int job_done){
		 	int input_exit = 1, count= 0; 
		//do{
			//start the scanning process! 
			System.out.println("Scanning process...");
			//display stock keywords for the cashier 
			 
					
	
				//	for(int i = 0; i <100; i++)
				//	{
					System.out.println("apple_stock\t Apple item code is 101\n banana_stock\t Banana item code is 102\n pop_stock\t Pop item code is 203\n chips_stock\t Chips item code is 200\n");
					Stuff i1 = new Stuff();
					//Items.return_ID();
					Stuff.ask_ID();
				//	System.out.println("Press '0' to exit if there are no items left or press '1' to contiune scanning\n"); 
				//	Scanner input_e = new Scanner(System.in);
				//	input_exit = input_e.nextInt();
				//	 if(input_exit == 1){
				//		 count++;
				//		 continue;
				//	 }
				//	 else
				//		 break; 
					
				//	} 
				//	break;
					
		//}while(input_exit == 0);
		
		knt = count;  
		//Stuff.get_total(5, 6, 7, 8); 
		
		System.out.println("Thank you for shopping!\n");
		
		//start the menu1 process
		//since it is the same cashier
		//if a new customer arrives then then can contiune
		//with a new scan
		//if their shift is over they can exit 
		intro_menu1();
		return job_done; 
		
		
		
		}
	}


	
