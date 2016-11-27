/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
*/

public class Rogue extends Character{

    private String name;
    
    public Rogue(){
	name = "unknown";
	life = 100;
	strength = 130;
	defense = 5;
	attack = 0.4;
    }

    public Rogue(String n){
	this();//calls default constructor
	name = n;
    }
        public void normalize(){
	while (count > 0){//funtion returns stat back to the original base stat
	    defense = defense + 10;
	    attack = attack - .5;
	    count -= 1;//decreases the counter
	}
    }
    public void specialize(){
	count += 1;//counter increaes by 1
	defense = defense - 10; 
	attack = attack + .5;	
    }
    public  String about(){
	return "Rouge - The wild card- (Life = 100 Strength = 130 Defense = 5 Att = .45) ";
    }
    public String graphics(){
	String s = "";
	s +="                      .~      ,   . ~.\n";
s +="                     /                |\n";
s +="                    /      |~||~|   ,  |\n";
s +="                   |   .   |    |   '   |\n";
s +="                   |         ||         |\n";
s +="          XX       |  /~~|        /~~|  |       XX\n";
s +="        XX  X      | |  o  |    /  o  | |      X  XX\n";
s +="      XX     X     |  |____/    |____/  |     X     XX\n";
s +=" XXXXX     XX      |         /|        ,/      XX     XXXXX\n";
s +="X        XX8~~O      |      / |     ,/      O88~XX        X\n";
s +="X       X  O88~~O     |           '  |     O88~~O  X       X\n";
s +="X      X     O88~~O   |. ` ~ ~ ~ ~  ,|   O88~~O     X      X\n";
s +=" X    X        O88~~O                  O88~~O        X    X\n";
s +="  X   X          O88~~O              O88~~O          X   X\n";
s +="   X  X            O88~~O          O88~~O            X  X\n";
s +="    XX X             O88~~O      O88~~O             X XX\n";
s +="      XXX              O88~~O  O88~~O              XXX\n";
s +="                         O88~~88~~O\n";
s +="                           O88~~O\n";
s +="                         O88~~O..OO\n";
s +="                          OOO  OOO\n";
return s;
    }
    
}
