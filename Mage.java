/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11 - 20
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

}
