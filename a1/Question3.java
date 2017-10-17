package ca.mcgill.ecse202.a1;

import java.util.Scanner;

public class Question3 {
  public static void main(String[]args){
    //Create new Scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompt the user to enter coordinates
    System.out.println("Enter the coordinates for two points:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    
    //Calculates the slope
    double slope = ( y2 - y1 )/( x2 - x1 );
    
    //Display the result
    System.out.println("The slope for the line that connects two points (" + x1 + ", " + y1 + ")" + 
    " and (" + x2 + ", " + y2 + ")" + " is " + slope);
  }
}
