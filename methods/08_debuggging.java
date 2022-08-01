// 08_Debugging Lesson (Jerusha, Joel, Jenna, Dave)

// Overview: Students will be provided with a non-working "Game of Nim" code, which has been infected with a variety of bugs! For this activity, students must employ a variety of debugging techniques to correct the syntax errors.

// More about the Game of Nim



// Activity:

// Navigate to and compile the Debugging.java file
// There are several syntax errors in the program.
// Find and correct the 'dirty dozen' errors in the code.
// Read the error messages provided in the console window
// On your debugging activity guide, record 1)the line number 2) the error messge 3) What you did to fix the error.
// THE DIRTY DOZEN ERRORS

// Error#	Line Number	How to Fix Error
// 1		
// 2		
// 3		
// 4		
// 5		
// 6		
// 7		
// 8		
// 9		
// 10		
// 11		
// 12		
// How to Troubleshooting Tips:

// Read error messages in the console to see what line the error occured.
// Indent all of the curly braces properly to see if any structures are missing any.
// Click on a curly brace to see where it is being matched to.
// Some common Errors:

// Are the variable names typed the exact same way?
// Is each variable declared with the correct type?
// Is every open delimiter -- {, (, " -- paired with a closed delimiter -- }, ), " ?
// Student Starter Code Sample

import java.util.*;

public class Debugging{

  public static final String[] OPPONENTS = {"Dave", "Jenna", "Jerusha", "Joel"};

  public static void main(String[] antarctica){
    System.out.println("Nim class starting!");

    String stones = 12;
      int stonesTaken;
    playerFirst = true;
    boolean playerTurn = true;
    int oppIndex = (int) (Math.random() * OPPONENTS.length);
    
    String userResponse = "";
    Scanner eyes = new Scanner(System.in);

  System.out.println("Would you like to go first? [Y/N]");
    userResponse = eyes.nextLine().toLowerCase();
        if( userresponse.equals("n")){
      playerFirst = false;
    
    }

    //loop until game ends
    while(stones > 0){

      //prompt user input (user turn)
      System.out.println("How many stones would you like to take?");
      stonesTaken = eyes.nextInt();
      eyes.nextLine();
      
      //calculate numbers of stone remaining
      stones -= stonesTaken;
      System.out.println("Number of stones remaining: " + stones);

      //check for win
      if(stones <= 0){
            System.out.println("You win!");
            break;
          }
      
      //machine turn: if 3 or fewer, take all the remaining stones
      if(stones <=3){
        stonesTaken = stones;
       
      else if{
        stonesTaken = (int) (Math.random() * 3) + 1;        
  }
      
      System.out.println("Computer takes " + stonesTaken()  " stones");
      
      //calculate numbers of stone remaining
      stones -= stonesTaken;
      System.out.println("Number of stones remaining:"  + stones);

//check win
if(stones <= 0){
  System.out.println("You lose!);
  break;

      }
    }

        System.out.println("Game over!");

    
    
        }