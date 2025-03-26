import java.util.Scanner;   //for user input

/* StudentManagementSystem class template to create StudentManagementSystem objects
(I'll name it as student1...etc) with int StudentNumber, String studentName,
int studentID and float studentGrade */
public class StudentManagementSystem {
    int studentNumber;
    String studentName;
    int studentID;
    float studentGrade;

    /* Constructor to create student objects of the class StudentManagementSystem */
    StudentManagementSystem(int studentNumber, String studentName, int studentID, float studentGrade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGrade = studentGrade;
    }

    /* Static Void Method to display the program instructions */
    public static void programInstructions() {
        System.out.println("\nWelcome to the Student Management System");
        System.out.println("\n1. Add Student  ");
        System.out.println("2. View All Students  ");
        System.out.println("3. Update Student Grade  ");
        System.out.println("4. Exit");
    }

    // main method for creation of student objects of class Student Management System
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;             // int variable choice to store choice value
        int studentCounter = 0;     // int studentCounter to store added student count
        StudentManagementSystem[] studentList = new StudentManagementSystem[1000];

        while (choice != 4){
            StudentManagementSystem.programInstructions();
            System.out.print("\nEnter your choice: ");                   
            choice = scanner.nextInt();   // User input for int variable choice

            if (choice == 1){
                System.out.print("Enter student name: ");      
                // User input for String variable name (adding scanner.next() before the 
                // scanner.nextLine() will prevent it from skipping to nextInt())
                String name = scanner.next() + scanner.nextLine();  
                
                System.out.print("Enter student ID: ");    
                // User input for int variable id               
                int id = scanner.nextInt();   

                System.out.print("Enter student grade: ");     
                // User input for float variable grade              
                float grade = scanner.nextFloat();   

                studentCounter++;   // add 1 to studentCounter

                /* Create student object for class StudentManagementSystem to be stored in studentlist array*/
                studentList[studentCounter - 1] = new StudentManagementSystem(studentCounter, name, id, grade);

                for (int i = 0; i < studentCounter; i++) {
                    System.out.print(studentList[i]);
                }
            }
        }

        

    }
}