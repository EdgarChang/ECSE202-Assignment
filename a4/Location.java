package ca.mcgill.ecse202.a4;

/** 
 * A class that locates maximum value and its indices in a two dimensional array
 * @author edgar chang
 *
 */
public class Location {
  double maxValue;
  int[][] indices;
  
  // Creates a constructor for the class Location
  Location(int [][]indices,double maxValue){
    this.maxValue = maxValue;
    this.indices = indices;
  }

  /**
   * Locates and return the largest number in a two dimensional array of double values and its indices
   * @param a the two dimensional array with double values whose maximum value and its indices we are looking for
   * @return a Location object that stores the max value's indices in a two dimensional array and value in a double variable
   */
  public static Location locateLargest(double[][] a) {
    // Creates a two dimensional int array to store the indices
    int[][]indices= new int[1][2];
    
    // Creates a double variable to store the maximum value
    double standard = 0;
    
    // Creates a for loop to look for the maximum value
    for (int x = 0; x < a.length; x++) {
      for (int y = 0; y < a[x].length; y++) {
        
        // Updates the value of standard whenever we find a larger number in the array
        if (a[x][y] > standard) {
          standard = a[x][y];
          // Updates the indices of the maximum value
          indices[0][0]=x;
          indices[0][1]=y;
        }
      }
    }
   
  
    return new Location(indices,standard);}

}


