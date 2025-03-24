import java.util.Scanner;                                   
public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();           // User input for number using int data type

        /* If else statement to check if number is positive or negative */
        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}

/* 
OUTPUT:
Enter a number: 1
The number is positive.

Enter a number: -1
The number is negative.
 */