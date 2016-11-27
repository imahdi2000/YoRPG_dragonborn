/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
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
    
    public String getType(){
	return "Monster";
    }
    
    public  String about(){
	return "Monster - is the enemey, nuff said - (Life = 150  Defense = 20  Attack = 1 Strength = random[45,60))";
    }
    public String graphics(){
	String s = "";
	s += "              ^I                                           I^\n";
	s += "             ^II             ^               ^             II^\n";
	s += "            ^ ^^^^          ^^               ^^          ^^^^ ^\n";
	s += "           ^  I^  ^         I ^   ^     ^   ^ I         ^  ^I  ^\n"; 
	s += "           ^  I^   ^        I ^   ^     ^   ^ I         ^  ^I  ^\n";
	s += "          ^  ^  ^  ^         ^  ^^ ^---^ ^^  ^         ^  ^     ^\n";
	s += "         ^  ^    I  ^         ^  ^^^   ^^^  ^         ^  I       ^\n";
	s += "        ^  ^     ^   ^^^       ^ ( 0^ ^0 ) ^       ^^^   ^        ^\n";
	s += "       ^  ^       ^     ^^^^    ^ ^^^I^^^ ^    ^^^^     ^^         ^\n";
	s += "      ^  ^         ^^)      ^^^^ ^^-^I^-^^ ^^^^      (^^^ ^      ^  ^\n";
	s += "     ^  ^           ^^^^)       ^^  oVo  ^^       (^^^   ^ ^      ^  ^\n";
	s += "    ^  ^           ^,   ^^^)    (^^^ ^ ^^^)    (^^^         ^      ^  ^\n";
	s += "   ^  '           ^^       ^^^)  (^^V^V^^)  (^^^                    ^  ^\n";
	s += "  ^  '  '        ^'           ^   I(^^^)I   ^         ^              ^  ^\n";
	s += " ^  '  ^        ^              ^^ I(^^^)I ^^^          ^              ^  ^\n";
	s += "^     ^        '       ^        ^^(^^^^^)^^  ^          ^    ^         ^  ^\n";
	s += "     ^                ,         ^(^^^^^^^)^   ^          ^    ^         ^\n";
	s += "                     ^         ^(^^^^^^^^^)^   ^          ^    ^\n";
	return s;
    }
}
