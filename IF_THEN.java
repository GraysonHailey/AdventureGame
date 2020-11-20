 /**
 * Write a description of class Celsius2farhenheit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class IF_THEN

{
  public static void main(String[] args)
 {
  //Instantiate input from the user
  System.out.print('\u000C');
  
  Scanner inputScanner = new Scanner(System.in);
  Scanner thingDoer = new Scanner (System.in);
  double fahrenheitTemp = 0;
  double celsiusTemp = 0;
  int choice;
  
  //Prompt the user for which function they would like to use
  System.out.println("To convert Celsius to Fahrenheit, press 1. To convert Fahrenheit to Celsius, press 2.");
  
  choice = inputScanner.nextInt();
  
  if (choice == 1)
  {
   System.out.println("The program will now convert Celsius to Fahrenheit. Please enter whole number value.");
   celsiusTemp = thingDoer.nextDouble();
  
  
   //Complete calculation here.
  
   fahrenheitTemp = celsiusTemp * 9/5 + 32;
   System.out.println(celsiusTemp + " * 9/5 + 32 = ");
   System.out.println("Your answer is " + fahrenheitTemp + ".");
  }
  else if (choice == 2)
  {
   System.out.println("The program will now convert Fahrenheit to Celsius. Please enter a whole number value.");
   fahrenheitTemp = thingDoer.nextDouble();
   
   //do the thing.
   
   celsiusTemp = fahrenheitTemp - 32 + 5/9;
    
   System.out.println(fahrenheitTemp + " - 32 * 5 / 9");
   System.out.println("Your answer is " + celsiusTemp + ".");
  }
  else //unreadable text
  {
   System.out.println("That isn't a 1 or a 2. Follow my directions. I'll give you another chance, input a 1 or a 2.");
   choice = inputScanner.nextInt();
     if (choice == 1)
   {
    System.out.println("The program will now convert Celsius to Fahrenheit. Please enter whole number value.");
    celsiusTemp = thingDoer.nextDouble();
  
  
    //Complete calculation here.
  
    fahrenheitTemp = celsiusTemp * 9/5 + 32;
    System.out.println(celsiusTemp + " * 9/5 + 32 = ");
    System.out.println("Your answer is " + fahrenheitTemp + ".");
   }
   else if (choice == 2)
   {
    System.out.println("The program will now convert Fahrenheit to Celsius. Please enter a whole number value.");
    fahrenheitTemp = thingDoer.nextDouble();
   
    //do the thing.
   
    celsiusTemp = fahrenheitTemp * 5/9 + 32;
    
    System.out.println(fahrenheitTemp + " - 32 * 5 / 9");
    System.out.println("Your answer is " + celsiusTemp + ".");
   }
   else //unreadable text
   {
   System.out.println("I'm disappointed. I gave you another chance, but you still didn't input a 1 or a 2. Get out of my sight.");
   }
  }
 }
}