package numbergame;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
    	int maxAttempt=3;
    	int score=0;
    	int round=0;
    	boolean PlayAgain=true;
       
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the number guessing game!");
        
        while(PlayAgain)
        {
        	round++;
        	 Random rand = new Random();
             int numberToGuess = rand.nextInt(100) + 1;
        	System.out.println("Guess a number between 1 and 100:");
          int attempts=0;
          
        	while (attempts<maxAttempt) 
        	{
        		
            System.out.println("Enter your guess :");
            guess = scanner.nextInt();
             attempts++;
            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number!");
               score++;
                break;
            } else if (guess < numberToGuess)
            {
                System.out.println("Your guess is too low. Try again:");
            } else 
            {
                System.out.println("Your guess is too high. Try again:");
            }
            
            if(attempts==maxAttempt)
            {
            	System.out.println("sorry yor reached the max number of attemps The correct number was "+numberToGuess);
            }
        }
        System.out.println("Do you want to play again (yes/no)");
        String PlayAgainResponse= scanner.next().toLowerCase();
        PlayAgain=PlayAgainResponse.equals("yes");
        
        } 
        System.out.println("Thanks for Playing Your Score is = "+score+" round win = "+round+" ");
        scanner.close();
    }
}
