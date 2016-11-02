package Ass1;
import java.util.ArrayList;
public class Inventory{
	
	// total price
	 double total_a;
	 double total_b;
	 double total_p;
	 double total_c;
	 double total_cc; 
	
		//stock
		String input =""; 
			int minus = 0; 
			private int apple_stock = 1000 - minus;
			private int item_ID_a = 101;
			private double item_price_a = 2.00;
			private String item_des_a ="Apple";
			
			
			 private int banana_stock = 1000 - minus;
			 private int item_ID_b = 102;
			 private double item_price_b = 0.99;
			 private String item_des_b ="Banana";
				
				
				
			 private int pop_stock = 2000 - minus;
			 private int item_ID_p = 203;
			 private double item_price_p = 2.00;
			 private String item_des_p ="Coke 2L bottle";
			 
			 
			 
			 private int chips_stock = 2000- minus;   
			 private int item_ID_c = 200;
			 private double item_price_c = 1.50;
			 private String item_des_c ="Chips";
			 
	
		//create new inventory 
		// for test don't need this 
			 //Inventory I1 = new Inventory();
		
	
		public Inventory()
		   {
		      // implicit call to Object constructor occurs here
		   } 
		public Inventory(int minus_t, int apple_stock_t)
		   {
		      // implicit call to Object constructor occurs here
		      minus = minus_t;  // no need for validation
		      apple_stock = apple_stock_t;  // no need for validation
		   } 
	

		//stock methods 
	public void get_apple_stock(){
		
			System.out.println("The apple stock is" +apple_stock); 
			System.out.println("\n");
			
		}
	public void get_banana_stock(){	
	
			System.out.println("The banana stock is" +banana_stock); 
			System.out.println("\n");
			
		}
	public void get_pop_stock(){	
			System.out.println("The pop stock is" +pop_stock); 
			System.out.println("\n");
			
		}
	public void get_chip_stock(){	
			System.out.println("The chips stock is" +chips_stock); 
			System.out.println("\n");
			
		}
		
	
	//pruchasing minus stock methods 
	public void minus_stock_apple(int minus){
		
		apple_stock = apple_stock - minus; 
		System.out.println("The new stock after purchase is" +apple_stock);
		System.out.println("\n");
	}
	public void minus_stock_banana(int minus){
		
		banana_stock = banana_stock - minus; 
		System.out.println("The new stock after purchase is" +banana_stock);
		System.out.println("\n");
		
	}	
	public void minus_stock_pop(int minus){
		
		pop_stock = pop_stock - minus; 
		System.out.println("The new stock after purchase is" +pop_stock);
		System.out.println("\n");
		
	}	
	public void minus_stock_chips(int minus){
		
		chips_stock = chips_stock - minus; 
		System.out.println("The new stock after purchase is" +chips_stock);
		System.out.println("\n");
		
		
	}	
	
	
	// price methods 
	public double get_apple_price(int minus, double total_a){
		
		total_a = item_price_a * (double)minus; 
		System.out.println("The apple price is $\t" +item_price_a); 
		System.out.println("\n");
		System.out.println("With the total apples you are purchasing \t" +minus);
		System.out.println("\n");
		System.out.println("The total is $ \t" +total_a); 
		System.out.println("\n");
		return this.total_a = total_a; 
		
		
	}
	public double get_banana_price(int minus, double total_b){
		
		total_b = item_price_b * (double)minus; 
		System.out.println("The apple price is $\t" +item_price_b); 
		System.out.println("\n");
		System.out.println("With the total apples you are purchasing \t" +minus);
		System.out.println("\n");
		System.out.println("The total is $ \t" +total_b); 
		System.out.println("\n");
		
		return this.total_b = total_b;  
	}
	public double get_pop_price(int minus, double total_p){
		
		total_p = item_price_p * (double)minus; 
		System.out.println("The apple price is $\t" +item_price_p); 
		System.out.println("\n");
		System.out.println("With the total apples you are purchasing \t" +minus);
		System.out.println("\n");
		System.out.println("The total is $ \t" +total_p); 
		System.out.println("\n");
		
		//Price pp1 = new Price();
		//pp1.store_p(total_p);
		
		return this.total_p = total_p;  
	}
	public double get_chips_price(int minus, double total_c){
		
		total_c = item_price_c * (double)minus; 
		System.out.println("The apple price is $\t" +item_price_c); 
		System.out.println("\n");
		System.out.println("With the total apples you are purchasing \t" +minus);
		System.out.println("\n");
		System.out.println("The total is $ \t" +total_c); 
		System.out.println("\n");
		
		//Price c1 = new Price();
		//c1.store_c(total_c);
		return this.total_c = total_c; 
		//set_chips_price(total_c); 
		
		
			

		//return total_cc = total_c; 
	}
	public double set_chips_price(double total_cc){
		System.out.println("Total C is" +total_cc);
		return this.total_cc = total_c; 
	}
	
	
	
	//total price
	public void total_purchase_price(double total_a, double total_b, double total_p, double total_c){
		double full_total, before_tax_total, tax = 0.15; 
		int sub_exit = 0, sum = 0;
		double[] subtotal = null; 
		
		
		
		
		// testing 
		System.out.println("apple total is" +total_a); 
		System.out.println("banana total is" +total_b);
		System.out.println("pop total is" +total_p);
		System.out.println("chips total is" +total_cc); 
		System.out.println("\n");
		before_tax_total = total_a + total_b + total_p + total_c; 
		//display total before tax
		System.out.println("The sub total is $\t" +before_tax_total);
		
		//other way of doing it 
		
		double s; 
		//s = before_tax_total; 
		
		   
	
		
		
		//display the tax
		System.out.println("\n");
		
		System.out.println("The tax right now is \t" +tax); 
		System.out.println("\n");
		//display the final total
		full_total = before_tax_total + (tax * before_tax_total); 
		System.out.println("The final total after tax being applied is $\t" +full_total);
		
	}
	
	}
