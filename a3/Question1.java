package ca.mcgill.ecse202.a3;

import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
    // Create new scanner object
    Scanner input = new Scanner(System.in);

    // Declare the menu as a string variable for convenience
    String menu = ("Main menu" + "\n1: Addition" + "\n2: Subtraction" + "\n3: Multiplication"
        + "\n4: Division" + "\n5: Exit" + "\nEnter a choice:");

    // Declare an int varible to store user input
    int response = 0;

    // Create a loop to execute the game
    while (response != 5) {
      
      // Print out the menu
      System.out.println(menu);
      
      // Use variable response to store user input
      response = input.nextInt();

      // Generate two random integers
      int num1 = (int) (Math.random() * 10);
      int num2 = (int) (Math.random() * 10);

      // Create a switch statement to determine question type
      switch (response) {

        case 1:
          int answer1 = num1 + num2;
          System.out.println("What is " + num1 + " + " + num2 + " ?");
          int response1 = input.nextInt();
          examine(response1, answer1);
          break;

        case 2:
          // Make sure num1 is larger than num2 so the answer is positive
          if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
          }
          int answer2 = num1 - num2;
          System.out.println("What is " + num1 + " - " + num2 + " ?");
          int response2 = input.nextInt();
          examine(response2, answer2);
          break;

        case 3:
          int answer3 = num1 * num2;
          System.out.println("What is " + num1 + " * " + num2 + " ?");
          int response3 = input.nextInt();
          examine(response3, answer3);
          break;

        case 4:
          // Continue generating random number for num2 until it is not 0
          while (num2 == 0) {
            num2 = (int) (Math.random() * 10);
          }
          int answer4 = num1 / num2;
          System.out.println("What is " + num1 + " / " + num2 + " ?");
          int response4 = input.nextInt();
          examine(response4, answer4);
          break;
      }
    }
  }

  // Declare a method to test if user's input answer is correct
  public static void examine(int response, int answer) {
    if (response == answer) {
      System.out.println("Correct \n");
    } else {
      System.out.println("Your answer is wrong. The correct answer is " + answer + "\n");
    }
  }
}
