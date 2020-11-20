
/**
 * Write a description of class Javamathfuctions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Javamathfuctions

{ 
  public static void main(String[] args)
  {
   System.out.print('\u000C');
   
   Scanner numbers1 = new Scanner (System.in);
   Scanner numbers2 = new Scanner (System.in);

   Scanner inputScanner = new Scanner(System.in);
   int choice;
   double max;
   double max2;
   double min;
   double min2;
   double sqrt;
   double sqrt2;
   double abs;
   double abs2;
   int random;
   int random2;
   double pow;
   double pow2;
   System.out.println("Please enter one of the following:");
   System.out.println("'1' to find the larger of two numbers.");
   System.out.println("'2' to find the smaller of two numbers.");
   System.out.println("'3' to find the square root of a number.");
   System.out.println("'4' to find the absolute value of a number.");
   System.out.println("'5' to find a random number which includes decimal values.");
   System.out.println("'6' to find an exponential value of a number.");
   choice = inputScanner.nextInt();
   
   if (choice == 1)
   {
    System.out.println("The program will now find the larger number. Please enter a whole number value.");
    max = numbers1.nextDouble();  
    System.out.println("Please enter a second whole number value.");
    max2 = numbers2.nextDouble();
    System.out.println(Math.max(max, max2) + " is the larger number.");  
    
   }
   else if (choice == 2)
   {
    System.out.println("The program will now find the smaller number. Please enter a whole number value.");
    min = numbers1.nextDouble();  
    System.out.println("Please enter a second whole number value.");
    min2 = numbers2.nextDouble();
    System.out.println(Math.min(min, min2) + " is the smaller number."); 
   }
   else if (choice == 3)
   {
    System.out.println("The program will now calculate the square root of a number. Please enter a whole number value.");
    sqrt = numbers1.nextDouble();
    System.out.println(Math.sqrt(sqrt) + " is the square root of " + sqrt + ".");  
   }
   else if (choice == 4)
   {
    System.out.println("The program will now find the absolute value of a number. Please enter a whole number value.");
    abs = numbers1.nextDouble();
    System.out.println(Math.abs(abs) + " is the absolute value of " + abs + ".");  
   }
   else if (choice == 5)
   {
    System.out.println("The program will now find a random number between 0 and 'x'. Please enter 'x'");
    random = numbers1.nextInt();  
    System.out.println(Math.random() * random + " is the randomly generated number.");
   }
   else if (choice == 6)
   {
    System.out.println("The program will now find the exponential value of a number. Please enter base number.");
    pow = numbers1.nextDouble();  
    System.out.println("Please enter the exponent.");
    pow2 = numbers2.nextDouble();
    System.out.println(Math.pow(pow, pow2) + " is the value of " + pow + "^" + pow2 + "."); 
   }
   else
   {
    System.out.println("That is not an acceptable value.");  
   }
  }
}
