package que3;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
/*Assign 5 Question 3
 * 60-280
 * Prabhjit Singh
 * Drawing a circle, GIVEN a radius
 * from the user and the coordiantes
 * draw them in an Applet
 *  */
public class Circ2 extends Applet{
  /*using the formula;
   *diameter = 2 * radius;
   *area = Math.PI * Math.pow(radius, 2);
   *circumference = 2 * Math.PI * radius;
   */
	public void paint(Graphics g){
	//set the size of the window
    this.setSize(500, 500);
    //variables
	   int radius, diameter, x, y;
	   double circumference, area;
     //ask for a radius
     //using showInputDialog
     radius = Integer.parseInt(JOptionPane.showInputDialog("Please enter a radius!"));
	   //use the random radius to calculate the following:
	   diameter = 2 * radius;
	   area = Math.PI * Math.pow(radius, 2);
	   circumference = 2 * Math.PI * radius;
     //ask for the coordiantes
     //using showInputDialog
     x = Integer.parseInt(JOptionPane.showInputDialog("Please enter x coordiante!"));
     y = Integer.parseInt(JOptionPane.showInputDialog("Please enter y coordiante!"));

     String area_string, circum_string, rad_string, diam_string; 
	  area_string = Double.toString(area);
	  circum_string = Double.toString(circumference);
	  rad_string = Integer.toString(radius); 
	  diam_string = Integer.toString(diameter); 
     
     
	   //test all the variables
	   System.out.println("Radius: " +radius);
	   System.out.println("Diamter: " +diameter);
	   System.out.println("Area: "+area);
	   System.out.println("Circumference: "+circumference);
     //take all the variables given and then use them
     //in the drawOval function
	   g.drawOval(x,y,radius,diameter);
	   g.drawString("Area= " +area_string, 100, 400);
	   g.drawString("Circumference= " +circum_string, 100, 415);
	   g.drawString("Radius= " +rad_string, 100, 430);
	   g.drawString("Diameter= " +diam_string, 100, 445);


	}//end of paint

}//end of class
