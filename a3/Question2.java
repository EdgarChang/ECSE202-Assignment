package ca.mcgill.ecse202.a3;

import java.util.Scanner;

public class Question2 {
  
  // Declare a method that converts the first letter of each word in the string to uppercase
  public static void capital(String b) {
    
    // Split string
    String[] strarray = b.split(" ");
    
    // Declare a string variable to store result
    String output = "";
    
    // Search for spaces between words in the string
    for (int i = 0; i < strarray.length; i++) {
      String uppercase = strarray[i];
      
      // Convert the first letter of each
      uppercase = uppercase.substring(0, 1).toUpperCase() + uppercase.substring(1);
      output = output + " " + uppercase;
    }
    // Print new string
    System.out.println("The new string is:" + output);
  }

  public static void main(String[] args) {
    // Create a scanner object
    Scanner input = new Scanner(System.in);
    // Prompt user to enter a string
    System.out.println(("Enter a string: "));
    // Assign entered string to variable
    String str1 = input.nextLine();
    // Send String a to method
    capital(str1);
  }
}

