// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Lab6_1
{
    public static void main(String[] args)
    {
  Scanner scan = new Scanner(System.in);
  int salesPeople;
  System.out.println("How many salesmen do you have? ");
  salesPeople = scan.nextInt();
 int[] sales = new int[salesPeople];
 int sum;

 for (int i=0; i<sales.length; i++)
     {
  System.out.print("Enter sales for salesperson " + (i+1) + ": ");
  sales[i] = scan.nextInt();
     }

 System.out.println("\nSalesperson   Sales");
 System.out.println("--------------------");
 sum = 0;
 for (int i=0; i<sales.length; i++)
     {
  System.out.println("     " + (i+1) + "         " + sales[i]);
  sum += sales[i];
     }
 double average = sum/(double) (sales.length);
 System.out.println("\nTotal sales: $" + sum);
 
System.out.println();
 System.out.println("Average sales: $" +((average)));
System.out.println();
 //Find the maximum sale value
 int maxSaleValue = Integer.MIN_VALUE;
 for (int i=0; i<sales.length; i++)
     {
   if(sales[i]>maxSaleValue){
     maxSaleValue = sales[i];
   }
   
 }
 //Find the location of the maximum sale value in array
 int maxSaleGuy = -1;
 for (int i = 0; i<sales.length; i++){
   if(sales[i]==maxSaleValue){
     maxSaleGuy = i;
     //System.out.println(i);
     break;
   }
 }
 System.out.println("Salesperson "+(maxSaleGuy+1)+" had the maximum sales reading $"+maxSaleValue);
 //Find the minimum sale value
 int minSaleValue = Integer.MAX_VALUE;
 for (int i = 0; i<sales.length; i++){
   if(sales[i]<minSaleValue){
     minSaleValue = sales[i];
   }
 }
 //Find index of minimum sale guy
int minSaleGuy = Integer.MAX_VALUE;
for(int i = 0; i<sales.length; i++){
  if(sales[i]==minSaleValue){
    minSaleGuy = i;
    break;
  }
}
System.out.println();
System.out.println("Salesperson "+(minSaleGuy+1)+" had the least sales reading $"+minSaleValue);
int salesTarg;
System.out.println();
System.out.println("Enter the cutoff value ");
salesTarg = scan.nextInt();
int count = 0;
for(int i = 0; i<sales.length; i++){
  if(sales[i]>salesTarg){
    System.out.println("Salesperson "+(i+1)+" exceeded the target with sales $"+sales[i]);
    count++;
  }
}
System.out.println();
System.out.println("A total of "+count+" salesmen exceeded the cutoff value.");
//System.out.println(minSaleValue);
 scan.close();
     }
 
}

