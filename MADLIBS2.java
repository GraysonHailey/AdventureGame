
/**
 * Write a description of class MADLIBS2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MADLIBS2
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
        System.out.println("");
        System.out.println("Carl was hungry, so he went to the fridge to get some _____");
        myWords = user_input.next();
        System.out.println(myWords + " tastes delicious, he thought to himself as he opened the fridge.");
        System.out.println("I wish my roommate, _____, hadn't eaten them all. There aren't any left.");
        mySecondWord = user_input.next();
        System.out.println(mySecondWord + " is at the store right now! I better call him and ask him to buy some " + myWords);
        System.out.print(mySecondWord + "! We are out of ");
        System.out.print(myWords + "! Please pick some up.");
        System.out.println(mySecondWord + " told him, 'Sure dude. I'll pick it up as soon as I finish _______ with the cashier.");
        myThirdWord = user_input.next();
        System.out.println("When " + mySecondWord + " was finished " + myThirdWord + " with the cashier, he bought the " + myWords + " and gave them to Carl when he got home.");
        System.out.println(mySecondWord + " says, 'Oh no! I forgot to buy food for my pet ____.");
        myFourthWord = user_input.next();
        System.out.println(mySecondWord + " ran back to the store and bought " + myFourthWord + " food and came back to the house, but it was too late.");
        System.out.println("The " + myFourthWord + " had already starved to death, but luckily Carl knew that the magic spell _____ would bring it back to life.");
        myFifthWord = user_input.next();
        System.out.println("Carl cast the magical spell " + myFifthWord + " so passionately that it could be heard by everyone in the city. They all rejoiced.");
        System.out.println("What a mad day.");
    }
}
