/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators:Stacy Goldstein,Jerusha Theobald, A Cassara
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    this.data = new int [10];

    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
    this.numberElements = 0;
    //No intergers stored in SuperArray
  }


  
  //overloaded constructor -- allows specification of initial capacity
  
   public SuperArray(int size)
   { 
      //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */ 
       this.numberElements = 0;
    // Array called data with "size" as its capacity
     
    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */
      this.data = new int[size];
    
   }



  


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add(int value) //int value tells us how many times to increase the length 
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */
    //int[]temp = new int[data.length+1]; //+1 so that we start above the default value

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */
      if(numberElements == data.length) { 
        grow();
        
      /**if data length is 10 and elements is 10 then there is no room for an additional element*/
      // for(int =0;i<data.length;i++) {
        
      //   /**so we have to loop through the original array and copy all ements to the temp array (which now is size 11)*/
      //   temp[i] = data[i];// copying
      
      }
    
      //resetting the original array to the new array temp
      

      data[numberElements] = value; 

    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
      numberElements++;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
    if(numberElements == 0){
      return true;
    } 
      else{
      return false;
    }
  }


    public int get(int index)
    {
    //return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    
      return data[index];
    }  

  
      public String toString()
      {
       String output = "[ ";
		    for (int i = 0; i < numberElements; i++)
			  output += data[i] + " ";
		    output += "]";

		    return output;
   //return stringified version of this Object
  //   /* YOUR SIMPLE+SMART CODE HERE */
   
      }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
      s = "Size: " + this.data.length;
      s = s + " LastItem: " + numberElements + "  Data: ";
    
      for(int i = 0; i < numberElements; i++){
        s = s + data[i] + ", ";
      }
    
        s = s + "\n";
        return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    index=data[index];
      for (int i=index; i<data.length-1;i++)
      data[i]=data[i+1];
      numberElements--;
    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
  }


      public void add(int index, int value)
      {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */
        if(data.length == numberElements){
        grow();
        }
    //data[index]
    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */
          for(int i=numberElements-1; i>=index; i--){
            data[i+1] = data[i];
          }  
    
    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */
            data[index] = value;

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
            numberElements++;
      }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */
    int[]data1 = new int[data.length + 1];
    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */
      for(int i=0; i<data.length; i++){
        data1[i] = data[i];
      }    
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
        data = data1;
  }//end grow()

}//end class