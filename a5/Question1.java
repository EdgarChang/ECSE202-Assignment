package ca.mcgill.ecse202.a5;

public class Question1 {
  public static void main(String[] args) {
    // Creates an Rectangle object
    MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

    // Prints out the area of the rectangle
    System.out.println("The area of the rectangle is " + r1.getArea());

    // Prints out the perimeter of the rectangle
    System.out.println("The perimeter of the rectangle is " + r1.getPerimeter());

    // Prints out if a point is within the rectangle or not
    System.out.println("Is point (3,3) inside the rectangle? " + r1.contains(3, 3));

    // Prints out if the rectangle contains specified rectangle
    System.out.println("Does the rectangle contains a rectangle with (4,5) center "
        + "and 10.5 width and height of 3.2? " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));

    // Prints out if the rectangle overlaps with specified rectangle
    System.out.println(
        "Does the rectangle overlaps with the another rectangle which center is at (3,5) and "
            + "has the width of 2.3 and the height of 5.4? "
            + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
  }
}


// Creates a class
class MyRectangle2D {
  
  // Creates doubles
  private double x;
  private double y;
  private double width;
  private double height;

  /**
   * A getter method to get x
   * @return x
   */
  public double getX() {
    return x;
  }

  /**
   * A getter method to get y
   * @return y
   */
  public double getY() {
    return y;
  }

  /**
   * A setter method to set x
   */
  public void setX() {
    this.x = x;
  }

/**
 * A setter method to set y
 */
  public void setY() {
    this.x = x;
  }

  /**
   * A getter method to get width
   * @return width
   */
  public double getWidth() {
    return width;
  }

  /**
   * A getter method to get height 
   * @return height
   */
  public double getHeight() {
    return height;
  }

  /**
   * A setter method to set width
   */
  public void setWidth() {
    this.width = width;
  }

  /**
   * A setter method to set height
   */
  public void setHeight() {
    this.height = height;
  }

  // Creates a no-arg constructor with x,y is equal to 0 and width,height is equal to 1
  public MyRectangle2D() {
    x = 0;
    y = 0;
    width = 1;
    height = 1;
  }

  // Creates a constructor with specified x, y, width and height values
  public MyRectangle2D(double x, double y, double Width, double Height) {
    this.x = x;
    this.y = y;
    this.width = Width;
    this.height = Height;
  }

  /**
   * Method to calculate the area 
   * @return double value of area
   */
  public double getArea() {
    return (width * height);
  }

  /**
   * A method to calculate perimeter
   * @return double value of perimeter
   */
  public double getPerimeter() {
    return (2) * (width + height);
  }

  /**
   * Checks if the point is inside the rectangle
   * @param x the x-coordinate of the point
   * @param y the y-coordinate of the point
   * @return boolean true or false
   */
  public boolean contains(double x, double y) {
    return (Math.abs(this.x - x) < width / 2 && Math.abs(this.y - y) < height / 2);
  }

  /**
   * Checks if the rectangle contains another specified rectangle
   * @param r is the another rectangle
   * @return boolean true of false
   */
  public boolean contains(MyRectangle2D r) {
    return ((r.x + r.width / 2) < this.x + width / 2) && (r.x - r.width / 2 > this.x - width / 2)
        && (r.y - r.height / 2 > this.y - height / 2) && (r.y + r.height / 2 < this.y + height / 2);
  }

  /**
   * Checks if the rectangle overlaps with another specified rectangle
   * @param r is another rectangle
   * @return boolean true or false
   */
  public boolean overlaps(MyRectangle2D r) {
    return (Math.abs(x - r.x) <= (r.width / 2 + width / 2)
        && Math.abs(y - r.y) <= (r.height / 2 + height / 2));
  }
}
