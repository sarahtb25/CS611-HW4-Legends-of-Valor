# CS611-HW4
## Legends of Valor
---------------------------------------------------------------------------
Sarah Taaher Bonna              Harsh Gaurang Kapadia
sbonna@bu.edu                   harshk@bu.edu
U86084310                       U22820240

## Files
---------------------------------------------------------------------------
1. Armor.java: Represents an armor, a type of Equippable item
2. ArmorFactory.java: Represents all possible armors
3. AudioPlayer.java: To play a soundtrack while the game is being played.
    Adapted from: https://www.geeksforgeeks.org/play-audio-file-using-java/
4. Battle.java: An interface that contains the method that is needed in all battles
5. Board.java: Represents a board used in a board game
6. BoardGame.java: An abstract class that defines what a Board Game in general needs
7. BoardGameNonPlayerCharacter.java: Represents a NonPlayerCharacter for a board game, where its position on the 
    board can be tracked by the row and column of the cell it is in
8. BushPiece.java: A Legends of Valor game piece that is used to represent a Bush, which increases hero's dexterity 
    and monster's defense
9. CavePiece.java: A Legends of Valor game piece that is used to represent a Cave, which increases hero's agility and 
    monster's dodge chance
10. Cell.java: Represents a cell in a board
11. ConsoleColours.java: To modify the colours of command prompt/terminal when printing
    Obtained from: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
12. ConsumableItem.java: Represents an item that can be consumed, such as a potion or a spell.
    Consumable items cannot be sold.
13. Dragon.java: Represents a dragon, a type of Monsters and Hero and Legends of Valor monster
14. DragonFactory.java: Represents all possible dragons
15. EquippableItem.java: Represents items that can be worn or carried, such as a weapon or an armor
16. Exoskeleton.java: Represents an exoskeleton, a type of Monsters and Hero and Legends of Valor monster
17. ExoskeletonFactory.java: Represents all possible exoskeletons
18. Fighters.java: Represents the fighters in a battle i.e. Monster and Hero for Monsters and Heroes game and Legends 
    of Valor game
19. FireSpell.java: Represents a fire spell, a type of spell
20. Game.java: An interface that represents the behaviour of a game
21. GenerateHeroes.java: This class generates heroes according to the number of heroes wanted by player (Monsters and 
    Heroes) or as dictated by the game (Legends of Valor)
22. GenerateMonsters.java: This class generates monsters as needed for a cell
23. Help.java: An interface that contains expected behaviour for a game help
24. Hero.java: This class represents a general hero, a type of NonPlayerCharacter (a character that is not a player)
25. Heroes.java: Represents a list of heroes
26. HeroFactory.java: An interface that represents the expected behaviour of factories that will generate
    the various types of heroes e.g. Warrior, Sorcerer and Paladin
27. HeroNexusPiece.java: A Legends of Valor game piece that is used to represent a hero's nexus piece, where heroes can 
    respawn and go to the market
28. IceSpell.java: Represents a fire spell, a type of spell
29. InvalidPiece.java: A Legends of Valor game piece that is used to represent a cell is invalid
30. Inventory.java: Represents a hero's inventory, which keeps track of the weapons, armors, potions and spells
    a hero has
31. Item.java: Represents an item that a hero can use in battle, e.g. weapon, armor, spell and potion
32. ItemFactory.java: An interface that contains the expected behaviour for all item factories e.g. WeaponFactory, etc.
33. KoulouPiece: A Legends of Valor game piece which represents a Koulou, which increases a hero's strength and a 
    monster's damage
34. LightningSpell.java: Represents a Lightning Spell, a type of spell
35. LoVBattle.java: Represents a battle in Legends of Valor
36. LoVBoard.java: Represents a Legends of Valor Board
37. LoVBoardGame.java: Represents the Legends of Valor game logic
38. LoVHelp.java: Prints the help and rules for the map, market and battle in Legends of Valor
39. LoVHero.java: Represents a Legends of Valor Hero, which shares a lot of attributes with the hero in Monsters and 
    Heroes
40. LoVHeroLocationComparator.java: To sort heroes based on the columns and rows they are in, to allow players to control 
    their heroes more intuitively
41. LoVMarket.java: Represents a Legends of Valor market
42. LoVMonsterLocationComparator.java: To sort monsters based on the columns and rows they are in, to allow players 
    to view monster movements more intuitively
43. LoVPiece.java: Represents a game piece for Legends of Valor
44. LoVPlayer.java: Represents a Legends of Valor player, the same as Monsters and Heroes player
45. LoVRoundHistory.java: Keep track of the number of times each hero respawned in a game round,
    where game round here refers to an entire game from welcome message to end of game message
46. LoVStatistics.java: Prints the statistics of each hero at the end of each game (the number of times hero respawned)
47. LoVUtility.java: Contains methods that are used across different classes in the game
48. Main.java: The game launcher
49. Market.java: An interface which provides the expected behavior of a market in any game
50. MHHero.java: Represents a hero in Monsters and Heroes
51. MHBattle.java: Represents a battle between a hero and a monster in the Monsters and Heroes game
52. MHMonster.java: Represents a monster in Monsters and Heroes and Legends of Valor
53. MHBoardGame.java: Represents the Monsters and Heroes game logic
54. Monster.java: Represents a general monster, a type of NonPlayerCharacter (a character that is not a player)
55. MonsterFactory.java: An interface that represents the expected behaviour of factories that will generate
    the various types of monsters e.g. Dragon, Exoskeleton and Spirit
56. MonsterNexusPiece.java: A Legends of Valor game piece that represents monster's nexus piece, where monsters can spawn
57. Monsters.java: Represents a list of monsters
58. NonPlayerCharacter: This class represents any character that is not a player
    e.g. in Monsters and Heroes and Legends of Valor, Monsters and Heroes are the non player characters
59. Paladin.java: Represents a paladin, a type of Hero in Legends of Valor and Monsters and Heroes
60. PaladinFactory.java: Represents all possible paladins
61. Piece.java: Represents a general game piece
62. PiratesOfTheCaribbeanSoundtrack.wav: The soundtrack used in the game
63. PlainPiece.java: A Legends of Valor game piece which represents a Plain, where heroes and monsters are not affected
64. Player.java: Represents a general game player
65. Potion.java: Represents a potion, a type of ConsumableItem
66. PotionFactory.java: Represents all possible potions
67. RoundHistory.java: An interface that contains the methods needed to keep track of the scores in each round
68. Sorcerer.java: Represents a sorcerer, a type of Hero in Legends of Valor and Monsters and Heroes
69. SorcererFactory.java: Represents all possible sorcerers
70. Spell.java: Represents a spell, a type of ConsumableItem
71. SpellFactory.java: Represents all possible spells
72. Spirit.java: Represents a spirit, a type of Monsters and Hero and Legends of Valor monster
73. SpiritFactory.java: Represents all possible spirits
74. Statistics.java: An interface that contains the expected behaviour of how the scores of each round
    should be handled
75. Utility.java: An interface containing the method that is used often
76. Warrior.java: Represents a warrior, a type of Hero in Legends of Valor and Monsters and Heroes
77. WarriorFactory.java: Represents all possible warriors
78. Weapon.java: Represents a weapon, a type of EquippableItem
79. WeaponFactory.java: Represents all possible weapons
80. UML.png: UML Diagram of Legends of Valor

## Justification of Structure
---------------------------------------------------------------------------
We chose Sarah's Monsters and Heroes design infrastructure over Harsh’s because Sarah's Monsters and Heroes game 
infrastructure was more developed and therefore, had many classes that could be either reused in Legends of Valor 
as is, or had to be minimally modified.

The classes reused from Monsters and Heroes are:
1. Armor
2. ArmorFactory
3. Battle
4. Board
5. BoardGame
6. Cell
7. ConsoleColours
8. ConsumableItem
9. DragonFactory
10. EquippableItem
11. ExoskeletonFactory
12. Fighters
13. FireSpell
14. Game
15. GenerateMonsters
16. Help
17. Heroes
18. HeroFactory
19. IceSpell
20. Inventory
21. Item
22. ItemFactory
23. LightningSpell
24. LoVPlayer (formerly known as MHPlayer, renamed to reflect the new game name)
25. MonsterFactory
26. NonPlayerCharacter
27. PaladinFactory
28. Piece
29. Player
30. Potion
31. PotionFactory
32. RoundHistory
33. SorcererFactory
34. Spell
35. SpellFactory
36. SpiritFactory
37. Statistics
38. Utility
39. WarriorFactory
40. Weapon
41. WeaponFactory

The classes that were minimally modified are:
1. Hero.java: Split into Hero.java (hitpoints) and MHHero.java (rest of the attributes of Monsters and Heroes hero)
2. Monster.java: Split into Monster.java (hitpoints) and MHMonster.java (rest of the attributes of Monsters and Heroes monster)
3. Market.java: Split into Market.java interface and LoVMarket.java (very similar to Monsters and Heroes market)
4. Dragon.java: Replaced superclass with MHMonster
5. Exoskeleton.java: Replaced superclass with MHMonster
6. Spirit.java: Replaced superclass with MHMonster
7. Sorcerer.java: Replaced superclass with LoVHero
8. Paladin.java: Replaced superclass with LoVHero
9. Warrior.java: Replaced superclass with LoVHero

Benefits of the current structure for Legends of Valor:
1. Design Patterns used: Singleton, Factory and Strategy
2. Concepts used from lecture: Generics, Inheritance, Interface, Comparator, Overriding methods, Abstraction, 
   Single Responsibility Principle, Open-closed Principle, Dependency Injection, etc.
3. Extensible and scalable design that can be easily modified.
4. It was much easier to add on to the design (Sarah's design) from the Monsters and Heroes game, and the modular and 
   extensible structure of the design was one of the major reasons to go ahead wih Sarah's design. Harsh's design 
   lacked the features and extensive design required to incorporate all the features required by this game. A lot more 
   effort would have to be put in to make Harsh's design work with the requirements of this game.
5. Well-structured and commented code with appropriate context-based variable names.
6. Appropriate access specifiers were chosen, and getter and setter methods were implemented accordingly.

Flaws of the current structure:
1. There are a lot of nested `if` - `else`s that we couldn't figure how to avoid.
2. Generalizing a lot of components to make them extensible added the additional burden of typecasting to the specific 
   type of object required every time and putting in checks for the exact type required. It is something that cannot 
   necessarily be avoided, but just a point that we had to take care of.

Lessons learnt from HW3 and (hopefully) corrected in HW4:
1. Looked for ways to reuse as many of the existing classes from Monsters and Heroes, and in some cases, 
   broke down those existing classes to allow for greater extendability for future games.
2. Advanced the various principles learned in class, such as Single Responsibility Principle and more.

## Notes
---------------------------------------------------------------------------
1. Bonus Done
   (a) Potions and Spells are multi-use items.
   (b) Legends of Valor can be played for multiple rounds.
   (c) The number of times each hero respawns is tracked and printed when the player quits the game.
   (d) Added colours to board to distinguish the different types of pieces and messages shown to player.
   (e) Added soundtrack to the game (PiratesOfTheCaribbeanSoundtrack.wav).
   (f) Added some animations (welcome, round start, round end, game end message and quit game message).
   (g) Used Singleton Pattern for the Legends of Valor game logic.
   (h) Used Factory Design Pattern for generating the various monsters and heroes.
   (i) Player can regenerate the map if they are not happy with their current map.
   (j) Heroes alive at the end of each round get bonus hitpoints and mana.
   (k) Used Strategy Pattern to sort the heroes and monsters based on the columns and rows they are in, so 
       players can control their heroes and view monsters' movements more intuitively.
   (l) Keeping track of the number of times each hero respawned in a game round, where game round here refers to an 
       entire game from welcome message to end of game message or quit game message
2. Please maximize terminal screen before playing. This game has been developed and tested using Java 8.

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "HW4" after unzipping the files
2. Run the following instructions:
   mkdir bin
   javac -d bin src/*.java
   java -cp bin Main

## Input/Output Example
---------------------------------------------------------------------------
Output:
*************************************************
          WELCOME TO LEGENDS OF VALOR!
*************************************************

######################################################################
|                          LEGENDS OF VALOR                          |
######################################################################

A long time ago, the villagers of Lockwood were living a peaceful when one day, their village was overtaken by
monsters. The monsters were tyrants and destroyed their village. With nowhere to go, they retreated into the pockets of
magical forest that stood even after the monsters attacked. The forest gave them protection, with its magic hiding the
villagers from the monsters. The invalid areas in the map represent the pockets of magical forest, which keeps out
everything and everyone. However, they are not safe. The monsters have been slowly weakening the magical forest,
with the aim of eradicating every single villager.

Will you rise up to the challenge and help the villagers of Lockwood free themselves from the monsters' tyranny? Will
you help protect the magical forest from its slow death? The monsters are able to spawn in their Nexus, strategize and
you will succeed. Take advantage of the terrain, coordinate actions between heroes, and use items to outwit and
outfight the invading waves of monsters. Can your heroes destroy the monsters' Nexus and stop the monster
invasion? Or will the monsters overrun your own fortress?

Good luck!

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
---------------------------------------------------------------------------
|                                   RULES                                  |
---------------------------------------------------------------------------

*****************
|   Map Rules   |
*****************

1.  The map contains 6 types of spaces:
    (a) Bush, which increases hero's dexterity and monster's defense
    (b) Cave, which increases hero's agility and monster's dodge chance
    (c) Koulou, which increases a hero's strength and a monster's damage
    (d) Invalid, which are inaccessible to both heroes and monsters
    (e) Hero Nexus, where heroes respawn and shop at the market
    (f) Monster Nexus, where monsters spawn
2.  The game ends if:
    (1) a hero enters a monster's nexus, or
    (2) a monster enters a hero's nexus
3.  You can provide the following commands (Not case-sensitive):
    (1) W/w: Move up
    (2) A/a: Move left
    (3) S/s: Move down
    (4) D/d: Move right
    (5) Q/q: Quit game
    (6) I/i: Show information about the current hero
    (7) M/m: When in a place that has a Market, use M/m to go to the market
    (8) H/h: To view possible commands while using the map
    (9) R/r: To view the rules of the map
    (10) View Map: To view the map
    (11) Inventory: To view the inventory of a hero
    (12) Drink <Potion ID>: To get a hero to consume a potion e.g. Drink P0
    (13) Regenerate Map: To create a new map e.g. if you are stuck, or just don't like the map you have.
    All heroes and monsters currently alive are sent back to their nexus.
    (14) Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing
    e.g. Equip B0
    To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
    comma-separated manner e.g. Equip B0,E0
    (15) Teleport <Row Number>,<Column Number>: A teleport action allows a hero to move to a space adjacent to a target hero in a
    different lane. Teleport works only between different lanes, so a hero cannot teleport from one
    space in a lane to another space in the same lane. A hero may not teleport to a space ahead of
    the hero being teleported to, onto a space already occupied by another hero, and behind a
    monster in the lane. To go back to a hero's original lane after teleportation, use recall.
    (16) Recall: The recall action allows a hero to return to their specific Nexus. This will always return
    the hero to the Nexus space they spawned at - no matter how far they are from that Nexus
    space (i.e. even if the hero is in another lane).
    (17) [Press ENTER without any input]: Do nothing.
    Note: A hero cannot enter a cell already occupied by another hero. A monster cannot enter a cell already occupied by another monster.


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
********************
|   Battle Rules   |
********************

1.  This is a turn-based battle, where the heroes make a move first, followed by the monster.
    Heroes and monsters are only allowed one move. If the hero and monster are still alive after that one move,
    the battle continues when the turn of the monster or hero involved comes.
2.  If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,
    depending on whose turn it is.
3.  The battle is 1-on-1 i.e. one hero vs one monster
4.  The battle ends when
    (1) the hero runs out of hit points, or
    (2) the monster runs out of hit points
5.  Possible commands to use in battle (Not case-sensitive):
    (1) Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0
    The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,
    the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the
    inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
    comma-separated manner e.g. Equip B0,E0
    (2) Hit: To hit the monster with the weapon the hero is carrying
    (3) Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0
    (4) Drink <Potion ID>: To drink a potion e.g. Drink P0
    (5) I/i: To view the details of the hero and the monster engaged in battle (Will not lose a turn)
    (6) Q/q: To quit the game
    (7) H/h: To view possible commands for battle (Will not lose a turn)
    (8) R/r: To view the rules of battle (Will not lose a turn)
6.  Commands that do not have (Will not lose a turn) means that if the item ID given does not exist,
    the hero loses a turn.
7.  The monsters will only attack the heroes, as they do not have items or spells to use.
8.  Heroes have a dodge chance that will allow them to occasionally avoid taking damage from a monster's attack.
    If the dodge chance >= monster's attack, then the monster's attack is dodged. Otherwise, the hero gets the full
    brunt of the monster's attack - defence provided by the hero's armor (if any).

    Hero's dodge chance = hero's agility * 0.2

9.  Similarly, monsters also have a dodge chance that will allow them to occasionally avoid taking damage from
    a hero's attack. If the dodge chance >= hero's attack, then the hero's attack is dodged. Otherwise, the monster
    gets the full brunt of the hero's attack - monster's defence.

    Monster's dodge points = monster's dodge chance * 0.1

10.  When a monster is unable to dodge the hero's spell, the monster faces a loss in skill. The skill affected
     depends on the type of spell used.
     The types of spell and their effects are:
     (1) Ice spell: reduces the amount of damage the monster can cause
     (2) Fire spell: reduces the defense of the monster
     (3) Lightning spell: reduces the dodge chance of the monster

     Skill left after getting hit by spell = (damage or defence or dodge chance, depending on type of spell) * 0.9

11. If a hero wins the battle, the hero gets money and experience points.

    Money gained = Monster level * 100
    Experience gained = 20 * number of monster in battle, which is 1

12. Heroes are able to level up. Once they level up, their hit points, mana and experience level increases.
    When a hero levels up all of their skills increase by 5% and their favored skills increase by an extra 5%.

    Experience points needed to level up = Hero's current level * 10
    Hero's hit point = hero's current level * 100
    Hero's mana after level up = Hero's mana before level up * 1.1
    Hero's experience level after level up = Hero's experience level before level up + 1
13. If a hero dies in a battle, the hero will respawn in their nexus in the round after the next round
    i.e. if a hero dies in round 8, the hero will respawn in their nexus in round 10.



[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------
|   Heroes   |
--------------

1. A hero has several attributes:
   (1) A name
   (2) A level with an amount of experience points
   (3) HP (hit points, the hero's in battle)
   (4) MP (mana or magic points, for casting spells)
   (5) A strength value
   (6) A dexterity value
   (7) An agility value
   (8) An amount of gold
   (9) An inventory of items
   (10) The weapon and/or armor they have on them

2.  A hero has a level, representing how strong (or not) that hero is. Experience points determine the hero's level.
    A hero levels up after accumulating enough experience points. A hero's skills increase when the hero levels up.
    A hero never loses experience. It accumulates over the course of the game.
3.  HP (hot point): HP is the hero's current health. The initial HP value is determined by hero's level.

    Hero's hit points = Hero's current level * 100

    When a hero levels up, they have their HP set according to the same formula.

4.  MP: MP (or mana) is used to cast spells.
5.  Strength: A hero's strength increases the amount of damage they deal when using a weapon.
6.  Dexterity: A hero's dexterity increases the amount of damage they deal when casting a spell.
7.  Agility: A hero's agility increases their chance to dodge a monster's attack.
8.  Money: Money is for use in the market.
9.  Inventory: A hero has a collection of items that they have bought during the game. At the
    start of the game, the inventory is empty. There is no maximum size of the inventory.
10. There are three types of heroes, each with their own balance of skills:
    (1) Warriors are favored on strength and agility.
    (2) Sorcerers are favored on dexterity and agility.
    (3) Paladins are favored on strength and dexterity.



[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
----------------
|   Monsters   |
----------------

1.  A monster has several attributes:
    (1) A name
    (2) A level
    (3) HP
    (4) A base damage value
    (5) A defense value
    (6) A dodge ability

2.  Base damage. This is a monster's attack damage.
3.  Defense. Monsters don't wear armor, relying on their natural hides and carapaces to
    protect them from the heroes' attacks. This value reduces the amount of damage a monster
    takes from a hero's attack or spell.
4.  Dodge ability. This represents how well a monster can avoid a hero's attack. It functions in a
    similar way to the hero's agility.
5.  There are three kinds of monsters, each with a favored attribute:
    (1) Dragons have increased base damage.
    (2) Exoskeletons have increased defense.
    (3) Spirits have increased dodge ability.

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
********************
|   Market Rules   |
********************

1.  The heroes can buy and sell items at any market. Items that are sold at every market are:
    (1) Armors
    (2) Potions
    (3) Spells
    (4) Weapons
2.  Each hero has a private wallet (their gold amount) and does not share money with the other heroes.
    Likewise, each hero has their own inventory of items that they do not share with their fellow heroes.
3.  A hero can sell an item that is not consumable i.e. potions and spells cannot be sold.

    Money earned by hero after a successful sale = 0.5 * the item's cost

    The item will be removed from the player's inventory.
4.  A successful purchase will reduce the amount of money the hero has, and the item will be transferred to
    the hero's inventory.
5.  All items have a name, a price, and a level. A hero cannot buy:
    (1) an item that costs more than the money they have, or
    (2) an item that is a higher level than they are.
6.  You can provide the following commands (Not case-sensitive):
    (1) View Market: To view the items in the market
    (2) Buy <Item ID>: To buy an item for a hero e.g. Buy B0
    To buy multiple items, include the IDs in a comma-separated manner e.g. Buy B0,E0
    HOARDING IS NOT ALLOWED. If a hero already has an item, the hero cannot buy another of the same
    item, until the item is sold (for weapons and armors) or the item has been completely consumed (for potions and spells)
    (3) Sell <Item ID>: To sell an item that a hero has e.g. Sell B0
    To sell multiple items, include the IDs in a comma-separated manner e.g. Sell B0,E0
    (4) I/i: To view current hero information
    (5) Q/q: To quit the game
    (6) H/h: To view possible commands for Market
    (7) R/r: To view the rules of the market
    (8) X/x: To exit the market and go back to the map



[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
----------------
|  Item Types  |
----------------

1.  Armor: Armor reduces the incoming damage from a monster's attack. A piece of armor has
    a name, a price, a level, and a damage reduction value. When equipped, armor will reduce
    the damage taken by the hero by its damage reduction value. A hero can equip at most one
    piece of armor at a time.
2.  Potions: Potions can be used by a hero in order to increase one of their statistics by some
    amount. Potions are multi-use items, and each potion can be consumed a different number of times.
    Potions have a name, a price, a level, and an effect amount. Using the potion should
    increase the given statistic by the effect amount. There are potions for increasing hit points, mana,
    strength, dexterity, and agility.
3.  Spells. A spell represents a magic attack performed by a hero. A spell has a name, a price, a
    level, a damage value, a mana cost, and a spell type. A hero will require at least the mana
    cost amount of mana to cast the spell. Therefore, if a hero has no mana, that hero cannot cast
    any spells. The damage value is used along with the hero's dexterity value to calculate the
    damage dealt during a spell cast move in a battle.

    Hero's spell damage = spell_base_damage + (dexterity/10000) * spell_base_damage

    After casting a spell, the mana cost is deducted from the hero's mana.
    Spells also have an additional effect besides their damage.

    The types of spell and their effects are:
    (1) Ice spell: reduces the amount of damage the target can cause
    (2) Fire spell: reduces the defense of the target
    (3) Lightning spell: reduces the dodge chance of the target

4.  Weapons: A weapon is used by a hero to attack a monster. A weapon has a name, a price, a
    level, a damage value, and the number of hands required to use it. A weapon must be
    equipped by the hero before it can be used. The damage value is used to calculate the
    damage dealt during an attack move in a battle.

    Hero's attack damage with weapon = (hero's strength + weapon_damage) * 0.05

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
---------------------------------------------------------------------------
|                                   HELP                                  |
---------------------------------------------------------------------------

****************
|   Map Help   |
****************

Commands allowed on the map (Not case-sensitive):
1. W/w: Move up
2. A/a: Move left
3. S/s: Move down
4. D/d: Move right
5. Q/q: Quit game
6. I/i: Show information about the current hero
7. M/m: When in a place that has a Market (Hero's Nexus), use M/m to go to the market
8. H/h: To view possible commands while using the map
9. R/r: To view the rules of Monsters and Heroes
10. View Map: To view the map
11. Inventory: To view the inventory of a hero
12. Drink <Potion ID>: To get a hero to consume a potion e.g. Drink P0
13. Regenerate Map: To create a new map e.g. if you are stuck, or just don't like the map you have.
All heroes and monsters currently alive are sent back to their nexus.
14. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing
e.g. Equip B0
To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
comma-separated manner e.g. Equip B0,E0
15. Teleport <Row Number>,<Column Number>: A teleport action allows a hero to move to a space adjacent to a target hero in a
different lane. Teleport works only between different lanes, so a hero cannot teleport from one
space in a lane to another space in the same lane. A hero may not teleport to a space ahead of
the hero being teleported to, onto a space already occupied by another hero, and behind a
monster in the lane. To go back to a hero's original lane after teleportation, use recall.
16. Recall: The recall action allows a hero to return to their specific Nexus. This will always return
the hero to the Nexus space they spawned at - no matter how far they are from that Nexus
space (i.e. even if the hero is in another lane).
17. [Press ENTER without any input]: Do nothing.
Note: A hero cannot enter a cell already occupied by another hero. A monster cannot enter a cell already occupied by another monster.


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
********************
|   Market Help    |
********************

Commands allowed in the market (Not case-sensitive):
1. View Market: To view the items in the market
2. Buy <Item ID>: To buy an item for a hero e.g. Buy B0
To buy multiple items, include the IDs in a comma-separated manner e.g. Buy B0,E0
HOARDING IS NOT ALLOWED. If a hero already has an item, the hero cannot buy another of the same
item, until the item is sold (for weapons and armors) or the item has been completely consumed (for potions and spells)
3. Sell <Item ID>: To sell an item that a hero has e.g. Sell B0
To sell multiple items, include the IDs in a comma-separated manner e.g. Sell B0,E0
4. I/i: To view current hero information
5. Q/q: To quit the game
6. H/h: To view possible commands for Market
7. R/r: To view the rules of Monsters and Heroes
8. X/x: To exit the market and go back to the map


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
********************
|   Battle Help    |
********************

A battle occurs whenever a hero and a monster is within range i.e. in the cells around a hero or monster.
If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,
depending on whose turn it is.

Commands allowed in battle (Not case-sensitive):
1. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0
The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,
the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the
inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
comma-separated manner e.g. Equip B0,E0
2. Hit: To hit the monster with the weapon the hero is carrying
3. Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0
4. Drink <Potion ID>: To drink a potion e.g. Drink P0
5. I/i: To view the details of the hero and the monster engaged in battle
6. Q/q: To quit the game
7. H/h: To view possible commands for battle
8. R/r: To view the rules of Monsters and Heroes

[INPUT] Please enter player name:
Input: Sarah
Output:
[GAME MESSAGE] New monster Desghidorrah J0 has spawned!

[GAME MESSAGE] New monster Phaarthurnax J7 has spawned!

[GAME MESSAGE] New monster TheWeatherbe J9 has spawned!

*************************************************
                 ROUND 1 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     R5                Eunoia_Cyn       Warrior        600        600     6000         6            700         800        600
     H1          Sehanine_Moonbow       Paladin        700        700     7000         7            750         700        700
     G3            Reverie_Ashels      Sorcerer        700        700     7000         7            800         700        400
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Hero Eunoia_Cyn R5

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: m
Output:
#############################################################################################
|                                   MARKET                                                  |
#############################################################################################



---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B0         Sword         500          1            1           800
          B1           Bow         300          2            2           500
          B2        Scythe        1000          6            2          1100
          B3           Axe         550          5            1           850
          B4       TSwords        1400          8            2          1600
          B5        Dagger         200          1            1           250
          B6         Fists           0          1            2           150
----------------------------------------------------------------------------------------------



---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E0      Platinum_Shield         150          1             200
          E1          Breastplate         350          3             600
          E2      Full_Body_Armor        1000          8            1100
          E3        Wizard_Shield        1200         10            1500
          E4       Guardian_Angel        1000         10            1000
          E5         Body_of_Hero           0          1             100
----------------------------------------------------------------------------------------------



-----------------------------------------------------------------------------------------------------------------------------------
|                                                           POTIONS                                                               |
-----------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------
ID            NAME         COST     LEVEL    # OF CONSUMPTIONS      INCREASE AMOUNT                               ATTRIBUTES
-----------------------------------------------------------------------------------------------------------------------------------
P0       Healing_Potion     250       1            20                      100                                        health
P1      Strength_Potion     200       1            15                       75                                      strength
P2         Magic_Potion     350       2            10                      100                                          mana
P3          Luck_Elixir     500       4             4                       65                                       agility
P4        Mermaid_Tears     850       5             3                      100               health, mana, strength, agility
P5             Ambrosia    1000       8             1                      150    health, mana, strength, dexterity, agility
------------------------------------------------------------------------------------------------------------------------------------



------------------------------------------------------------------------------------------------------------------------------------
|                                                             SPELLS                                                               |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID              TYPE               NAME          COST      MANA COST     LEVEL         # OF CONSUMPTIONS         DAMAGE
------------------------------------------------------------------------------------------------------------------------------------
     F0            Fire           Flame_Tornado       700        300            4                   4                  850
     F1            Fire          Breath_of_Fire       350        100            1                  10                  450
     F2            Fire               Heat_Wave       450        150            2                   7                  600
     F3            Fire              Lava_Comet       800        550            7                   1                 1000
     F4            Fire              Hell_Storm       600        600            3                   5                  950
     C0             Ice             Snow_Cannon       500        250            2                   4                  650
     C1             Ice               Ice_Blade       250        100            1                   6                  450
     C2             Ice          Frost_Blizzard       750        350            5                   2                  850
     C3             Ice            Arctic_Storm       700        300            6                   1                  800
     L0       Lightning        Lightning_Dagger       400        150            1                   1                  500
     L1       Lightning           Thunder_Blast       750        400            4                   4                  950
     L2       Lightning         Electric_Arrows       550        200            5                   5                  650
     L3       Lightning           Spark_Needles       500        200            2                   2                  600
------------------------------------------------------------------------------------------------------------------------------------




********************
|   Market Help    |
********************

Commands allowed in the market (Not case-sensitive):
1. View Market: To view the items in the market
2. Buy <Item ID>: To buy an item for a hero e.g. Buy B0
To buy multiple items, include the IDs in a comma-separated manner e.g. Buy B0,E0
HOARDING IS NOT ALLOWED. If a hero already has an item, the hero cannot buy another of the same
item, until the item is sold (for weapons and armors) or the item has been completely consumed (for potions and spells)
3. Sell <Item ID>: To sell an item that a hero has e.g. Sell B0
To sell multiple items, include the IDs in a comma-separated manner e.g. Sell B0,E0
4. I/i: To view current hero information
5. Q/q: To quit the game
6. H/h: To view possible commands for Market
7. R/r: To view the rules of Monsters and Heroes
8. X/x: To exit the market and go back to the map



[INPUT] Please provide a valid market command (Enter [H/h] for a list of possible commands):
Input: buy b2,e1,p0,p4,f4,c3,l2
Output:
[MARKET MESSAGE] Added weapon B2 to hero R5's inventory

[MARKET MESSAGE] Money left: 5000

[MARKET MESSAGE] Added armor E1 to hero R5's inventory

[MARKET MESSAGE] Money left: 4650

[MARKET MESSAGE] Added potion P0 to hero R5's inventory

[MARKET MESSAGE] Money left: 4400

[MARKET MESSAGE] Added potion P4 to hero R5's inventory

[MARKET MESSAGE] Money left: 3550

[MARKET MESSAGE] Added spell F4 to hero R5's inventory

[MARKET MESSAGE] Money left: 2950

[MARKET MESSAGE] Added spell C3 to hero R5's inventory

[MARKET MESSAGE] Money left: 2250

[MARKET MESSAGE] Added spell L2 to hero R5's inventory

[MARKET MESSAGE] Money left: 1700


[INPUT] Please provide a valid market command (Enter [H/h] for a list of possible commands):
Input: x
Output:
      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Hero Eunoia_Cyn R5

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: equip b2,e1
Output:
[GAME MESSAGE] You are currently armed with:

#########################################################################################
|                                   Currently Equipped Items                            |
#########################################################################################

---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B2        Scythe        1000          6            2          1100
----------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E1          Breastplate         350          3             600
----------------------------------------------------------------------------------------------
.
.
.
[GAME MESSAGE] Hero Reverie_Ashels G3

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
[GAME MESSAGE] Hero Reverie_Ashels G3's strength increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Monster Desghidorrah J0 has moved down.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |    J0 |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Monster Phaarthurnax J7 has moved down.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Monster TheWeatherbe J9 has moved down.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
*************************************************
                 ROUND 1 END!
*************************************************

[GAME MESSAGE] Rewarding heroes who are alive...

*************************************************
                 ROUND 2 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     R5                Eunoia_Cyn       Warrior        660        660     1700         6            700         800        600
     H1          Sehanine_Moonbow       Paladin        770        770     2750         7            750         700        700
     G3            Reverie_Ashels      Sorcerer        770        770     7000         7            880         700        400
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |R5     |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Hero Eunoia_Cyn R5

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: teleport 7,8
Output:
[GAME MESSAGE] Hero Eunoia_Cyn R5's strength increased!

[GAME MESSAGE] Hero R5 teleported to 7, 8

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

*************************************************
                 ROUND 3 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     H1          Sehanine_Moonbow       Paladin        847        847     2750         7            750         770        700
     G3            Reverie_Ashels      Sorcerer        847        847     7000         7            792         770        400
     R5                Eunoia_Cyn       Warrior        726        726     1700         6            770         800        600
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Hero Sehanine_Moonbow H1

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
[GAME MESSAGE] Hero Sehanine_Moonbow H1's agility reduced!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Hero Reverie_Ashels G3

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
[GAME MESSAGE] Hero Reverie_Ashels G3's agility reduced!

[GAME MESSAGE] Hero Reverie_Ashels G3's agility increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Hero Eunoia_Cyn R5

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
[GAME MESSAGE] Hero Eunoia_Cyn R5's strength reduced!

[GAME MESSAGE] Hero Eunoia_Cyn R5's agility increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |R5     |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
.
.
.

*************************************************
                 ROUND 4 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     H1          Sehanine_Moonbow       Paladin        931        931     2750         7            750         693        700
     G3            Reverie_Ashels      Sorcerer        931        931     7000         7            792         762        400
     R5                Eunoia_Cyn       Warrior        798        798     1700         6            693         880        600
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |       |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |R5     |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Hero Sehanine_Moonbow H1

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |R5     |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------------------------------
|           BATTLE START             |
--------------------------------------

********************
|   Battle Help    |
********************

A battle occurs whenever a hero and a monster is within range i.e. in the cells around a hero or monster.
If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,
depending on whose turn it is.

Commands allowed in battle (Not case-sensitive):
1. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0
The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,
the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the
inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
comma-separated manner e.g. Equip B0,E0
2. Hit: To hit the monster with the weapon the hero is carrying
3. Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0
4. Drink <Potion ID>: To drink a potion e.g. Drink P0
5. I/i: To view the details of the hero and the monster engaged in battle
6. Q/q: To quit the game
7. H/h: To view possible commands for battle
8. R/r: To view the rules of Monsters and Heroes




[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
HERO Reverie_Ashels :
ID: G3
Type: Sorcerer
Hit Points:931
Mana: 931
Strength: 792
Agility: 762
Dexterity: 400
Money: 7000
Experience: 7
Experience Gained: 0 / 70
Number of Times Hero Respawned: 0
[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Currently Equipped Items:

#########################################################################################
|                                   Currently Equipped Items                            |
#########################################################################################

---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B6         Fists           0          1            2           150
----------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E5         Body_of_Hero           0          1             100
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Inventory:
None



[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
MONSTER TheWeatherbe :
ID: J9
Type: Dragon
Hit Points: 800
Level: 8
Damage: 871
Defense: 900
DodgeChance: 80

[INPUT] Please enter the action you would like to take (Equip <Weapon or Armor ID>, Hit, Drink <Potion ID>, Cast <Spell ID>, I/i, Q/q, H/h, R/r):
Input: hit
Output:
[BATTLE MESSAGE] Monster TheWeatherbe J9 has successfully defended against Hero Reverie_Ashels G3's attack!

[BATTLE MESSAGE] Battle to be continued...

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |R5     |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Hero Eunoia_Cyn R5

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
[GAME MESSAGE] Hero Eunoia_Cyn R5's agility reduced!

[GAME MESSAGE] Hero Eunoia_Cyn R5's agility increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |    J0 |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Monster Desghidorrah J0's defence reduced!

[GAME MESSAGE] Monster Desghidorrah J0 has moved down.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------------------------------
|           BATTLE START             |
--------------------------------------


[BATTLE MESSAGE] Hero Sehanine_Moonbow H1 has successfully defended against Monster Phaarthurnax J7's attack!

[BATTLE MESSAGE] Battle to be continued...

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------------------------------
|           BATTLE START             |
--------------------------------------


[BATTLE MESSAGE] Hero Reverie_Ashels G3 was hit by Monster TheWeatherbe J9 and lost 771 hitpoints!

[BATTLE MESSAGE] Battle to be continued...

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
*************************************************
                 ROUND 4 END!
*************************************************

[GAME MESSAGE] Rewarding heroes who are alive...

*************************************************
                 ROUND 5 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     H1          Sehanine_Moonbow       Paladin       1024       1024     2750         7            750         693        700
     G3            Reverie_Ashels      Sorcerer        176       1024     7000         7            792         762        400
     R5                Eunoia_Cyn       Warrior        877        877     1700         6            693         871        600
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


--------------------------------------
|           BATTLE START             |
--------------------------------------

********************
|   Battle Help    |
********************

A battle occurs whenever a hero and a monster is within range i.e. in the cells around a hero or monster.
If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,
depending on whose turn it is.

Commands allowed in battle (Not case-sensitive):
1. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0
The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,
the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the
inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
comma-separated manner e.g. Equip B0,E0
2. Hit: To hit the monster with the weapon the hero is carrying
3. Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0
4. Drink <Potion ID>: To drink a potion e.g. Drink P0
5. I/i: To view the details of the hero and the monster engaged in battle
6. Q/q: To quit the game
7. H/h: To view possible commands for battle
8. R/r: To view the rules of Monsters and Heroes




[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
HERO Sehanine_Moonbow :
ID: H1
Type: Paladin
Hit Points:1024
Mana: 1024
Strength: 750
Agility: 693
Dexterity: 700
Money: 2750
Experience: 7
Experience Gained: 0 / 70
Number of Times Hero Respawned: 0
[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Currently Equipped Items:

#########################################################################################
|                                   Currently Equipped Items                              |
#########################################################################################

---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B2        Scythe        1000          6            2          1100
----------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E1          Breastplate         350          3             600
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Inventory:

#########################################################################################
|                                        Inventory                                      |
#########################################################################################


---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B6         Fists           0          1            2           150
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E5         Body_of_Hero           0          1             100
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


-----------------------------------------------------------------------------------------------------------------------------------
|                                                           POTIONS                                                               |
-----------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------
ID            NAME         COST     LEVEL    # OF CONSUMPTIONS      INCREASE AMOUNT                               ATTRIBUTES
-----------------------------------------------------------------------------------------------------------------------------------
P0       Healing_Potion     250       1            20                      100                                        health
P4        Mermaid_Tears     850       5             3                      100               health, mana, strength, agility
------------------------------------------------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


------------------------------------------------------------------------------------------------------------------------------------
|                                                             SPELLS                                                               |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID              TYPE               NAME          COST      MANA COST     LEVEL         # OF CONSUMPTIONS         DAMAGE
------------------------------------------------------------------------------------------------------------------------------------
     F3            Fire              Lava_Comet       800        550            7                   1                 1000
     F2            Fire               Heat_Wave       450        150            2                   7                  600
     L2       Lightning         Electric_Arrows       550        200            5                   5                  650
------------------------------------------------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
MONSTER Phaarthurnax :
ID: J7
Type: Dragon
Hit Points: 600
Level: 6
Damage: 594
Defense: 700
DodgeChance: 60

[INPUT] Please enter the action you would like to take (Equip <Weapon or Armor ID>, Hit, Drink <Potion ID>, Cast <Spell ID>, I/i, Q/q, H/h, R/r):
Input: cast l2
Output:
[BATTLE MESSAGE] Monster Phaarthurnax J7 has successfully defended against Hero Sehanine_Moonbow H1's spell!

[BATTLE MESSAGE] Battle to be continued...

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------------------------------
|           BATTLE START             |
--------------------------------------

********************
|   Battle Help    |
********************

A battle occurs whenever a hero and a monster is within range i.e. in the cells around a hero or monster.
If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,
depending on whose turn it is.

Commands allowed in battle (Not case-sensitive):
1. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0
The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,
the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the
inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
comma-separated manner e.g. Equip B0,E0
2. Hit: To hit the monster with the weapon the hero is carrying
3. Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0
4. Drink <Potion ID>: To drink a potion e.g. Drink P0
5. I/i: To view the details of the hero and the monster engaged in battle
6. Q/q: To quit the game
7. H/h: To view possible commands for battle
8. R/r: To view the rules of Monsters and Heroes




[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
HERO Eunoia_Cyn :
ID: R5
Type: Warrior
Hit Points:877
Mana: 877
Strength: 693
Agility: 871
Dexterity: 600
Money: 1700
Experience: 6
Experience Gained: 0 / 60
Number of Times Hero Respawned: 0
[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Currently Equipped Items:

#########################################################################################
|                                   Currently Equipped Items                            |
#########################################################################################

---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B2        Scythe        1000          6            2          1100
----------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E1          Breastplate         350          3             600
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Inventory:

#########################################################################################
|                                        Inventory                                      |
#########################################################################################


---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B6         Fists           0          1            2           150
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E5         Body_of_Hero           0          1             100
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


-----------------------------------------------------------------------------------------------------------------------------------
|                                                           POTIONS                                                               |
-----------------------------------------------------------------------------------------------------------------------------------
-----------------------------------------------------------------------------------------------------------------------------------
ID            NAME         COST     LEVEL    # OF CONSUMPTIONS      INCREASE AMOUNT                               ATTRIBUTES
-----------------------------------------------------------------------------------------------------------------------------------
P0       Healing_Potion     250       1            20                      100                                        health
P4        Mermaid_Tears     850       5             3                      100               health, mana, strength, agility
------------------------------------------------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


------------------------------------------------------------------------------------------------------------------------------------
|                                                             SPELLS                                                               |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID              TYPE               NAME          COST      MANA COST     LEVEL         # OF CONSUMPTIONS         DAMAGE
------------------------------------------------------------------------------------------------------------------------------------
     F4            Fire              Hell_Storm       600        600            3                   5                  950
     C3             Ice            Arctic_Storm       700        300            6                   1                  800
     L2       Lightning         Electric_Arrows       550        200            5                   5                  650
------------------------------------------------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
MONSTER TheWeatherbe :
ID: J9
Type: Dragon
Hit Points: 800
Level: 8
Damage: 871
Defense: 900
DodgeChance: 80

[INPUT] Please enter the action you would like to take (Equip <Weapon or Armor ID>, Hit, Drink <Potion ID>, Cast <Spell ID>, I/i, Q/q, H/h, R/r):
Input: hit
Output:
[BATTLE MESSAGE] Monster TheWeatherbe J9 has successfully defended against Hero Eunoia_Cyn R5's attack!

[BATTLE MESSAGE] Battle to be continued...

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |    J0 |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

*************************************************
                 ROUND 6 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     H1          Sehanine_Moonbow       Paladin       1126        906     2750         7            750         693        700
     G3            Reverie_Ashels      Sorcerer        193       1126     7000         7            792         762        400
     R5                Eunoia_Cyn       Warrior        666        964     1700         6            693         871        600
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |G3     |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |    J0 |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

--------------------------------------
|           BATTLE START             |
--------------------------------------


[BATTLE MESSAGE] Hero Reverie_Ashels G3 was hit by Monster TheWeatherbe J9 and has been defeated!

[BATTLE MESSAGE] Monster TheWeatherbe J9 wins!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |    J0 |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
*************************************************
                 ROUND 6 END!
*************************************************

[GAME MESSAGE] Rewarding heroes who are alive...

*************************************************
                 ROUND 7 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     G3            Reverie_Ashels      Sorcerer          0       1126     7000         7            792         762        400
     H1          Sehanine_Moonbow       Paladin       1238        996     2750         7            750         693        700
     R5                Eunoia_Cyn       Warrior        732       1060     1700         6            693         871        600
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |    J0 |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

[GAME MESSAGE] Monster Desghidorrah J0 has moved down.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P

  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K
4 |       |  |       |  |       |  |       |  |    J7 |  |       |  |       |  |    J9 |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
5 |       |  |       |  |       |  |H1     |  |       |  |       |  |       |  |R5     |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  C-C-C-C-C

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |    J0 |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[WINNER] Monsters won!

*************************************************
                 END OF GAME!
*************************************************

----------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME           NUMBER OF TIMES HERO RESPAWNED
----------------------------------------------------------------------------------------------------------------------------------
     G3            Reverie_Ashels                    0
     H1          Sehanine_Moonbow                    0
     R5                Eunoia_Cyn                    0
-----------------------------------------------------------------------------------------------------------------------------------

[GAME MESSAGE] Would you like to play again? Y/N
Input: y
Output:
*************************************************
          WELCOME TO LEGENDS OF VALOR!
*************************************************

.
.
.

[INPUT] Please enter player name:
Input: Sarah
Output:
[GAME MESSAGE] New monster Natsunomeryu J3 has spawned!

[GAME MESSAGE] New monster BlueEyesWhite J11 has spawned!

[GAME MESSAGE] New monster TheWeatherbe J9 has spawned!

*************************************************
                 ROUND 1 START!
*************************************************

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     G5                 Skye_Soar      Sorcerer        500        500     5000         5            700         400        500
     R0          Gaerdal_Ironhand       Warrior        700        700     7000         7            700         500        600
     H1          Sehanine_Moonbow       Paladin        700        700     7000         7            750         700        700
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |    J3 |  |       |  |       |  |    J11|  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |G5     |  |       |  |       |  |R0     |  |       |  |       |  |H1     |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Hero Skye_Soar G5

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |    J3 |  |       |  |       |  |    J11|  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |R0     |  |       |  |       |  |H1     |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
.
.
.

*************************************************
                 ROUND 1 END!
*************************************************

[GAME MESSAGE] Rewarding heroes who are alive...

.
.
.

--------------------------------------
|           BATTLE START             |
--------------------------------------


[BATTLE MESSAGE] Hero Gaerdal_Ironhand R0 was hit by Monster BlueEyesWhite J11 and has been defeated!

[BATTLE MESSAGE] Monster BlueEyesWhite J11 wins!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |    J3 |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |G5     |  |       |  |       |  |       |  |       |  |H1     |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
.
.
.

*************************************************
                 ROUND 7 START!
*************************************************

[GAME MESSAGE] Hero Gaerdal_Ironhand R0 has respawned!

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     G5                 Skye_Soar      Sorcerer        884        884     5000         5            700         400        490
     R0          Gaerdal_Ironhand       Warrior        700        700     7000         7            700         544        600
     H1          Sehanine_Moonbow       Paladin       1238       1238     7000         7            750         693        700
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |    J3 |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |G5     |  |       |  |       |  |R0     |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


--------------------------------------
|           BATTLE START             |
--------------------------------------

********************
|   Battle Help    |
********************

A battle occurs whenever a hero and a monster is within range i.e. in the cells around a hero or monster.
If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,
depending on whose turn it is.

Commands allowed in battle (Not case-sensitive):
1. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0
The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,
the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the
inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a
comma-separated manner e.g. Equip B0,E0
2. Hit: To hit the monster with the weapon the hero is carrying
3. Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0
4. Drink <Potion ID>: To drink a potion e.g. Drink P0
5. I/i: To view the details of the hero and the monster engaged in battle
6. Q/q: To quit the game
7. H/h: To view possible commands for battle
8. R/r: To view the rules of Monsters and Heroes




[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
HERO Skye_Soar :
ID: G5
Type: Sorcerer
Hit Points:884
Mana: 884
Strength: 700
Agility: 400
Dexterity: 490
Money: 5000
Experience: 5
Experience Gained: 0 / 50
Number of Times Hero Respawned: 0
[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Currently Equipped Items:

#########################################################################################
|                                   Currently Equipped Items                            |
#########################################################################################

---------------------------------------------------------------------------------------------
|                                   WEAPONS                                                 |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME         COST        LEVEL        HANDS       DAMAGE
---------------------------------------------------------------------------------------------
          B6         Fists           0          1            2           150
----------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
|                                   ARMORS                                                  |
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
          ID         NAME                 COST      LEVEL     DAMAGE REDUCTION
---------------------------------------------------------------------------------------------
          E5         Body_of_Hero           0          1             100
----------------------------------------------------------------------------------------------

[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
        Inventory:
None



[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
MONSTER Natsunomeryu :
ID: J3
Type: Dragon
Hit Points: 100
Level: 1
Damage: 99
Defense: 162
DodgeChance: 198

[INPUT] Please enter the action you would like to take (Equip <Weapon or Armor ID>, Hit, Drink <Potion ID>, Cast <Spell ID>, I/i, Q/q, H/h, R/r):
Input: hit
Output:
[BATTLE MESSAGE] Monster Natsunomeryu J3 was hit by Hero Skye_Soar G5 and has been defeated!

[BATTLE MESSAGE] Congratulations! Hero Skye_Soar G5 wins!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |G5     |  |       |  |       |  |R0     |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Hero Gaerdal_Ironhand R0

[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):
Input: w
Output:
      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |       |  |       |  |R0     |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

*************************************************
                 ROUND 7 END!
*************************************************

[GAME MESSAGE] Rewarding heroes who are alive...

*************************************************
                 ROUND 8 START!
*************************************************

[GAME MESSAGE] New monster D-Maleficent J8 has spawned!

[GAME MESSAGE] New monster Kas-Ethelinh J5 has spawned!

[GAME MESSAGE] New monster Brandobaris K1 has spawned!

------------------------------------------------------------------------------------------------------------------------------------
|                                                               HEROES                                                             |
------------------------------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME            TYPE      HIT POINT    MANA    MONEY    EXPERIENCE      STRENGTH    AGILITY    DEXTERITY
------------------------------------------------------------------------------------------------------------------------------------
     G5                 Skye_Soar      Sorcerer        972        972     5100         5            700         400        490
     R0          Gaerdal_Ironhand       Warrior        770        770     7000         7            700         544        600
     H1          Sehanine_Moonbow       Paladin        609       1361     7000         7            750         693        700
-------------------------------------------------------------------------------------------------------------------------------------

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |    J8 |  |       |  |       |  |    J5 |  |       |  |       |  |    K1 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |       |  |       |  |R0     |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

.
.
.

[GAME MESSAGE] Monster D-Maleficent J8 has moved down.

[GAME MESSAGE] Monster D-Maleficent J8's damage increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |    J5 |  |       |  |       |  |    K1 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |    J8 |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |G5     |  |       |  |       |  |R0     |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------------------------------
|           BATTLE START             |
--------------------------------------


[BATTLE MESSAGE] Hero Gaerdal_Ironhand R0 was hit by Monster BlueEyesWhite J11 and has been defeated!

[BATTLE MESSAGE] Monster BlueEyesWhite J11 wins!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |    J5 |  |       |  |       |  |    K1 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |    J8 |  |       |  |       |  |       |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Monster Kas-Ethelinh J5 has moved down.

[GAME MESSAGE] Monster Kas-Ethelinh J5's damage increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    K1 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |    J8 |  |       |  |       |  |    J5 |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |H1     |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
--------------------------------------
|           BATTLE START             |
--------------------------------------


[BATTLE MESSAGE] Hero Sehanine_Moonbow H1 was hit by Monster TheWeatherbe J9 and has been defeated!

[BATTLE MESSAGE] Monster TheWeatherbe J9 wins!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    K1 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |    J8 |  |       |  |       |  |    J5 |  |       |  |       |  |       |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[GAME MESSAGE] Monster Brandobaris K1 has moved down.

[GAME MESSAGE] Monster Brandobaris K1's damage increased!

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |    J8 |  |       |  |       |  |    J5 |  |       |  |       |  |    K1 |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
*************************************************
                 ROUND 8 END!
*************************************************

[GAME MESSAGE] Rewarding heroes who are alive...

*************************************************
                 ROUND 9 START!
*************************************************

.
.
.

[GAME MESSAGE] Monster TheWeatherbe J9 has moved down.

      1          2          3          4          5          6          7          8
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
1 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N

  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
2 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    K1 |
  C-C-C-C-C  K-K-K-K-K  I-I-I-I-I  B-B-B-B-B  K-K-K-K-K  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
3 |       |  |    J8 |  |       |  |       |  |    J5 |  |       |  |       |  |       |
  K-K-K-K-K  B-B-B-B-B  I-I-I-I-I  K-K-K-K-K  K-K-K-K-K  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P
4 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  B-B-B-B-B  P-P-P-P-P

  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B
5 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  C-C-C-C-C  B-B-B-B-B  I-I-I-I-I  P-P-P-P-P  B-B-B-B-B

  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K
6 |G5     |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
  B-B-B-B-B  B-B-B-B-B  I-I-I-I-I  C-C-C-C-C  P-P-P-P-P  I-I-I-I-I  C-C-C-C-C  K-K-K-K-K

  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P
7 |       |  |       |  |       |  |       |  |    J11|  |       |  |       |  |       |
  P-P-P-P-P  P-P-P-P-P  I-I-I-I-I  P-P-P-P-P  C-C-C-C-C  I-I-I-I-I  P-P-P-P-P  P-P-P-P-P

  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N
8 |       |  |       |  |       |  |       |  |       |  |       |  |       |  |    J9 |
  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N  I-I-I-I-I  N-N-N-N-N  N-N-N-N-N


[GAME MESSAGE] Press ENTER to continue
Input: (Press ENTER)
Output:
[WINNER] Monsters won!

*************************************************
                 END OF GAME!
*************************************************

----------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME           NUMBER OF TIMES HERO RESPAWNED
----------------------------------------------------------------------------------------------------------------------------------
     H1          Sehanine_Moonbow                    0
     R0          Gaerdal_Ironhand                    1
     G5                 Skye_Soar                    0
-----------------------------------------------------------------------------------------------------------------------------------

[GAME MESSAGE] Would you like to play again? Y/N
Input: n
Output:
[GAME MESSAGE] Quitting game...

################################################################################################################################
|                                                         OVERALL SCORES                                                       |
################################################################################################################################

--------------------------------------------------------------------------------------------------------------------------------
                                                        ROUND 1 SCORES
--------------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME           NUMBER OF TIMES HERO RESPAWNED
----------------------------------------------------------------------------------------------------------------------------------
     G3            Reverie_Ashels                    0
     H1          Sehanine_Moonbow                    0
     R5                Eunoia_Cyn                    0
-----------------------------------------------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------------------------------------------
                                                        ROUND 2 SCORES
--------------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------------------
     ID                  NAME           NUMBER OF TIMES HERO RESPAWNED
----------------------------------------------------------------------------------------------------------------------------------
     H1          Sehanine_Moonbow                    0
     R0          Gaerdal_Ironhand                    1
     G5                 Skye_Soar                    0
-----------------------------------------------------------------------------------------------------------------------------------
