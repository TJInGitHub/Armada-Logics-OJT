import java.util.Scanner;   // module for user input

/* create a class named Employee as a template for Employee objects */
class Employee {
    String name;
    int employeeID;
    double salary;
    String department;


    /* Having a default constructor and parameterized constructor applies overloading */
    /* default Employee objects constructor */
    Employee() {
        this.name = "Test Name";
        this.employeeID = 9999;
        this.salary = 0;
        this.department = "Default";
    }

    /* Parameterized Employee objects constructor based on the class attributes provided*/
    Employee(String name, int employeeID, double salary, String department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    /* Instance void method to display employee details based on the class attributes */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    /* Instance method to calculate annual salary and return it as double*/
    public double calculateAnnualSalary() {
        return salary * 12;
    } 

    public double raiseSalary(double percentage) {
        salary += salary * (0.01 * percentage);
        return salary;
    }
}

public class EmployeePayrollManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;           // int variable choice to store choice value
        /* int variable employeeCounter to keep track of number of employees in the system */
        int employeeCounter = 0;  
        /* boolean employeeFound variable will be used for error handling in choice 3 and 4 */
        boolean employeeFound = false; 
        /* array employeeList that can store 1000 Employee objects */
        Employee[] employeeList = new Employee[1000];

        System.out.println("\nWelcome to the Employee Payroll Management System");

        /* While loop is used to loop in the program, in which it will only exit if the choice is equal to 5 */
        while(choice != 5){
            System.out.println("\n1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Calculate Annual Salary");
            System.out.println("4. Give Salary Raise  ");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");                   
            choice = scanner.nextInt();   // User input for their choice of action in int

            /* Add an employee to the system if choice is equal to 1 */
            if (choice == 1){
                System.out.print("Enter employee name: ");                   
                String name = scanner.next() + scanner.nextLine();   // User input for employee name in string

                System.out.print("Enter employee ID: ");             
                int id = scanner.nextInt();                         // User input for employee id in int

                System.out.print("Enter employee salary: ");             
                double salary = scanner.nextDouble();               // User input for employee salary in double

                System.out.print("Enter department: ");                   
                String department = scanner.next() + scanner.nextLine();   // User input for employee's department in string

                /* Create the employee object to be stored in employeeList array using name, id, salary and department inputs */
                employeeList[employeeCounter] = new Employee(name, id, salary, department);
                System.out.println("Employee added successfully!");
                employeeCounter++; /* Increase employee count by 1 */

            /* View all employees and their details in the system if choice is equal to 2 */
            } else if (choice == 2){
                /* int variable employee number to indicate the employee's number in the system  */
                int employeeNumber = 0;  
                System.out.println("--- Employee Records ---  ");

                /* if there are no employees, this if statement will notify the user about it */
                if (employeeCounter == 0) {
                    System.out.println("\n    No employees recorded yet!    ");
                /* if there are employees, the else statement have a for each loop to loop in the employeeList
                array through Employee objects 1 by 1. Inside this, there is an if statement that will increase
                the employee number and print the employee and their details if the employee object is not null
                in value (as declaring the size of the array will make the objects that have yet to be created 
                in it to be null)*/
                } else {
                    for (Employee employee : employeeList){
                        if (employee != null){
                            employeeNumber++;
                            System.out.println("\nEmployee " + employeeNumber + ":");
                            employee.displayInfo();
                        }
                    }
                }

            /* Calculate the annual salary of an employee in the system if choice is equal to 3 */
            } else if (choice == 3){
                System.out.print("Enter employee ID to calculate salary: ");             
                /* User input for employee id in int to be used for finding an Employee object with similar id */
                int id = scanner.nextInt();    

                /* redeclare employee found is equal to false to ensure that it will return false if the same 
                choice will be picked again during the while loops*/
                employeeFound = false; 

                /* For each loop again to loop to employeeList array's Employee objects. An if statement inside
                is declared to not provide the output if an Employee objects value is null and the inputted id
                is not equal to an Employee object's id, but if both is satisfied, it will make employeeFound value
                into true and print the annual salary of the said employee object with the help of 
                calculateAnnualSalary instance method. */
                for (Employee employee : employeeList){
                    if (employee != null && employee.employeeID == id){
                        employeeFound = true;
                        System.out.println("Annual Salary of " + employee.name + ": $" + employee.calculateAnnualSalary());
                    }
                }

                /* If the employee is not found during the loop, indicated by having the employeeFOund value
                equals to false, it will print a notification that there are no existing employees with the same id */
                if(employeeFound == false) {
                    System.out.println("\n    There are no existing employees with the same ID!    ");
                }
            
            /* Raise the salary of an employee in the system if choice is equal to 4 */
            } else if (choice == 4){
                System.out.print("Enter employee ID to raise salary: ");       
                /* Another user input for employee id in int, which will be used to verify the Employee object
                that will have its salary raised */      
                int id = scanner.nextInt();    

                /* redeclare employee found is equal to false to ensure that it will return false if the same 
                choice will be picked again during the while loops*/
                employeeFound = false; 

                /* The same for each loop to loop through the employeeList Array's Employee objects. It also 
                have the same if statement to only output the next if statement if the Employee object is
                not null and the inputted id is equal to an Employee object's id. The only difference is it will 
                prompt the user to enter the percentage increase and print the updated salary of an 
                Employee object through the help of raiseSalary instance method that accepts the 
                percentage inputted to be used in the calculation of the new salary when both the conditions are
                satisfied */
                for (Employee employee : employeeList){
                    if (employee != null && employee.employeeID == id){
                        employeeFound = true;
                        System.out.print("Enter percentage increase: ");             
                        double percentage = scanner.nextDouble();                 // User input for employee id in int
                        System.out.println("Salary updated successfully! New Salary: $" + employee.raiseSalary(percentage));
                    } 
                }
                
                /* A same if statement will notify the user that there are no existing employees with the
                same id if the loop didn't find a similar employee id based on employeeFound value of false */
                if(employeeFound == false) {
                    System.out.println("\n    There are no existing employees with the same ID!    ");
                }
            
            /* Break the if-else-if statement loop if choice value equals to 5, in order to escape the while
            loop too */
            } else if (choice == 5){
                break;
            
            /* If the choice doesn't equal to 1, 2, 3, 4 and 5, it will notify that the choice is invalid through
            this else statement */
            } else {
                System.out.println("Invalid choice. Please try again");
            }
        }
        /* After the while loop ended when the choice is equal to 5, print a notification to user that
        the user is now exiting the program */
        System.out.println("Exiting program...");
    }
}

/* 
SAMPLE OUTPUT:
Welcome to the Employee Payroll Management System  

1. Add Employee  
2. View All Employees  
3. Calculate Annual Salary  
4. Give Salary Raise  
5. Exit  

Enter your choice: 1  
Enter employee name: John Doe  
Enter employee ID: 2021  
Enter employee salary: 5000  
Enter department: IT  
Employee added successfully!  

1. Add Employee  
2. View All Employees  
3. Calculate Annual Salary  
4. Give Salary Raise  
5. Exit  

Enter your choice: 2  
--- Employee Records ---  

Employee 1:  
Name: John Doe  
ID: 2021  
Salary: $5000.00  
Department: IT  

1. Add Employee  
2. View All Employees  
3. Calculate Annual Salary  
4. Give Salary Raise  
5. Exit  

Enter your choice: 3  
Enter employee ID to calculate salary: 2021  
Annual Salary of John Doe: $60000.00  

1. Add Employee  
2. View All Employees  
3. Calculate Annual Salary  
4. Give Salary Raise  
5. Exit  

Enter your choice: 4  
Enter employee ID to raise salary: 2021  
Enter percentage increase: 10  
Salary updated successfully! New Salary: $5500.00  

1. Add Employee  
2. View All Employees  
3. Calculate Annual Salary  
4. Give Salary Raise  
5. Exit  

Enter your choice: 5  
Exiting program...  

PROGRAM OUTPUT:
Welcome to the Employee Payroll Management System

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 1
Enter employee name: John Doe
Enter employee ID: 2021
Enter employee salary: 5000
Enter department: IT
Employee added successfully!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 2
--- Employee Records ---  

Employee 1:
Name: John Doe
ID: 2021
Salary: $5000.0
Department: IT

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 3
Enter employee ID to calculate salary: 2021
Annual Salary of John Doe: $60000.0

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise  
5. Exit

Enter your choice: 4
Enter employee ID to raise salary: 2021
Enter percentage increase: 10
Salary updated successfully! New Salary: $5500.0

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise  
5. Exit

Enter your choice: 5
Exiting program...

OTHER OUTPUT:
Welcome to the Employee Payroll Management System

1. Add Employee
2. View All Employees     
3. Calculate Annual Salary
4. Give Salary Raise      
5. Exit

Enter your choice: 2      
--- Employee Records ---

    No employees recorded yet!    

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 3
Enter employee ID to calculate salary: 1

    There are no existing employees with the same ID!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 4
Enter employee ID to raise salary: 1

    There are no existing employees with the same ID!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 1
Enter employee name: Jane Doe
Enter employee ID: 2020
Enter employee salary: 100000
Enter department: Special Force
Employee added successfully!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 1
Enter employee name: Purist Thunderwrath
Enter employee ID: 2021
Enter employee salary: 85000
Enter department: Paladin
Employee added successfully!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 1
Enter employee name: Kira Yamato
Enter employee ID: 2022
Enter employee salary: 100000
Enter department: MS Pilot
Employee added successfully!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 2
--- Employee Records ---  

Employee 1:
Name: Jane Doe
ID: 2020
Salary: $100000.0
Department: Special Force

Employee 2:
Name: Purist Thunderwrath
ID: 2021
Salary: $85000.0
Department: Paladin

Employee 3:
Name: Kira Yamato
ID: 2022
Salary: $100000.0
Department: MS Pilot

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 3
Enter employee ID to calculate salary: 1

    There are no existing employees with the same ID!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 4
Enter employee ID to raise salary: 1

    There are no existing employees with the same ID!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 3
Enter employee ID to calculate salary: 2022
Annual Salary of Kira Yamato: $1200000.0

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 4
Enter employee ID to raise salary: 10

    There are no existing employees with the same ID!

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 4
Enter employee ID to raise salary: 2022
Enter percentage increase: 10
Salary updated successfully! New Salary: $110000.0

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 2
--- Employee Records ---  

Employee 1:
Name: Jane Doe
ID: 2020
Salary: $100000.0
Department: Special Force

Employee 2:
Name: Purist Thunderwrath
ID: 2021
Salary: $85000.0
Department: Paladin

Employee 3:
Name: Kira Yamato
ID: 2022
Salary: $110000.0
Department: MS Pilot

1. Add Employee
2. View All Employees
3. Calculate Annual Salary
4. Give Salary Raise
5. Exit

Enter your choice: 5 
Exiting program...
 */