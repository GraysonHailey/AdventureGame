


import java.util.Scanner;

public class ForLoop
{
    public static void main(String[] arg)
    {
     System.out.print('\u000C');
     Scanner thingDoer = new Scanner (System.in);

     int a = 0;
     int b = 1;
     int c = 0;
     int num;
     int end = 0;
     System.out.print("Input how many digits of the fibonnaci sequence you want to see.");
     num = thingDoer.nextInt();
     
     num = num - 1;
     System.out.print("0");
     do
       {
      c = a + b;
      b = a;
      a = c;
      System.out.print(" " + c);
      end++;
       }
     while (end < num);
    }
}
