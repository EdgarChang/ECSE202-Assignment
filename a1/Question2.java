package ca.mcgill.ecse202.a1;

import java.util.Scanner;

public class Question2 {
  public static void main(String[]args){
    //Creates new Scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompts the user to enter width and height
    System.out.println("Enter the width and height of a rectangle: ");
    double width = input.nextDouble();
    double height = input.nextDouble();
    //Calculates the perimeter
    double perimeter = (width + height)*2;
    // Calculates the area
    double area = width*height;
    //Calculates the diagonal
    double diagonal = (Math.pow((Math.pow(width, 2)) + (Math.pow(height, 2)), 0.5));
        
    //Display result
    System.out.println("The perimeter is " + perimeter );
    System.out.println("The area is " + area );
    System.out.println("The length of diagonal is " + diagonal );
    
  }
}
