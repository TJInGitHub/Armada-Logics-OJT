import java.util.Scanner;                                   
public class OddEvenTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();           // User input for number using int data type

        /* if else statement to determine if number is odd or even by checking if the number has a remainder
        when divided to 2 */
        if (number % 2 == 0){
            System.out.println(number + " is an even number.");     // Output this if there's no remainder
        } else {
            System.out.println(number + " is an odd number.");      // Output this if there's a remainder
        }
    }
}

/* 
EXAMPLE OUTPUT: 
Enter a number: 7  
7 is an odd number.  

PROGRAM OUTPUT:
Enter a number: 7  
7 is an odd number.  

PROGRAM OUTPUT IF NUMBER IS EVEN:
Enter a number: 2
2 is an even number.
 */

/* Completed within 10 minutes */