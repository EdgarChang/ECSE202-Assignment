package ca.mcgill.ecse202.a3;

import java.util.Scanner;

public class Question7 {

  public static void main(String[] args) {
    // Create a scanner object
    Scanner input = new Scanner(System.in);
   
    // Prompt the user to enter order of polynomial
    System.out.println("Enter the order of the polynomial n: ");
    
    // Declare an int variable to store user input
    int power = input.nextInt();

    // Prompt the user to enter the coefficients
    System.out.println("Enter the coefficients: ");
    
    // Declare a double array with size of power plus 1
    double[] coefficient = new double[power + 1];
   
    // Assign each user input to each array slot 
    for (int a = 0; a < (int) (coefficient.length); a++) {
      coefficient[a] = input.nextDouble();
    }
    
    // Prompt the user to enter the value of variable
    System.out.println("Enter x: ");
    
    // Declare a double variable to store user input
    double variable = input.nextDouble();
    
    // Print the result on the console
    System.out.println("The polynomial expression is " + evaluatePolynomial(coefficient, variable));
  }

  // Declare a method to calculte the polynomial
  public static double evaluatePolynomial(double[] a, double x) {
    
    // Declare a double variable to store the sum of value of each order
    double sum = 0;
    
    // Declare a for loop to raise x to appropriate order and multiply it with corresponding coefficient. Add each new value to sum
    for (int i = 0; i < (int) a.length; i++) {
      double value = Math.pow(x, a.length - 1 - i);
      value = value * a[i];
      sum += value;
    }
    // The method returns the double variable sum
    return sum;

  }
}
