import java.io.*;
import java.util.*; 

public class lifePrac
{
  public static void main(String[] args)
  {
    int row = 5; 
    int col = 5;

    int[][] grid = { 
        { 0, 0, 0, 0, 0 },
        { 0, 0, 1, 1, 0 },
        { 0, 0, 0, 1, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        };
      
      // Initializing a 2D array called grid with index values of elements 1 and 0.

      
     System.out.println("Start Game:");
     // Prints a title for the array grid of elements 
      
      for (int i = 0; i < row; i++){
    // Iteration loop with conditions and incriments increase incrementally row by row until i condition is met. But contains a nested loop
   
      for (int j = 0; j < col; j++){
    //nested iteration loop, at a time across a column as per the condition 
           
      if (grid[i][j] == 0)
        
        System.out.print("*" + " ");
   //NOTE: Changing elements of value 0 in the index to * symbol in 2D array grid  

      else
      
        System.out.print("." + " ");
    //NOTE: Changing elements of value  1 in the index to . symbol in 2D array grid  
    }
        System.out.println();
  }
    // ensures that the 2D grid array will print on the next line so indexes appear as a grid with columns and rows to visualize cell life and death due to the rules of the Game of life.
      
    secondRound(grid, row, col);
  }
 
  public static void secondRound(int grid[][], int r, int c)
  {
    int[][] genTwo = new int[r][c];
    //Declares a new array called genTwo
 
     for (int k = 0; k < r; k++){ 
    
     for (int l = 0; l < c; l++){

      // Every index will be looped through following the conditions set to locate the number of aliveNeighbors
       
      int aliveNeighbours = 0;
       
        for (int i = -1; i <= 1; i++)
    
          for (int j = -1; j <= 1; j++)
  
            if ((k+i>=0 && k+i<r) && (l+j>=0 && l+j<c))

        aliveNeighbours += grid[k + i][l + j];

    aliveNeighbours -= grid[k][l];
  // Neighbour count before rules apply
 
        if ((grid[k][l] == 1) && (aliveNeighbours < 2))
    // Applying the rules of the game 
  
          genTwo[k][l] = 0;
   // Condition that the cell will die because there are less than 2 alive neighbours.

        else if ((grid[k][l] == 1) && (aliveNeighbours > 3))
  
          genTwo[k][l] = 0;
  // Condition that the if statment is false but the cell will die because more than three alive neighbors
 
        else if ((grid[k][l] == 0) && (aliveNeighbours == 3))
                    
          genTwo[k][l] = 1;
 
 // A new is cell changes from dead to alive  
            else
            genTwo[k][l] = grid[k][l];
        // No cells change or become alive
    }
  }
        System.out.println("Round 1");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (genTwo[i][j] == 0)
                     System.out.print("*" + " ");
                else
                     System.out.print("." + " ");
            }
            System.out.println();
        }
    }
}