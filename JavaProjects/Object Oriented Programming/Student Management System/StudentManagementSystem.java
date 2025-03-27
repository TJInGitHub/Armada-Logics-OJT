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
        System.out.println("\n1. Add Student  ");
        System.out.println("2. View All Students  ");
        System.out.println("3. Update Student Grade  ");
        System.out.println("4. Exit");
    }

    /* Static Void Method to display Invalid choice input */
    public static void invalidChoice() {
        System.out.println("Invalid choice. Please try again");
    }

    /* Static Void Method to display Exiting program...   */
    public static void exitProgram() {
        System.out.println("Exiting program...");
    }

    /* Static Void Method to display notification about empty student records   */
    public static void noRecords() {
        System.out.println("\n    No records of students have been made!   ");
    }

    /* Static Void Method to display notification if no existing students is found through the inputted id for update   */
    public static void unexistingStudent() {
        System.out.println("\n    There are no existing students with the same ID!   ");
    }

    /* Instance Void Method to display all student objects of class Student Management System and their details*/
    public void studentRecords() {
        System.out.println("\nStudent " + studentNumber + ":");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentID);
        System.out.println("Grade: " + studentGrade);
    }

    // main method for creation of student objects of class Student Management System
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;             // int variable choice to store choice value
        int studentCounter = 0;     // int studentCounter to store added student count
        /* Object Array named studentList that can store 1000 student objects as its elements
        for class Student Management System */
        StudentManagementSystem[] studentList = new StudentManagementSystem[1000];

        System.out.println("\nWelcome to the Student Management System");

        while (choice != 4){
            StudentManagementSystem.programInstructions();
            System.out.print("\nEnter your choice: ");                   
            choice = scanner.nextInt();   // User input for int variable choice

            /* create an student object for class Student Management System if choice == 1 */
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

                System.out.println("Student added successfully!");

            /* view all student objects for class Student Management System if choice == 2 */
            } else if (choice == 2){
                System.out.println("--- Student Records ---");
                System.out.println("School: Greenwood High School");

                /* If there are no students recorded based on counter, notify the user through method noRecords */
                if (studentCounter == 0) {
                    StudentManagementSystem.noRecords();
                /* else if counter != 0, display all student objects and their details through a for each loop of
                studentList array. An if statement is used to only display student objects if they are not null in
                the studentList array, because it can hold 1000 objects as its elements but if the objects are yet
                to be created, it will return null causing errors. */
                } else {
                    for (StudentManagementSystem student : studentList){
                        if (student != null){
                            student.studentRecords();
                        }
                    }
                }

            /* update a student object for class Student Management System if choice == 3 */
            } else if (choice == 3){
                System.out.print("Enter student ID to update: ");    
                // another User input for int variable id to be used to find the student object to update              
                int id = scanner.nextInt();   

                boolean studentFound = false; // declare boolean variable studentFound to false as default

                /* For loop for checking student objects with the same ID in the studentList Array. An if statement
                was then used to check only those in the array that is not null. Inside this, an if-else statement
                was declared to allow the user to update the student grade once the id inputted is verified to be
                similar to what is stored in the system while also changing the studentFound value to true and if
                not found, studentfound value will be/or still be false*/
                for (StudentManagementSystem student : studentList){
                    if (student != null){
                        if (student.studentID == id) {
                            studentFound = true;   
                            System.out.print("Enter new grade: ");     
                            student.studentGrade = scanner.nextFloat();  
                            System.out.println("Grade updated successfully!"); 
                        } else {
                            studentFound = false;
                        }
                    }
                }

                /* Notify the user if the id inputted doesn't find an existing student with the same ID through
                an if statement that will output it if the value of studentFound is equal to false. */
                if (studentFound == false) {
                    StudentManagementSystem.unexistingStudent();
                }

            /* break the loop to exit the system if choice == 4 */
            } else if (choice == 4) {
                break;

            /* if choice is not equal to 1, 2, 3 and 4, print an invalid choice through static void method */
            } else {
                StudentManagementSystem.invalidChoice();
            }
        }
        StudentManagementSystem.exitProgram();
    }
}

/* 
EXPECTED OUTPUT:
Welcome to the Student Management System  

1. Add Student  
2. View All Students  
3. Update Student Grade  
4. Exit  

Enter your choice: 1  
Enter student name: Alice Johnson  
Enter student ID: 101  
Enter student grade: 92.5  
Student added successfully!  

1. Add Student  
2. View All Students  
3. Update Student Grade  
4. Exit  

Enter your choice: 2  
--- Student Records ---  
School: Greenwood High School  

Student 1:  
Name: Alice Johnson  
ID: 101  
Grade: 92.5  

1. Add Student  
2. View All Students  
3. Update Student Grade  
4. Exit  

Enter your choice: 3  
Enter student ID to update: 101  
Enter new grade: 95.0  
Grade updated successfully!  

1. Add Student  
2. View All Students  
3. Update Student Grade  
4. Exit  

Enter your choice: 4  
Exiting program...  

PROGRAM OUTPUT:
Welcome to the Student Management System

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 1
Enter student name: Alice Johnson
Enter student ID: 101
Enter student grade: 92.5
Student added successfully!

1. Add Student  
2. View All Students       
3. Update Student Grade    
4. Exit

Enter your choice: 2       
--- Student Records ---      
School: Greenwood High School

Student 1:
Name: Alice Johnson
ID: 101
Grade: 92.5

1. Add Student  
2. View All Students     
3. Update Student Grade  
4. Exit

Enter your choice: 3     
Enter student ID to update: 101
Enter new grade: 95.0
Grade updated successfully!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 4
Exiting program...

OTHER OUTPUT:
Welcome to the Student Management System

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 2
--- Student Records ---
School: Greenwood High School

    No records of students have been made!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 3
Enter student ID to update: 1

    There are no existing students with the same ID!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 1
Enter student name: Gusion Paxley
Enter student ID: 101
Enter student grade: 75.2
Student added successfully!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 1
Enter student name: Guinevere Baroque
Enter student ID: 102
Enter student grade: 100.0
Student added successfully!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 1
Enter student name: Harley Vance
Enter student ID: 103
Enter student grade: 89.25
Student added successfully!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 2
--- Student Records ---
School: Greenwood High School

Student 1:
Name: Gusion Paxley
ID: 101
Grade: 75.2

Student 2:
Name: Guinevere Baroque
ID: 102
Grade: 100.0

Student 3:
Name: Harley Vance
ID: 103
Grade: 89.25

1. Add Student
2. View All Students
3. Update Student Grade  
4. Exit

Enter your choice: 3
Enter student ID to update: 1

    There are no existing students with the same ID!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 3
Enter student ID to update: 103
Enter new grade: 90.0
Grade updated successfully!

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 2
--- Student Records ---
School: Greenwood High School

Student 1:
Name: Gusion Paxley
ID: 101
Grade: 75.2

Student 2:
Name: Guinevere Baroque
ID: 102
Grade: 100.0

Student 3:
Name: Harley Vance
ID: 103
Grade: 90.0

1. Add Student
2. View All Students
3. Update Student Grade
4. Exit

Enter your choice: 4
Exiting program...

 */