/* 
* pj92singh
* Prabhjit Singh 
*
*
* Cracking code example String exponents 
*/
import java.util.*;
import java.util.Arrays;

public class SplitExponents{
	
	public double n1, exp;
	public String in = " ";
	
	//2^3 3^4 4^5 5^6
	//test mystring func
	public static void main(String[] args){
		mystring("2^3 3^4 4^5"); 
	
	}


public static void mystring(String s){
	//take in the string
	//break it down 
	int[] xa = null; 
	String[] splitString = s.split("\\s"); 
	System.out.println("Split array string: " +Arrays.toString(splitString)); 
	String[] splitString1 = s.split("^"); 
	System.out.println("Split array string: " +Arrays.toString(splitString1)); 

	try{

		for (int x = 0; x < splitString.length-1; x++){
			xa[x] = Integer.parseInt(splitString[x]);
		}
		System.out.println("XA: " +Arrays.toString(xa)); 		
	}catch(Exception e){
		System.out.println("Error: " +e); 

	}
}
}
