package ca.mcgill.ecse202.a2;

public class Question7 {

  public static void main(String[] args) {
    // declares the int numberOfTrials, i, match
    int numberOfTrials = 1000000;
    int i = 0;
    int match = 0;
    // creates a loop to test the probability
    while (i < numberOfTrials){
      double x = (Math.random()*2) - 1;
      double y = (Math.random()*2) - 1;
      i++;
      if (((x*x) + (y*y)) <= 1){
        match++;
      }
    // calculates pi
    }double pi = 4 * (match / (double)numberOfTrials);
    System.out.println(pi);
  }
}