// Guess.java 
// Alexis Chavez
// alfchave
// pa2
// plays an interactive guessing game with user

import java.util.Scanner;
import java.util.Random; 


class Guess{
   public static void main ( String [] args ) {
     

      System.out.println("\nI\'m thinking of an integer in the range 1 to 10. You have three guesses.\n");

      Scanner sc = new Scanner(System.in);
      int guessInput;
     
      // generate random number from 1-10
      Random rand = new Random();
      int k = (int)(Math.random()*10)+1;

     
      for(int guessAttempts = 0; guessAttempts < 3; guessAttempts++){
       
         //prompt user for next guess
         if(guessAttempts == 0){
            System.out.print("Enter your first guess: "); 
         }else if(guessAttempts == 1){
            System.out.print("Enter your second guess: ");
         }
         else{
         System.out.print("Enter your third guess: ");
         }

         guessInput = sc.nextInt();
        
         // check guesses
         if (guessInput < k){
            System.out.println("Your guess is too low.\n");
         }else if(guessInput > k){
            System.out.println("Your guess is too high.\n");
         } 
         else if(guessInput == k){
            System.out.println("You win!\n");
            System.exit(0);
         }
      }
      System.out.println("You lose. The number was " + k+".\n");
   }
}
