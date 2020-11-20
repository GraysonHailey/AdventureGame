
/**
 * Write a description of class MADLIBS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import java.util.Scanner;  // Import the Scanner class
class MADLIBS
{
  public static void main(String[] args) 
  { 
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    
    Scanner mySofa = new Scanner(System.in);
    String sofaFillin;
    
   System.out.print(userName);
   System.out.print("was sitting on the sofa when he realized that he was out of" + sofaFillin);
   mySofa = sofaFillin.nextLine();
  }
}

