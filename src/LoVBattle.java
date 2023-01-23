import java.util.Scanner;

// Represents a battle in Legends of Valor
public class LoVBattle implements Battle {
    private Fighters fighters;
    private final LoVHelp help = new LoVHelp();

    public LoVBattle(Fighters fighters) {
        this.fighters = fighters;

        System.out.print(ConsoleColours.CYAN + "\n--------------------------------------");
        System.out.print("\n|           BATTLE START             |");
        System.out.println("\n--------------------------------------" + ConsoleColours.RESET);
    }

    public Fighters getFighters() {
        return fighters;
    }

    public void setFighters(Fighters fighters) {
        this.fighters = fighters;
    }

    // Print instructions
    public void printHelp() {
        help.printHelpBattle();
    }

    public void printRules() {
        help.printRulesBattle();
    }

    public boolean checkUserResponse(String userResponse) {
        return (userResponse.contains("equip ") || userResponse.equals("hit") || userResponse.contains("drink ") || userResponse.contains("cast ") || userResponse.equals("i") || userResponse.equals("r") || userResponse.equals("q") || userResponse.equals("h"));
    }

    public String fighterTurn(BoardGameNonPlayerCharacter nonPlayerCharacter) {
        String response = "";

        // Whose turn it is depends on the BoardGameNonPlayerCharacter passed in from LoVBoardGame
        if (nonPlayerCharacter instanceof LoVHero) {
            response = fight();
        } else {
            monsterFight();
        }

        return response;
    }

    @Override
    public String fight() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String userResponse = "";
        String response = "";
        int turn = 0;
        boolean isValid;
        LoVHero hero = new LoVHero();
        MHMonster monster = new MHMonster();

        if (fighters.getHero() instanceof LoVHero) {
            hero = (LoVHero) fighters.getHero();
        }

        if (fighters.getMonster() instanceof MHMonster) {
            monster = (MHMonster) fighters.getMonster();
        }

        printHelp();
        System.out.println("\n");
        LoVUtility.pause();
        fighters.printFightersInformation();

        while (turn <= 0) {
            if (hero.getHitPoints() > 0 && monster.getHitPoint() > 0) {
                // Player's turn
                do {
                    System.out.println(ConsoleColours.GREEN + "\n[INPUT] Please enter the action you would like to take (Equip <Weapon or Armor ID>, Hit, Drink <Potion ID>, Cast <Spell ID>, I/i, Q/q, H/h, R/r):" + ConsoleColours.RESET);
                    userResponse = scan.next().trim().toLowerCase();
                    isValid = checkUserResponse(userResponse);
                    if (!isValid) {
                        System.out.println(ConsoleColours.RED + "\n[ERROR] Invalid Input!" + ConsoleColours.RESET);
                    }
                } while (!isValid);

                if (userResponse.contains("equip ")) {
                    EquippableItem equippableItem;
                    boolean equippableItemExists;

                    String itemId = userResponse.split(" ")[1].toUpperCase();
                    if (itemId.contains(",")) {
                        String[] itemIds = itemId.split(",");

                        for (String id : itemIds) {
                            equippableItemExists = hero.getInventory().checkIfEquippableItemExists(id);

                            if (equippableItemExists) {
                                equippableItem = hero.getInventory().getEquippableItemFromId(id);
                                hero.replaceAWeaponOrArmor(equippableItem);
                            } else {
                                System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getName() + " " + hero.getId() + " does not have weapon or armor " + id + " in their inventory! You just lost a turn." + ConsoleColours.RESET);
                            }
                        }
                    } else {
                        equippableItemExists = hero.getInventory().checkIfEquippableItemExists(itemId);

                        if (equippableItemExists) {
                            equippableItem = hero.getInventory().getEquippableItemFromId(itemId);
                            hero.replaceAWeaponOrArmor(equippableItem);
                        } else {
                            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getName() + " does not have weapon or armor " + itemId + " in their inventory! You just lost a turn." + ConsoleColours.RESET);
                        }
                    }

                    System.out.println(ConsoleColours.CYAN + "\n[BATTLE MESSAGE] You are currently armed with:" + ConsoleColours.RESET);
                    hero.printCurrentlyEquippedItems();
                } else if (userResponse.contains("drink ")) {
                    String potionId = userResponse.split(" ")[1].toUpperCase();
                    boolean potionExists = hero.getInventory().checkIfPotionExists(potionId);
                    if (potionExists) {
                        Potion potion = hero.getInventory().getPotionFromId(potionId);
                        hero.drinkPotion(potion);
                    } else {
                        System.out.println(ConsoleColours.RED + "\n[ERROR] Potion " + potionId + " does not exist in " + hero.getName() + " " + hero.getId() + "'s inventory! You just lost a turn." + ConsoleColours.RESET);
                    }
                } else if (userResponse.contains("cast ")) {
                    String spellId = userResponse.split(" ")[1].toUpperCase();
                    boolean spellExists = hero.getInventory().checkIfSpellExists(spellId);
                    if (spellExists) {
                        Spell spell = hero.getInventory().getSpellFromId(spellId);
                        response = hero.castSpell(spell, monster);
                        if (response.contains("[ERROR]")) {
                            System.out.println("\n" + ConsoleColours.RED + response + ConsoleColours.RESET);
                        } else {
                            System.out.println("\n" + ConsoleColours.CYAN + response + ConsoleColours.RESET);
                        }

                    } else {
                        System.out.println(ConsoleColours.RED + "\n[ERROR] Spell " + spellId + " does not exist in " + hero.getName() + " " + hero.getId() + "'s inventory! You just lost a turn." + ConsoleColours.RESET);
                    }
                } else if (userResponse.equals("hit")) {
                    response = hero.hit(monster);
                    System.out.println(ConsoleColours.CYAN + response + ConsoleColours.RESET);
                } else if (userResponse.equals("i")) {
                    fighters.printFightersInformation();
                    turn--; // Ensure when increment happens, it is still hero's turn
                } else if (userResponse.equals("h")) {
                    printHelp();
                    turn--; // Ensure when increment happens, it is still hero's turn
                } else if (userResponse.equals("q")) { // Quit the game
                    break;
                } else if (userResponse.equals("r")) {
                    printRules();
                    turn--; // Ensure when increment happens, it is still hero's turn
                }
            }

            turn++;
        }

        if (!userResponse.equals("q")) {
            checkBattleStatus(hero, monster);
        }

        // contains q if user quits the game
        return userResponse;
    }

    public void monsterFight() {
        String response = "";
        LoVHero hero = new LoVHero();
        MHMonster monster = new MHMonster();

        if (fighters.getHero() instanceof LoVHero) {
            hero = (LoVHero) fighters.getHero();
        }

        if (fighters.getMonster() instanceof MHMonster) {
            monster = (MHMonster) fighters.getMonster();
        }

        // Monster's turn
        response = monster.attack(hero);
        System.out.println(ConsoleColours.CYAN + "\n" + response + ConsoleColours.RESET);

        checkBattleStatus(hero, monster);
    }

    public void checkBattleStatus(LoVHero hero, MHMonster monster) {
        // Hero wins
        if (!hero.isUnconscious() && monster.getHitPoint() <= 0) {
            System.out.println(ConsoleColours.CYAN + "\n[BATTLE MESSAGE] Congratulations! Hero " + hero.getName() + " " + hero.getId() + " wins!" + ConsoleColours.RESET);
            updateHeroAfterBattle(hero, monster.getLevel());
        } else if (hero.isUnconscious() && monster.getHitPoint() > 0) {
            // Monster wins
            System.out.println(ConsoleColours.CYAN + "\n[BATTLE MESSAGE] Monster " + monster.getName() + " " + monster.getId() + " wins!" + ConsoleColours.RESET);
        } else {
            // Battle in progress
            System.out.println(ConsoleColours.CYAN + "\n[BATTLE MESSAGE] Battle to be continued..." + ConsoleColours.RESET);
        }
    }

    public void updateHeroAfterBattle(LoVHero hero, int monsterLevel) {
        hero.updateExperienceGained();
        hero.updateMoneyAfterBattle(monsterLevel);
    }
}
