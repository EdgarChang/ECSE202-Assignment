package ca.mcgill.ecse202.a2;

import java.util.Scanner;

public class Question6 {
  
  public static void main(String[] args){
    // creates a scanner object
    Scanner input = new Scanner(System.in);
    // prompts the user to enter a string
    System.out.print("Enter a genome string: ");
    // assigns the input to the variable genome
    String genome = input.nextLine();
    // declares begin codon and end codon
    String begin = "ATG";
    String end1 = "TGA";
    String end2 = "TAA";
    String end3 = "TAG";
    // declares beginIndex and endIndex to mark the position of begin and end
    int beginIndex = 0;
    int endIndex = 0;
    // creates a for loop to look for begin codon and end codon and print out the gene
    for (int i = 0; i < (genome.length()-2); i++){
      String codon = genome.substring(i, i+3);
      if (codon.equals(begin)){
        beginIndex = i+3;
      }
      else if(codon.equals(end1) || codon.equals(end2) || codon.equals(end3) && beginIndex !=0 ){
        // marks the end of the gene
        endIndex = i;    
        // declares the gene as a string variable result
        String result = genome.substring(beginIndex, endIndex);
        // checks if the length of result is a multiple of three
        if (result.length() % 3 == 0){
        // prints the result on the console
        System.out.println(result);
        beginIndex =0;
        }
        // prints no gene is found on the console if the length of the result is not a multiple of three
        else{
        System.out.println("no gene is found");
        }
      }
    }
    // prints no gene is found on the console if no gene is found
    if(endIndex == 0){
      System.out.println("no gene is found");
    }
  }
}
  

