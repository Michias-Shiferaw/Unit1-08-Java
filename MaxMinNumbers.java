//Scan all primitive data types
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This program lists 10 random numbers between 1 and 99 then shows the 
 * max and min values.
 * @author Michias Shiferaw
 * @Version 2.0
 * @since 2020-03-02.
 */


public class MaxMinNumbers {
  /**
  * This program lists 10 random numbers between 1 and 99 then shows the 
  * max and min values.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-03-02.
  */
 
  public static void main(String[] arg) {
    
    // Creates an array with 10 indexes
    int[] rangeArray = new int[10];
    Random rangeVal = new Random();
    //int minValue;
    //int maxValue = 99;
    
    // Adds a random number from 1-99 into the array for every index
    for (int index = 0; index < rangeArray.length; index++) {
      rangeArray[index] = rangeVal.nextInt(99) + 1;
    }

    // Sort the array
    Arrays.sort(rangeArray);
    System.out.println(Arrays.toString(rangeArray));
    int maxValue = 99;  
    int minValue;
    minValue = minValue(rangeArray);
    maxValue = maxValue(rangeArray);
        
        
    // Prints the max and min values
    System.out.println("The max value is : " + maxValue);
    System.out.println("The min value is: " + minValue);
  }

  /**
  * This program lists 10 random numbers between 1 and 99 then shows the 
  * max and min values.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-03-02.
  */ 
  
  public static int minValue(int[] rangeArray) {
   
    int minValue;
    minValue = rangeArray[0];

    // Finds minimum value
    for (int counter = 1; counter < rangeArray.length; counter++) {
      {
        if (counter < rangeArray.length - 1) {
          if (rangeArray[counter] < minValue) {
            minValue = rangeArray[counter];
          }
        }
      }
    }

    return minValue;
  }
  
  /**
  * This program lists 10 random numbers between 1 and 99 then shows the 
  * max and min values.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-03-02.
  */    
  
  public static int maxValue(int[] rangeArray) { 
    
    int maxValue;
    maxValue = rangeArray[0];

       
    //sorting of array process
    for (int counter = 1; counter < rangeArray.length; counter++) {
      if (rangeArray[counter] > maxValue) {
        maxValue = rangeArray[counter];
      }
    }

    //Arrays.sort(rangeArray);
    // System.out.println("The max value is: " + rangeArray.length - 1);
    return maxValue;
  }
}
