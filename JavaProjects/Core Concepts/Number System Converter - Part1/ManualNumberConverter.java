import java.util.Scanner;    
public class ManualNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");                   
        int decimalNumber = scanner.nextInt();   // User input for int variable decimalNumber

        /* Changes will be applied with the decimalNumber variable as it will be used for dividing and
        getting quotient. An int variable to store the original value will be created named 
        original_decimalNumber*/
        int original_decimalNumber = decimalNumber;
        
        /* Below this print will be the output converted decimal number into binary, octal and hexadecimal */
        System.out.println("\n=== Number System Conversions ===  ");        
        
        /* For Binary */
        int[] inBinary = new int[1000];       // declare an empty array that can store 1000 elements called
        int i = 0;                            // inBinary and index i for the array's index using int data type

        /* while loop that divides the inputted decimal number by 2 to get a remainder to be presented as the
        binary value. The quotient obtained will also be divided by 2 in every loop until there's no
        quotient left, wherein each remainder will be stored as the index element for the binary value of 
        decimal number */
        while (decimalNumber != 0) {
            inBinary[i] = decimalNumber % 2;
            decimalNumber /= 2;
            i++;
        }

        /* Print the binary in reversed order to provide the correct binary output using for loop*/
        System.out.print("Binary: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(inBinary[j]);
        }


        /* For Octal */
        int[] inOctal = new int[100];    // declare an empty array that can store 100 elements called inOctal
        i = 0;                           // reset index i value back to 0 to be used again for another array 
        decimalNumber = original_decimalNumber; // return the original inputted decimal number to be used again

        /* while loop that divides the inputted decimal number by 8 to get a remainder to be presented as the
        octal value. The quotient obtained will also be divided by 8 in every loop until there's no
        quotient left, wherein each remainder will be stored as the index element for the octal value of 
        decimal number */
        while (decimalNumber != 0) {
            inOctal[i] = decimalNumber % 8;
            decimalNumber /= 8;
            i++;
        }

        /* Print the Octal in reversed order to provide the correct Octal output using for loop*/
        System.out.print("\nOctal: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(inOctal[j]);
        }


        /* For Hexadecimal */
        int[] inHexa = new int[100];    // declare an empty array that can store 100 elements called inHexa
        i = 0;                           // reset index i value back to 0 to be used again for another array 
        decimalNumber = original_decimalNumber; // return the original inputted decimal number to be used again

        /* while loop that divides the inputted decimal number by 16 to get a remainder to be presented as the
        hexadecimal value. The quotient obtained will also be divided by 16 in every loop until there's no
        quotient left, wherein each remainder will be stored as the index element for the octal value of 
        decimal number */
        while (decimalNumber != 0) {
            inHexa[i] = decimalNumber % 16;
            decimalNumber /= 16;
            i++;
        }

        /* Print the Octal in reversed order to provide the correct Octal output using for loop and 
        because hexadecimal values 10 to 15 is outputted as A, B, C, D, E and F, an if-else statement will
        be used to output the following by adding the remainders greater than 9 to decimal number of 55 to get
        the equivalent character by basing on ascii table character equivalent of the decimal number */
        System.out.print("\nHexadecimal: ");
        for (int j = i - 1; j >= 0; j--) {
            if (inHexa[j] > 9) {
                System.out.print((char)(55 + inHexa[j]));
            } else {
                System.out.print(inHexa[j]);
            }
        }
    }
}

/* 
SAMPLE OUTPUT:
Enter a decimal number: 45  

=== Number System Conversions ===  
Binary: 101101  
Octal: 55  
Hexadecimal: 2D  

PROGRAM OUTPUT:
Enter a decimal number: 45

=== Number System Conversions ===
Binary: 101101
Octal: 55
Hexadecimal: 2D

OTHER PROGRAM OUTPUT:
Enter a decimal number: 26

=== Number System Conversions ===
Binary: 11010
Octal: 32
Hexadecimal: 1A



Enter a decimal number: 16

=== Number System Conversions ===
Binary: 10000
Octal: 20
Hexadecimal: 10



Enter a decimal number: 33

=== Number System Conversions ===
Binary: 100001
Octal: 41
Hexadecimal: 21
 */

/* Completed within 2 hour */