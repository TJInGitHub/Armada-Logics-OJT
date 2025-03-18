public class combinedOperatorsTJGE {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        /* Check if a and b are positive numbers and do the operation below if the condition is satisfied */
        if (a >= 0 && b >= 0) {
            a += (a + b);               // Add a and b and store the result in a 
            b += (a * 2);               // Multiply a by 2 and store the result in b
        }

        System.out.println("Final value of a: " + a);       // Print final value of a 
        System.out.println("Final value of b: " + b);       // Print final value of b
    }
}

/* 
EXPECTED OUTPUT:
Final value of a: 20
Final value of b: 50

REAL OUTPUT:
Final value of a: 20
Final value of b: 50
 */