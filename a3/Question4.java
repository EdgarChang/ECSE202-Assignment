package ca.mcgill.ecse202.a3;

import java.util.Scanner;

public class Question4 {
  
  
  public static void main(String[] args) {
    // Create a scanner object
    Scanner input = new Scanner(System.in);
   
    // Prompt user to enter a integer
    System.out.println("Enter a positive integer: ");
    
    // Assign user's input to a variable
    int n1 = input.nextInt();
    
    // Determines the result based on it's a palindrome or not
    if (isPalindrome(n1)) {
      System.out.println(n1 + " is a palindrome");
    } else {
      System.out.println(n1 + " is not a palindrome");
    }
  }
  
  // Takes the reverse of the number
  public static int reverse(int number) {   
    
    int reverseNumber = 0;
    
    while (number != 0) {
      reverseNumber = reverseNumber * 10 + number % 10;
      number = number / 10;
    }
    return reverseNumber;
  }
  
  // Check if the number is same as its reverse
  public static Boolean isPalindrome(int number) {  
    return (number == reverse(number));
  }

}

