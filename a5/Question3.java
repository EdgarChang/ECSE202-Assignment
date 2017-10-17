package ca.mcgill.ecse202.a5;

import java.util.Scanner;
import java.util.Random;

public class Question3 {
  public static void main(String[] args) {
    
    // Creates an array of 100 integers
    int[] randomarrays = new int[100];
    
    // Prompts user to enter the index
    System.out.println("Enter an index of an array from 0 to 99");
    
    // Creates a scanner object
    Scanner input = new Scanner(System.in);
    
    // Assign user's input to index of array
    int index = input.nextInt();
   
    // Creates a random number generator
    Random random = new Random();
    
    // Creates random integers and assigns them to each index of an array
    for (int i = 0; i < 100; i++){
      randomarrays[i] = random.nextInt();
    }
    
    // Checks if user's typed index is within our array
    if (index < 100)
      System.out.println(randomarrays[index]);
    else
      System.out.println("Out of bounds");
  }
}
