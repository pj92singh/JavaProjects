package guessgame;
/* Question 2  
 * 60-280
 * Assignment 2 
 * Prabhjit Singh 
 * uwinID 103180339 
 * GUI for guess game 
 * */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class ques2guess {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ques2guess window = new ques2guess();
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
	public ques2guess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblQuestionGuess = new JLabel("Question 2 Guess Game!");
		
		JLabel lblEnterYourGuess = new JLabel("Enter your Guess!");
		
		textField = new JTextField();
		textField.setText("0");
		textField.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		
		JButton btnTryAgain = new JButton("Try Again!");
		
		JLabel label_reply = new JLabel("-");
		
		JLabel lbltheNumberIs = new JLabel("(The number is betwen 1-1000)");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnGuess)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnTryAgain))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEnterYourGuess)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(83, Short.MAX_VALUE)
							.addComponent(lblQuestionGuess)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbltheNumberIs, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(142)
					.addComponent(label_reply)
					.addContainerGap(360, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQuestionGuess)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterYourGuess)
						.addComponent(lbltheNumberIs))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuess)
						.addComponent(btnTryAgain))
					.addGap(18)
					.addComponent(label_reply)
					.addContainerGap(90, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		//the random integer to guess
		//--------------------------
 	 	Random rand = new Random();
     	 int y = rand.nextInt(1000) + 1;
     	 
     	 //just for testing print out the number 
     	 System.out.println("Testing the random number \n" 
     	 +"and using it to print out so I can see if the game works\n"  +"is:" +y);
		//-------------------------
     	 
		//guess listener 
     	//-------------------------------------------------------
		btnGuess.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	
		        	 
		        	 //read in the integer 
		        	 //that the user puts in
		        	 //as their guess
		        	String answer = textField.getText(); 
		        	double ans1 = Integer.parseInt(answer);
		        	//close of editing for the textfield 
		        	 textField.setEditable(false);
		        	 
		        	function(y, ans1,label_reply); 	
	        	 }
	         }); 
		//-------------------------------------------------------
		//try again button listener 
		//-------------------------------------------------------
		btnTryAgain.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 //this will close the current window
	          frame.dispose(); 
	          //start the game over 
	          //with the new integer to guess
	          ques2guess window2 = new ques2guess();
	          window2.frame.setVisible(true);
	         }
		}); 
	}
	public void function(double a, double ans1,JLabel label_reply){
		//just for testing print out the number 
   	 System.out.println("random from function:" +a);
    	 
		
		//rest the field if it's already coloured 
		 textField.setForeground(Color.black);
    	 textField.setBackground(Color.white);
		//if the guess is correct
    	if(ans1 == a){
    		label_reply.setText("Correct! you guessed right!");
    		textField.setBackground(Color.green);
    		textField.setForeground(Color.black);
    		label_reply.setForeground(Color.green);
    	}
    	//if the guess is higher than x 
    	if(ans1 > a){
    		label_reply.setText("Wrong! Your guess is higher!");
    		textField.setBackground(Color.red);
    		textField.setForeground(Color.black);
    		label_reply.setForeground(Color.red);
    		
    	}
    	//if the guess is lower than x 
    	if(ans1 < a){
    		label_reply.setText("Wrong! Your guess is lower!");
    		textField.setBackground(Color.BLUE);
    		textField.setForeground(Color.black);
    		label_reply.setForeground(Color.blue);
    		
    	}
	}
}
