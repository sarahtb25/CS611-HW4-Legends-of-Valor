// Prints the help and rules for the map, market and battle in Legends of Valor
public class LoVHelp implements Help {
    @Override
    public void printIntroduction() {
        String introduction = "######################################################################\n" +
                "|                          LEGENDS OF VALOR                          |\n" +
                "######################################################################\n" +
                "\n" +
                "A long time ago, the villagers of Lockwood were living a peaceful when one day, their village was overtaken by\n" +
                "monsters. The monsters were tyrants and destroyed their village. With nowhere to go, they retreated into the pockets of\n" +
                "magical forest that stood even after the monsters attacked. The forest gave them protection, with its magic hiding the\n" +
                "villagers from the monsters. The invalid areas in the map represent the pockets of magical forest, which keeps out\n" +
                "everything and everyone. However, they are not safe. The monsters have been slowly weakening the magical forest,\n" +
                "with the aim of eradicating every single villager.\n" +
                "\n" +
                "Will you rise up to the challenge and help the villagers of Lockwood free themselves from the monsters' tyranny? Will\n" +
                "you help protect the magical forest from its slow death? The monsters are able to spawn in their Nexus, strategize and \n" +
                "you will succeed. Take advantage of the terrain, coordinate actions between heroes, and use items to outwit and\n" +
                "outfight the invading waves of monsters. Can your heroes destroy the monsters' Nexus and stop the monster\n" +
                "invasion? Or will the monsters overrun your own fortress?\n" +
                "\n" +
                "Good luck!";

        System.out.println(introduction);
    }

    @Override
    public void printHelp() {
        String helpHeader = "---------------------------------------------------------------------------\n" +
                "|                                   HELP                                  |\n" +
                "---------------------------------------------------------------------------";

        System.out.println(helpHeader);
        printHelpMap();
        LoVUtility.pause();
        printHelpMarket();
        LoVUtility.pause();
        printHelpBattle();
    }

    public void printHelpMarket() {
        String help = "\n********************\n" +
                "|   Market Help    |\n" +
                "********************\n" +
                "\n" +
                "Commands allowed in the market (Not case-sensitive):\n" +
                "    1. View Market: To view the items in the market\n" +
                "    2. Buy <Item ID>: To buy an item for a hero e.g. Buy B0\n" +
                "       To buy multiple items, include the IDs in a comma-separated manner e.g. Buy B0,E0\n" +
                "       HOARDING IS NOT ALLOWED. If a hero already has an item, the hero cannot buy another of the same \n" +
                "       item, until the item is sold (for weapons and armors) or the item has been completely consumed (for potions and spells)\n" +
                "    3. Sell <Item ID>: To sell an item that a hero has e.g. Sell B0\n" +
                "       To sell multiple items, include the IDs in a comma-separated manner e.g. Sell B0,E0\n" +
                "    4. I/i: To view current hero information\n" +
                "    5. Q/q: To quit the game\n" +
                "    6. H/h: To view possible commands for Market\n" +
                "    7. R/r: To view the rules of Monsters and Heroes\n" +
                "    8. X/x: To exit the market and go back to the map\n";

        System.out.println(help);
    }

    public void printHelpMap() {
        String help = "\n****************\n" +
                "|   Map Help   |\n" +
                "****************\n" +
                "\n" +
                "Commands allowed on the map (Not case-sensitive):\n" +
                "    1. W/w: Move up\n" +
                "    2. A/a: Move left\n" +
                "    3. S/s: Move down\n" +
                "    4. D/d: Move right\n" +
                "    5. Q/q: Quit game\n" +
                "    6. I/i: Show information about the current hero\n" +
                "    7. M/m: When in a place that has a Market (Hero's Nexus), use M/m to go to the market\n" +
                "    8. H/h: To view possible commands while using the map\n" +
                "    9. R/r: To view the rules of Monsters and Heroes\n" +
                "    10. View Map: To view the map\n" +
                "    11. Inventory: To view the inventory of a hero\n" +
                "    12. Drink <Potion ID>: To get a hero to consume a potion e.g. Drink P0\n" +
                "    13. Regenerate Map: To create a new map e.g. if you are stuck, or just don't like the map you have.\n" +
                "        All heroes and monsters currently alive are sent back to their nexus.\n" +
                "    14. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing\n" +
                "        e.g. Equip B0\n" +
                "        To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a \n" +
                "        comma-separated manner e.g. Equip B0,E0\n" +
                "    15. Teleport <Row Number>,<Column Number>: A teleport action allows a hero to move to a space adjacent to a target hero in a\n" +
                "        different lane. Teleport works only between different lanes, so a hero cannot teleport from one\n" +
                "        space in a lane to another space in the same lane. A hero may not teleport to a space ahead of\n" +
                "        the hero being teleported to, onto a space already occupied by another hero, and behind a\n" +
                "        monster in the lane. To go back to a hero's original lane after teleportation, use recall.\n" +
                "    16. Recall: The recall action allows a hero to return to their specific Nexus. This will always return\n" +
                "        the hero to the Nexus space they spawned at - no matter how far they are from that Nexus\n" +
                "        space (i.e. even if the hero is in another lane).\n" +
                "    17. [Press Enter without any input]: Do nothing\n" +
                "    Note: A hero cannot enter a cell already occupied by another hero. A monster cannot enter a cell already occupied by another monster.\n";

        System.out.println(help);
    }

    public void printHelpBattle() {
        String help = "\n********************\n" +
                "|   Battle Help    |\n" +
                "********************\n" +
                "\n" +
                "A battle occurs whenever a hero and a monster is within range i.e. in the cells around a hero or monster.\n" +
                "If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,\n" +
                "depending on whose turn it is.\n" +
                "\n" +
                "Commands allowed in battle (Not case-sensitive):\n" +
                "    1. Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0\n" +
                "       The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,\n" +
                "       the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the\n" +
                "       inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a \n" +
                "       comma-separated manner e.g. Equip B0,E0\n"  +
                "    2. Hit: To hit the monster with the weapon the hero is carrying\n" +
                "    3. Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0\n" +
                "    4. Drink <Potion ID>: To drink a potion e.g. Drink P0\n" +
                "    5. I/i: To view the details of the hero and the monster engaged in battle\n" +
                "    6. Q/q: To quit the game\n" +
                "    7. H/h: To view possible commands for battle\n" +
                "    8. R/r: To view the rules of Monsters and Heroes\n";

        System.out.println(help);
    }

    public void printRules() {
        String rulesHeader = "---------------------------------------------------------------------------\n" +
                "|                                   RULES                                  |\n" +
                "---------------------------------------------------------------------------";

        System.out.println(rulesHeader);
        printRulesMap();
        LoVUtility.pause();
        printRulesBattle();
        LoVUtility.pause();
        printRulesMarket();
    }

    public void printRulesMarket() {
        String rules = "\n********************\n" +
                "|   Market Rules   |\n" +
                "********************\n" +
                "\n" +
                "1.  The heroes can buy and sell items at any market. Items that are sold at every market are:\n" +
                "    (1) Armors\n" +
                "    (2) Potions\n" +
                "    (3) Spells\n" +
                "    (4) Weapons\n" +
                "2.  Each hero has a private wallet (their gold amount) and does not share money with the other heroes.\n" +
                "    Likewise, each hero has their own inventory of items that they do not share with their fellow heroes.\n" +
                "3.  A hero can sell an item that is not consumable i.e. potions and spells cannot be sold.\n" +
                "\n" +
                "    Money earned by hero after a successful sale = 0.5 * the item's cost\n" +
                "\n" +
                "    The item will be removed from the player's inventory.\n" +
                "4.  A successful purchase will reduce the amount of money the hero has, and the item will be transferred to\n" +
                "    the hero's inventory.\n" +
                "5.  All items have a name, a price, and a level. A hero cannot buy:\n" +
                "    (1) an item that costs more than the money they have, or\n" +
                "    (2) an item that is a higher level than they are.\n" +
                "6.  You can provide the following commands (Not case-sensitive):\n" +
                "    (1) View Market: To view the items in the market\n" +
                "    (2) Buy <Item ID>: To buy an item for a hero e.g. Buy B0\n" +
                "        To buy multiple items, include the IDs in a comma-separated manner e.g. Buy B0,E0\n" +
                "        HOARDING IS NOT ALLOWED. If a hero already has an item, the hero cannot buy another of the same \n" +
                "        item, until the item is sold (for weapons and armors) or the item has been completely consumed (for potions and spells)\n" +
                "    (3) Sell <Item ID>: To sell an item that a hero has e.g. Sell B0\n" +
                "        To sell multiple items, include the IDs in a comma-separated manner e.g. Sell B0,E0\n" +
                "    (4) I/i: To view current hero information\n" +
                "    (5) Q/q: To quit the game\n" +
                "    (6) H/h: To view possible commands for Market\n" +
                "    (7) R/r: To view the rules of the market\n" +
                "    (8) X/x: To exit the market and go back to the map\n" +
                "\n";

        String itemTypes = "----------------\n" +
                "|  Item Types  |\n" +
                "----------------\n" +
                "\n" +
                "1.  Armor: Armor reduces the incoming damage from a monster's attack. A piece of armor has\n" +
                "    a name, a price, a level, and a damage reduction value. When equipped, armor will reduce\n" +
                "    the damage taken by the hero by its damage reduction value. A hero can equip at most one\n" +
                "    piece of armor at a time.\n" +
                "2.  Potions: Potions can be used by a hero in order to increase one of their statistics by some\n" +
                "    amount. Potions are multi-use items, and each potion can be consumed a different number of times.\n" +
                "    Potions have a name, a price, a level, and an effect amount. Using the potion should\n" +
                "    increase the given statistic by the effect amount. There are potions for increasing hit points, mana,\n" +
                "    strength, dexterity, and agility.\n" +
                "3.  Spells. A spell represents a magic attack performed by a hero. A spell has a name, a price, a\n" +
                "    level, a damage value, a mana cost, and a spell type. A hero will require at least the mana\n" +
                "    cost amount of mana to cast the spell. Therefore, if a hero has no mana, that hero cannot cast\n" +
                "    any spells. The damage value is used along with the hero's dexterity value to calculate the\n" +
                "    damage dealt during a spell cast move in a battle.\n" +
                "\n" +
                "    Hero's spell damage = spell_base_damage + (dexterity/10000) * spell_base_damage\n" +
                "\n" +
                "    After casting a spell, the mana cost is deducted from the hero's mana.\n" +
                "    Spells also have an additional effect besides their damage.\n" +
                "\n" +
                "    The types of spell and their effects are:\n" +
                "    (1) Ice spell: reduces the amount of damage the target can cause\n" +
                "    (2) Fire spell: reduces the defense of the target\n" +
                "    (3) Lightning spell: reduces the dodge chance of the target\n" +
                "\n" +
                "4.  Weapons: A weapon is used by a hero to attack a monster. A weapon has a name, a price, a\n" +
                "    level, a damage value, and the number of hands required to use it. A weapon must be\n" +
                "    equipped by the hero before it can be used. The damage value is used to calculate the\n" +
                "    damage dealt during an attack move in a battle.\n" +
                "\n" +
                "    Hero's attack damage with weapon = (hero's strength + weapon_damage) * 0.05";

        System.out.println(rules);
        LoVUtility.pause();
        System.out.println(itemTypes);
    }

    public void printRulesBattle() {
        String rules = "\n********************\n" +
                "|   Battle Rules   |\n" +
                "********************\n" +
                "\n" +
                "1.  This is a turn-based battle, where the heroes make a move first, followed by the monster.\n" +
                "    Heroes and monsters are only allowed one move. If the hero and monster are still alive after that one move,\n" +
                "    the battle continues when the turn of the monster or hero involved comes.\n" +
                "2.  If there are more than 1 monsters or heroes within range, a monster or hero is randomly chosen among them,\n" +
                "    depending on whose turn it is.\n" +
                "3.  The battle is 1-on-1 i.e. one hero vs one monster\n" +
                "4.  The battle ends when\n" +
                "    (1) the hero runs out of hit points, or\n" +
                "    (2) the monster runs out of hit points\n" +
                "5.  Possible commands to use in battle (Not case-sensitive):\n" +
                "    (1) Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing e.g. Equip B0\n" +
                "        The item must be in the hero's inventory. Once a hero is equipped with a weapon or armor,\n" +
                "        the hero can only replace the weapon with another weapon from the inventory, and an armor with another armor from the\n" +
                "        inventory. To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a \n" +
                "        comma-separated manner e.g. Equip B0,E0\n"  +
                "    (2) Hit: To hit the monster with the weapon the hero is carrying\n" +
                "    (3) Cast <Spell ID>: To cast a spell on the monster e.g. Cast F0\n" +
                "    (4) Drink <Potion ID>: To drink a potion e.g. Drink P0\n" +
                "    (5) I/i: To view the details of the hero and the monster engaged in battle (Will not lose a turn)\n" +
                "    (6) Q/q: To quit the game\n" +
                "    (7) H/h: To view possible commands for battle (Will not lose a turn)\n" +
                "    (8) R/r: To view the rules of battle (Will not lose a turn)\n" +
                "6.  Commands that do not have (Will not lose a turn) means that if the item ID given does not exist,\n" +
                "    the hero loses a turn.\n" +
                "7.  The monsters will only attack the heroes, as they do not have items or spells to use.\n" +
                "8.  Heroes have a dodge chance that will allow them to occasionally avoid taking damage from a monster's attack.\n" +
                "    If the dodge chance >= monster's attack, then the monster's attack is dodged. Otherwise, the hero gets the full\n" +
                "    brunt of the monster's attack - defence provided by the hero's armor (if any).\n" +
                "\n" +
                "    Hero's dodge chance = hero's agility * 0.2\n" +
                "\n" +
                "9.  Similarly, monsters also have a dodge chance that will allow them to occasionally avoid taking damage from\n" +
                "    a hero's attack. If the dodge chance >= hero's attack, then the hero's attack is dodged. Otherwise, the monster\n" +
                "    gets the full brunt of the hero's attack - monster's defence.\n" +
                "\n" +
                "    Monster's dodge points = monster's dodge chance * 0.1\n" +
                "\n" +
                "10.  When a monster is unable to dodge the hero's spell, the monster faces a loss in skill. The skill affected\n" +
                "     depends on the type of spell used.\n" +
                "     The types of spell and their effects are:\n" +
                "     (1) Ice spell: reduces the amount of damage the monster can cause\n" +
                "     (2) Fire spell: reduces the defense of the monster\n" +
                "     (3) Lightning spell: reduces the dodge chance of the monster\n" +
                "\n" +
                "     Skill left after getting hit by spell = (damage or defence or dodge chance, depending on type of spell) * 0.9\n" +
                "\n" +
                "11. If a hero wins the battle, the hero gets money and experience points.\n" +
                "\n" +
                "    Money gained = Monster level * 100\n" +
                "    Experience gained = 20 * number of monster in battle, which is 1\n" +
                "\n" +
                "12. Heroes are able to level up. Once they level up, their hit points, mana and experience level increases.\n" +
                "    When a hero levels up all of their skills increase by 5% and their favored skills increase by an extra 5%.\n" +
                "\n" +
                "    Experience points needed to level up = Hero's current level * 10\n" +
                "    Hero's hit point = hero's current level * 100\n" +
                "    Hero's mana after level up = Hero's mana before level up * 1.1\n" +
                "    Hero's experience level after level up = Hero's experience level before level up + 1\n" +
                "13. If a hero dies in a battle, the hero will respawn in their nexus in the round after the next round\n" +
                "    i.e. if a hero dies in round 8, the hero will respawn in their nexus in round 10.\n" +
                "\n";
        String heroDetails = "--------------\n" +
                "|   Heroes   |\n" +
                "--------------\n" +
                "\n" +
                "1. A hero has several attributes:\n" +
                "   (1) A name\n" +
                "   (2) A level with an amount of experience points\n" +
                "   (3) HP (hit points, the hero's in battle)\n" +
                "   (4) MP (mana or magic points, for casting spells)\n" +
                "   (5) A strength value\n" +
                "   (6) A dexterity value\n" +
                "   (7) An agility value\n" +
                "   (8) An amount of gold\n" +
                "   (9) An inventory of items\n" +
                "   (10) The weapon and/or armor they have on them\n" +
                "\n" +
                "2.  A hero has a level, representing how strong (or not) that hero is. Experience points determine the hero's level.\n" +
                "    A hero levels up after accumulating enough experience points. A hero's skills increase when the hero levels up.\n" +
                "    A hero never loses experience. It accumulates over the course of the game.\n" +
                "3.  HP (hot point): HP is the hero's current health. The initial HP value is determined by hero's level.\n" +
                "\n" +
                "    Hero's hit points = Hero's current level * 100\n" +
                "\n" +
                "    When a hero levels up, they have their HP set according to the same formula.\n" +
                "\n" +
                "4.  MP: MP (or mana) is used to cast spells.\n" +
                "5.  Strength: A hero's strength increases the amount of damage they deal when using a weapon.\n" +
                "6.  Dexterity: A hero's dexterity increases the amount of damage they deal when casting a spell.\n" +
                "7.  Agility: A hero's agility increases their chance to dodge a monster's attack.\n" +
                "8.  Money: Money is for use in the market.\n" +
                "9.  Inventory. A hero has a collection of items that they have bought during the game. At the\n" +
                "    start of the game, the inventory is empty. There is no maximum size of the inventory.\n" +
                "10. There are three types of heroes, each with their own balance of skills:\n" +
                "    (1) Warriors are favored on strength and agility.\n" +
                "    (2) Sorcerers are favored on dexterity and agility.\n" +
                "    (3) Paladins are favored on strength and dexterity.\n" +
                "\n";
        String monsterDetails = "----------------\n" +
                "|   Monsters   |\n" +
                "----------------\n" +
                "\n" +
                "1.  A monster has several attributes:\n" +
                "    (1) A name\n" +
                "    (2) A level\n" +
                "    (3) HP\n" +
                "    (4) A base damage value\n" +
                "    (5) A defense value\n" +
                "    (6) A dodge ability\n" +
                "\n" +
                "2.  Base damage. This is a monster's attack damage.\n" +
                "3.  Defense. Monsters don't wear armor, relying on their natural hides and carapaces to\n" +
                "    protect them from the heroes' attacks. This value reduces the amount of damage a monster\n" +
                "    takes from a hero's attack or spell.\n" +
                "4.  Dodge ability. This represents how well a monster can avoid a hero's attack. It functions in a\n" +
                "    similar way to the hero's agility.\n" +
                "5.  There are three kinds of monsters, each with a favored attribute:\n" +
                "    (1) Dragons have increased base damage.\n" +
                "    (2) Exoskeletons have increased defense.\n" +
                "    (3) Spirits have increased dodge ability.";

        System.out.println(rules);
        LoVUtility.pause();
        System.out.println(heroDetails);
        LoVUtility.pause();
        System.out.println(monsterDetails);
    }

    public void printRulesMap() {
        String rules = "\n*****************\n" +
                "|   Map Rules   |\n" +
                "*****************\n" +
                "\n" +
                "1.  The map contains 6 types of spaces:\n" +
                "    (a) Bush, which increases hero's dexterity and monster's defense\n" +
                "    (b) Cave, which increases hero's agility and monster's dodge chance\n" +
                "    (c) Koulou, which increases a hero's strength and a monster's damage\n" +
                "    (d) Invalid, which are inaccessible to both heroes and monsters\n" +
                "    (e) Hero Nexus, where heroes respawn and shop at the market\n" +
                "    (f) Monster Nexus, where monsters spawn\n" +
                "2.  The game ends if:\n" +
                "    (1) a hero enters a monster's nexus, or\n" +
                "    (2) a monster enters a hero's nexus\n" +
                "3.  You can provide the following commands (Not case-sensitive):\n" +
                "    (1) W/w: Move up\n" +
                "    (2) A/a: Move left\n" +
                "    (3) S/s: Move down\n" +
                "    (4) D/d: Move right\n" +
                "    (5) Q/q: Quit game\n" +
                "    (6) I/i: Show information about the current hero\n" +
                "    (7) M/m: When in a place that has a Market, use M/m to go to the market\n" +
                "    (8) H/h: To view possible commands while using the map\n" +
                "    (9) R/r: To view the rules of the map\n" +
                "    (10) View Map: To view the map\n" +
                "    (11) Inventory: To view the inventory of a hero\n" +
                "    (12) Drink <Potion ID>: To get a hero to consume a potion e.g. Drink P0\n" +
                "    (13) Regenerate Map: To create a new map e.g. if you are stuck, or just don't like the map you have.\n" +
                "         All heroes and monsters currently alive are sent back to their nexus.\n" +
                "    (14) Equip <Weapon or Armor ID>: To update the weapon or armor a hero is or is not carrying/wearing\n" +
                "         e.g. Equip B0\n" +
                "         To update more than one equippable item i.e. change both weapon and armor, include the weapon and armor IDs in a \n" +
                "         comma-separated manner e.g. Equip B0,E0\n" +
                "    (15) Teleport <Row Number>,<Column Number>: A teleport action allows a hero to move to a space adjacent to a target hero in a\n" +
                "         different lane. Teleport works only between different lanes, so a hero cannot teleport from one\n" +
                "         space in a lane to another space in the same lane. A hero may not teleport to a space ahead of\n" +
                "         the hero being teleported to, onto a space already occupied by another hero, and behind a\n" +
                "         monster in the lane. To go back to a hero's original lane after teleportation, use recall.\n" +
                "    (16) Recall: The recall action allows a hero to return to their specific Nexus. This will always return\n" +
                "         the hero to the Nexus space they spawned at - no matter how far they are from that Nexus\n" +
                "         space (i.e. even if the hero is in another lane).\n" +
                "    (17) [Press Enter without any input]: Do nothing\n" +
                "    Note: A hero cannot enter a cell already occupied by another hero. A monster cannot enter a cell already occupied by another monster.\n";

        System.out.println(rules);
    }
}
