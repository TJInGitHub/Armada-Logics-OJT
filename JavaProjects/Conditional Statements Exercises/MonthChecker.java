import java.util.Scanner;                                   
public class MonthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number: ");
        int monthNumber = scanner.nextInt();           // User input for month number using int data type

        /* Switch statement to check what month is the month number provided */
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
        }
    }
}

/* 
OUTPUT:
Enter a month number: 1
January

Enter a month number: 2
February

Enter a month number: 3
March

Enter a month number: 4
April

Enter a month number: 5
May

Enter a month number: 6
June

Enter a month number: 7
July

Enter a month number: 8
August

Enter a month number: 9
September

Enter a month number: 10
October

Enter a month number: 11
November

Enter a month number: 12
December

Enter a month number: 13
Invalid month.
 */