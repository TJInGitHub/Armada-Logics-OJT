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
        salary += salary + (0.01 * percentage);
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

                employeeList[employeeCounter] = new Employee(name, id, salary, department);
                System.out.println("Employee added successfully!");
                employeeCounter++; /* Increase employee count by 1 */

            /* View all employees and their details in the system if choice is equal to 2 */
            } else if (choice == 2){
                /* int variable employee number to indicate the employee's number in the system  */
                int employeeNumber = 0;  
                System.out.println("--- Employee Records ---  ");

                if (employeeCounter == 0) {
                    System.out.println("\n    No employees recorded yet!    ");
                } else {
                    for (Employee employee : employeeList){
                        if (employee != null){
                            employeeNumber++;
                            System.out.println("\nEmployee " + employeeNumber + ":");
                            employee.displayInfo();
                        }
                    }
                }

            } else if (choice == 3){
                System.out.print("Enter employee ID to calculate salary: ");             
                int id = scanner.nextInt();                         // User input for employee id in int

                for (Employee employee : employeeList){
                    if (employee != null){
                        if (employee.employeeID == id){
                            employeeFound = true;
                            System.out.println("Annual Salary of " + employee.name + ": $" + employee.calculateAnnualSalary());
                        } else {
                            employeeFound = false;
                        }
                    }
                }

                if(employeeFound == false) {
                    System.out.println("\n    There are no existing employees with the same ID!    ");
                }

            } else if (choice == 4){
                System.out.print("Enter employee ID to raise salary: ");             
                int id = scanner.nextInt();                         // User input for employee id in int

                for (Employee employee : employeeList){
                    if (employee != null) {
                        if (employee.employeeID == id){
                            employeeFound = true;
                            System.out.print("Enter percentage increase: ");             
                            double percentage = scanner.nextDouble();                 // User input for employee id in int
                            System.out.println("Salary updated successfully! New Salary: $" + employee.raiseSalary(percentage));
                        } else {
                            employeeFound = false;
                        }
                    }
                }
                
                if(employeeFound == false) {
                    System.out.println("\n    There are no existing employees with the same ID!    ");
                }

            } else if (choice == 5){
                break;
            } else {
                System.out.println("Invalid choice. Please try again");
            }
        }
    }
}