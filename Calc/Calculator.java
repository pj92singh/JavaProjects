package Calcu;

/* Assignment 3 60-280
 * Prabhjit Singh
 * uwinID 103180339
 * Caluclator class  */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Calculator{ //implements ActionListener {

	protected static final Double NULL = null;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblCalculator = new JLabel("Calculator");
		//create the textfiled
		//and set it to uneditable
		textField = new JTextField();
		textField.setColumns(10);
		//textField.setEditable(false);
		int operator=0;
		 double a=0,b=0,result=0;
		JButton btnSqr = new JButton("Sqrt");

		JButton b7 = new JButton("7");

		JButton b8 = new JButton("8");

		JButton b9 = new JButton("9");

		JButton b4 = new JButton("4");

		JButton b5 = new JButton("5");

		JButton b6 = new JButton("6");

		JButton b1 = new JButton("1");

		JButton b2 = new JButton("2");

		JButton b3 = new JButton("3");

		JButton btnPwr = new JButton("Pwr");

		JButton bmod = new JButton("%");

		JButton btnClear = new JButton("Clear");

		JButton b0 = new JButton("0");

		JButton bdot = new JButton(".");

		JButton bequal = new JButton("=");

		JButton bdivide = new JButton("/");

		JButton bmulti = new JButton("*");

		JButton bsubtract = new JButton("-");

		JButton baddition = new JButton("+");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCalculator)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnSqr)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnPwr, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bmod, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(b7, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(b8, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(b9, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(b4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(b5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(b6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(bdot, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(b0))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(b1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(b2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(bequal, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(b3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(baddition, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(bsubtract, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(bmulti, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(bdivide, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(36, Short.MAX_VALUE))
		);

		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCalculator)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnClear))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSqr)
						.addComponent(btnPwr)
						.addComponent(bmod)
						.addComponent(bdivide))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(b7)
						.addComponent(b8)
						.addComponent(b9)
						.addComponent(bmulti))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(b4)
						.addComponent(b5)
						.addComponent(b6)
						.addComponent(bsubtract))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(b1)
						.addComponent(b2)
						.addComponent(b3)
						.addComponent(baddition))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(b0)
						.addComponent(bdot)
						.addComponent(bequal))
					.addContainerGap(46, Short.MAX_VALUE))
		);

		frame.getContentPane().setLayout(groupLayout);

		//decimal button
		bdot.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
						 textField.setText(textField.getText().concat("."));
					 }

		});
		//addition button
		baddition.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
						 double  a=Double.parseDouble(textField.getText());
						 textField.setText(" ");
						 bequal.addActionListener(new ActionListener() {
				 	         public void actionPerformed(ActionEvent e) {
										 double  b=Double.parseDouble(textField.getText());
				 	           double result = a + b;
				 	           String add_res = Double.toString(result);
				 	            textField.setText(add_res);
				 	           result = 0; 
				 	          add_res = ""; 
				 	     	b = 0; 
				 	     	
									 }
								 });
						
					 }
				 });

		//subtrtact button
		bsubtract.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
						 double  a=Double.parseDouble(textField.getText());
						 textField.setText(" ");
						 bequal.addActionListener(new ActionListener() {
				 	         public void actionPerformed(ActionEvent e) {
										 double  b=Double.parseDouble(textField.getText());
				 	           double result = a - b;
				 	           String sub_res = Double.toString(result);
				 	            textField.setText(sub_res);
				 	           result = 0; 
				 	           sub_res = ""; 
				 	      	b = 0; 
									 }
								 });
					 }
				 });
		//multiply button
		bmulti.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
						 double  a=Double.parseDouble(textField.getText());
						 textField.setText(" ");
						 bequal.addActionListener(new ActionListener() {
				 	         public void actionPerformed(ActionEvent e) {
										 double  b=Double.parseDouble(textField.getText());
				 	           double result = a * b;
				 	           String multi_res = Double.toString(result);
				 	            textField.setText(multi_res);
				 	           result = 0; 
				 	           multi_res = "";
				 	      	b = 0; 
									 }
								 });
					 }
				 });
		//divide button
		bdivide.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
						 double  a=Double.parseDouble(textField.getText());
						 textField.setText(" ");
						 bequal.addActionListener(new ActionListener() {
				 	         public void actionPerformed(ActionEvent e) {
										 double  b=Double.parseDouble(textField.getText());
				 	           double result = a / b;
				 	           String div_res = Double.toString(result);
				 	            textField.setText(div_res);
				 	           result = 0; 
				 	           div_res = "";
				 	      	b = 0; 
									 }
								 });
					 }
				 });
		//power button
		btnPwr.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
						double a=Double.parseDouble(textField.getText());
						textField.setText(" ");
						bequal.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										double  b=Double.parseDouble(textField.getText());
				           double result = Math.pow(a, b);
				           String pow_res = Double.toString(result);
						textField.setText(pow_res);
						 result = 0; 
						 pow_res = ""; 
							b = 0; 
					}
				});
			 }
		});
		//square root button
		btnSqr.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e) {
	        	 //get number first
	        	String srt_root = textField.getText();
	        	Double square_ans = Double.parseDouble(srt_root);
	        	//check if its 0
	        	if((square_ans == 0) || (square_ans == NULL ) ){
	        		textField.setText("Can't have square root of zero or null");
	        	}
						bequal.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
						//now using math function sqrt
						//preform the square root
						//and return it
	        	double ans = Math.sqrt(square_ans);
	        	String final_ans = Double.toString(ans);
	        	textField.setText(final_ans);
	        	ans = 0;
	        	final_ans = ""; 
	        	
	         }
								
									
				 });
			 }
		});
		//modulous button
		bmod.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e) {
						 double a=Double.parseDouble(textField.getText());
 						textField.setText(" ");
 						bequal.addActionListener(new ActionListener() {
 									public void actionPerformed(ActionEvent e) {
 										double  b=Double.parseDouble(textField.getText());
										double result = a % b;
									 String mod_res = Double.toString(result);
										textField.setText(mod_res);
										result = 0;
										mod_res = ""; 
										b = 0; 
										
								 }
							 });
				 }
			 });
		
		//button listener
		btnClear.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //clear the jlabel of outupt
	        	 textField.setText("");
	         }
		});

		b7.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 7 to the textfield
	        	 textField.setText(textField.getText().concat("7"));
	         }
		});
		b8.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 8 to the textfield
	        	 textField.setText(textField.getText().concat("8"));
	         }
		});
		b9.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 9 to the textfield
	        	 textField.setText(textField.getText().concat("9"));
	         }
		});
		b0.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 0 to the textfield
	        	 textField.setText(textField.getText().concat("0"));
	         }
		});
		b6.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 6 to the textfield
	        	 textField.setText(textField.getText().concat("6"));
	         }
		});
		b5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 5 to the textfield
	        	 textField.setText(textField.getText().concat("5"));
	         }
		});
		b4.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 4 to the textfield
	        	 textField.setText(textField.getText().concat("4"));
	         }
		});
		b3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 3 to the textfield
	        	 textField.setText(textField.getText().concat("3"));
	         }
		});
		b2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 2 to the textfield
	        	 textField.setText(textField.getText().concat("2"));
	         }
		});
		b1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //concat 7 to the textfield
	        	 textField.setText(textField.getText().concat("1"));
	         }
		});


}
	private void op(double a, int i) {
		// TODO Auto-generated method stub
		int operator=i;
		double result;
		double b=Double.parseDouble(textField.getText());

         switch(operator)
         {
             case 1: result=a+b;
                 break;

             case 2: result=a-b;
                 break;

             case 3: result=a*b;
                 break;

             case 4: result=a/b;
                 break;

             default: result=0;
         }

         textField.setText(""+result);
     }


	}//end of class






		//subtraction button listener
		/*
		bsubtract.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //get number first
	        	String sub_num = textField.getText();
	        	Double number_to_subtract = Double.parseDouble(sub_num);
	        		//now preform subtraction by taking another input
	        	double ans = Math.sqrt(square_ans);
	        	String final_ans = Double.toString(ans);
	        	textField.setText(final_ans);
	         }
		});

	}
	*/
