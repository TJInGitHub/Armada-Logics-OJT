public class arithmeticOperatorsTJGE {
    public static void main(String[] args) {
        float num1 = (float) 7.43;
        float num2 = (float) 3.87;

        System.out.println("Addition: " + (num1 + num2) );             // Get sum of num1 and num2
        System.out.println("Subtraction: " + (num1 - num2));          // Get difference of num1 and num2
        System.out.println("Multiplication: " + (num1 * num2));       // Get product of num1 and num2
        System.out.println("Division: " + (num1 / num2));             // Get quotient of num1 and num2
    }
}

/* EXPECTED OUTPUT:
Addition: 11.3
Subtraction: 3.56
Multiplication: 28.7541
Division: 1.919896640826873

REAL OUTPUT: 
Addition: 11.299999
Subtraction: 3.56
Multiplication: 28.754099
Division: 1.9198966

Almost the same (although rounded off to at least 6 decimal places) 
with the expected output that came from calculator. 
 */