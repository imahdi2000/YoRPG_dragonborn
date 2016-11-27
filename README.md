# dragonborn
YoRpg

What was added: 

1. Graphics: When monsters appear, their image will be displayed in the terminal. Player image (depending on character type) also appears.
 
2. Changed special attacks to ones that were specific to character type (ie. Mages cast fireballs that burned the monster over a period of time). 

3. Health potions: player can now choose to drink potions to boost health.

4. Stats bar: Life, attack rating, defense, and strength are all displayed after each turn. 

ISH - I added Graphics to make it MORE AWESOME!!!
    : I found ASCII art online that I used to add the graphics, I had to modfify almost all of them becuase java wouldn't accept certain characters like semicolons, or backslashes in strings. In addtion, I had to seperate it line by line becuase I got an error "illegal start of expression" whenever I did that.
    - I also added a stats bar, (creds to Micheal for the idea), to update the user on their health and defense so they can make well informed decisions. I added it to the while loops becuase that's when the gameplay occured.
    - I also noticed that the pat.getname was giving us a default name instead of the characters actual name so I simply replaced pat.getname() with the variable name that the user gives us. 
    - I do not think the user needs to do anything different due to my changes. 


ALLARD - I added the special attacks that were specific to character type. The game's text was also edited for consistency with what was happening in the game 
            -Mages have fireball attacks --> sets monster on fire and makes it lose life, however, monster is enraged and hits harder
            -Warriors can daze the monster --> reduces the monster's attack power
            -Rogues can disarm monsters --> reduces monster's attack power
            -Archers fire poisoned arrows --> makes monster lose life 
Code: 
         *** the code I used to change the stats was a method called directEffect() in the Character class. It just changes the life and attack rating of the character (only monster) directly.
         *** in order to check whether monster was on fire, poisoned, etc, I made the (boolean) instance variables in the driver file. This way, when pat.specialize() is used, I simply added that the corresponding instance variable had to be changed.
         
Gameplay:
This addition changes the strategy of the game. For example, it allows the player to influence how the monster attacks and it allows for quick damage, all in exchange for lowered defense rating. This means that special attacks can in a way "save the player" for a few turns, but lead to troubles later on. If played correctly. David added health potions, which is one more thing that will affect gameplay. 
         
         
