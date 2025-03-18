public class logicalOperatorsTJGE {
    public static void main(String[] args) {
        boolean a = false;                                  
        boolean b = false;                                  

        System.out.println("a && b: " + (a && b));  //Print Logical AND output between a and b
        System.out.println("a || b: " + (a || b));  //Print Logical OR output between a and b
        System.out.println("!a: " + !a);            //Print Logical NOT of a
        System.out.println("!b: " + !b);            //Print Logical NOT of b

        /* Sample credit score and annual income */
        int creditScore = 701;
        int annualIncome = 50000;

        /* Check if credit score is above 700 and annual income is above $50,000 if eligible for a loan*/
        if ((creditScore > 700) && (annualIncome > 50000)) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }
    }
}

/* 
EXPECTED OUTPUT:
a && b: false
a || b: false
!a: true
!b: true
You are not eligible for a loan.

REAL OUTPUT:
a && b: false
a || b: false
!a: true
!b: true
You are not eligible for a loan.
 */