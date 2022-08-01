//Contributors: Group 7:

import java.io.*;
import java.util.*;

public class SortSearchDriver {
  
  public static void main(String[] args) {


// // Uncomment these to test part 1
    
// System.out.println("Part 1 Test----------");
// SortSearch ss = new SortSearch(20);
// System.out.println(ss);

    
		
// // Uncomment these to test part 2
   
//System.out.println("Part 2 Test----------");
  // int i;
	// i = ss.findSmallestIndex(0);
	// System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  // System.out.println();
	// i = ss.findSmallestIndex(3);
	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);


    
// // Uncomment these to test part 3
    
//System.out.println("Part 3 Test----------");
  // System.out.println();     
  // System.out.println(ss);
  // ss.sort();
	// System.out.println(ss);
  // System.out.println("Linear search found value 5 at index " + ss.linearSearch(5));
  // System.out.println("Binary search found value 5 at index " + ss.binarySearch(5));
  // System.out.println("Binary search found value 35 at index " + ss.binarySearch(35));

  // System.out.println("Recursive Bin Search found value 5 at index " + ss.binarySearchRecursive(5, 0, ss.size()-1));

 // System.out.println("Recursive Bin Search found value 35 at index " + ss.binarySearchRecursive(35, 0, ss.size()-1));


 // int size = 10000;

// long start,elapsed;
// start = System.currentTimeMillis();
//    // put what you want to test here!
    
//    SortSearch test = new SortSearch(size);
//    // System.out.println(test); 
//    // System.out.println("sorting"); 
    
//    test.sort();
//    // System.out.println(test); 
//   elapsed = System.currentTimeMillis() - start;
//   System.out.println("Size: " + size + " Time: " + elapsed);

  

    
//   start = System.currentTimeMillis();
//     // put what you want to test here!
//    SortSearch test2 = new SortSearch(size);
//    // System.out.println(test2); 
//     //  System.out.println("sorting"); 
//    test2.sort();
//     //System.out.println(test2); 
//   elapsed = System.currentTimeMillis() - start;
//   System.out.println("Size: " + size + " Time: " + elapsed);


//   start = System.currentTimeMillis();
//     // put what you want to test here!
//   SortSearch test3 = new SortSearch(size);
//     // System.out.println(test3); 
//     // System.out.println("sorting"); 
//    test3.sort();
//     // System.out.println(test3); 
//         elapsed = System.currentTimeMillis() - start;
//         System.out.println("Size: " + size + " Time: " + elapsed);
           
      
//      SortSearch BIG = new SortSearch(10,100);
//      System.out.println(BIG);

    
    // ArrayList<Integer> a = ss.buildIncreasingList(20);
  	// System.out.println(a);

    
  	// // build a second Arralist here
  	// ArrayList<Integer> b = ss.buildIncreasingList(25);
  	//   System.out.println(b);
  
  	// // test your merge routine here
    
    // ArrayList<Integer> merged = ss.merge(a, b);
    //   System.out.println(merged);
      
    int size = 100000;
    long start,elapsed;
	  
    start = System.currentTimeMillis();
	    // put what you want to test here!
      SortSearch test = new SortSearch(size);
      // System.out.println(test); 
      // System.out.println("sorting"); 
   
    test.sort();
      // System.out.println(test); 
	      elapsed = System.currentTimeMillis() - start;
	      System.out.println("Size: " + size + " Time: " + elapsed);
      

          start = System.currentTimeMillis();
    
	    // put what you want to test here!
      test = new SortSearch(size);
      // System.out.println(test); 
      // System.out.println("sorting"); 
    
      test.msort();
      // System.out.println(test); 
	      elapsed = System.currentTimeMillis() - start;
    
	        System.out.println("Size: " + size + " Time: " + elapsed);     
    }
}