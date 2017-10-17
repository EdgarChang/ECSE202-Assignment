package ca.mcgill.ecse202.a3;

import java.util.Scanner;

public class Question3 {

  public static void main(String[] args) {

    // Create new scanner object
    Scanner input = new Scanner(System.in);

    // Print instruction on the console
    System.out.println("Enter an integer : ");

    // Declare an int variable to store user input
    int response = input.nextInt();

    // Display the result on the console
    System.out.println("The binary value is " + decimalToBinary(response));

  }

  // Declare a method to convert decimal number to binary
  public static String decimalToBinary(int value) {

    // Declare an empty string variable
    String binary = "";

    // Declare a while loop to determine each binary number and concatenate it to the string binary
    while (value != 0) {

      // Each binary digit is determined by the remainder of the value devided 2
      int bvalue = value % 2;

      // Assign 1 or 0 to each binary digit and add every new digit to original string binary
      if (bvalue == 1) {
        String one = "1";
        binary = one.concat(binary);
      } else if (bvalue == 0) {
        String zero = "0";
        binary = zero.concat(binary);
      }
      // Value is halved after each operation until it becomes 0
      value = value / 2;
    }
    // Return the string binary after operations
    return binary;
  }
}