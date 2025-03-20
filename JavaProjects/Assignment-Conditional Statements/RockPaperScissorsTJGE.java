import java.util.Scanner;                                   
public class RockPaperScissorsTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";                 // declare string variable result as empty string
        String computerChoice = "";           // declare string variable computerChoice as empty string

        System.out.print("Enter your choice (R, P, S): ");
        String choice = scanner.nextLine();           // User input for choice using String data type

        /* Generate a random choice value for Computer ranging from 0 to 2 */
        int choiceValue = (int)(Math.random() * 3);

        /* Change the choice value of computer to char data type and print it */
        switch (choiceValue) {
            case 0:
                computerChoice += "R";                // Computer Choice is R (Rock) if choice value is 0
                System.out.println("Computer chose: R");
                break;
            case 1:
                computerChoice += "P";                // Computer Choice is P (Paper) if choice value is 1
                System.out.println("Computer chose: P");
                break;
            case 2:                                   // Computer Choice is S (Scissors) if choice value is 2
                computerChoice += "S";
                System.out.println("Computer chose: S");
                break;
        }

        /* Combine user's choice and computer's choice in one string as value of result*/
        result += choice + computerChoice;

        /* Determine the winner based on the string value of result */
        switch (result) {
            /* When RR (Rock to Rock), PP (Paper to Paper) and SS (Scissors to Scissors) is the value of result, 
            it is draw */
            case "RR":
                System.out.println("Draw!");
                break;
            case "PP":
                System.out.println("Draw!");
                break;
            case "SS":                                   
                System.out.println("Draw!");
                break;
            /* When RS (Rock to Scissors), PR (Paper to Rock) and SP (Scissors to Paper) is the value of result, 
            the user will win */
            case "RS":
                System.out.println("You win!");
                break;
            case "PR":
                System.out.println("You win!");
                break;
            case "SP":                                   
                System.out.println("You win!");
                break;
            /* When SR (Scissors to Rock), RP (Rock to Paper) and PS (Paper to Scissors) is the value of result, 
            the user will lose */
            case "SR":
                System.out.println("You lose!");
                break;
            case "RP":
                System.out.println("You lose!");
                break;
            case "PS":                                   
                System.out.println("You lose!");
                break;
            /* If there are wrong combinations caused by wrong user input, wrong user input will be displayed 
            as the default case */
            default:
                System.out.println("Wrong user input!");
        }
    }
}

/* 
EXAMPLE OUTPUT: 
Enter your choice (R, P, S): R  
Computer chose: S  
You win!  

PROGRAM OUTPUT:
Enter your choice (R, P, S): R
Computer chose: S
You win!


OTHER PROGRAM OUTPUTS:
Enter your choice (R, P, S): R
Computer chose: P
You lose!

Enter your choice (R, P, S): R
Computer chose: R
Draw!

Enter your choice (R, P, S): P
Computer chose: S
You lose!

Enter your choice (R, P, S): P
Computer chose: R
You win!

Enter your choice (R, P, S): P
Computer chose: P
Draw!

Enter your choice (R, P, S): S
Computer chose: R
You lose!

Enter your choice (R, P, S): S
Computer chose: P
You win!

Enter your choice (R, P, S): S
Computer chose: S
Draw!

Enter your choice (R, P, S): A
Computer chose: P
Wrong user input!
*/

/* Completed within 1 hour and 30 minutes */