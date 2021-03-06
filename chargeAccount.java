// ***************************************************************
//   chargeAccount.java
//   It helps me learn the usage of the number format class and 
//   calculate interest based on inputs.
// ***************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class chargeAccount{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    double prevBalance, interest, addCharges, interestRate = 0.0, minimumPayment = 0.0, newBalance;
    System.out.println("Enter your previous balance from last month. ");
    prevBalance = sc.nextDouble();
    System.out.println("Enter the total amount of additional charges form last month. ");
    addCharges = sc.nextDouble();
    //System.out.println(addCharges+", "+prevBalance); 
    double totalAmt = (prevBalance+addCharges);
    
    if(totalAmt==0){
      interestRate = 0;
    }else if(totalAmt>0){
      interestRate =0.02;
    }
    interest = interestRate*totalAmt;
    newBalance = totalAmt + (interestRate*totalAmt);
    //System.out.println(newBalance);
    if(newBalance<50){
      minimumPayment=newBalance;
    }else if((newBalance>=50)&&(newBalance<=300)){
      minimumPayment=50;
    }else if((newBalance>300)){
      minimumPayment = (0.2 * newBalance);
    }else{
    
    }
    NumberFormat money = NumberFormat.getCurrencyInstance();
    System.out.println();
    System.out.println("CS CARD International Statemtent");
    System.out.println("================================");
    System.out.println();
    System.out.println("Previous Balance: "+money.format(prevBalance));
    System.out.println("Additional Charges: "+money.format(addCharges));
    System.out.println("Interest: "+money.format(interest));
    System.out.println();
    System.out.println("New Balance: "+money.format(newBalance));
    System.out.println();
    System.out.println("Minimum Payment: "+money.format(minimumPayment));
    
    
    sc.close();
  }
}

