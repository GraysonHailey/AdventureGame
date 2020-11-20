/**
 * Write a description of class Celsius2farhenheit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Celsius3farhenheit

{
  public static void main(String[] args)
  {
  //Celsius to Fahrenheit: CelsiusTemp * 9/5 + 32
  System.out.print('\u000C');
  Scanner user_input = new Scanner(System.in);
  System.out.println("What degrees Celsius do you want to convert to Fahrenheit?");
  double fahrenheitTemp = 0;
  double celsiusTemp = 0;
  celsiusTemp = user_input.nextDouble();
  
  
  //Complete calculation here.
  
  fahrenheitTemp = celsiusTemp * 9/5 + 32;
  System.out.println(celsiusTemp + " * 9/5 + 32 = ");
  System.out.println("Your answer is " + fahrenheitTemp + ".");
  }
}