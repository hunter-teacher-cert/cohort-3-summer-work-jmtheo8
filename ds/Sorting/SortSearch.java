//Contributors: Group 7:

import java.io.*;
import java.util.*;


/*
  Sort Project:
  Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
  Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch {

    /* Sort project starts here */

    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data

    private Random r;


    public SortSearch() {
      data = new ArrayList<Integer>();
      r = new Random();
      for (int i = 0; i < 15; i++) {
        data.add(r.nextInt(20));
      }

    }
    public SortSearch(int size) {
      data = new ArrayList<Integer>();
      r = new Random();
      for (int i = 0; i < size; i++) {
        data.add(r.nextInt(20));
      }
    }
  
    // creates random list with an input for size and max value. 
    public SortSearch(int size, int max) {
      data = new ArrayList<Integer>();
      r = new Random();
      for (int i = 0; i < size; i++) {
        data.add(r.nextInt(max));
      }

    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index) {
      return this.data.get(index);
    }

    /* Convenience function to get the size of the ArrayList from the driver.
    */
    public int size() {
      return data.size();
    }

    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
    */
    public int findSmallestIndex(int start) {
      int smallIndex = start;
      for (int i = start; i < data.size(); i++) {
        if ( data.get(i) < data.get(smallIndex)) {
          smallIndex = i;
        }
      }
      return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
      to the end of the array and swap it with that index.
    */
    public void sort() {
      for (int i = 0; i < data.size(); i++) { //iterating the start position of find smallest index
        int smallindex = findSmallestIndex(i); //sets the variable to index of smallest element
        swapElements(data, smallindex, i);

        //SORT WITHOUT USING SWAPELEMENTS METHOD
        // int smallval = data.get(smallindex); //set the variable to the value of the smallest element
        // int startval = data.get(i); //sets the value of the start position
        // data.set(i, smallval); //puts the smallest values at the start position
        // data.set(smallindex, startval); //puts the start value at the smallest values position
      }

    }

    public static void swapElements(ArrayList<Integer> dataList, int index1, int index2) {
      int index1val = dataList.get(index1);// initialize variables and use get and set methods
      int index2val = dataList.get(index2);
      dataList.set(index1, index2val);// replace value in index 1 with value in index 2
      dataList.set(index2, index1val); //replace value in index2 with value in index 1
    }


    /* Search project starts here */

    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value) {
      for (int i = 0; i < data.size(); i++) {
        if (data.get(i) == value ) {
          return i;
        }
      }
      return -1; // replace this return
    }

    /**
       Implement a binary search as specified by the comments
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value) {

      //set firstIndex, lastIndex, and middleIndex
      int firstIndex = 0;
      int lastIndex = data.size() - 1;
      int middleIndex = (firstIndex + lastIndex) / 2;

      while (data.get(middleIndex) != value) {

        //if middleIndexValue is < value
        if (data.get(middleIndex) < value) {
          firstIndex = middleIndex;
        }
        //else if middleIndexValue > value
        else {
          lastIndex = middleIndex;
        }
        middleIndex = (firstIndex + lastIndex) / 2;

        if (firstIndex == middleIndex || lastIndex == middleIndex) {
          return -1;
        }
      }

      return middleIndex;

    }

    /**
       Implement a RECURSIVE binary search as specified by the comments
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex) {

      if (highIndex - lowIndex != 1) {

        int middleIndex = (lowIndex + highIndex) / 2;

        if (data.get(middleIndex) == value) {
          return middleIndex;
        }

        if (data.get(middleIndex) < value) {

          return binarySearchRecursive(value, middleIndex, highIndex);
        }

        return binarySearchRecursive(value, lowIndex, middleIndex);

      }
      return -1;

    }


    public String toString() {
      return "" + data;
    };


    public void builtinSort() {
      Collections.sort(data);

    }

  /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      // code for merge
      ArrayList<Integer> mergedList = new ArrayList<Integer>();

      int i = 0,j = 0;
       while (list1.size() != i && list2.size() != j ){
        if(list1.get(i) < list2.get(j)) {
         mergedList.add(list1.get(i));
          i++;
         } else {
         mergedList.add(list2.get(j));
         j++;
        }
       }  
        if(list1.size() > i) {
        for(i = i; i < list1.size(); i++) {
          mergedList.add(list1.get(i));
        }
      } 
         if(list2.size() > j) {
         for(j = j; j < list2.size(); j++) {
          mergedList.add(list2.get(j));
         }
      }
      return mergedList;
    }
  
  
  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
      int size = list.size();
      // Checks for base case
      if(size < 2){
        return list;
        
          }else{
          //Not the base case, then divide the list in half, mergeSort the left them mergeSort the right half and then mergesort the rigt half, then merge the list into a new one amd return th new list,
            ArrayList<Integer> listLeft = new ArrayList<Integer>(list.subList(0, size/2)); 
            ArrayList<Integer> listRight = new ArrayList<Integer>(list.subList(size/2, size)); 
            ArrayList<Integer> sortedLeft = mergeSort(listLeft); 
            ArrayList<Integer> sortedRight = mergeSort(listRight); 
            ArrayList<Integer> sorted = merge(sortedLeft, sortedRight);
        //Return new list after merge
              return sorted;
          }
  }

      public void msort(){
        data = mergeSort(data);
      }    
    
}