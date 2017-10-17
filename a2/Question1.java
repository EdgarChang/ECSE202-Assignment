package ca.mcgill.ecse202.a2;

import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
    // creates scanner object
    Scanner input = new Scanner(System.in);
    // declares a string
    String computer = " ";
    // generates the random computer number
    int computerNumber = (int)(3 * Math.random());
   // assigns different strings to computer based on computerNumber
    switch (computerNumber){      
      case 0: computer = "scissor";
        break;
      case 1: computer = "rock";
        break;
      case 2: computer = "paper";
        break;
    }
    //prompt the user to enter a number from 1, 2, 3
    System.out.println("scissor (0), rock (1) , paper (2): ");
    // declare an int variable with value based on user input
    int userNumber = input.nextInt();
    // declares a string
    String user = " ";
    // assigns different strings to user based on userNumber
    switch (userNumber){
      case 0: user = "scissor";
        break;
      case 1: user = "rock";
        break;
      case 2: user = "paper";
        break;
    }
    // declares a variable to store the result
    int result = userNumber - computerNumber;
    // determines result and print it onto console
    if (result == 1 || result == -2){
      System.out.println("The computer is " + computer + ". You are " + user + ". You win.");
    } else if (result == 0){
      System.out.println("The computer is " + computer + ". You are " + user + " too. It is a draw.");
    } else if (result == -1 || result == 2){
      System.out.println("The computer is " + computer + ". You are " + user + ". You lose.");
    } else {
      System.out.println("Invalid input.");
    }
  }
}
