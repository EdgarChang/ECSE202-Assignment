package ca.mcgill.ecse202.a2;

public class Question2 {
    
  public static void main (String[] args) {
      // Generates radius between 0 and 5
      double radius = Math.random()*5;
      // Generates angle between 0 and 2pi
      double angle = Math.random()*2*Math.PI;
      // Assigns value to x1 and x2
      double x1 = radius*Math.cos(angle);
      double x2 = radius*Math.sin(angle);
      // Calculates the distance from 0,0 to the point
      double distance;
      distance = Math.sqrt(((Math.pow(x1, 2)+Math.pow(x2, 2))));
      // Print the distance to the center to the console
      System.out.println("The point is (" + x1 + ", " +  x2 + ") and its distance to"
      + " the center is " + distance);
  }
 }