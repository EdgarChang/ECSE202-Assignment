package ca.mcgill.ecse202.a4;

import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    // Imports a scanner object
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter the scope of the input array
    System.out.println("Enter the number of rows and columns of the array: ");

    // Store the input row and column numbers in int variables
    int row = input.nextInt();
    int column = input.nextInt();

    // Creates a two dimensional double array of the size based on user input
    double[][] array = new double[row][column];

    // Prompts the user to enter the array
    System.out.println("Enter the array: ");

    // Creates a for loop to store each input number in our double array
    for (int x = 0; x < row; x++) {
      for (int y = 0; y < column; y++) {
        array[x][y] = input.nextDouble();
      }
    }

    // Declares a new Location object that store the array's maximum value and its indices
    Location b = Location.locateLargest(array);

    // Print the maximum value of the array and its indices on the console
    System.out.println("The location of the largest element is " + b.maxValue + " at ("
        + b.indices[0][0] + " , " + b.indices[0][1] + ")");
  }


}
