/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 32 -- Ye Olde Role Playing Game, Expanded
2016 - 11 - 20
*/
public class Monster extends Character{
    
    public Monster(){
	life = 150;
	strength = (int) ((Math.random() * 45)+20);//random str value between 45 and 65
	defense = 0;
	attack = 1;
    }
        public void normalize(){

    }
    public void specialize(){

    }
    public  String about(){
	return "Monster - is the enemey, nuff said - (Life = 150  Defense = 20  Attack = 1 Strength = random[45,60))";
    }
}
