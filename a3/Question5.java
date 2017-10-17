package ca.mcgill.ecse202.a3;

import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {

    // Create new scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter 3 numbers
    System.out.println("Enter 3 numbers: ");

    // Declare the user inputs as 3 double variable
    double input1 = input.nextDouble();
    double input2 = input.nextDouble();
    double input3 = input.nextDouble();

    // Execute the defined method
    displaySortedNumbers(input1, input2, input3);


  }

  // Declare a method to rank input values
  public static void displaySortedNumbers(double num1, double num2, double num3) {

    // Interchange num1 and num2 if num1 is larger than num2
    if (num1 > num2) {
      double temp = num1;
      num1 = num2;
      num2 = temp;
    }

    // Interchange num2 and num3 if num2 is larger than num3
    if (num2 > num3) {
      double temp1 = num2;
      num2 = num3;
      num3 = temp1;
    }

    // Interchange num1 and num2 again if updated num1 is now larger than num2
    if (num1 > num2) {
      double temp2 = num1;
      num1 = num2;
      num2 = temp2;
    }

    // Print the result on the console
    System.out.println("Numbers in increasing order: " + num1 + " " + num2 + " " + num3);
  }
}

