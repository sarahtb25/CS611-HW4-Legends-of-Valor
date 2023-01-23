import java.util.Collections;
import java.util.Scanner;

// Represents the Legends of Valor game logic
public class LoVBoardGame extends BoardGame {
    private static LoVBoardGame loVBoardGame = new LoVBoardGame();
    private static final int NUMBER_OF_HEROES = 3;
    private static final int NUMBER_OF_MONSTERS = NUMBER_OF_HEROES;
    private static final int NUMBER_OF_ROUNDS_TO_SPAWN_MONSTER = 8;
    private final LoVHelp help = new LoVHelp();
    private LoVBoard board;
    private LoVStatistics statistics = new LoVStatistics();
    private LoVPlayer player;
    private Heroes heroes;
    private Monsters monsters;
    private final LoVUtility utility = new LoVUtility();
    private int roundNumber;

    private LoVBoardGame() {
        super();
    }

    public static LoVBoardGame getLoVBoardInstance() {
        return loVBoardGame;
    }

    public void printWelcomeMessage() {
        String border = "*************************************************";
        String welcomeMessage = "WELCOME TO LEGENDS OF VALOR!";

        try {
            System.out.println();
            for (int i = 0; i < border.length(); i++) {
                System.out.print(ConsoleColours.YELLOW_BOLD + border.charAt(i));
                Thread.sleep(10);
            }

            System.out.print("\n          ");

            for (int i = 0; i < welcomeMessage.length(); i++) {
                System.out.print(welcomeMessage.charAt(i));
                Thread.sleep(75);
            }

            System.out.println();

            for (int i = 0; i < border.length(); i++) {
                System.out.print(border.charAt(i));
                Thread.sleep(10);
            }
            System.out.println(ConsoleColours.RESET);
        } catch (Exception e) {
            System.out.println(ConsoleColours.YELLOW_BOLD + "\n" + border);
            System.out.print("          " + welcomeMessage);
            System.out.println("\n" + border + "\n" + ConsoleColours.RESET);
        }
    }

    public void printGameEndMessage() {
        String border = "*************************************************";
        String gameEndMessage = "END OF GAME!";

        try {
            System.out.println();
            for (int i = 0; i < border.length(); i++) {
                System.out.print(ConsoleColours.YELLOW_BOLD + border.charAt(i));
                Thread.sleep(10);
            }

            System.out.print("\n                 ");

            for (int i = 0; i < gameEndMessage.length(); i++) {
                System.out.print(gameEndMessage.charAt(i));
                Thread.sleep(75);
            }

            System.out.println();

            for (int i = 0; i < border.length(); i++) {
                System.out.print(border.charAt(i));
                Thread.sleep(10);
            }
            System.out.println(ConsoleColours.RESET);
        } catch (Exception e) {
            System.out.println(ConsoleColours.YELLOW_BOLD + "\n" + border);
            System.out.print("                 " + gameEndMessage);
            System.out.println("\n" + border + "\n" + ConsoleColours.RESET);
        }
    }

    public void printRoundStartMessage(int roundNumber) {
        String border = "*************************************************";
        String roundStartMessage = "ROUND " + roundNumber + " START!";

        try {
            Thread.sleep(500);

            System.out.println();
            for (int i = 0; i < border.length(); i++) {
                System.out.print(ConsoleColours.YELLOW_BOLD + border.charAt(i));
                Thread.sleep(10);
            }

            System.out.print("\n                 ");

            for (int i = 0; i < roundStartMessage.length(); i++) {
                System.out.print(roundStartMessage.charAt(i));
                Thread.sleep(75);
            }

            System.out.println();

            for (int i = 0; i < border.length(); i++) {
                System.out.print(border.charAt(i));
                Thread.sleep(10);
            }
            System.out.println(ConsoleColours.RESET);
        } catch (Exception e) {
            System.out.println(ConsoleColours.YELLOW_BOLD + "\n" + border);
            System.out.print("                 " + roundStartMessage);
            System.out.println("\n" + border + "\n" + ConsoleColours.RESET);
        }
    }

    public void printRoundEndMessage(int roundNumber) {
        String border = "*************************************************";
        String roundEndMessage = "ROUND " + roundNumber + " END!";

        try {
            System.out.println();
            for (int i = 0; i < border.length(); i++) {
                System.out.print(ConsoleColours.YELLOW_BOLD + border.charAt(i));
                Thread.sleep(10);
            }

            System.out.print("\n                 ");

            for (int i = 0; i < roundEndMessage.length(); i++) {
                System.out.print(roundEndMessage.charAt(i));
                Thread.sleep(75);
            }

            System.out.println();

            for (int i = 0; i < border.length(); i++) {
                System.out.print(border.charAt(i));
                Thread.sleep(10);
            }
            System.out.println(ConsoleColours.RESET);
        } catch (Exception e) {
            System.out.println(ConsoleColours.YELLOW_BOLD + "\n" + border);
            System.out.print("                 " + roundEndMessage);
            System.out.println("\n" + border + "\n" + ConsoleColours.RESET);
        }
    }

    public void getPlayerName() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println(ConsoleColours.GREEN + "[INPUT] Please enter player name:" + ConsoleColours.RESET);
        String playerName = scan.nextLine();

        while(playerName.equals("")) {
            System.out.println(ConsoleColours.RED + "[ERROR] No name given!\n" + ConsoleColours.RESET);
            System.out.println(ConsoleColours.GREEN + "[INPUT] Please enter player name:" + ConsoleColours.RESET);
            playerName = scan.nextLine();
        }

        player = new LoVPlayer(playerName);
    }

    public void setPlayerHeroes() {
        player.setHeroes(heroes);
    }

    public void initializeGame() {
        getPlayerName();
        board = new LoVBoard();
        heroes = board.generateHeroes(NUMBER_OF_HEROES);
        monsters = board.spawnMonsters(NUMBER_OF_MONSTERS);
        roundNumber = 1;
        setPlayerHeroes();
    }

    private void printHeroesInformation() {
        heroes.printHeroes();
    }

    public Heroes getAliveHeroes() {
        Heroes heroesAlive = new Heroes();

        for (Hero hero : heroes.getHeroes()) {
            if (hero.getHitPoints() > 0) {
                heroesAlive.addHero(hero);
            }
        }

        return heroesAlive;
    }

    // Regenerate map
    public void regenerateMap() {
        board = new LoVBoard();
        board.recallHeroesAndMonsters(getAliveHeroes(), monsters);
    }

    // View map
    public void printMap() {
        board.printBoard();
    }

    // Q/q
    public void quit() {
        String quitGameMessage = "[GAME MESSAGE] Quitting game...";

        try {
            System.out.println(ConsoleColours.YELLOW_BOLD);

            for (int i = 0; i < quitGameMessage.length(); i++) {
                System.out.print(quitGameMessage.charAt(i));
                Thread.sleep(75);
            }
            System.out.println("\n" + ConsoleColours.RESET);
        } catch (Exception e) {
            System.out.print(ConsoleColours.YELLOW_BOLD + "\n" + quitGameMessage + "\n" + ConsoleColours.RESET);
        }

        showScore();

        System.exit(1);
    }

    public void printOverallHelp() {
        help.printHelp();
    }

    public void printIntroduction() {
        printWelcomeMessage();
        System.out.println();
        help.printIntroduction();
    }

    // H/h
    public void printHelp() {
        help.printHelpMap();
    }

    // R/r
    public void printRules() {
        help.printRulesMap();
    }

    public void printOverallRules() {
        help.printRules();
    }

    // I/i
    public void printHeroInformation(LoVHero hero) {
        hero.printHero();
    }

    // Inventory
    public void viewHeroInventory(LoVHero hero) {
        hero.getInventory().printInventory();
    }

    // Drink <Potion ID>
    public void drinkPotion(LoVHero hero, String potionId) {
        boolean potionExists = hero.getInventory().checkIfPotionExists(potionId);

        if (potionExists) {
            Potion potion = hero.getInventory().getPotionFromId(potionId);
            hero.drinkPotion(potion);
        } else {
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getName() + " does not have potion "
                    + potionId + " in their inventory!" + ConsoleColours.RESET);
        }
    }

    // Equip <Weapon or Armor ID>
    public void changeWeaponOrArmor(LoVHero hero, String itemId) {
        boolean equippableItemExists;
        EquippableItem equippableItem;
        if (itemId.contains(",")) {
            String[] itemIds = itemId.split(",");

            for (int i = 0; i < itemIds.length; i++) {
                equippableItemExists = hero.getInventory().checkIfEquippableItemExists(itemIds[i]);

                if (equippableItemExists) {
                    equippableItem = hero.getInventory().getEquippableItemFromId(itemIds[i]);
                    hero.replaceAWeaponOrArmor(equippableItem);
                } else {
                    System.out.println(
                            ConsoleColours.RED + "\n[ERROR] Hero " + hero.getName() + " does not have weapon or armor "
                                    + itemIds[i] + " in their inventory!" + ConsoleColours.RESET);
                }
            }
        } else {
            equippableItemExists = hero.getInventory().checkIfEquippableItemExists(itemId);

            if (equippableItemExists) {
                equippableItem = hero.getInventory().getEquippableItemFromId(itemId);
                hero.replaceAWeaponOrArmor(equippableItem);
            } else {
                System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getName()
                        + " does not have weapon or armor " + itemId + " in their inventory!" + ConsoleColours.RESET);
            }
        }

        System.out.println(
                ConsoleColours.YELLOW + "\n[GAME MESSAGE] You are currently armed with:" + ConsoleColours.RESET);
        hero.printCurrentlyEquippedItems();
    }

    // W/w
    public void moveUp(LoVHero hero) {
        board.moveHeroUp(hero, heroes);
    }

    // S/s
    public void moveDown(LoVHero hero) {
        board.moveHeroDown(hero, heroes);
    }

    // A/a
    public void moveLeft(LoVHero hero) {
        board.moveHeroLeft(hero, heroes);
    }

    // D/d
    public void moveRight(LoVHero hero) {
        board.moveHeroRight(hero, heroes);
    }

    public void recall(LoVHero hero) {
        board.recallHero(hero, heroes);
    }

    public void teleport(LoVHero hero, int row, int column) {
        board.teleportHero(hero, row, column, heroes);
    }

    public int getNumberOfHeroesAlive() {
        return heroes.getNumberOfHeroesAlive();
    }

    public void reviveHeroes() {
        for (Hero hero : heroes.getHeroes()) {
            if (hero.getHitPoints() > 0 && hero instanceof LoVHero) {
                LoVHero loVHero = (LoVHero) hero;
                loVHero.revive(loVHero.getHitPoints(), loVHero.getMana());
            }
        }
    }

    // Start the hero's market
    public String goToMarket(LoVHero hero) {
        String response = "";
        // Check if hero is in its nexus cell to be able to access the market
        if (hero.getRow() == hero.getNexusRow() && hero.getColumn() == hero.getNexusColumn()) {
            Cell nexusCell = board.getLoVBoardCell(hero.getNexusRow(), hero.getNexusColumn());
            response = ((HeroNexusPiece) nexusCell.getPiece()).goToMarket(); // Start the market
        } else {
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId()
                    + " is not allowed to go to the market!" + ConsoleColours.RESET);
        }

        return response;
    }

    @Override
    public void playGame() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String userInput = "y";
        LoVHero hero;
        MHMonster monster;
        boolean isValid;

        // Allow game to be multiple times if desired
        while (userInput.equals("y")) {
            printIntroduction();
            LoVUtility.pause();
            printOverallRules();
            LoVUtility.pause();
            printOverallHelp();
            initializeGame();
            LoVRoundHistory loVRoundHistory = new LoVRoundHistory(heroes);

            while (!checkGameStatus()) {
                printRoundStartMessage(roundNumber);

                int turn = 0; // track the turn number

                // Respawn hero in the next round if there are any heroes that are unconscious
                if (getNumberOfHeroesAlive() < NUMBER_OF_HEROES) {
                    for (Hero heroPresent : heroes.getHeroes()) {
                        if (heroPresent.getHitPoints() <= 0 && heroPresent instanceof LoVHero) {
                            LoVHero loVHero = (LoVHero) heroPresent;
                            if (roundNumber - loVHero.getRoundNumberWhenUnconscious() > 1) {
                                board.respawnHero((LoVHero) heroPresent, heroes);
                            }
                        }
                    }
                }

                // spawn monsters after every 8 rounds
                if (roundNumber % NUMBER_OF_ROUNDS_TO_SPAWN_MONSTER == 0) {
                    Monsters spawnedMonsters = board.spawnMonsters(NUMBER_OF_MONSTERS);

                    for (Monster monsterSpawn : spawnedMonsters.getMonsters()) {
                        monsters.addMonster(monsterSpawn);
                    }
                }

                Collections.sort(heroes.getHeroes(), new LoVHeroLocationComparator());
                printHeroesInformation();

                Collections.sort(monsters.getMonsters(), new LoVMonsterLocationComparator());

                printMap();

                // For each round
                while (turn < (heroes.getHeroes().size() + monsters.getMonsters().size()) && !checkGameStatus()) {
                    // hero turn
                    if (turn < heroes.getHeroes().size()) {
                        if (heroes.getHeroes().get(turn).getHitPoints() > 0) {
                            hero = (LoVHero) heroes.getHeroes().get(turn);

                            // Check for battle first
                            MHMonster inRangeMonster = board.getMonsterInRange(hero);
                            if (inRangeMonster != null) {
                                Fighters fighters = new Fighters(hero, inRangeMonster);
                                String userResponse = new LoVBattle(fighters).fighterTurn(hero);

                                if (userResponse.equals("q")) {
                                    statistics.addRoundHistory(loVRoundHistory);
                                    quit();
                                }

                                board.removeHeroFromBoardIfUnconscious(hero, heroes, roundNumber);
                                board.removeMonsterFromBoardIfUnconscious(monsters);
                            } else {
                                // Allow hero to move
                                do {
                                    System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " "
                                            + hero.getId());

                                    System.out.println(ConsoleColours.GREEN
                                            + "\n[INPUT] Please provide a valid map command (Enter [H/h] for a list of possible commands):"
                                            + ConsoleColours.RESET);
                                    userInput = scan.next().trim().toLowerCase();
                                    isValid = utility.checkValidUserResponse(userInput);
                                    if (!isValid) {
                                        System.out.println(
                                                ConsoleColours.RED + "\n[ERROR] Invalid Input!" + ConsoleColours.RESET);
                                    }
                                } while (!isValid);

                                if (userInput.equals("w")) {
                                    // Move Up
                                    moveUp(hero);
                                } else if (userInput.equals("a")) {
                                    // Move Left
                                    moveLeft(hero);
                                } else if (userInput.equals("s")) {
                                    // Move Down
                                    moveDown(hero);
                                } else if (userInput.equals("d")) {
                                    // Move Right
                                    moveRight(hero);
                                } else if (userInput.equals("q")) {
                                    statistics.addRoundHistory(loVRoundHistory);
                                    quit();
                                } else if (userInput.equals("h")) {
                                    printHelp();
                                    turn--;
                                } else if (userInput.equals("r")) {
                                    printRules();
                                    turn--;
                                } else if (userInput.equals("i")) {
                                    printHeroInformation(hero);
                                    turn--;
                                } else if (userInput.equals("m")) {
                                    // Go to Market
                                    String userResponse = goToMarket(hero);
                                    if (userResponse.equals("q")) {
                                        statistics.addRoundHistory(loVRoundHistory);
                                        quit();
                                    }

                                    turn--;
                                } else if (userInput.equals("view map")) {
                                    // Map gets printed after each turn
                                    turn--;
                                } else if (userInput.equals("regenerate map")) {
                                    regenerateMap();
                                    turn--;
                                } else if (userInput.contains("inventory")) {
                                    viewHeroInventory(hero);
                                    turn--;
                                    System.out.println();
                                } else if (userInput.contains("drink ")) {
                                    String potionId = userInput.split(" ")[1].toUpperCase();
                                    drinkPotion(hero, potionId);
                                } else if (userInput.contains("equip ")) {
                                    String itemId = userInput.split(" ")[1].toUpperCase();
                                    changeWeaponOrArmor(hero, itemId);
                                } else if (userInput.equals("recall")) {
                                    recall(hero);
                                } else if (userInput.contains("teleport ")) {
                                    String rowInput = userInput.split(" ")[1].split(",")[0].trim();
                                    String columnInput = userInput.split(" ")[1].split(",")[1].trim();

                                    if (utility.checkIsNumber(rowInput) && utility.checkIsNumber(columnInput)) {
                                        // make row and column 0-index
                                        int row = Integer.parseInt(rowInput) - 1;
                                        int column = Integer.parseInt(columnInput) - 1;
                                        teleport(hero, row, column);
                                    } else {
                                        System.out.println(ConsoleColours.RED
                                                + "\n[ERROR] Row and Column numbers must be provided!" + ConsoleColours.RESET);
                                        turn--;
                                    }
                                }
                            }
                            printMap();
                            LoVUtility.pause();
                        }
                    } else {
                        if (monsters.getMonsters().get(turn - heroes.getHeroes().size()) instanceof MHMonster) {
                            monster = (MHMonster) monsters.getMonsters().get(turn - heroes.getHeroes().size());

                            if (monster.getHitPoint() > 0) {
                                // Check for battle first
                                LoVHero inRangeHero = board.getHeroInRange(monster);
                                if (inRangeHero != null) {
                                    Fighters fighters = new Fighters(inRangeHero, monster);
                                    new LoVBattle(fighters).fighterTurn(monster);
                                    board.removeHeroFromBoardIfUnconscious(inRangeHero, heroes, roundNumber);
                                    board.removeMonsterFromBoardIfUnconscious(monsters);
                                } else {
                                    board.moveMonsterDown(monster, monster.getRow() + 1, monster.getColumn(), monsters);
                                }

                                printMap();
                                LoVUtility.pause();
                            }
                        }
                    }

                    turn++;
                }

                if (checkGameStatus()) {
                    String winner = returnWinner();

                    if (winner.equals("hero")) {
                        System.out.println(ConsoleColours.YELLOW_BOLD + "\n[WINNER] Congratulations! Heroes won!" + ConsoleColours.RESET);
                    } else {
                        System.out.println(ConsoleColours.YELLOW_BOLD + "\n[WINNER] Monsters won!" + ConsoleColours.RESET);
                    }

                    break;
                } else {
                    printRoundEndMessage(roundNumber);
                    System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Rewarding heroes who are alive..." + ConsoleColours.RESET);
                    reviveHeroes();

                    roundNumber++;
                }
            }

            printGameEndMessage();
            loVRoundHistory.printRoundScores();
            statistics.addRoundHistory(loVRoundHistory);

            System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Would you like to play again? Y/N" + ConsoleColours.RESET);
            userInput = scan.next().trim().toLowerCase();
            while (!userInput.equals("y") && !userInput.equals("n")) {
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Would you like to play again? Y/N" + ConsoleColours.RESET);
                userInput = scan.next().trim().toLowerCase();
            }

            if (userInput.equals("n")) {
                quit();
            }
        }
    }

    @Override
    public boolean checkGameStatus() {
        boolean heroNexusHasMonster = board.checkHeroNexusForMonster();
        boolean monsterNexusHasHero = board.checkMonsterNexusForHero();

        return (heroNexusHasMonster || monsterNexusHasHero);
    }

    public String returnWinner() {
        if (board.checkHeroNexusForMonster()) {
            return "monster";
        }

        return "hero";
    }

    @Override
    public void showScore() {
        statistics.printStatistics();
    }
}
