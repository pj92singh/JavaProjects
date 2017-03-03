package que2;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*Assign 5 Question 2
 * 60-280
 * Prabhjit Singh
 * Drawing a circle with a random radius
 *  */
public class Circ1 extends Applet{
  /*using the formula;
   *diameter = 2 * radius;
   *area = Math.PI * Math.pow(radius, 2);
   *circumference = 2 * Math.PI * radius;
   */
	public void paint(Graphics g){

	//public static void main(String[] args){
		//set the size of the window
	    this.setSize(500, 500);
	   int radius, diameter;
	   double circumference, area;
	   //get a random radius
	   radius = (int) (Math.random() * 100 + 1);
	   //use the random radius to calculate the following:
	   diameter = 2 * radius;
	   area = Math.PI * Math.pow(radius, 2);
	   circumference = 2 * Math.PI * radius;
	   //strings to show the calculated area, circumference etc.
	  String area_string, circum_string, rad_string, diam_string;
	  area_string = Double.toString(area);
	  circum_string = Double.toString(circumference);
	  rad_string = Integer.toString(radius);
	  diam_string = Integer.toString(diameter);

	   //test all the variables
	   System.out.println("Radius " +radius);
	   System.out.println("Diamter: " +diameter);
	   System.out.println("Area: "+area);
	   System.out.println("circumference "+circumference);
	   g.drawOval(30,30,radius,diameter);
	   g.drawString("Area= " +area_string, 100, 400);
	   g.drawString("Circumference= " +circum_string, 100, 415);
	   g.drawString("Radius= " +rad_string, 100, 430);
	   g.drawString("Diameter= " +diam_string, 100, 445);
	   //g.drawRoundRect(120, 120, 20, 30, 15, 30);


	}//end of paint

}//end of class
