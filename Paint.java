//***************************************************************
//File: Paint.java
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
import java.lang.Math;
public class Paint
{
    public static void main(String[] args)
    {
        int doors, windows, windowArea, doorArea;
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        int length, width, height;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner sc = new Scanner(System.in);
        //Prompt for and read in the length of the room
        System.out.println("Enter the length of the room. ");
        length = sc.nextInt();
        //Prompt for and read in the width of the room
        System.out.println("Enter the width of the room. ");
        width = sc.nextInt();
        //Prompt for and read in the height of the room
        System.out.println("Enter the height of the room. ");
        height = sc.nextInt();
        System.out.println("Enter the number of doors in the room. ");
        doors = sc.nextInt();
        System.out.println("Enter the number of windows in the room. ");
        windows = sc.nextInt();
        windowArea = windows*15;
        doorArea = doors*20;
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = (2*(height*width)+2*(height*length))-(windowArea+doorArea);             
        //Compute the amount of paint needed
        paintNeeded = totalSqFt/COVERAGE;
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Length is "+length+" units, width is "+width+" units, height is "+height+" units.\nThe area to be painted is "+totalSqFt+" units squared.\nIt needs about "+Math.ceil(paintNeeded)+" gallon(s) of paint.");
        sc.close();
    }
}
