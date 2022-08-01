/**
Driver.java
Owner: Théa W
Collaborators: Maxwell Y, Will L, Jerusha T
**/

import java.io.*;
import java.util.*;

public class Driver{
  
  public static void main(String[] args){
    
    LinkedList l = new LinkedList();
    
    l.add("Dan");
    l.add("Cara");
    l.add("Ben");
    l.add("Ana");
    
    System.out.println("\nLinked List-------------------------------------------");
    System.out.println(l);
    l.add(0, "Kyle");
    
    System.out.println("\nLinked List with element added to index 0-------------");
    System.out.println(l);

    System.out.println("\nGet elements at index 1, 2 and 3----------------------");
    System.out.println(l.get(1) + ", " + l.get(2) + ", " + l.get(3));
  
    System.out.println("\nIndex of Jack-----------------------------------------");
    System.out.println(l.indexOf("Jack"));
    
    System.out.println("\nArray Test--------------------------------------------");
    System.out.println(l);
    String[] l_array = l.toArray();

    System.out.println("\nRemove element at index 0-----------------------------");
    l.remove(0);
    System.out.print(l_array[0]);
    for(int i=1; i<l_array.length;i++){
    System.out.println(); 
    }

  }
  
}