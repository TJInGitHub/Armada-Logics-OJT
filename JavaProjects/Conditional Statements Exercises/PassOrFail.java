import java.util.Scanner;                                   
public class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();           // User input for score using int data type

        /* If else statement to check if your score passed or not */
        if (score >= 50) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
    }
}

/* 
OUTPUT:
Enter your score: 1
You failed!

Enter your score: 50
You passed!

Enter your score: 51
You passed!
 */