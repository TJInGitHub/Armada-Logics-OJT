import java.util.Scanner;                                   
public class ElectricityBillTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float totalBill = 0;    // Initialize a variable named totalBill as float with a defaul value of 0

        System.out.print("Enter number of units consumed: ");
        float unitsConsumed = scanner.nextFloat();       // User input for unitsConsumed using float data type

        /* If-else-if statement to calculate total bill based on units consumed, modified to allow those lower
        than 300 and less than or equal to 100 to have a calculation for total bill*/
        if (unitsConsumed > 300 ) {
            /* Output this if units consumed is greater than 300. First 100 units will cost 1.50 per unit 
            (total cost of 150), the next 200 units will cost 2.50 per unit (total cost of 500) which are 
            300 units in total, but those beyond 300 units will cost 3.50 per unit so the formula below is 
            used */
            totalBill += 150 + 500 + ((unitsConsumed - 300) * 3.50);
            System.out.println("Total bill: " + totalBill);
        } else if ((unitsConsumed <= 300) && (unitsConsumed > 100)) {
            /* Output this if units consumed is less than or equal to 300 and units consumed is greater than 
            101. First 100 units will cost 1.50 per unit (total cost of 150) and those beyond 100 units up to 
            300 units will cost 2.50 per unit so the formula below is used */
            totalBill += 150 + ((unitsConsumed - 100) * 2.50);
            System.out.println("Total bill: " + totalBill);
        } else {
            /* Output this if units consumed is less than or equal to 100. Units lower or equal to 100 will cost
            1.50 per unit thus the calculation */
            totalBill += unitsConsumed * 1.50;
            System.out.println("Total bill: " + totalBill);
        }
    }
}

/* 
EXAMPLE OUTPUT: 
Enter number of units consumed: 350  
Total bill: 825.0  

PROGRAM OUTPUT:
Enter number of units consumed: 350
Total bill: 825.0

OTHER PROGRAM OUTPUTS:
Enter number of units consumed: 500
Total bill: 1350.0

Enter number of units consumed: 300
Total bill: 650.0

Enter number of units consumed: 150
Total bill: 275.0

Enter number of units consumed: 100
Total bill: 150.0

Enter number of units consumed: 5
Total bill: 7.5
*/

/* Completed within 1 hour */