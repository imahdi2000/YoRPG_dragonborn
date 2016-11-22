/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11 - 20
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
	return "Rouge-the wild card- life - 100, str - 130, def - 5, att - .45 ";
    }
    
}
