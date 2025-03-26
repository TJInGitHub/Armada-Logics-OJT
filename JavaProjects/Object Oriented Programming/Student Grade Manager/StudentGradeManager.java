import java.util.Scanner;    //for user input

/* StudentGradeManager class template to create Student Grade Manager objects  
with String studentName and int studentGrades in array*/
public class StudentGradeManager {
    String studentName;
    int[] studentGrades;

    /* Overloaded Constructor to create StudentGradeManager objects with provided student name and 3 grades*/
    StudentGradeManager(String studentName, int grade1, int grade2, int grade3) {
        this.studentName = studentName;
        studentGrades = new int[]{grade1, grade2, grade3};
    }

    /* Overloaded Constructor to create StudentGradeManager objects with provided student name and 4 grades*/
    StudentGradeManager(String studentName, int grade1, int grade2, int grade3, int grade4) {
        this.studentName = studentName;
        studentGrades = new int[]{grade1, grade2, grade3, grade4};
    }

    /* Static Method to verify if student is overloading or not (I only added this to show static method usage) */
    public static String studentStatus(String answer){
        /* Switch statement to return "Overloading" is the answer is "Yes" or "yes", return "Regular"
        if the answer is "No" or "no" and return "Invalid if the answer is none of the above choices*/
        switch(answer){
            case "Yes":
                return "Overloading";
            case "yes":
                return "Overloading";
            case "No":
                return "Regular";
            case "no":
                return "Regular";
            default:
                return "Invalid";
        }
    }

    // Instance Method to calculate Grade Average
    public float gradeAverage(){
        float sum = 0;
        /* for loop to get the total sum of grades in studentGrades array using +=*/
        for (int i = 0; i < studentGrades.length; i++){
            sum += studentGrades[i];
        }
        // divide sum by studentGrades.length to get average
        return (sum / studentGrades.length);    
    }

    // Instance Method to get Grade classification
    public String gradeClassification(float average){
        /* if-else-if statement to get grade classification based on the value of average */
        if (average >= 90 && average <= 100){      // output this if grade is 90-100
            return "Excellent";
       } else if (average >= 80 && average <= 89){ // output this if grade is 80-89
            return "Good";
       } else if (average >= 70 && average <= 79){ // output this if grade is 70-79
            return "Average";
       } else {                                    // output this if grade is below 70
            return "Needs Improvement";
       }
    }

    // Instance Void Method to display the StudentGradeManager objects Student details which include student name and student grades array
    public void studentDetails() {
        System.out.println("Student: " + studentName);

        System.out.print("Grade: ");
        /* For loop to print student grades array content with if else statement to add
        comma when it's not the last element */
        for (int i = 0; i < studentGrades.length; i++){
            if (i < (studentGrades.length - 1)) {
                System.out.print(studentGrades[i] + ", ");
            } else {
                System.out.print(studentGrades[i]);
            }
        }
    } 

    // main method for creation of StudentGradeManager objects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");                   
        String name = scanner.nextLine();   // User input for string variable name

        System.out.print("Does the student takes overload subject (Type 'Yes' or 'No'): ");                   
        String answer = scanner.nextLine();   // User input for string variable answer
        String status = StudentGradeManager.studentStatus(answer); // string status variable to indicate if student is regular or overloading
       
        /* if-else statements to adjust number of grade inputs if student is overloading or not */
        /* Allow 3 grade inputs if student status is "Regular" and create the StudentGradeManager object
        displaying student details, grade average and classification */
        if (status == "Regular") {
            System.out.print("Enter 3 grades: ");                   
            int grade1 = scanner.nextInt();  
            int grade2 = scanner.nextInt();   
            int grade3 = scanner.nextInt();   
            StudentGradeManager student = new StudentGradeManager(name, grade1, grade2, grade3);   
            student.studentDetails();
            float averageGrade = student.gradeAverage();    
            String classification = student.gradeClassification(averageGrade);
            System.out.println("\nAverage: " + averageGrade);   
            System.out.println("Classification: " + classification);   

        /* Allow 4 grade inputs if student status is "Overloading" and create the StudentGradeManager object, 
        displaying student details, grade average and classification */    
        } else if (status == "Overloading") {
            System.out.print("Enter 4 grades: ");                   
            int grade1 = scanner.nextInt();   
            int grade2 = scanner.nextInt();   
            int grade3 = scanner.nextInt();   
            int grade4 = scanner.nextInt();   
            StudentGradeManager student = new StudentGradeManager(name, grade1, grade2, grade3, grade4);
            student.studentDetails();
            float averageGrade = student.gradeAverage();    
            String classification = student.gradeClassification(averageGrade);
            System.out.println("\nAverage: " + averageGrade);   
            System.out.println("Classification: " + classification);   

        /* Print invalid answer as
         output if student status is Invalid  */
        } else if (status == "Invalid") {
            System.out.println("Invalid answer");
        }
    }
}

/* 
Expected Output (without overload):
Enter student name: Alice  
Enter 3 grades: 85 90 88  
Student: Alice  
Grades: 85, 90, 88  
Average: 87.67  
Classification: Good  


Expected Output (with overload):
Enter student name: Bob  
Enter 4 grades: 78 82 79 85  
Student: Bob  
Grades: 78, 82, 79, 85  
Average: 81.0  
Classification: Good  


Program Output (without overload):
Enter student name: Alice
Does the student takes overload subject (Type 'Yes' or 'No'): No
Enter 3 grades: 85 90 88
Student: Alice
Grade: 85, 90, 88
Average: 87.666664
Classification: Good


Program Output (with overload):
Enter student name: Bob
Does the student takes overload subject (Type 'Yes' or 'No'): Yes
Enter 4 grades: 78 82 79 85
Student: Bob
Grade: 78, 82, 79, 85
Average: 81.0
Classification: Good


Other Program Output:
Enter student name: Rick
Does the student takes overload subject (Type 'Yes' or 'No'): 1
Invalid answer

Enter student name: Aliyah
Does the student takes overload subject (Type 'Yes' or 'No'): No
Enter 3 grades: 100 95 96
Student: Aliyah
Grade: 100, 95, 96
Average: 97.0
Classification: Excellent

Enter student name: Totoy
Does the student takes overload subject (Type 'Yes' or 'No'): Yes
Enter 4 grades: 50 60 70 35
Student: Totoy
Grade: 50, 60, 70, 35
Average: 53.75
Classification: Needs Improvement

Enter student name: Tim
Does the student takes overload subject (Type 'Yes' or 'No'): No
Enter 3 grades: 87 82 85
Student: Tim
Grade: 87, 82, 85
Average: 84.666664
Classification: Good

Enter student name: Pete
Does the student takes overload subject (Type 'Yes' or 'No'): Yes
Enter 4 grades: 79 71 75 77
Student: Pete
Grade: 79, 71, 75, 77
Average: 75.5
Classification: Average
*/