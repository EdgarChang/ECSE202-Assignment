package ca.mcgill.ecse202.a6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Question1 {

  public static void main(String[] args) throws Exception {

    // Creates a File instance
    java.io.File file = new java.io.File("Question1.txt");

    // Creates a Scanner for the file
    Scanner input = new Scanner(file);

    try (
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);) {

      // Creates a new Random variable
      Random random = new Random();

      // Uses for loop to write 100 random integer outputs to the file
      for (int i = 0; i < 100; i++) {
        output.print(random.nextInt() + " ");
      }
    }

    // Declare an array to sort the file content
    int[] num = new int[100];

    // Copies the contents of the file to the array
    for (int i = 0; i < 100; i++) {
      num[i] = input.nextInt();
    }

    // Sorts the array in order
    Arrays.sort(num);

    // Prints the sorted array on the console
    for (int i = 0; i < 100; i++) {
      System.out.print(num[i] + " ");
    }
  }
}


