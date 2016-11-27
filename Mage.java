/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
*/
public class Mage extends Character{
    private String name;
    public Mage(){

	name = "unknown";
	life = 110;
	strength =75;
	defense = 115;
	attack = .4;
    }
    public Mage(String n){
	this();
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
    public String about(){
	return "Mage - Pew Pew Zap - (Life = 110  Defense = 35  Attack = .4 Strength = 75)";
    }
    public String graphics(){
	String s ="";
	s += "YOUR A WIZARD!!!\n";
	s +="o \n";
	s +="                   O       /`-._\n";
	s +="                          /  ^·'^|\n";
	s +="             o           T    l  *\n";
	s +="                        _|-..-|_\n";
	s +="                 O    (^ '----' `)\n";
	s +="                       `^-....-/^\n";
	s +="             O       o  ) O/ O (\n";
	s +="                       _( (-)  )\n";
	s +="                   O  /^ )    (  /^\n";
	s +="                     /  ^(    ) |  ^\n";
	s +="                 o  o    ^)  ( /    ^\n";
	s +="                   /     |(  )|      ^\n";
	s +="                  /    o ^ ^( /       ^\n";
	s +="            __.--'   O    ^_ /   .._   ^\n";
	s +="           /||)^      ,   (_)   /(((^^)'^\n";
	s +="              |       | O         )  `  |\n";
	s +="              |      / o___      /      /\n";
	s +="             /  _.-''^^__O_^^''-._     /\n";
	s +="           .'  /  -''^^    ^^''-  ^--'^\n";
	s +="         .'   .`.  `'''----'''^  .`. ^\n";
	s +="       .'    /   `'--..____..--'^   ^ ^\n";
	s +="      /  _.-/                        ^ ^\n";
	s +="  .::'_/^   |                        |  `.\n";
	s +="         .-'|                        |    `-.\n";
	s +="   _.--'`   ^                        /       `-.\n";
	s +="  /          ^                      /           `-._\n";
	s +="  `'---..__   `.                  .´_.._   __       ^\n";
	s +="           ``'''`.              .'gnv   `'^  `''---'^\n";
	s +="                  `-..______..-'\n";
	return s;
    }

}
