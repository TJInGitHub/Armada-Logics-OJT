public class modulusOperatorTJGE {
    public static void main(String[] args) {
        int dividend = 10;                         // number to be divided 
        int divisor = 3;                           // number that divides the number to be divided
        int quotient = dividend / divisor;         // Output of division between dividend and divisor
        int remainder = dividend % divisor;        // Remainder output if dividend is not divisible by divisor

        /* Check if dividend is divisible to divisor */
        if (dividend % divisor == 0){
            System.out.println("The number " + dividend + " is divisible by number " + divisor);
        } else {
            System.out.println("The number " + dividend + " is not divisible by number " + divisor);
        }

        /* Print the quotient and remainder of the dividend and divisor */
        System.out.println(dividend + "/" + divisor + " = " + quotient + ", remainder: " + remainder);
    }
}

/* 
EXPECTED OUTPUT:
The number 10 is not divisible by number 3
10/3 = 3, remainder: 1

REAL OUTPUT:
The number 10 is not divisible by number 3
10/3 = 3, remainder: 1
 */