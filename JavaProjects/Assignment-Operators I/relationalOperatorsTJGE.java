public class relationalOperatorsTJGE {
    public static void main(String[] args) {
        int x = 27;
        int y = 9;

        /* Check if x is equal to y */
        System.out.println(x + " is equal to " + y + ": " + (x == y));  
        
        /* Check if x is not equal to y */
        System.out.println(x + " is not equal to " + y + ": " + (x != y));

        /* Check if x is greater than y */
        System.out.println(x + " is greater than " + y + ": " + (x > y));

        /* Check if x is less than y */
        System.out.println(x + " is less than " + y + ": " + (x < y));

        /* Check if x is greater than or equal to y */
        System.out.println(x + " is greater than or equal to " + y + ": " + (x >= y));

        /* Check if x is less than or equal to y */
        System.out.println(x + " is less than or equal to " + y + ": " + (x <= y));


        /* Bonus Task: Check if x is within the range of two numbers (i.e. x is greater than or equal to 10 
        and x is less than or equal to 50) */

        /* Output true and within the range if satisfied, else output false and not in range*/
        if ((x >= 10) && (x <= 50) == true) {
            System.out.println("10 <= " + x + " <= 50 " + ": " + ((x >= 10) && (x <= 50)) + " (Within the Range)");
        } else {
            System.out.println("10 <= " + x + " <= 50 " + ": " + ((x >= 10) && (x <= 50)) + " (Not in Range)");
        }
    }
}

/* 
EXPECTED OUTPUT:
27 is equal to 9: false
27 is not equal to 9: true
27 is greater than 9: true
27 is less than 9: false
27 is greater than or equal to 9: true
27 is less than or equal to 9: false
10 <= 27 <= 50 : true (Within the Range)

REAL OUTPUT:
27 is equal to 9: false
27 is not equal to 9: true
27 is greater than 9: true
27 is less than 9: false
27 is greater than or equal to 9: true
27 is less than or equal to 9: false
10 <= 27 <= 50 : true (Within the Range)

 */