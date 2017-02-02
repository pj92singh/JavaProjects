package qu4;
/* Question 4  
 * 60-280
 * Assignment 2 
 * Prabhjit Singh 
 * uwinID 103180339 
 * GUI for accounts 
 * */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class InterestManage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterestManage window = new InterestManage();
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
	public InterestManage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblQuestionInterest = new JLabel("Question 4: Interest Calculator");
		
		textField = new JTextField();
		textField.setText("4000");
		textField.setColumns(10);
		
		JLabel lblInitialBalance = new JLabel("Initial Balance Debit");
		
		JLabel lblNewLabel = new JLabel("Annual Interest (%)");
		
		textField_1 = new JTextField();
		textField_1.setText("4.0");
		textField_1.setColumns(10);
		
		JLabel lblIintialBalanceCredit = new JLabel("Initial Balance Credit");
		
		textField_2 = new JTextField();
		textField_2.setText("1400");
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Simple");
		comboBox.addItem("Compound");
	    Object cmboitem = comboBox.getSelectedItem();
	    System.out.println(cmboitem);

		
		JLabel lblBalanceAfterCalculation = new JLabel("Balance after calculation");
		
		/* JButton btnCalculate = new JButton("Calculate"); */ 
		
		JLabel lblDebitBalanceAfter = new JLabel("Debit Balance after Interest");
		
		JLabel lblCreditBalanceAfter = new JLabel("Credit Balance after Interest");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(125)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblBalanceAfterCalculation, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQuestionInterest)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField, 0, 0, Short.MAX_VALUE)
										.addComponent(lblInitialBalance, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblIintialBalanceCredit)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
											.addGap(18)
										/*	.addComponent(btnCalculate)*/))) 
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDebitBalanceAfter, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCreditBalanceAfter, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQuestionInterest)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblInitialBalance))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIintialBalanceCredit)
								/*.addComponent(btnCalculate)*/)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblBalanceAfterCalculation)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDebitBalanceAfter)
						.addComponent(lblCreditBalanceAfter))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		//get all the information 
    	//from the text fields 
    	//debit
    	String debit1 = textField.getText(); 
    	double bal1 = Double.parseDouble(debit1);
    	
    	//credit 
    	String credit1 = textField_2.getText(); 
    	double bal2 = Double.parseDouble(credit1);
    	
    	//interest 
    	String interest = textField_1.getText(); 
    	double interest_given = Double.parseDouble(interest);
    	
		frame.getContentPane().setLayout(groupLayout);
		//combolistner 
		//get the option from the combox as well
    	comboBox.addActionListener (new ActionListener () {
    	    public void actionPerformed(ActionEvent e) {
    	       String combo_option ;
    	      if( comboBox.getSelectedItem() == "Simple"){
    	    	  //do the calculation 
    	    	double ans_Debit = monthly_interest_cal(bal1, interest_given);
    	    	String finalans1; 
    	    	  //write it to the textField_3
    	    	 DecimalFormat numberFormat = new DecimalFormat("#.00");
 	            	finalans1 = numberFormat.format(ans_Debit);
    	    	  textField_3.setText("$"+finalans1);
    	    	  
    	    	  //get credit 
    	    	 double ans_Credit = monthly_interest_cal(bal2, interest_given);
    	    	 String finalans2; 
    	    	  //write it to the textField_4
    	    	 DecimalFormat numberFormat_1 = new DecimalFormat("#.00");
 	            	finalans2 = numberFormat_1.format(ans_Credit);
    	    	  textField_4.setText("$"+finalans2);
    	    	  
    	    	  
    	      }
    	      if( comboBox.getSelectedItem() == "Compound"){
    	    	  //do the calculation 
    	    	  double ans_Debit1 = compoud_interest_cal(bal1, interest_given);
    	    	  String finalans3; 
    	    	  //write it to the textField_3
        	    	 DecimalFormat numberFormat_3 = new DecimalFormat("#.00");
     	            	finalans3 = numberFormat_3.format(ans_Debit1);
        	    	  textField_3.setText("$"+finalans3);
        	    	  
        	    	  //get credit final ans
    	    	 double ans_Credit1 = compoud_interest_cal(bal2, interest_given);
    	    	 String finalans4; 
    	    	 //write it to the textField_4
    	    	 DecimalFormat numberFormat_4 = new DecimalFormat("#.00");
    	    	 finalans4 = numberFormat_4.format(ans_Credit1);
    	    	  textField_4.setText("$"+finalans4);
    	    	 
    	      }
    	    }
    	});
		
		
		/*
		
		//button listner 
		btnCalculate.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	
	        }
		});  */

		
	}
	double intial_balance, annual_interest_rate; 

	public double monthly_interest_cal(double x, double y){
	/* multiplying the initialBalance by annualInterestRate divided by 12*/
	double res;
	res = (x*y)/12; 
	//used to test out res System.out.println(+res);
	return res; 

	}
	public double compoud_interest_cal(double z, double a){
		/* the interest is earned in a month will be added to the initialBalance. */
		double ans;
		ans = intial_balance + (z*a); 
		//used to test out ans System.out.println(+ans);
		return ans; 
	}
}
