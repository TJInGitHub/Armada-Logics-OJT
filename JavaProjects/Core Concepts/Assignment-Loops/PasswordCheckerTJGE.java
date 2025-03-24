import java.util.Scanner;    
public class PasswordCheckerTJGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean correctPassword = false;    // declare a boolean variable correctPassword with a default value
                                            // of false

        /* do while loop to repeatedly prompt the user for a password until correctPassword is equal to true */
        do {
            System.out.print("Enter password: ");                   
            String password = scanner.nextLine();   // User input for password to prompt untils it corrected
            
            /* Switch statement to check if the entered password is the correct password (should be java123) 
            returning true to correctPassword and printing incorrect password if false as default*/
            switch (password) {
                case "java123":
                    correctPassword = true;
                    break;
                default:
                    System.out.println("Incorrect password. Try again.");  
            } 
        } while (correctPassword == false);

        System.out.println("Access granted!");   // Print a string to notify user that the password is correct 
    }
}

/* 
SAMPLE OUTPUT:
Enter password: abc123  
Incorrect password. Try again.  
Enter password: java123  
Access granted!  

PROGRAM OUTPUT:
Enter password: abc123
Incorrect password. Try again.
Enter password: java123
Access granted!

OTHER PROGRAM OUTPUT:
Enter password: java123
Access granted!

Enter password: Armada
Incorrect password. Try again.
Enter password: OJT
Incorrect password. Try again.
Enter password: abc123
Incorrect password. Try again.
Enter password: java123
Access granted!
 */

/* Completed within 1 hour */