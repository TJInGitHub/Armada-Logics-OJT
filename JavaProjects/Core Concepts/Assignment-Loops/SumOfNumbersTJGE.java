import java.util.Scanner;    
public class SumOfNumbersTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int integer = scanner.nextInt();           // User input for integer using int data type

        /* while loop to print the sum of integers from 1 to the inputted integer value*/
        int i = 1;                                  
        int integerSum = 0;                        // declare int variable integer sum with default value of 0

        while (i <= integer){
            integerSum += i;
            i++;
        }

        /* Print integerSum as the output */
        System.out.println("The sum of natural numbers from 1 to " + integer + " is: " + integerSum);
    }
}

/* 
SAMPLE OUTPUT:
Enter a positive integer: 10  
The sum of natural numbers from 1 to 10 is: 55  

PROGRAM OUTPUT:
Enter a positive integer: 10
The sum of natural numbers from 1 to 10 is: 55

OTHER PROGRAM OUTPUT:
Enter a positive integer: 20
The sum of natural numbers from 1 to 20 is: 210

Enter a positive integer: 25
The sum of natural numbers from 1 to 25 is: 325

Enter a positive integer: 5
The sum of natural numbers from 1 to 5 is: 15
 */

/* Completed within 10 minutes */