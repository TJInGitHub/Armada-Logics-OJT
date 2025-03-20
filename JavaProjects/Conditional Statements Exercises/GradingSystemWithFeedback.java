import java.util.Scanner;                                   
public class GradingSystemWithFeedback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();           // User input for score using int data type

        /* Modified If else statement of example to check the grade for your score and a review 
        if Grade A or Grade F is achieved */
        if (score >= 90) {
            System.out.println("Grade: A");
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
            System.out.println("Try harder");
        }
    }
}

/* 
OUTPUT:
Enter your score: 49
Grade: F
Try harder

Enter your score: 50
Grade: C

Enter your score: 75
Grade: B

Enter your score: 90
Grade: A
Excellent
 */