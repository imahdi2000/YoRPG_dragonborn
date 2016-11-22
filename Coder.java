/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11 - 20
*/

public class Coder extends Character{

    private String name;
    
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
	return "Coder - HACKERMAN - (Life = 999  Defense = 999  Attack = 999 Strength = 999)";
    }
    
}
