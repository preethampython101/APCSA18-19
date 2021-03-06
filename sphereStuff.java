//*****************************************************************************************************************************
// sphereStuff.java                                   Lab2_9
// Preetham                                           9/11/18
// This program helps me learn the usage of the math package and later print the volume and surface area of it.
//*****************************************************************************************************************************
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class sphereStuff{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    float radius;
    System.out.println("Enter the radius");
    radius = sc.nextFloat();
    double surfaceArea = (4* Math.PI * Math.pow(radius, 2));
    double volume = (4* Math.PI * Math.pow(radius, 3)/3);
    DecimalFormat fmt = new DecimalFormat ("0.####");
                    
    System.out.println("The sphere's volume with radius "+radius+" unit(s) is: "+ fmt.format(volume)+" units cubed.");
    System.out.println("The sphere's surface area with radius "+radius+" unit(s) is: "+ fmt.format(surfaceArea)+" units squared.");
                    
 }
}

           