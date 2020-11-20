
/**
 * Write a description of class MADLIBS2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MADLIBS3
{
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner user_input = new Scanner(System.in);
        Scanner keyboard1 = new Scanner (System.in);
        
        //Define a String and input information by user.
        String myWords;
        String mySecondWord;
        String myThirdWord;
        String myFourthWord;
        String myFifthWord;
        String poop;
        System.out.println("");
        System.out.println("Carl missed his alarm! 'Oh no!' he said. 'My boss is going to be _____'");
        myWords = user_input.next();
        System.out.println("Carl immediately rushed out the door. He didn't even bother putting his _____ on!");
        mySecondWord = user_input.next();
        System.out.println("He ran to work faster than he ever had before. A[n] ____ policeman tried to pull him over for speeding, but he outran him.");
        myThirdWord = user_input.next();
        System.out.println("Carl arrived at work just before his boss noticed that he was missing. Sadly, though, his ____ co-worker snitched on him.");
        myFourthWord = user_input.next();
        System.out.println("To Carl, his normally ______ boss forgave him for being late.");
        myFifthWord = user_input.next();
        System.out.println("'Go home and get dressed, though.' his boss told him. 'You look like a fool without any " + mySecondWord + "'");
        poop = user_input.next();
        System.out.println("");
        System.out.println("Carl missed his alarm! 'Oh no!' he said. 'My boss is going to be " + myWords + "!");
        System.out.println("Carl immediately rushed out the door. He didn't even bother putting his " + mySecondWord + " on!");
        System.out.println("He ran to work faster than he ever had before. A[n] " + myThirdWord + " policeman tried to pull him over for speeding, but he outran him.");
        System.out.println("Carl arrived at work just before his boss noticed that he was missing. Sadly, though, his " + myFourthWord + " co-worker snitched on him.");
        System.out.println("To Carl, his normally " + myFifthWord + " boss forgave him for being late.");
        System.out.println("'Go home and get dressed, though.' his boss told him. 'You look like a fool without any " + mySecondWord + "'");
    }
}