/* Ishtiaque Mahdi, Allard Peng, David Frid (Team DragonBorns)
APCS1 pd 3
HW 35 -- Ye Olde Role Playing Game, Realized
2016 - 11 - 27
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
	    //  attack = attack - .5;
	    count -= 1;//decreases the counter
	}
    }
    public void specialize(){
       	System.out.println("Thou hast shot a poisoned arrow at Monster!");         
	count += 1;//counter increaes by 1
	defense = defense - 10; 
	//	attack = attack + .5;	
    }
    public  String about(){
	return "Archer - Robin Hood Y'all - (Life = 110  Defense = 15  Attack = .5 Strength = 100)";
    }
    public String graphics(){
	String s = "";
	s +="                                                   	~.\n";
	s +="                                                          ~|.\n";
	s +="                                                      ~  `|.\n";
	s +="                                                     ~     |.\n";
	s +="                                                  ~       |.\n";
	s +="                                                ~         `|.\n";
	s +="                                             ~            |.\n";
	s +="                                             ~              |.\n";
	s +="                                         ~                |.\n";
	s +="      __                                 ~                  `|.\n";
	s +="     -~                              ~                     |.\n";
	s +="        ~~                          ~                       |. \n";
	s +="          ~~                      ~                         |.\n";
	s +="           ~|                   ~                           |~\n";
	s +="             ~#####~          ~                             ||\n";
	s +="         ==###########>     ~                               ||\n";
	s +="          ~##==      ~    ~                                 ||\n";
	s +="      ______ =       =|__~___                                ||\n";
	s +="  ,--' ,----`-,__ ___~'  --,-`-==============================##==========>\n";
	s +=" ~               '        ##_______ ______   ______,--,____,=##,__\n";
	s +=" `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-~\n";
	s +="   `-,____,---'       ~####~              |        ____,--~_##,~\n";
	s +="       #_              |##   ~  _____,---==,__,---'         ##\n";
	s +="        #              ]===--==~                            ||\n";
	s +="        #,             ]         ~                          ||\n";
	s +="         #_            |           ~                        ||\n";
	s +="           ##_       __~'             ~                      ||\n";
	s +="            ####='     |                ~                    |~\n";
	s +="            ###       |                  ~                  |.\n";
	s +="            ##       _'                    ~                |.\n";
	s +="           ###=======]                       ~              |.\n";
	s +="           ~~~        |                         ~           ,|.\n";
	s +="           ~~         |                           ~         |.\n";
	s +="                                                    ~      ,|.\n";
	s +="                                                      ~    |.\n";
	s +="                                                        ~  |.\n";
	s +="                                                          ~|.\n";
	s +="                                                          ~.\n";
	s +="                                                         |\n";
	return s;

    }
}
    
