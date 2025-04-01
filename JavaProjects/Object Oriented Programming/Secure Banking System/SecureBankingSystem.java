import java.util.Scanner;   // module for user input

/* Class for the Bank Account Object template that contains private attributes */
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String[] transactionHistory;
    private double interestRate;

    /* Default Constructor for Bank Account Object */
    BankAccount() {
        this.accountNumber = null;
        this.accountHolder = null;
        this.balance = 0;
        this.transactionHistory = new String[0];  // set a transactionHistory string array that can store 0 histories for the meantime
        this.interestRate = 5;              // default interest rate is 5% which I get from the ex. provided
    }

    /* Parameterized Constructor for Bank Account Object */
    BankAccount(String accountNumber, String accountHolder, double balance, String[] transactionHistory, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
        this.interestRate = interestRate;
    }

    /* Getter method for Bank account number */
    public String getAccountNumber() {
        return accountNumber;
    }

    /* Setter Method for Bank account number */
    public void setAccountNumber(String accountNumber) {
        boolean wrongInput = false; // boolean wrongInput variable for error checking of the inputted account number

        /* if statement that whent the account number does not match any digits from 0 to 9 and is not 10 digits
        long, it will change wrong input to true. The matches keyword is used to check for matches in the 
        account number based on the regex pattern: "\\d" which is any digit from 0 to 9 and "{10}" which refers
        to 10 digits long*/
        if (!accountNumber.matches("\\d{10}")) {
            wrongInput = true;
        }

        /* If statement to notify account number invalidity if wrong input == true and if not, set the account
        number inputted as the Bank account's account number*/
        if (wrongInput) {
            System.out.println("Invalid account number. It should be exactly 10 digits long and contain only numbers.");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    /* Getter method for Bank account holder name */
    public String getAccountHolder() {
        return accountHolder;
    }

    /* Setter Method for Bank account holder name*/
    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            System.out.println("Invalid account holder name. Please provide an account holder name");
        } else {
            this.accountHolder = accountHolder;
        }
    }

    /* Getter method for Bank account balance */
    public double getBalance() {
        return balance;
    }

    /* Setter Method to deposit money in Bank Account */
    public void deposit(double deposit) {
        if (deposit > 0) {
            balance += deposit;
        } else {
            System.out.println("Invalid deposit. It should not be lower than or equal to 0");
        }
    }

    /* Setter Method to withdraw money in Bank Account */
    public void withdraw(double withdraw) {
        if (withdraw > 0 && withdraw <= balance) {
            balance -= withdraw;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    /* Getter method for transaction history of Bank account */
    public String getTransactionHistory() {
        String transactionList = "";                    // empty string to store transaction histories
        /* For each loop to iterate through every transactionHistory elements, storing it in the string*/
        for(String transaction : transactionHistory) {
            transactionList += "- " + transaction + "\n";
        }
        return transactionList;
    }

    /* Setter method for transaction history of Bank account */
    public void setTransactionHistory(String transaction) {
        // Create a new array with +1 extra space to allow the adding of new transaction
        String[] newHistory = new String[transactionHistory.length + 1];

        // Copy existing transactions to the new array through .arraycopy keyword by copying the transactionHistory
        // array to newHistory array starting in array's index 0 for each array, copying all elements based on
        // transactionHistory array's length
        System.arraycopy(transactionHistory, 0, newHistory, 0, transactionHistory.length);

        // Add new transaction at the last index
        newHistory[newHistory.length - 1] = transaction;

        // Update transactionHistory array with the newHistory array afterwards
        transactionHistory = newHistory;
    }

    public double getInterestRate(){
        return interestRate;
    }

    /* Getter Method to calculate the balance plus the interest rate applied annually for the bank account */
    public double interestCalculation() {
        double interest = balance * (interestRate * 0.01);
        double balancewithInterest = balance + interest;
        balance = balancewithInterest;
        return interest;
    }

    /* void method to display the bank account details/attributes using getter methods */
    public void displayInfo(){
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
    }
}

public class SecureBankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;           // int variable choice to store choice value
        int transactionCounter = 0; // int variable transaction counter to store number of transactions done in the system

        System.out.println("\nWelcome to the Secure Banking System");

        /* Create Bank Account Object using default constructor outside the loop to persist data */
        BankAccount account = new BankAccount();

        /* While loop is used to loop in the program, in which it will only exit if the choice is equal to 7 */
        while(choice != 7){
            System.out.println("\n1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");

            System.out.print("\nEnter your choice: ");                   
            choice = scanner.nextInt();   // User input for their choice of action in int

            /* Create Bank account (by setter methods) if choice is equal to 1 */
            if (choice == 1) {
                /* Initialize deposit so it is accessible after the loop */
                double deposit = 0;  

                do {
                    System.out.print("Enter Account Number (10 digits): ");                   
                    String accountNumber = scanner.next() + scanner.nextLine();   // User input for bank account number in string
                    account.setAccountNumber(accountNumber);  // use setter method setAccountNumber to set inputted Bank account's number
                } while (account.getAccountNumber() == null); // Loop until a valid number is entered

                do {
                    System.out.print("Enter Account Holder Name: ");                   
                    String accountHolder = scanner.nextLine();   // User input for bank account holder name in string
                    account.setAccountHolder(accountHolder);   // use setter method setAccountHolder to set inputted Bank account's holder name
                } while (account.getAccountHolder() == null || account.getAccountHolder().isEmpty()); // to loop until account holder name is not null or empty

                do {
                    System.out.print("Enter Initial Deposit: ");                   
                    deposit = scanner.nextDouble();   // User input for bank account initial deposit in double
                    account.deposit(deposit);         // use setter method deposit to set inputted Bank account's initial deposit
                } while (account.getBalance() == 0); // to loop while the Balance is still equal to 0

                // Now deposit is accessible here
                account.setTransactionHistory("Deposit $" + deposit); //set the latest transaction through setter method setTransactionHistory 
                transactionCounter++; //add +1 to transactionCounter

                System.out.print("Account created successfully!\n");

            /* View Account Details if choice is equal to 2 */
            } else if (choice == 2) {
                System.out.println("--- Account Details ---");
                account.displayInfo();      // use getter method to get bank account details

            /* Deposit Money if choice is equal to 3 */
            } else if (choice == 3) {
                System.out.print("Enter deposit amount: ");                   
                double deposit = scanner.nextDouble();   // User input for bank account deposit
                account.deposit(deposit);       // use setter method deposit to set inputted Bank account's deposit

                System.out.println("Deposit successful. New Balance: $" + account.getBalance());                   

                account.setTransactionHistory("Deposit $" + deposit); //set the latest transaction through setter method setTransactionHistory 
                System.out.print("Transaction recorded: Deposit $" + deposit + "\n");

                transactionCounter++; //add +1 to transactionCounter

            /* Withdraw Money if choice is equal to 4 */
            } else if (choice == 4) {
                System.out.print("Enter withdrawal amount: ");                   
                double withdraw = scanner.nextDouble();   // User input for bank account withdrawal

                /* Declare a double variable initialBalance to get the current balance before withdrawal through getter method getBalance()*/
                double initialBalance = account.getBalance();
                account.withdraw(withdraw);               // use setter method withdraw() with the inputted withdrawn amount to change the balance
                
                /* if statement to check if the current balance is less than the initial balance, outputting successful withdrawal if it does and recording the transaction history */
                if (account.getBalance() < initialBalance) {
                    System.out.println("Withdrawal successful. New Balance: $" + account.getBalance());                   
                    account.setTransactionHistory("Withdrawal $" + withdraw); //set the latest transaction through setter method setTransactionHistory 
                    System.out.print("Transaction recorded: Withdrawal $" + withdraw + "\n");
                    transactionCounter++; //add +1 to transactionCounter
                }

            /* Apply Interest if choice is equal to 5 */
            } else if (choice == 5) {
                /* If else statement to apply interest only if balance is greater than 0 */
                if (account.getBalance() > 0) {
                    double interestAmount = account.interestCalculation();
                    account.setTransactionHistory("Interest Applied: $" + interestAmount); 
                    transactionCounter++; //add +1 to transactionCounter    
                    System.out.println("Interest applied. New Balance: $" + account.getBalance() + " (Interest Rate: " + account.getInterestRate() + "% annual)"); 
                } else {
                    System.out.println("Interest cannot be applied to a zero balance.");
                }

            /* View Transaction History if choice is equal to 6 */
            } else if (choice == 6) {
                System.out.println("--- Transaction History ---");
                
                /* If else statement to print transaction history if there are recorded number of transactions based on transactionCounter */
                if (transactionCounter == 0){
                    System.out.println("There are no transaction history.\n");
                } else {
                    System.out.println(account.getTransactionHistory()); // 
                }

            /* Exit if choice is equal to 7 */
            } else if (choice == 7) {
                break;

            /* Output Invalid if choice is not equal to 1, 2, 3, 4, 5, 6 & 7 */
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Exiting program...");
    }
}

/* 
EXAMPLE OUTPUT:
Welcome to the Secure Banking System  

1. Create Account  
2. View Account Details  
3. Deposit Money  
4. Withdraw Money  
5. Apply Interest  
6. View Transaction History  
7. Exit  

Enter your choice: 1  
Enter Account Number (10 digits): 1234567890  
Enter Account Holder Name: John Doe  
Enter Initial Deposit: 5000  
Account created successfully!  

1. Create Account  
2. View Account Details  
3. Deposit Money  
4. Withdraw Money  
5. Apply Interest  
6. View Transaction History  
7. Exit  

Enter your choice: 3  
Enter deposit amount: 2000  
Deposit successful. New Balance: $7000  
Transaction recorded: Deposit $2000

Enter your choice: 4  
Enter withdrawal amount: 8000  
Insufficient funds.

Enter your choice: 5  
Interest applied. New Balance: $7350 (Interest Rate: 5% annual)

Enter your choice: 6  
--- Transaction History ---  
- Deposit $5000  
- Deposit $2000  
- Interest Applied: $350

Enter your choice: 2  
--- Account Details ---  
Account Number: 1234567890  
Account Holder: John Doe  
Balance: $7350  

Enter your choice: 7  
Exiting program...  

MY PROGRAM OUTPUT:
Welcome to the Secure Banking System

1. Create Account
2. View Account Details    
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 1       
Enter Account Number (10 digits): 1234567890
Enter Account Holder Name: John Doe
Enter Initial Deposit: 5000
Account created successfully!

1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 3
Enter deposit amount: 2000
Deposit successful. New Balance: $7000.0
Transaction recorded: Deposit $2000.0

1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 4
Enter withdrawal amount: 8000
Insufficient funds.

1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 5
Interest applied. New Balance: $7350.0 (Interest Rate: 5.0% annual)

1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 6
--- Transaction History ---
- Deposit $5000.0
- Deposit $2000.0
- Interest Applied: $350.0


1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 2
--- Account Details ---
Account Number: 1234567890
Account Holder Name: John Doe
Balance: 7350.0

1. Create Account
2. View Account Details
3. Deposit Money
4. Withdraw Money
5. Apply Interest
6. View Transaction History
7. Exit

Enter your choice: 7
Exiting program...
 */