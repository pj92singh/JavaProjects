package graph; 

/* 60-280 Assign 4
 * Question 2
 * Prabhjit Singh
 * 103180339 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CompleteGraph extends JFrame{
	//set up the variables needed
	//ask the user if they want graph of 
	//1-5 points 
	private final String strings[] = {"1", "2", "3", "4", "5"};
	private boolean[] vertex = new boolean[5];
	
	//make button access the different vertecies option 
	private JRadioButton radio[];
	private ButtonGroup group = new ButtonGroup(); // group for radiobuttons
	private JLabel label = new JLabel("Select the amount of Points/vertices you want!");
	//start the Jpanel 
	JPanel panel = new JPanel();
	
	public CompleteGraph(){
		
		super("Question 2: Graph");
		setLayout(new FlowLayout());
		
		radio = new JRadioButton[strings.length];
		
		ItemHandler handler = new ItemHandler();
		
		JPanel northPanel = new JPanel(); // create south panel
		northPanel.setLayout(new GridLayout(1, radio.length));
		
		add(label);
		
		for(int i = 0; i < radio.length; i++){
			radio[i] = new JRadioButton(strings[i]);
			radio[i].addItemListener( handler );
			northPanel.add(radio[i]);
			group.add(radio[i]);
		}
		add (northPanel, BorderLayout.NORTH);
		
	}
	
	public void paint(Graphics g){
		super.paintComponents(g);
		if(vertex[0]){
			g.fillOval(250, 250, 4, 4);
		}
		if(vertex[1]){
			g.fillOval(99, 148, 4, 4);
			g.fillOval(200, 148, 4, 4);
			g.drawLine(100, 150, 200, 150);
		}
		if(vertex[2]){
			g.fillOval(148, 106, 4, 4);
			g.fillOval(98, 191, 4, 4);
			g.fillOval(198, 191, 4, 4);
			g.drawLine(150, 107, 100, 193);
			g.drawLine(100, 193, 200, 193);
			g.drawLine(200, 193, 150, 107);
		}
		if(vertex[3]){
			g.fillOval(148, 99, 4, 4);
			g.fillOval(99, 148, 4, 4);
			g.fillOval(198, 148, 4, 4);
			g.fillOval(148, 197, 4, 4);
			g.drawLine(150, 100, 100, 150);
			g.drawLine(150, 100, 200, 150);
			g.drawLine(100, 150, 150, 200);
			g.drawLine(200, 150, 150, 200);
			g.drawLine(150, 100, 150, 200);
			g.drawLine(200, 150, 100, 150);
		}
		if(vertex[4]){
		    for(int i = 0; i < 360; i+=72){
		    	g.fillOval((int)(148 + Math.cos((i * Math.PI / 180)) * 50),
		    			(int)(148 + Math.sin((i * Math.PI / 180)) * 50),
		    			4, 4);
		    }
		    g.drawLine((int)(150 + Math.cos((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((72 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((144 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((144 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((216 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((216 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((0 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((288 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((288 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((144 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((144 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((216 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((216 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((72 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((288 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((288 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((144 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((144 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((216 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((216 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((144 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((144 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((288 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((288 * Math.PI / 180)) * 50));
		    g.drawLine((int)(150 + Math.cos((288 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((288 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.cos((216 * Math.PI / 180)) * 50),
		    		(int)(150 + Math.sin((216 * Math.PI / 180)) * 50));
		}
	}
	
	
	private class ItemHandler implements ItemListener{
		public void itemStateChanged( ItemEvent event ){
			for(int i = 0; i < radio.length; i++){
				vertex[i] = false;
				if(radio[i].isSelected()){
					vertex[i] = true;
					repaint();
				}
			}	
		}	
	}
	
	public static void main(String[] args){
		CompleteGraph f1 = new CompleteGraph();
		f1.setVisible(true);
		f1.setSize(500, 400);
		f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}