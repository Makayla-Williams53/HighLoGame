import java.util.Scanner;
import java.util.Random;
public class HiLo
{
    //-----------------------------------------------------------------
    //  Plays a simple guessing game with the user.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        validateGuess();
    }

    public static void validateGuess(){
        final int MAX = 100;
        int answer, guess;
        boolean cont = true;
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;
        System.out.println(answer);
        System.out.println ("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is: ");
        guess = scan.nextInt();

        while(cont)
        {
            if(guess == answer)
            {
                System.out.println("The entered value " + guess + " is correct. Enter -1 to play again or -2 to quit.");
                guess = scan.nextInt();
            }
            else if(guess < answer)
            {
                System.out.println("The entered value is too low. Enter -2 to quit or enter your new guess");
                guess = scan.nextInt();
            }
            else
            {
                System.out.println("The entered value is too high. Enter -2 to quit or enter your new guess");
                guess = scan.nextInt();
            }

            if(guess == -1){
                answer = generator.nextInt(MAX) + 1;
                System.out.println ("I'm thinking of a number between 1 and "
                        + MAX + ". Guess what it is: ");
                guess = scan.nextInt();
            }
            else if(guess == -2)
            {
                System.out.println("You have decided to quit. The correct number was " + answer);
                cont = false;
            }
        }
    }
}
