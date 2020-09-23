/*
 * Programmer: David
 * Date: Tuesday, September 22, 2020
 * Purpose: To say things about me
 */

public class AboutMe {
    public static void main (String [] args) {
        
        // Print the values
    	String myName = "David.";
    	int myAge = 16;
    	double myHeightInMetres = 1.87;
        
    	// Printing first part
    	System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");
         
        // Printing values
        myAge = 19;
        myHeightInMetres = 1.91;
        
        int myAge2 = 19;
        double myHeightInMetres2 = 1.91;
        
        // Printing second part
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge2 + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres2 + " m tall.");
    }
}