/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
*/

public class Warrior extends Character{
    private String name;
    public Warrior(){

	name = "unknown";//needed to set name to somthing
	life = 125;
	strength = 100;
	defense = 20;
	attack = 0.4;
    }
    public Warrior(String n){
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
	return " Warrior - Strong and Mighty - (Life = 125  Defense = 20  Attack = .4 Strength = 100 )";
    }
    public String graphics(){
	String s = "";
	s +="	                       ,dM\n";
s +="                         dMMP\n";
s +="                        dMMM'\n";
s +="                        OMM/\n";
s +="                        dMMm.\n";
s +="                       dMMP'_O---.\n";
s +="                      _| _  _ ;88;`\n";
s +="                    ,db; _ >  ;8P|  `.\n";
s +="                   (``T8b,__,'dP |   |\n";
s +="                   |   `Y8b..dP  ;_  |\n";
s +="                   |    |`T88P_ /  `O;\n";
s +="                   :_.-~|d8P'`Y/    / \n";
s +="                    O_   TP    ;   7`O\n";
s +="         ,,__        >   `._  /'  /   `O_\n";
s +="         `._ ~~~~~~~------|`O;' ;     ,'\n";
s +="            ~~~-----~~~'O__(|;' _.-'  `O\n";
s +="                    ;--..._     .-'-._     \n";
s +="                   /      /`~~'   ,'`O_ ,/\n";
s +="                  ;_    /'        /    ,/\n";
s +="                  | `~-l         ;    /\n";
s +="                  `O    ;       /O.._|\n";
s +="                    O    O      O     O\n";
s +="                    /`---';      `----'\n";
s +="                   (     /            \n";
s +="                    `---'\n";
return s;
    }
}
