import java.util.Scanner;                                   
public class GradingSystemTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();           // User input for score using int data type

        /* If-else-if statement to assign a grade based on the inputted score */
        if (score >= 90) {
            System.out.println("Grade: A");              // Output this if score is greater than or equal to 90
            System.out.println("Feedback: Excellent!");
        } else if (score >= 75) {                        
            System.out.println("Grade: B");              // Output this if score is greater than or equal to 75
            System.out.println("Feedback: Good Job!");   // and if score is less than or equal to 89
        } else if (score >= 50) {
            System.out.println("Grade: C");              // Output this if score is greater than or equal to 50
            System.out.println("Feedback: Fair!");       // and if score is less than or equal to 74
        } else {
            System.out.println("Grade: F");              // Output this if score is less than 50
            System.out.println("Feedback: Failed! Try harder next time.");
        }
    }
}

/* 
EXAMPLE OUTPUT: 
Enter your score: 85  
Grade: B  
Feedback: Good job!  

PROGRAM OUTPUT:
Enter your score: 85
Grade: B
Feedback: Good Job!

OTHER PROGRAM OUTPUTS:
Enter your score: 90
Grade: A
Feedback: Excellent!

Enter your score: 89
Grade: B
Feedback: Good Job!

Enter your score: 75
Grade: B
Feedback: Good Job!

Enter your score: 74
Grade: C
Feedback: Fair!

Enter your score: 50
Grade: C
Feedback: Fair!

Enter your score: 49
Grade: F
Feedback: Failed! Try harder next time.
 */

/* Completed within 10 minutes */