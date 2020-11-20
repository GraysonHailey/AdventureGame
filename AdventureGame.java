
/**
 * Write a description of class AdventureGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class AdventureGame

{
  public static void main(String[] args)
 {
  System.out.print('\u000C');
  Scanner name_scanner = new Scanner(System.in);
  Scanner actual_thing = new Scanner(System.in);
  String userName;
  String playAgain = "yes";
  int choice;
  int choice2;
        
  
  while (playAgain.equals("yes") || playAgain.equals("Yes"))
  { 
     System.out.print('\u000C');
     System.out.println("Welcome, adventurer. Please tell me your name.");
     userName = name_scanner.next();
        
     System.out.println("Ah, " + userName + ". What a powerful name. It must strike fear into the hearts of your enemies. Now, let's begin your adventure.");
     System.out.println("~~~");
     System.out.println("You are locked in prison for a crime you didn't commit. You've been waiting for months for the perfect opportunity to escape, and it has finally come.");
     System.out.println("You weren't just sitting around for those 6 months, though.");
     System.out.println("You were observing the behavior of the guards, so you know where they will be and when.");
     System.out.println("You noticed a guard forgot to lock the door to the courtyard. Now, you can attempt an escape by running out.");
     System.out.println("Your best friend is right next to your cell, though.");
     System.out.println("You know a guard will come by in 3 minutes. Do you escape alone or risk saving your friend?");
     System.out.println("Please enter '1' for the former and '2' for the latter.");
     choice = actual_thing.nextInt();
    if (choice == 1)
  {
    System.out.println("You decide that it isn't worth the risk, and you run off alone.");
    System.out.println("You run out into the courtyard and see the electric fence blocking your way.");
    System.out.println("Suddenly, you hear the alarm. " + userName + " HAS ESCAPED. FIND HIM.");
    System.out.println("To hide, enter 1. To jump the elecric fence, press 2.");
    choice2 = actual_thing.nextInt();
    if (choice2 == 1)
    {
      System.out.println("You look around for a place to hide. You quickly decide the best nearby place is the garden.");
      System.out.println("You jump into one of the bushes just as the guards burst out into the courtyard.");
      System.out.println("You hear one of the guards say, 'I'll check the workout area. You two search the garden and warehouse.");
      System.out.println("The two guards go into the warehouse first. To run to find a better hiding spot, enter 1. To stay put, enter 2.");
      choice2 = actual_thing.nextInt();
      if (choice2 == 1)
      {
       System.out.println("The two guards hear your footsteps as you rush out of the bushes.");
       System.out.println("'There's " + userName + "!' shouts one of the guards.");
       System.out.println("The guard shoots you with his tazor.");
       System.out.println("You are knocked unconscious and brought back inside the prison to server solitary confinement for life. Play again?");
       playAgain = actual_thing.next();
       }
      else if (choice2 == 2)
      {
       System.out.println("The guards come out of the warehouse. They walk over to the bushes. One of the guards checks the plants, while the other looks at the bushes.");
       System.out.println("The guard shakes the bush next to you. You hold your breath as he walks over to the one you're hiding in.");
       System.out.println("Luckily for you, he doesn't look thoroughly. The two guards leave, and you climb out of the bush.");
       System.out.println("You aren't sure where to go now. To attempt to steal a guard's uniform, enter 1. To climb the electric fence, enter 2.");
       choice2 = actual_thing.nextInt();
       if (choice2 == 1)
       {
        System.out.println("You look around, and see a guard all alone.");
        System.out.println("To fight them and try to steal their uniform, press 1. To look for another way to get a uniform, enter 2.");
        choice2 = actual_thing.nextInt();
        if (choice2 == 1)
        {
         System.out.println("You run up to the guard. Before he can realize what is going on, you punch him in the face and knock him out.");
         System.out.println("You steal his uniform, and re-enter the prison.");
         System.out.println("To walk right out the front door, enter 1. To assume the identity of the guard whose uniform you stole, enter 2.");
         choice2 = actual_thing.nextInt();
         if (choice2 == 1)
         {
          System.out.println("You go to the front of the prison, and walk right out. Sadly for you, you get tazed the instant you step through the door.");
          System.out.println("The last thing you hear before everything fades to black is, 'NO LEAVING BEFORE YOUR SHIFT IS OVER.'");
          System.out.println("You are dead. Play again?");
          playAgain = actual_thing.next();     
         }
         else if (choice2 == 2)
         {
          System.out.println("You impersonate the guard. In a stroke of luck, the guard was also named " + userName + ".");
          System.out.println("You work at that prison under the identity of the guard for the next 50 years, before finally retiring at age 80.");
          System.out.println("You win.");
          System.out.println("Play again?");
          playAgain = actual_thing.next();     
         }
         else
         {
          System.out.println("God smites you for not picking a valid option. You are dead. Play again?");
          playAgain = actual_thing.next();    
         }
        }
        else if (choice2 == 2)
        {
         System.out.println("You look around for a while, but you waste too much time. The guards spot you and tackle you.");
         System.out.println("You are recaptured and brought back into the prison. Play again?");
         playAgain = actual_thing.next();     
        }
        else
        {
         System.out.println("God smites you for not picking a valid option. You are dead. Play again?");
         playAgain = actual_thing.next();   
        }
       }
       else if (choice2 == 2)
       {
        System.out.println("ZAPPPPPPPPPPPPPPPPPPPPPP...");
        System.out.println("You are dead. Play again?");
        playAgain = actual_thing.next();   
        }
       }
     }
    else if (choice2 == 2)
    {
      System.out.println("ZZZZAPPPPPP!");
      System.out.println("You are dead. Play again?");
      playAgain = actual_thing.next();
     }    
    else
     {
      System.out.println("God smites you for not picking a valid option. You are dead. Play again?");
      playAgain = actual_thing.next();
     }
     
     
 }
   else if (choice == 2)
 {
    System.out.println("You spend a few minutes lockpicking your friend's cell. You open it, and he comes out.");
    System.out.println("Hey " + userName + ". Let's get out of here.");
    System.out.println("You and your friend run to the courtyard door, but before you can get out, you hear a voice from a few feet behind you.");
    System.out.println("'HEY, YOU TWO! STOP!' shouts the guard.");
    System.out.println("To fight, enter 1. To run, enter 2.");
    choice2 = actual_thing.nextInt();
    if (choice2 == 1)
    {
      System.out.println("You punch the guard in the face, and you knock him out cold. This triggers a lockdown, and the courtyard door locks.");
      System.out.println("You realize that you need to find another way out. To hide in the janitor's closet, enter 1. To go to the visitor's office, go to 2.");
      choice2 = actual_thing.nextInt();
      if (choice2 == 1)
      {
       System.out.println("You and your friend try to hide in the janitor's closet. The closet is tiny, though, so you both can't fit in.");
       System.out.println("A guard discovers you and your friend, and brings you back to your cell.");
       System.out.println("Do you want to play again?");
       playAgain = actual_thing.next();
      }
      else if (choice2 == 2)
      {
       System.out.println("You go to the visitor's office. Luckily, no one is in there. Your friend climbs over the glass to the other side.");
       System.out.println("Before you can climb over, a guard comes in and asks who you are and what you are doing.");
       System.out.println("To tell him that you are a visitor and your friend is a prisoner, enter 1. To tell him you are both visitors, enter 2.");
       choice2 = actual_thing.nextInt();
       if (choice2 == 1)
       {
        System.out.println("The guard believes you, but takes your friend back to their cell. You walk out of the prison alone.");
        System.out.println("To escape, enter 1. To go back for your friend, enter 2.");
        choice2 = actual_thing.nextInt();
        if (choice2 == 2)
        {
         System.out.println("You go back into the prison. The guards watch as you unlock your friends cell.");
         System.out.println("'Why aren't you arresting me?' you ask one of them. He responds, 'This will make us a lot of money.'");
         System.out.println("'What do you mean?'");
         System.out.println("'A prison escape with action, friendship, betrayal, and restitution. Someone will make a movie out of this, and we'll be rich!'");
         System.out.println("While the guard was talking, you walked out of the prison with your friend. He monolouged about the escape for the next 30 minutes.");
         System.out.println("But, he was right. 10 years after your 'escape', you and your friend made a movie about it. The prison became rich, and pardoned your crimes.");
         System.out.println("This is the best ending. Play again?");
         playAgain = actual_thing.next();
        }
        else if (choice2 == 1)
        {
         System.out.println("You are a winner. You found the bad ending. Your friend never forgives you, but you eventually forget about him.");
         System.out.println("You are a free man, but he rots in prison for the rest of his life. Play again?");
         playAgain = actual_thing.next();     
        }
        else
        {
         System.out.println("God smites you for not picking a valid option. You are dead. Play again?");
         playAgain = actual_thing.next();   
        }
       }
       else if (choice2 == 2)
       {
        System.out.println("The guard doesn't believe you, and calls for backup. You are put to death for assaulting an officer and attempting to escape.");
        System.out.println("You are dead. Play again?");
        playAgain = actual_thing.next();   
        }
       }
     }
    else if (choice2 == 2)
    {
      System.out.println("ZZZZAPPPPPP! The guard tazors you and your friend.");
      System.out.println("You are dead. Play again?");
      playAgain = actual_thing.next();
     }    
    else
     {
      System.out.println("God smites you for not picking a valid option. You are dead. Play again?");
      playAgain = actual_thing.next();
     }
     
     
 }
  else
 {
   System.out.println("God smites you for not picking a valid option. You are dead. Play again?");
   playAgain = actual_thing.next();
 }
}
}
}

