public class assignmentOperatorsTJGE {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("x = " + (x += 5));          // Add 5 to x using +=
        System.out.println("x = " + (x -= 3));          // Subtract 3 from x using -=
        System.out.println("x = " + (x *= 2));          // Multiply x by 2 using *=
        System.out.println("x = " + (x /= 4));          // Divide x by 4 using /=
        System.out.println("x = " + (x %= 3));          // Find the remainder when x is divided by 3 using %=

        int price = 100;                                // Start with an initial price of $100
        price *= (1 - 0.20);                            // Apply a 20% discount using the *= operator
        price *= (1 + 0.10);                            // Add a 10% tax using the *= operator
        System.out.println("Final price: $" + price);   // Print the final price.
    }
}

/* 
EXPECTED OUTPUT:
x = 15
x = 12
x = 24
x = 6
x = 0
Final price: $88

REAL OUTPUT:
x = 15
x = 12
x = 24
x = 6
x = 0
Final price: $88
 */