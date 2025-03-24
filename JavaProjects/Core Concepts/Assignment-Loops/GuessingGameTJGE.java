import java.util.Scanner;    
public class GuessingGameTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int guessedNumber = 0;     // declare an int variable called guessedNumber with default value of 0
         int attempts = 0;           // number of attempts in int data type with default value of 0

        /* Generate a random number to guess between 1 and 50 to be stored in randomNumber int variable*/
        int randomNumber = (int)((Math.random() * 50) + 1);  

        /* while loop that loops until user guess the random number */
        while (guessedNumber != randomNumber){
            System.out.print("Guess a number between 1 and 50: ");                   
            guessedNumber = scanner.nextInt();   // User input for guessedNumber with an int data type
            attempts++;

            /* if-else-if statement to notify user that the number guessed is incorrect and provide how high or 
            how low the number guessed is compared to the random number and continue if already guessed*/
            if (guessedNumber > randomNumber) {
                System.out.println("Too high! Try again.  ");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Too low! Try again.  ");
            } else {
                continue;
            }
        }

        /* Print a notification that the number have been guessed and provide the number of attempts taken */
        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
    }
}

/* 
SAMPLE OUTPUT:
Enter a number (-1 to stop): 10  
Enter a number (-1 to stop): 20  
Enter a number (-1 to stop): 15  
Enter a number (-1 to stop): -1  
The largest number entered is: 20  

PROGRAM OUTPUT:
Guess a number between 1 and 50: 1
Too low! Try again.  
Guess a number between 1 and 50: 5
Too high! Try again.  
Guess a number between 1 and 50: 2
Too low! Try again.  
Guess a number between 1 and 50: 3
Correct! You guessed it in 4 attempts.  

OTHER PROGRAM OUTPUT:
Guess a number between 1 and 50: 1
Too low! Try again.  
Guess a number between 1 and 50: 9
Too low! Try again.  
Guess a number between 1 and 50: 19
Too low! Try again.  
Guess a number between 1 and 50: 30
Too low! Try again.  
Guess a number between 1 and 50: 50
Too high! Try again.  
Guess a number between 1 and 50: 40
Too high! Try again.  
Guess a number between 1 and 50: 35
Too high! Try again.  
Guess a number between 1 and 50: 33
Too low! Try again.  
Guess a number between 1 and 50: 34
Correct! You guessed it in 9 attempts.
 */

/* Completed within 30 minutes */