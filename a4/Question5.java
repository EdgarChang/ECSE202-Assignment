package ca.mcgill.ecse202.a4;

public class Question5 {
  
  public static void main(String[] args) {
    // Creates a point in a class
    MyPoint p1 = new MyPoint(0, 0);
   
    // Creates another point in a class
    MyPoint p2 = new MyPoint(10, 30.5);
    
    // Displays the distance
    System.out.print("Distance between two points (" + p1.getX() + ", " + p1.getY() + ")" + " and ("
        + p2.getX() + ", " + p2.getY() + ") is equal to " + p1.distance(p2));
  }
}


/**
 * A class that contains method to calculate the distance between two points
 * @author ege odaci
 *
 */
class MyPoint {
  
  // Creates double numbers
  private double x;
  private double y;

  // No arg constructor that creates a point (0,0)
  public MyPoint() {
    x = 0;
    y = 0;
  }

  // Create a constructor which creates two specified points
  public MyPoint(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Sends X value to method
  public double getX() {
    return x;
  }

  // Sends Y value to method
  public double getY() {
    return y;

  }

  /**
   * Calculates the distance between from this point to a specified point.
   * 
   */
  public double distance(MyPoint point) {
    double distance = Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    return distance;
  }

  /**
   * Calculates the distance between any two specified points.
   * 
   * @param x1 to the x coordinate of the chosen point
   * @param y1 to the y coordinate of the chosen point
   * @return distance
   */
  public double distance(double x1, double y1) {
    double distance = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
    return distance;
  }



}


