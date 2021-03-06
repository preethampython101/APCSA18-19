// ***************************************************************
//   Salary.java
//   Computes the amount of a raise and the new salary for an 
//   employee.  The current salary and a performance rating 
//   (a String: "Excellent", "Good", or "Poor") are input.
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary
{
public static void main (String[] args)
    {
       double currentSalary;  // employee's current  salary
        double raise = 0.0;          // amount of the raise
        double newSalary;      // new salary for the employee
        String rating;         // performance rating
        Scanner scan = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.println("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = sc1.nextLine();

        // Compute the raise using if ...
        if(rating.equals("Excellent")||rating.equals("excellent")){
          raise = currentSalary*0.06;
        }else if(rating.equals("Good")||rating.equals("good")){
          raise = currentSalary*0.04;
        }else if(rating.equals("Poor")||rating.equals("poor")){
          raise = currentSalary*0.015;
        }else{
          System.out.println("You have made a mistake in entering the rating, please try again.");
        }
        newSalary = currentSalary + raise;

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
System.out.println("Current Salary:       " + money.format(currentSalary));
System.out.println("Amount of your raise: " + money.format(raise));
System.out.println("Your new salary:      " + money.format(newSalary));
scan.close();
sc1.close();
    }
}
