//Scan all primitive data types
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
* This program lists 10 random numbers between 1 and 99 then shows the 
* max and min values.
* @author Michias Shiferaw
* @Version 2.0
* @since 2020-02-29.
*/
 
class MaxMin {
  /**
  * This program lists 10 random numbers between 1 and 99 then shows the 
  * max and min values.
  * @author Michias Shiferaw
  * @Version 2.0
  * @since 2020-02-29.
  */
  
  public static void main(String[] args) {

    //Declare max and min value of array
    int maxValue = 99;
    int arrayLength = 10;
    int[] rangeArray = new int[arrayLength];
    int randNum;
    Random rangeVal = new Random();

    //populate array 
    for (int counter = 0; counter < arrayLength; counter++) {
      randNum = rangeVal.nextInt(maxValue) + 1;
      rangeArray[counter] = randNum;
      System.out.println(rangeArray[counter]);
    }

    //sorting of array process
    Arrays.sort(rangeArray);

    //output
    System.out.println("Max: " + rangeArray[arrayLength - 1]);
    System.out.println("Min: " + rangeArray[0]);
  }
}