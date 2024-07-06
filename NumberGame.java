import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int userGuess;
        int lowerBound=1;
        int upperBound=100;
        int generatedNumber=random.nextInt(upperBound-lowerBound+1)+lowerBound;
        int NumberOfAttempts=0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I had generated a number between 1 to 100. Try to guess it");

        do
        {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            NumberOfAttempts++;

            if (userGuess > generatedNumber) 
            {
                System.out.println("Too high. Try again!");
            } 
            else if (userGuess < generatedNumber) 
            {
                System.out.println("Too low. Try again!");
            } 
            else 
            {
                System.out.println("Congratulations! You guessed the number in " + NumberOfAttempts + " attempts.");
            }
        } while (userGuess != generatedNumber);

        input.close();
    }
}