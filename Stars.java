//*************************************************************************************************
// stars.java                                                          Lab3_12
// Preetham                                                            10/31/18
// This program helps me learn how to print sequences.
//*************************************************************************************************
import java.util.Scanner;
public class Stars{
  public static void drawA(){
    final int MAX_ROWS = 11;
    for(int i = 1; i<=MAX_ROWS; i++){
      for(int star = 1; star <= i; star++){
        System.out.print("");
       }
      for(int jam = 1; jam <= (MAX_ROWS-i); jam++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void drawC(){
    final int MAX_ROWS = 11;
    for(int i = 1; i<=MAX_ROWS; i++){
      
      for(int star = 1; star <= i; star++){
        if(star>1){
        System.out.print(" ");
        }
       }
      for(int jam = 1; jam <= (MAX_ROWS); jam++){
        System.out.print("*");
      }
      System.out.println("");
    }
    
    System.out.println();
  }
  
  public static void drawB(){
    //int x;
    final int MAX_ROWS = 10;
    for(int i = 1; i<=(MAX_ROWS); i++){
      for(int x = 1; x<=(MAX_ROWS-i); x++){
        System.out.print(" ");
      }
      System.out.println();
      for(int y = 1; y <= i; y++){
        System.out.print("*");
      }
    }
    System.out.println();
    System.out.println();
    }
  public static void drawD(){
    int star1 = 1;
    int spaceC = 4;
    for(int row = 0; row <5; row++){
      /*if(row<5){//System.out.print(" ");
        System.out.print(" ");}*/
      //else{System.out.print(" ");}
      for(int space = 0; space <spaceC; space++){
        System.out.print(" ");    
      }
      spaceC--;
      for(int star = 0; star < star1; star++){
        System.out.print("*");
    
    }
      star1 += 2;
      System.out.println();
    }
    int stare = 9;
    int spaces = 0;
    
    for(int row = 1; row<=5; row++){
      /*if(row>0){//System.out.print(" ");
      System.out.print(" ");}*/
      for(int space = 0; space < spaces; space++){
        System.out.print(" ");
     }
      spaces++;
      for(int star = 0; star < (stare); star++){
      
        System.out.print("*");
      }
      stare -= 2;
      System.out.println();
    }
  }
  
  
     
 public static void main (String[]args) 
 {
  Scanner scan = new Scanner(System.in);
  String doPattern = "yes";
  System.out.println("Which patterm do you wish to see (a,b,c,or d)?");
  String input = scan.next();
  if(input.equalsIgnoreCase("f")) {
    doPattern = "f";
   }else{
     //input = input;
     doPattern = "yes";
   }
  while(doPattern.equalsIgnoreCase("yes")){
   if(input.equalsIgnoreCase("a")) {
     drawA();
   }else if(input.equalsIgnoreCase("b")) {
     drawB();
   }else if(input.equalsIgnoreCase("c")){
     drawC();
   }else {
     drawD();
   }
   System.out.println("Which pattern do you wish to see (a,b,c,or d)? (Enter q to exit)");
   String playAgain = scan.next();
   if(playAgain.equalsIgnoreCase("q")) {
    doPattern = "q";
   }else{
     input = playAgain;
     doPattern = "yes";
   }
  }
  
  }
 
}
