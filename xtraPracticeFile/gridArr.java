import java.io.*;
import java.util.*; 

public class gridArr {
  
public static void main (String[] args){

char grid [][] = {
        {'X', 'X', 'X', 'X','X'}, 
        {'X', 'X', 'X', 'X','X'}, 
        {'X', 'X', 'X', 'X','X'},
        {'X', 'X', 'X', 'X','X'}, 
        {'X', 'X', 'X', 'X','X'},
      };
// a 2F array with all its elements assigned the data type char with the walue D 
  
for(char i=0; i < grid.length; i++){
  //for loop for variable i with conditions and an increating iteration
  System.out.println();
  // the row of the array grid will print on a new line
for(char j=0; j <  grid.length; j++){
  // This is a nested iteration statement. The innser loop j will complete all its iterations before the outer loop i can continue.
  
System.out.print(grid[i][j] + " ");
  
//nested for loop, For every one iteration of the i loop, complete iteration through the j along the length of the array.  
  //nested for loop will print out elements in i as a row and loop through j as individual indexes in the column to form a grid.
}
  grid [1][1] = 'O';
  //changes the value of index i [1,1] from X to O
  
     }
  
   }
}
