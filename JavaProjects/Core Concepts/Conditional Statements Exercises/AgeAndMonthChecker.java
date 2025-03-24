import java.util.Scanner;                                   
public class AgeAndMonthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();           // User input for age using int data type

        System.out.print("Enter your birth month number: ");
        int monthNumber = scanner.nextInt();           // User input for birth month number using int data type

        /* if else statement to determine in what stage of development you are  based on your age*/
        if (age < 13){
            System.out.println("You are a child.");
        } else if ((age >= 13) && (age <= 19)) {
            System.out.println("You are a teenager.");
        } else if ((age >= 20) && (age <= 59)) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        /* Switch statement to check what month is your birth month number provided */
        switch (monthNumber) {
            case 1:
                System.out.println("Your birth month is January");
                break;
            case 2:
                System.out.println("Your birth month is February");
                break;
            case 3:
                System.out.println("Your birth month is March");
                break;
            case 4:
                System.out.println("Your birth month is April");
                break;
            case 5:
                System.out.println("Your birth month is May");
                break;
            case 6:
                System.out.println("Your birth month is June");
                break;
            case 7:
                System.out.println("Your birth month is July");
                break;
            case 8:
                System.out.println("Your birth month is August");
                break;
            case 9:
                System.out.println("Your birth month is September");
                break;
            case 10:
                System.out.println("Your birth month is October");
                break;
            case 11:
                System.out.println("Your birth month is November");
                break;
            case 12:
                System.out.println("Your birth month is December");
                break;
            default:
                System.out.println("Invalid month.");
        }
    }
}

/* 
OUTPUT:
Enter your age: 12
Enter your birth month number: 1
You are a child.
Your birth month is January

Enter your age: 13
Enter your birth month number: 2
You are a teenager.
Your birth month is February

Enter your age: 20
Enter your birth month number: 3
You are an adult.
Your birth month is March

Enter your age: 59
Enter your birth month number: 4
You are an adult.
Your birth month is April

Enter your age: 60
Enter your birth month number: 5
You are a senior citizen.
Your birth month is May

 */