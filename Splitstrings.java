//String manupluatlion 

import java.util.Arrays; 
import java.util.regex.Pattern;
import java.util.regex.Matcher; 

public class Splitstrings {
  public static void main(String[] args) {
    String mystring = "Mississippi"; 
    String[] splitstring = mystring.split("s"); 
    
    String secondstring = mystring.substring(1,5); 
    
    
    Pattern p = Pattern.compile("Mi(.*?)pi"); 
    //get everything betweetn Mi -- pi 

    //matcher sees if it can find anything 
    Matcher m = p.matcher(mystring); 
    System.out.println("::Pattern::\n");
    while(m.find())
    {
    	//does the loop while it finds them
    	System.out.println(m.group(1)); 
    }
    System.out.println("\n::Substring::\n");
    System.out.println(secondstring); 
    System.out.println("\n::Split::\n");
    System.out.println(Arrays.toString(splitstring));
  }
}
