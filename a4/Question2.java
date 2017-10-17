package ca.mcgill.ecse202.a4;

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    
    // Prompt user to enter a rows and columns.
    System.out.println("Enter the number of rows and columns of the array:");
    
    // Creates a scanner object
    Scanner input = new Scanner(System.in);
    
    // Assigns user's input to rows and columns
    int row = input.nextInt();
    int column = input.nextInt();
    
    // Creates arrays with the entered rows and columns
    double numberofarrays[][] = new double[row][column];
    
    // Prompt user to enter the array
    System.out.println("Enter the array:");
    
    // Assigns user's numbers to arrays
    for (int x = 0; x < row; x++) {
      for (int y = 0; y < column; y++) {
        numberofarrays[x][y] = input.nextDouble();
      }
    }
    
    // Gets the integer from a method
    int[] location = locateLargest(numberofarrays);
    
    // Prints the location of the element
    System.out.print("The location of the largest element is at ");
    System.out.print("(");
    System.out.print(location[0]);
    System.out.print(",");
    System.out.print(location[1]);
    System.out.print(")");
  }

  /**
   * Locates the position of the largest number in an 2D array.
   * @param a to locate the largest
   * @return the modified integer
   */
  public static int[] locateLargest(double[][] a) {
    // Create variables to compare the numbers
    double maxArray = 0;
    int[] location = new int[] {0, 0};
    // Compares the arrays to each other to find the largest one
    for (int i = 0; i < a.length; i++) {
      for (int u = 0; u < a[i].length; u++) {
        if (a[i][u] > maxArray) {
          // Assigns the location of largest number to coordinates of i and u
          location[0] = i;
          location[1] = u;
          maxArray = a[i][u];
        }
      }

    }

    return location;

  }

}
