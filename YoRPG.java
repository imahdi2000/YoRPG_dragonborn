/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
*/

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 20; //increased the max encounter rate for testing

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //changed warrior pat to Chracter pat
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    String name = "";
    private InputStreamReader isr;
    private BufferedReader in;

    //these variables describe the condition of the monster. They will be called by specialize() 
    
    public boolean onFire = false;
    public boolean poisoned = false;
    public boolean dizzy = false;
    public boolean disarmed = false;
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame()
    {
	String s ="";

	String choice = "1";
	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
	System.out.print("\nChoose your class:\n Type 1 for Warrior \nType 2 for Mage\nType 3 for Archer\nType 4 for Rogue\nType 5 for Coder\n");
	try { //used mr.browns way of getting an input to let user choose the class
	    choice = in.readLine();
	}
	catch ( IOException e ) { }

	if ( choice.equals( "1")){
	    pat = new Warrior( name ); //remember to put .equals, not ==
	}
	else if ( choice.equals("2")){
	    pat = new Mage( name );
	}
	else if ( choice.equals("3")){
	    pat = new Archer( name );
	}
	else if ( choice.equals("4")){
	    pat = new Rogue( name );
	}
	else if ( choice.equals("5")){
	    pat = new Coder( name );
	}
	System.out.print(pat.graphics());
	System.out.print(pat.about());


    }//end newGame()


    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int d1, d2;

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster();
	    System.out.println(smaug.graphics());
	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println("Monster:"+smaug.getstats());
		    System.out.println(name +":"+ pat.getstats());

		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!\n\t3: Maybe a Potion?" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 ){
		    pat.specialize();
		    if ((pat.getType()).equals("Archer")) poisoned = true;
		    if ((pat.getType()).equals("Mage")) onFire = true;
		    if ((pat.getType()).equals("Warrior")) dizzy = true;
		    if ((pat.getType()).equals("Rogue")) disarmed = true;
	            d1 = pat.attack( smaug );
 		    d2 = smaug.attack( pat );
		    System.out.println( "\n" + name + " dealt " + d1 + " points of damage.");
		}
		else if(i == 1){
		    pat.normalize();
		    d1 = pat.attack( smaug );
 		    d2 = smaug.attack( pat );
		    System.out.println( "\n" + name + " dealt " + d1 + " points of damage.");
		}
		else{
		    if(potions > 0){
			pat.usePotion();
			System.out.println(name + " now has " + life + " health.");
		    }
		    else{
			System.out.println("You have no more potions!");    
		    }
		}

 
//
		if (poisoned == true){
		    smaug.directEffect(10, 0.0);
		    System.out.println("Ye olde Monster's weakened by the poison that courses through its blood, losing 10 health in its sickness.");
		    poisoned = false;
		}
		if (onFire == true){
		    smaug.directEffect(20, -0.2);
		    System.out.println("Ye olde Monster's still burning, losing 20 health in its agony. Alas, ye Monster has struck thou hard in its rage.");
		    onFire = false;
		}
		if (dizzy == true){
		    smaug.directEffect(0, 0.4);
		    System.out.println("Ye olde Monster's skull still rings with the power of your blow. Its power is reduced.");
		    dizzy = false;
		}
		if (disarmed == true){
		    smaug.directEffect(0, 0.4);
		    System.out.println("Ye olde Monster's without a weapon. Its power is reduced.");
		    disarmed = false; 
		}
//
		System.out.println( "\n" + "Ye Olde Monster smacked " + name + " for " + d2 + " points of damage.");

	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
	 	/*================================================ ================================================*/
    }//end main

}//end class YoRPG
