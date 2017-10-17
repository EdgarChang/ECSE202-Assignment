package ca.mcgill.ecse202.a1;

import java.util.Scanner;

public class Question4 {
  public static void main(String[] arg){
    //Creates new Scanner object
    Scanner input = new Scanner(System.in);
    
    //Prompts the user to enter the coordinates
    System.out.print("Enter the coordinates for two points:");
    int x1 = input.nextInt();
    int y1 = input.nextInt();
    int x2 = input.nextInt();
    int y2 = input.nextInt();
    
    //Checks if x1 = x2, under which slope would be undefined
    if (x1 == x2){
      System.out.println("For these coordinates we can not "
          + "display the line equation because slope is undefined." );
    
      //Calculates the equation if x1 is not equal x2
    } else{
      //Calculates the slope
      double m = (double) (y2-y1)/(x2-x1);
      //Calculates the y-intercept
      double b = y1-m*x1;
      //Assigns "y=" to msg to save space
      String msg = "y =" ;
     //Demands x not to be shown when it is 0
      if(m == 0.0){
        msg = msg;
      //Demands the slope not to be shown when it is 1 or -1
      }else if ( m == 1.0){
        msg = msg + " x";
      }else if( m == -1.0){
        msg = msg + " -x";
      }else{
        msg = msg + m + "x";
      //Demands b not to be shown when it is 0
      }if (b == 0.0){
        msg = msg;
      }else{ 
        msg = msg + " + " + b; 
      }      
      
      //Outputs the equation to the console
      System.out.print("The line equation for two points (" + x1 + ", " + y1 + ")"
      + " and (" + x2 + ", " + y2 + ")" + " is " + msg  );
    }          
  }
}
