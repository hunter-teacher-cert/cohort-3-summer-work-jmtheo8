import java.io.*;
import java.util.*; 

public class ar {
public static void main (String[] args){


// declring the data varibale datat type

  int [] arr = {2,4,6,2,10};
//declaing an array with elements in the indexes
  
  for(int i=0; i<arr.length; i++){
    if (arr[i] == 2)
      //if the index of the array holds an element that is equal to 2
    System.out.println(i);
    
    // the for statement will loop through the lenght of the array and print out the indexes where element of a value 2 will be found. When i is greater than the length if the array, the loop is broken, condition is false and loop ends.
    
  }
}
}