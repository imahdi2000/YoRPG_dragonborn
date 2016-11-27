/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
*/

public class Coder extends Character{

    private String name;

    public String getType(){
	return "Coder";
    }
    
    public Coder(){
	name = "unknown";
	life = 999;
	strength = 999;
	defense = 999;
	attack = 999;
    }

    public Coder(String n){
	this();//calls default constructor
	name = n;
    }
        public void normalize(){
	while (count > 0){//funtion returns stat back to the original base stat
	    defense = defense + 900;
	    attack = attack - .5;
	    count -= 1;//decreases the counter
	}
    }
    public void specialize(){
	System.out.println("Thou hast used a special attack!");	
	count += 1;//counter increaes by 1
	defense = defense - 900; 
	attack = attack + .5;	
    }
    public  String about(){
	return "Coder - HACKERMAN - (Life = 999  Defense = 999  Attack = 999 Strength = 999)";
    }
    public String graphics(){
	String s = "";
	s +="                                           , ,\n";
s +="                                          ,','\n";
s +="                                         + +\n";
s +="                                         `.`.\n";
s +="                                           ) +\n";
s +="                                      ,,,-','\n";
s +="                       _____,,,,---''~,,,-'\n";
s +="             ___,,--'~~_____,,,,--''~~\n";
s +="     __,,--'~__,,--'~~~\n";
s +="  ,-~_,,--'~~\n";
s +=" + ,'               .,------,....___\n";
s +=" + +               /       +        ~~~`---.._\n";
s +=" `.``-.._____,,,,,/       +                   ~~``.\n";
s +="   ``--...___++++/-~~~~~-+                         /\n";
s +="             ```+        +                         ++\n";
s +="               +        +                         / +\n";
s +="              +~----....+___                     + ++\n";
s +="              +-,,,,,___    ~~`~--..._         ,' + +\n";
s +="              +         ~~~~``---...__~~-...,-' ,'  +\n";
s +="              +                       ~`-....,-'   /\n";
s +="              `-._     _-------_                 ,'\n";
s +="                  ~`--'~~~~~~~~~``--..        ,,'\n";
s +="                                      ~~`---'~\n";
	return s;
    }
    
}
