package ca.mcgill.ecse202.a2;

import java.util.Scanner;

public class Question5 {

  public static void main(String[] args) {
    // creates scanner object
    Scanner input = new Scanner(System.in);
    // prompts the user to enter a four digit binary
    System.out.println("Enter a four-digit binary string: ");
    // reads the input into string variable
    String binary = input.nextLine();
    // obtains the char value of each digit of the string
    char fourthPow = binary.charAt(0);
    char thirdPow = binary.charAt(1);
    char secondPow = binary.charAt(2);
    char firstPow = binary.charAt(3);
    // casts the char variable into int type
    int thousandths = (int)fourthPow;
    int hundredths = (int)thirdPow;
    int tenths = (int)secondPow;
    int ones = (int)firstPow;
    // checks for invalid entry
    if(thousandths > 49 || hundredths > 49 || tenths > 49 || ones > 49 ||
       thousandths < 48 || hundredths < 48 || tenths < 48 || ones < 48){
        System.out.println("INVALID");
        System.exit(0); 
    }
    // declares an int variable to store the decimal value
    int decimal = 0;
    // converts binary into decimal based on whether it is 0 or 1 in each digit
    if(thousandths == 49){
      decimal += Math.pow(2, 3);
    }if(hundredths == 49){
      decimal += Math.pow(2, 2);
    }if(tenths == 49){
      decimal += Math.pow(2, 1);
    }if(ones == 49){
      decimal += Math.pow(2, 0);
    }
    // prints the decimal number on the console
    System.out.println("The decimal of number for " + binary + " is " + decimal);
 }
}
