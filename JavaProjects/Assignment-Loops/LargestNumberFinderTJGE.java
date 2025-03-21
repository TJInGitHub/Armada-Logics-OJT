import java.util.Scanner;    
public class LargestNumberFinderTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largestNumber = 0;    // declare an int variable largestNumber with a default value of 0
        int stopNumber = 0;      // declare an int variable stopNumber with a default value of 0

        /* do while loop to input numbers to be checked if its the largest number while the stopNumber is not
        equal to -1 */
        do {
            System.out.print("Enter a number (-1 to stop): ");                   
            int number = scanner.nextInt();   // User input for number with an int data type

            /* if-else -if statement to check if the inputted number is greater than the largestNumber stored
            value of 0 and is not equal to -1, replacing the largestNumber stored value if true, changing 
            stopNumber value to -1 if number is equal to -1 and continue to repeat again if the other
            conditions are not satisfied */
            if ((number > largestNumber) && (number != -1)) {
                largestNumber -= largestNumber;        // deduct largestNumber by itself to return to a 
                largestNumber += number;               // default value of 0
            } else if (number == -1) {
                stopNumber += number;
            } else {
                continue;
            }
        } while (stopNumber != -1);

        System.out.println("The largest number entered is: " + largestNumber);
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
Enter a number (-1 to stop): 10 
Enter a number (-1 to stop): 20
Enter a number (-1 to stop): 15
Enter a number (-1 to stop): -1
The largest number entered is: 20

OTHER PROGRAM OUTPUT:
Enter a number (-1 to stop): 1
Enter a number (-1 to stop): 2
Enter a number (-1 to stop): 3
Enter a number (-1 to stop): 4
Enter a number (-1 to stop): 5
Enter a number (-1 to stop): 6
Enter a number (-1 to stop): 7
Enter a number (-1 to stop): 8
Enter a number (-1 to stop): 9
Enter a number (-1 to stop): 0
Enter a number (-1 to stop): 65
Enter a number (-1 to stop): 1
Enter a number (-1 to stop): 5
Enter a number (-1 to stop): 89
Enter a number (-1 to stop): 100
Enter a number (-1 to stop): -1
The largest number entered is: 100
 */

/* Completed within 30 minutes */