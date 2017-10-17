package ca.mcgill.ecse202.a2;

import java.util.Scanner;

public class Question3 {
  
  public static void main(String[] args) {
    // creates a scanner object
    Scanner input = new Scanner(System.in);
    // prompts the user to enter numerator and denominator
    System.out.println("Enter a nominator: ");
    System.out.println("Enter a denominator: ");
    // declares numerator and denominator and assigns value into them
    int numerator = input.nextInt();
    int denominator = input.nextInt();
    if (denominator == 0)
      System.out.println("INVALID");
    while (denominator != 0){  
      //declares variables to store the result
      int result = (numerator % denominator);
      int multiple = numerator / denominator; 
      // determines the result based on the relationship between the nominator and denominator
      if (result == 0){
        System.out.println( numerator + "/" + denominator + " is an improper fraction and it can be reduced to " + 
        (numerator/denominator));
        break;
      }else if (numerator < denominator){
        System.out.println( numerator + "/" + denominator + " is a proper fraction");
        break;
      }else{
        System.out.println( numerator + "/" + denominator + " is an improper fraction and its mixed fraction is " + multiple + " + " 
        + result + " / " + denominator );
        break;
      }
    }
  }
}