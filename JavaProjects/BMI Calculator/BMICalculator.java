import java.util.Scanner;                                   
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        float weight = scanner.nextFloat();           // User input for weight in kilograms float data type

        System.out.print("Enter your height (m): ");    
        float height = scanner.nextFloat();           // User input for height in meters float data type

        float BMI = weight / (height * height);    // Formula to calculate BMI which value is changed to
        
        /* Float is used to get an output with fewer decimal places */

        /* Using Ternary operator for classify BMI into health status categories*/
        String healthStatus = (BMI < 18.5) ? "Underweight" : ((BMI >= 18.5) && (BMI < 25)) ? "Normal" : ((BMI >= 25) && (BMI <= 30)) ? "Overweight" : "Obese";

        /* Originally, the provided operation is healthStatus is Underweight if BMI is less than 18.5,  
           healthStatus is Normal if BMI is greater than or equal to 18.5 and if BMI is less than 24.9,
           healthStatus is Overweight if BMI is greater than or equal to 25 and if BMI is less than 29.9,
           and healthStatus is Obese if BMI is greater than or equal to 30 
           
           I made adjustment to the less than part of healthStatus is Normal to compare it to 25 instead of 24.9
           and the less than part of healthStatus is Overweight to compare it to 30 instead of 29.9
           as to allow the BMI value for those under 25 and 30 to not be Obese */
        
        /* Print the BMI and Health Status as BMI Report */
        System.out.println("\n=== BMI Report ===");    
        System.out.println("Your BMI: " + BMI);   
        System.out.println("Health Status: " + healthStatus);
        System.out.println("\n----------------------------");    
    }
}

/* 
SAMPLE OUTPUT:
Enter your weight (kg): 70  
Enter your height (m): 1.75  

=== BMI Report ===  
Your BMI: 22.86  
Health Status: Normal  

----------------------------

Enter your weight (kg): 50  
Enter your height (m): 1.60  

=== BMI Report ===  
Your BMI: 19.53  
Health Status: Normal  

----------------------------

Enter your weight (kg): 90  
Enter your height (m): 1.75  

=== BMI Report ===  
Your BMI: 29.39  
Health Status: Overweight  

----------------------------

Enter your weight (kg): 110  
Enter your height (m): 1.70  

=== BMI Report ===  
Your BMI: 38.06  
Health Status: Obese  


PROGRAM OUTPUT:
Enter your weight (kg): 70
Enter your height (m): 1.75

=== BMI Report ===
Your BMI: 22.857143
Health Status: Normal

----------------------------

Enter your weight (kg): 50
Enter your height (m): 1.60

=== BMI Report ===
Your BMI: 19.531248
Health Status: Normal

----------------------------

Enter your weight (kg): 90
Enter your height (m): 1.75

=== BMI Report ===
Your BMI: 29.387754
Health Status: Overweight

----------------------------

Enter your weight (kg): 110
Enter your height (m): 1.70

=== BMI Report ===
Your BMI: 38.062283
Health Status: Obese

----------------------------

Results is almost the same with the SAMPLE OUTPUT, aside from the fact that the SAMPLE OUTPUT is rounded-off
to display only 2 decimal places.
 */