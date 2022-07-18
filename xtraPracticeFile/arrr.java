import java.io.*;
import java.util.*; 

public class arrr {
public static void main (String[] args){

int count=0;
// an outside counter variable that will keep track of the index and the values or elements it holds.

  int [] arr = {2,4,6,2,10};

  for(int element:arr){
    System.out.println(element + " " + "the index is" + " " + count);
    count++;
    // Everytime the loop is ran, the counter will increment by 1 to keep track of the index of the element
    
  }
 }
}