package ca.mcgill.ecse202.a3;

public class Question6 {

  public static void main(String[] args) {
    int sum = 0;
    
    // Convert arguments into doubles and adds them
    for (int i = 0; i < args.length; i++) {
      double numbers = (new Double(args[i])).doubleValue();
      sum += numbers;
    }
    // Display the sum of the arguments.
    System.out.println("The total is " + sum);

  }
}
