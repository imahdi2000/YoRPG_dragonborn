/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11 - 20
*/

public class Archer extends Character{

    private String name;
    
    public Archer(){
	name = "unknown";
	life = 125;
	strength = 100;
	defense = 20;
	attack = 0.5;
    }

    public Archer(String n){
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
	return "Archer - Robin Hood Y'all - (Life = 110  Defense = 15  Attack = .5 Strength = 100)";
    }
}
    
