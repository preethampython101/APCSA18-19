// ****************************************************************
//   Guess.java
//   Play a game where the user guesses a number from 1 to 100
// ****************************************************************
import java.util.Scanner;

public class Guess
{
public static void main(String[] args)
     {
       int numToGuess;       //Number the user tries to guess
       int guess;            //The user's guess
       int count = 1;
       int highGuess = 0;
       int lowGuess = 0;
  Scanner sc = new Scanner(System.in);
  
  //randomly generate the  number to guess
  numToGuess = (int) ((Math.random()*100) +1);  
  //print message asking user to enter a guess
  System.out.println("Enter your guess between 1 and 100. ");
  //read in guess
  guess = sc.nextInt();
  
  while (guess!=numToGuess)  //keep going as long as the guess is wrong
       {
       System.out.println("You had a wrong guess. Try again.");
       count += 1;
       if(guess>numToGuess){
         System.out.println("You guessed a larger number. " +guess);
         highGuess += 1;
       }else{
         System.out.println("You guessed a smaller number. "+guess);
         lowGuess += 1;
         }
       //print message saying guess is wrong
       //get another guess from the user
       guess = sc.nextInt();
  }
  System.out.println("You finally got it right after "+count+" attempts, "+highGuess+" high guesses, and "+lowGuess+" low guesses and made it on the latest attempt.");
  //print message saying guess is right
  //System.out.println("You took "+count+ to get this right.");
  //System.out.println("You had ");
  sc.close();
}
}
