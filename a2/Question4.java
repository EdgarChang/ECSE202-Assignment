package ca.mcgill.ecse202.a2;

import java.util.Scanner;

public class Question4 {
  
  public static void main (String[] args){
    // Creates scanner object
    Scanner input = new Scanner(System.in);
    // Prompts user to enter a string 
    System.out.print("Enter a string: ");
    //Assign what user has written to string called str1
    String str1 = input.nextLine();
    // Assigns integer to length of the string
    int upper = str1.length();
    int upperCase = 0;
    int a = 0;
    // Prints the length of the string
    System.out.println("The lenght of the string is " + str1.length());
    // Prints the first character of string
    System.out.println("The first character is " + str1.charAt(0));
    // Prints the last character of string
    System.out.println("The last character is " + str1.charAt(str1.length() - 1));
    // Checks how many Upper case letters in the String
    for (a=0; a<str1.length(); a++) {
      if (Character.isUpperCase(str1.charAt(a))) upperCase++;
    }
    // Prints the number of uppercase letters on the console
    System.out.println("The number of letters in uppercase is " + upperCase);
  }
}


