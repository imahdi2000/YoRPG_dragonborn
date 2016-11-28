/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
*/
public abstract class Character{
    protected int life;
    protected int strength;
    protected int defense;
    protected double attack;
    protected int count;//to count how many times specialize is used
    protected int potions;
	
    public Character(){
	life = 0;
	strength = 0;
	defense = 0;
	attack = 0.0;
	potions = 3;
    } 
    public boolean isAlive(){
	return life > 0;//returns either true or false
    }
    public int getDefense(){
	return defense;
    }
    public void lowerHP(int a){
	life -= a;
    }
    
    public void directEffect(int damage, double powerLoss){//this lets the effects of the specialized attacks get to the monster
	life = life - damage;
	attack = attack - powerLoss;
    }
    
    public int attack(Character a){
	int damage;
	damage = (int)((strength * attack) - a.getDefense());//trunkates to int
	if (damage < 0){
	    damage = 0;//just in case we get negative damage,we don't wwant to give health to the other character.
	}
	a.lowerHP(damage);//apply damage to the enemey
	return damage; 
    }
    /*    public void specialize(){
	count += 1;//counter increaes by 1
	defense = defense - 10; 
	attack = attack + .5;	
    }
    public void normalize(){
	while (count > 0){//funtion returns stat back to the original base stat
	    defense = defense + 10;
	    attack = attack - .5;
	    count -= 1;//decreases the counter
	}
    }     */                                                                                
    public String getName(){
	return "unknown";
    }
    public String getstats(){
	String nlife;
	String ndefense;
	nlife = Integer.toString(life);
	ndefense = Integer.toString(defense);
	return "Heath: "+nlife+"  Defense:  "+ ndefense+"\n"; 
    }
    public void usePotion{
	if(potions > 0){
	    life += 10;
            potions -= 1;
	}
    }
    public abstract String about();
    public abstract void normalize();
    public abstract void specialize();
    public abstract String getType(); //lets you get the type of the character so driver can recognize the class of pat or smaug	
    public abstract String graphics();


    /*
	return "Monster - is the enemey, nuff said - (Life = 150  Defense = 20  Attack = 1 Strength = random[45,60))\n Warrior - Strong and Mighty - (Life = 125  Defense = 20  Attack = .4 Strength = 100 )\n Mage - Pew Pew Zap - (Life = 110  Defense = 35  Attack = .4 Strength = 75)\n Archer - Robin Hood Y'all - (Life = 110  Defense = 15  Attack = .5 Strength = 100 )\n Coder - HACKERMAN - (Life = 999  Defense = 999  Attack = 999 Strength = 999)\n";
				  */
}
