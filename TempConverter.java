//***************************************************************************************************
// TempConverter.java                                       Lab2_4
// Preetham                                           9/10/18
// This program helps me learn the operations with float numerbs and converts fahrenheit to celcius. 
//***************************************************************************************************
import java.util.Scanner;
public class TempConverter{
  //-----------------------------
  //Fahrenheit to Celcius
  //-----------------------------
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
      
    System.out.println("What is your temperature in Fahrenheit? ");
    double tempInF = sc.nextDouble();
    double tempInC = (5*(tempInF-32))/9;
    System.out.println(tempInF+ " degrees in Fahrenheit is " + tempInC + " degrees in Celsius.");
  }
}













































































































































