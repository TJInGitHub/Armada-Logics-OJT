import java.util.Scanner;    
public class StudentGradesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");                   
        int no_ofStudents = scanner.nextInt();   // User input for int variable no_ofStudents

        /* empty array that can store a number of elements based on no_ofStudents value named studentGrades */
        int[] studentGrades = new int[no_ofStudents];  

        /* for loop to store each student grades in the array based on array index with a default value of 0 */
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");                   
            studentGrades[i] = scanner.nextInt();   
        }

        /* Heading to indicate Grade Analysis. Below these are the total grades, average grade, highest grade
        and lowest grade outputs */
        System.out.println("\n=== Grade Analysis ===");

        /* To get Total sum of grades */
        int totalGrades = 0;    // declare an int variable named totalGrades that will be called to store the 
                                // sum of grades with a default value of 0

        /* To get Highest grade */
        /* declare an int variable named highestGrade to store the highest grade with a default value of 0 */
        int highestGrade = 0;  

        /* To get Lowest grade */
        /* declare an int variable named lowestGrade to store the lowest grade with a default value of 100
        (max grade of students when it comes to grading systems in schools) */
        int lowestGrade = 100;  

        /* for each loop to add every grades in studentGrades to totalGrades, getting the total sum of grades,
        there are also if statements that will store the studentGrade in the highestGrade and the lowestGrade
        if it is greater than the current value of highestGrade and if it is less than the current value of 
        lowestGrade */
        for (int studentGrade : studentGrades){
            totalGrades += studentGrade;

            if (studentGrade > highestGrade){
                highestGrade = studentGrade;
            }

            if (studentGrade < lowestGrade) {
                lowestGrade = studentGrade;
            }
        }

        /* To get Average Grade */
        /* declare float variable averageGrade which value is the quotient of totalGrades over no_ofStudents
        to get the Average Grade. This is declared after the loop as it will result to 0 instead if it's 
        declared before the loop*/
        float averageGrade = (float) totalGrades / no_ofStudents;  
                                                        
        /* Print the output for totalGrades, averageGrade, highestGrade and lowestGrade */
        System.out.println("Total Grades: " + totalGrades);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
    }
}

/* 
SAMPLE OUTPUT:
Enter the number of students: 5  
Enter grade for student 1: 85  
Enter grade for student 2: 90  
Enter grade for student 3: 78  
Enter grade for student 4: 88  
Enter grade for student 5: 92  

=== Grade Analysis ===  
Total Grades: 433  
Average Grade: 86.60  
Highest Grade: 92  
Lowest Grade: 78  


PROGRAM OUTPUT:
Enter grade for student 1: 85
Enter grade for student 2: 90
Enter grade for student 3: 78
Enter grade for student 4: 88
Enter grade for student 5: 92

=== Grade Analysis ===
Total Grades: 433
Average Grade: 86.6
Highest Grade: 92
Lowest Grade: 78

OTHER PROGRAM OUTPUT:
Enter the number of students: 8
Enter grade for student 1: 85
Enter grade for student 2: 90
Enter grade for student 3: 78
Enter grade for student 4: 92
Enter grade for student 5: 88
Enter grade for student 6: 76
Enter grade for student 7: 95
Enter grade for student 8: 89

=== Grade Analysis ===
Total Grades: 693
Average Grade: 86.625
Highest Grade: 95
Lowest Grade: 76


Enter the number of students: 15
Enter grade for student 1: 85
Enter grade for student 2: 90
Enter grade for student 3: 78
Enter grade for student 4: 92
Enter grade for student 5: 88
Enter grade for student 6: 76
Enter grade for student 7: 95
Enter grade for student 8: 89
Enter grade for student 9: 81
Enter grade for student 10: 87
Enter grade for student 11: 93
Enter grade for student 12: 79
Enter grade for student 13: 84
Enter grade for student 14: 91
Enter grade for student 15: 86

=== Grade Analysis ===
Total Grades: 1294
Average Grade: 86.26667
Highest Grade: 95
Lowest Grade: 76

 */

/* Completed within 1 hour */