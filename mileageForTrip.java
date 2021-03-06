//*************************************************************************************************
// mileageForTrip.java                                                 Lab2_11
// Preetham                                                            9/11/18
// This program helps me learn the usage of the math package and prints the mileage.
//*************************************************************************************************

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class mileageForTrip{
  public static void main(String[]args){
    //----------------------------------
    // Prints the mileage of a trip
    //----------------------------------
    Scanner sc = new Scanner(System.in);
    float gasConsumed;
    System.out.println("Enter the gallons of gas consumed. ");
    gasConsumed = sc.nextFloat();
    int startPoint;
    System.out.println("What was the initial distance reading on the Odometer? ");
    startPoint = sc.nextInt(); 
    int endPoint;
    System.out.println("What was the final distance reading on the Odometer? ");
    endPoint = sc.nextInt();
    int distance = Math.abs(endPoint-startPoint);
    double mileage = (distance/gasConsumed);
    System.out.println("Your mileage is "+mileage+" miles per gallon.");
  }
}
