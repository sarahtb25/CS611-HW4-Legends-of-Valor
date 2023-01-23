import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

// Represents a Legends of Valor Board
public class LoVBoard extends Board {
    public static final int NUMBER_OF_ROWS_AND_COLUMNS = 8;
    public static final int[] INVALID_COLUMNS = { 2, 5 };
    public static final int HERO_NEXUS_ROW = NUMBER_OF_ROWS_AND_COLUMNS - 1;
    public static final int MONSTER_NEXUS_ROW = 0;
    public static final double PROPORTION_OF_EACH_SPECIAL_PIECE = 0.2; // Bush, Cave and Koulou
    public static final int LENGTH_OF_EACH_CELL = 9;
    public static final int LENGTH_OF_EACH_CELL_WITH_SPACE = 10;
    public static final int WIDTH_OF_EACH_CELL = 3;
    public static final int WIDTH_OF_EACH_CELL_WITH_NEWLINE = 4;
    public static final int LENGTH_OF_ID = 3;
    public static final int HERO_SPAWN_ROW = 7;

    // Exclude the 2 columns of invalid pieces, 1 row of heroes' nexus and 1 row of
    // monsters' nexus
    public static int NUMBER_OF_EACH_SPECIAL_PIECE = (int) (PROPORTION_OF_EACH_SPECIAL_PIECE
            * (NUMBER_OF_ROWS_AND_COLUMNS - 2) * (NUMBER_OF_ROWS_AND_COLUMNS - 2));

    public static final List<List<Integer>> MONSTER_NEXUS = Arrays.asList(Arrays.asList(MONSTER_NEXUS_ROW, 1),
            Arrays.asList(MONSTER_NEXUS_ROW, 4),
            Arrays.asList(MONSTER_NEXUS_ROW, 7));
    public static final List<List<Integer>> HERO_NEXUS = Arrays.asList(Arrays.asList(HERO_NEXUS_ROW, 0),
            Arrays.asList(HERO_NEXUS_ROW, 3),
            Arrays.asList(HERO_NEXUS_ROW, 6));

    public static final List<List<Integer>> LANES = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(3, 4),
            Arrays.asList(6, 7));

    public static Map<Integer, Integer> discoveredRowLimit;

    public LoVBoard() {
        super(NUMBER_OF_ROWS_AND_COLUMNS);

        Cell[][] board = getLoVBoard();

        // Initialise and assign default discovered row limit values
        discoveredRowLimit = new HashMap<Integer, Integer>();
        for (int i = 0; i < LANES.size(); i++) {
            discoveredRowLimit.put(i, HERO_SPAWN_ROW);
        }

        // Set the 2 columns of Invalid pieces
        for (int row = 0; row < NUMBER_OF_ROWS_AND_COLUMNS; row++) {
            for (int column_index = 0; column_index < INVALID_COLUMNS.length; column_index++) {
                if (!board[row][INVALID_COLUMNS[column_index]].getOccupied()) {
                    board[row][INVALID_COLUMNS[column_index]].setPiece(new InvalidPiece());
                    board[row][INVALID_COLUMNS[column_index]].setOccupied(true);
                }
            }
        }

        // Set 1 row of Hero Nexus pieces
        for (int column = 0; column < NUMBER_OF_ROWS_AND_COLUMNS; column++) {
            if (!board[HERO_NEXUS_ROW][column].getOccupied()) {
                board[HERO_NEXUS_ROW][column].setPiece(new HeroNexusPiece());
                board[HERO_NEXUS_ROW][column].setOccupied(true);
            }
        }

        // Set 1 row of Monster Nexus pieces
        for (int column = 0; column < NUMBER_OF_ROWS_AND_COLUMNS; column++) {
            if (!board[MONSTER_NEXUS_ROW][column].getOccupied()) {
                board[MONSTER_NEXUS_ROW][column].setPiece(new MonsterNexusPiece());
                board[MONSTER_NEXUS_ROW][column].setOccupied(true);
            }
        }

        // Set Bush pieces
        for (int i = 0; i < NUMBER_OF_EACH_SPECIAL_PIECE; i++) {
            int row = (int) (Math.random() * NUMBER_OF_ROWS_AND_COLUMNS);
            int col = (int) (Math.random() * NUMBER_OF_ROWS_AND_COLUMNS);

            if (!board[row][col].getOccupied()) {
                board[row][col].setPiece(new BushPiece());
                board[row][col].setOccupied(true);
            } else {
                i--;
            }
        }

        // Set Cave pieces
        for (int i = 0; i < NUMBER_OF_EACH_SPECIAL_PIECE; i++) {
            int row = (int) (Math.random() * NUMBER_OF_ROWS_AND_COLUMNS);
            int col = (int) (Math.random() * NUMBER_OF_ROWS_AND_COLUMNS);

            if (!board[row][col].getOccupied()) {
                board[row][col].setPiece(new CavePiece());
                board[row][col].setOccupied(true);
            } else {
                i--;
            }
        }

        // Set Koulou pieces
        for (int i = 0; i < NUMBER_OF_EACH_SPECIAL_PIECE; i++) {
            int row = (int) (Math.random() * NUMBER_OF_ROWS_AND_COLUMNS);
            int col = (int) (Math.random() * NUMBER_OF_ROWS_AND_COLUMNS);

            if (!board[row][col].getOccupied()) {
                board[row][col].setPiece(new KoulouPiece());
                board[row][col].setOccupied(true);
            } else {
                i--;
            }
        }

        // Set Plain pieces
        for (int row = 0; row < NUMBER_OF_ROWS_AND_COLUMNS; row++) {
            for (int col = 0; col < NUMBER_OF_ROWS_AND_COLUMNS; col++) {
                if (!board[row][col].getOccupied()) {
                    board[row][col].setPiece(new PlainPiece());
                    board[row][col].setOccupied(true);
                }
            }
        }

        for (int row = 0; row < NUMBER_OF_ROWS_AND_COLUMNS; row++) {
            for (int col = 0; col < NUMBER_OF_ROWS_AND_COLUMNS; col++) {
                if (!board[row][col].getCellType().equals("N")) {
                    board[row][col].setOccupied(true);
                }
            }
        }

        setBoard(board);
    }

    public Cell[][] getLoVBoard() {
        return getBoard();
    }

    public Cell getLoVBoardCell(int row, int column) {
        return getLoVBoard()[row][column];
    }

    @Override
    public void printBoard() {
        Cell[][] board = getLoVBoard();
        int i = 0, j = 0;

        System.out.print("\n      ");
        String columnNumbers = "";
        for (int col = 0; col < NUMBER_OF_ROWS_AND_COLUMNS; col++) {
            columnNumbers += (col + 1) + "          ";
        }
        System.out.println(ConsoleColours.WHITE_BOLD + columnNumbers + ConsoleColours.RESET);
        /*
         * Bush - Green
         * Cave - Yellow
         * Koulou - Cyan
         * Plain - White
         * Invalid - Red
         * Hero Nexus - Blue
         * Monster Nexus - Purple
         * Hero - Yellow Bold
         * Monster - Cyan Bold
         */
        while (i < (NUMBER_OF_ROWS_AND_COLUMNS * WIDTH_OF_EACH_CELL_WITH_NEWLINE)
                || j < (NUMBER_OF_ROWS_AND_COLUMNS * LENGTH_OF_EACH_CELL_WITH_SPACE)) {
            if (j >= NUMBER_OF_ROWS_AND_COLUMNS * LENGTH_OF_EACH_CELL_WITH_SPACE) {
                j = 0;
                System.out.println();
                if (i < (NUMBER_OF_ROWS_AND_COLUMNS * WIDTH_OF_EACH_CELL_WITH_NEWLINE) - 1) {
                    i++;
                } else {
                    break;
                }
            }

            if (j % LENGTH_OF_EACH_CELL_WITH_SPACE == LENGTH_OF_EACH_CELL) {
                System.out.print("  ");
                j++; // go to next column
            } else if (i % WIDTH_OF_EACH_CELL_WITH_NEWLINE == WIDTH_OF_EACH_CELL) {
                System.out.println();
                i++; // go to next row
            } else {
                int row = i / WIDTH_OF_EACH_CELL_WITH_NEWLINE;
                int column = j / LENGTH_OF_EACH_CELL_WITH_SPACE;
                if (row < NUMBER_OF_ROWS_AND_COLUMNS && column < NUMBER_OF_ROWS_AND_COLUMNS) {
                    String border = board[row][column].getPiece().getId() + "-" +
                            board[row][column].getPiece().getId() + "-" +
                            board[row][column].getPiece().getId() + "-" +
                            board[row][column].getPiece().getId() + "-" +
                            board[row][column].getPiece().getId();

                    if (i % (WIDTH_OF_EACH_CELL - 1) == 0) {
                        if (j == 0) {
                            System.out.print("  ");
                        }

                        if (board[row][column].getPiece() instanceof BushPiece) {
                            System.out.print(ConsoleColours.GREEN + border + ConsoleColours.RESET);
                        } else if (board[row][column].getPiece() instanceof CavePiece) {
                            System.out.print(ConsoleColours.YELLOW + border + ConsoleColours.RESET);
                        } else if (board[row][column].getPiece() instanceof KoulouPiece) {
                            System.out.print(ConsoleColours.CYAN + border + ConsoleColours.RESET);
                        } else if (board[row][column].getPiece() instanceof PlainPiece) {
                            System.out.print(ConsoleColours.WHITE + border + ConsoleColours.RESET);
                        } else if (board[row][column].getPiece() instanceof InvalidPiece) {
                            System.out.print(ConsoleColours.RED + border + ConsoleColours.RESET);
                        } else if (board[row][column].getPiece() instanceof HeroNexusPiece) {
                            System.out.print(ConsoleColours.BLUE + border + ConsoleColours.RESET);
                        } else if (board[row][column].getPiece() instanceof MonsterNexusPiece) {
                            System.out.print(ConsoleColours.PURPLE + border + ConsoleColours.RESET);
                        }

                    } else if (i % (WIDTH_OF_EACH_CELL - 1) == 1) {
                        if (j == 0) {
                            System.out.print(ConsoleColours.WHITE_BOLD + (row + 1) + " " + ConsoleColours.RESET);
                        }

                        if (board[row][column].getPiece() instanceof LoVPiece) {
                            String heroId = ((LoVPiece) board[row][column].getPiece()).getHero().getId();
                            String monsterId = ((LoVPiece) board[row][column].getPiece()).getMonster().getId();

                            if (heroId.length() < 3) {
                                for (int k = 0; k < (LENGTH_OF_ID - heroId.length()); k++) {
                                    heroId += " ";
                                }
                            }

                            if (monsterId.length() < 3) {
                                for (int k = 0; k < (LENGTH_OF_ID - monsterId.length()); k++) {
                                    monsterId += " ";
                                }
                            }

                            if (board[row][column].getPiece() instanceof BushPiece) {
                                System.out.print(ConsoleColours.GREEN + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.GREEN + "|" + ConsoleColours.RESET);
                            } else if (board[row][column].getPiece() instanceof CavePiece) {
                                System.out.print(ConsoleColours.YELLOW + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW + "|" + ConsoleColours.RESET);
                            } else if (board[row][column].getPiece() instanceof KoulouPiece) {
                                System.out.print(ConsoleColours.CYAN + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.CYAN + "|" + ConsoleColours.RESET);
                            } else if (board[row][column].getPiece() instanceof PlainPiece) {
                                System.out.print(ConsoleColours.WHITE + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.WHITE + "|" + ConsoleColours.RESET);
                            } else if (board[row][column].getPiece() instanceof InvalidPiece) {
                                System.out.print(ConsoleColours.RED + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.RED + "|" + ConsoleColours.RESET);
                            } else if (board[row][column].getPiece() instanceof HeroNexusPiece) {
                                System.out.print(ConsoleColours.BLUE + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.BLUE + "|" + ConsoleColours.RESET);
                            } else if (board[row][column].getPiece() instanceof MonsterNexusPiece) {
                                System.out.print(ConsoleColours.PURPLE + "|" + ConsoleColours.RESET
                                        + ConsoleColours.YELLOW_BOLD + heroId + ConsoleColours.RESET + " "
                                        + ConsoleColours.CYAN_BOLD + monsterId + ConsoleColours.RESET
                                        + ConsoleColours.PURPLE + "|" + ConsoleColours.RESET);
                            }
                        }
                    }
                }
                j += LENGTH_OF_EACH_CELL; // Move to space column before next cell's column
            }
        }
    }

    public void respawnHero(LoVHero hero, Heroes heroes) {
        hero.setHitPoints(hero.getExperience() * LoVHero.HIT_POINT_FACTOR);
        hero.setMana(hero.getExperience() * LoVHero.MANA_FACTOR);
        hero.setRow(hero.getNexusRow());
        hero.setColumn(hero.getNexusColumn());
        if (getLoVBoardCell(hero.getRow(), hero.getColumn()).getPiece() instanceof LoVPiece) {
            LoVPiece piece = (LoVPiece) getLoVBoardCell(hero.getRow(), hero.getColumn()).getPiece();
            piece.enterLoVPiece(hero, heroes, null);
        }
        hero.incrementRespawnCount();
        System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId()
                + " has respawned!" + ConsoleColours.RESET);
    }

    public Monsters spawnMonsters(int numberOfMonsters) {
        Monsters monsters = new GenerateMonsters(numberOfMonsters).getMonsters();
        setMonstersInNexus(monsters);

        for (Monster monster : monsters.getMonsters()) {
                if (monster instanceof MHMonster) {
                    System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] New monster " + monster.getName()
                            + " " + monster.getId() + " has spawned!" + ConsoleColours.RESET);
                }
        }

        return monsters;
    }

    public Heroes generateHeroes(int numberOfHeroes) {
        Heroes heroes = new GenerateHeroes(numberOfHeroes).getHeroes();

        for (Hero hero : heroes.getHeroes()) {
            if (hero instanceof LoVHero) {
                for (List<Integer> heroNexus : HERO_NEXUS) {
                    Cell heroNexusCell = getLoVBoardCell(heroNexus.get(0), heroNexus.get(1));
                    HeroNexusPiece heroNexusPiece = (HeroNexusPiece) heroNexusCell.getPiece();

                    if (!heroNexusPiece.hasHero()) {
                        // Set the hero nexus row and column
                        LoVHero loVHero = (LoVHero) hero;
                        loVHero.setNexusRow(heroNexus.get(0));
                        loVHero.setNexusColumn(heroNexus.get(1));
                        // Update hero location
                        loVHero.setRow((loVHero.getNexusRow()));
                        loVHero.setColumn((loVHero.getNexusColumn()));
                        // Place hero in that hero nexus piece in the cell
                        heroNexusPiece.setHero(loVHero);
                        break;
                    }
                }
            }
        }

        return heroes;
    }

    public boolean checkMonsterNexusForHero() {
        for (List<Integer> lane : LANES) {
            for (Integer column : lane) {
                Cell monsterNexusCell = getLoVBoardCell(MONSTER_NEXUS_ROW, column);

                if (((MonsterNexusPiece) monsterNexusCell.getPiece()).hasHero()) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkHeroNexusForMonster() {
        for (List<Integer> lane : LANES) {
            for (Integer column : lane) {
                Cell heroNexusCell = getLoVBoardCell(HERO_NEXUS_ROW, column);

                if (((HeroNexusPiece) heroNexusCell.getPiece()).hasMonster()) {
                    return true;
                }
            }
        }

        return false;
    }

    public void recallHeroesAndMonsters(Heroes heroes, Monsters monsters) {
        for (Hero hero : heroes.getHeroes()) {
            if (hero instanceof LoVHero) {
                LoVHero loVHero = (LoVHero) hero;

                if (!loVHero.isUnconscious()) {
                    recallHero(loVHero, heroes);
                }
            }
        }

        setMonstersInNexus(monsters);
        System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Heroes and Monsters have been recalled!" + ConsoleColours.RESET);
    }

    public void setMonstersInNexus(Monsters monsters) {
        for (Monster monster : monsters.getMonsters()) {
            for (List<Integer> monsterNexus : MONSTER_NEXUS) {
                Cell monsterNexusCell = getLoVBoardCell(monsterNexus.get(0), monsterNexus.get(1));
                MonsterNexusPiece monsterNexusPiece = (MonsterNexusPiece) monsterNexusCell.getPiece();

                if (!monsterNexusPiece.hasMonster()) {
                    // Set the monster nexus row and column
                    monster.setRow(monsterNexus.get(0));
                    monster.setColumn(monsterNexus.get(1));
                    // Place monster in that monster nexus piece in the cell
                    if (monster instanceof MHMonster) {
                        monsterNexusPiece.setMonster((MHMonster) monster);
                        break;
                    }
                }
            }
        }
    }

    // Check if hero's move is valid
    public boolean isMoveValid(LoVHero hero, int moveToRow, int moveToColumn) {
        int moveToLaneNumber;
        int heroNexusLaneNumber;

        // Should not exceed row or column board limits
        if (moveToRow >= LoVBoard.NUMBER_OF_ROWS_AND_COLUMNS || moveToColumn >= LoVBoard.NUMBER_OF_ROWS_AND_COLUMNS
                || moveToRow < 0 || moveToColumn < 0) {
            return false;
        }

        if (getLoVBoardCell(moveToRow, moveToColumn).getPiece() instanceof LoVPiece) {
            LoVPiece piece = (LoVPiece) getLoVBoardCell(moveToRow, moveToColumn).getPiece();

            // Should not go into inaccessible squares and another hero should not be
            // present in the cell
            if (piece instanceof InvalidPiece || piece.hasHero()) {
                return false;
            }

            moveToLaneNumber = getLaneNumber(moveToColumn); // New lane number to want to move to
            heroNexusLaneNumber = getLaneNumber(hero.getNexusColumn());

            if (heroNexusLaneNumber != moveToLaneNumber) { // Hero does not belong to the current lane
                if (discoveredRowLimit.get(moveToLaneNumber) > moveToRow) {
                    // Move is beyond discovered row limit for that lane
                    return false;
                }
            }

            // Valid move
            return true;
        }

        return false;
    }

    public boolean moveHero(LoVHero hero, int newRow, int newColumn, Heroes heroes) {
        int newLaneNumber;
        int heroNexusLaneNumber;
        Cell oldHeroCell;
        Cell newHeroCell;
        LoVPiece oldPiece;
        LoVPiece newPiece;

        // Check move validity
        if (!isMoveValid(hero, newRow, newColumn)) {
            return false;
        }

        oldHeroCell = getLoVBoardCell(hero.getRow(), hero.getColumn());
        newHeroCell = getLoVBoardCell(newRow, newColumn);

        // Add hero to new piece and add new piece effects
        if (oldHeroCell.getPiece() instanceof LoVPiece && newHeroCell.getPiece() instanceof LoVPiece) {
            oldPiece = (LoVPiece) oldHeroCell.getPiece();
            newPiece = (LoVPiece) newHeroCell.getPiece();
            MHMonster inRangeMonster = getMonsterInRange(hero);
            if (inRangeMonster == null || newRow <= inRangeMonster.getRow()) {
                // Remove hero from old piece and remove its effects on the hero
                oldPiece.leaveLoVPiece(hero, heroes, null);

                // Move hero
                hero.setRow(newRow);
                hero.setColumn(newColumn);
                newPiece.enterLoVPiece(hero, heroes, null);
            } else {
                System.out.println(
                        ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() + " unable to go past undefeated monster "
                                + inRangeMonster.getId() + "!" + ConsoleColours.RESET);
            }

            // Update discovered row limit if the hero moves higher than before, in its own
            // lane
            newLaneNumber = getLaneNumber(newColumn); // New lane number to want to move to
            heroNexusLaneNumber = getLaneNumber(hero.getNexusColumn());

            if (newLaneNumber == heroNexusLaneNumber) { // The hero is in its own lane
                if (discoveredRowLimit.get(newLaneNumber) > newRow) { // The move is beyond the current row limit
                    discoveredRowLimit.put(newLaneNumber, newRow);
                }
            }

            // Move successful
            return true;
        } else {
            return false;
        }
    }

    public void moveHeroUp(LoVHero hero, Heroes heroes) {
        boolean isAbleToMove = moveHero(hero, (hero.getRow() - 1), hero.getColumn(), heroes);

        if (!isAbleToMove) {
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() + " is not allowed to move up!"
                    + ConsoleColours.RESET);
        }
    }

    public void moveHeroDown(LoVHero hero, Heroes heroes) {
        boolean isAbleToMove = moveHero(hero, (hero.getRow() + 1), hero.getColumn(), heroes);

        if (!isAbleToMove) {
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() + " is not allowed to move down!"
                    + ConsoleColours.RESET);
        }
    }

    public void moveHeroLeft(LoVHero hero, Heroes heroes) {
        boolean isAbleToMove = moveHero(hero, hero.getRow(), (hero.getColumn() - 1), heroes);

        if (!isAbleToMove) {
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() + " is not allowed to move left!"
                    + ConsoleColours.RESET);
        }
    }

    public void moveHeroRight(LoVHero hero, Heroes heroes) {
        boolean isAbleToMove = moveHero(hero, hero.getRow(), (hero.getColumn() + 1), heroes);

        if (!isAbleToMove) {
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() + " is not allowed to move right!"
                    + ConsoleColours.RESET);
        }
    }

    // Recall hero to its nexus
    public void recallHero(LoVHero hero, Heroes heroes) {
        LoVPiece oldPiece;
        LoVPiece newPiece;

        if (getLoVBoardCell(hero.getRow(), hero.getColumn()).getPiece() instanceof LoVPiece
                && getLoVBoardCell(hero.getNexusRow(), hero.getNexusColumn()).getPiece() instanceof LoVPiece) {
            oldPiece = (LoVPiece) getLoVBoardCell(hero.getRow(), hero.getColumn()).getPiece();
            newPiece = (LoVPiece) getLoVBoardCell(hero.getNexusRow(), hero.getNexusColumn()).getPiece();
            hero.setRow(hero.getNexusRow());
            hero.setColumn(hero.getNexusColumn());
            oldPiece.leaveLoVPiece(hero, heroes, null);
            newPiece.enterLoVPiece(hero, heroes, null);
        }
    }

    public void teleportHero(LoVHero hero, int row, int column, Heroes heroes) {
        int currentLane = getLaneNumber(hero.getColumn());
        int newLane = getLaneNumber(column);

//        System.out.println("Current Lane: " + currentLane + ", New Lane: " + newLane);

        if (currentLane == newLane) {
            // cannot teleport to cell in same lane
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() +
                    " cannot teleport within the same lane!" + ConsoleColours.RESET);
        } else if (newLane == getLaneNumber(hero.getNexusColumn())) {
            // cannot teleport to cell in original lane
            System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() +
                    " cannot teleport back to its original lane!\n To go back to original lane, please use recall." +
                    ConsoleColours.RESET);
        } else if (newLane != getLaneNumber(hero.getNexusColumn())) {
            // cannot teleport to cell in another lane beyond what that lane's hero has explored
            int maxRowExplored = discoveredRowLimit.get(newLane);

            if (row < maxRowExplored) {
                System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId() +
                        " cannot teleport to a location beyond what that lane's hero has explored!" +
                        ConsoleColours.RESET);
            } else {
                if (moveHero(hero, row, column, heroes)) {
                    System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getId()
                            + " teleported to " + (row + 1) + ", " + (column + 1) + ConsoleColours.RESET);
                } else {
                    System.out.println(ConsoleColours.RED + "\n[ERROR] Hero " + hero.getId()
                            + " cannot teleport to " + (row + 1) + ", " + (column + 1) + "!" + ConsoleColours.RESET);
                }
            }
        }
    }

    public void moveMonsterDown(MHMonster monster, int row, int column, Monsters monsters) {
        LoVPiece oldPiece;
        LoVPiece newPiece;

        if (row >= 0 && row < NUMBER_OF_ROWS_AND_COLUMNS && column >= 0 && column < NUMBER_OF_ROWS_AND_COLUMNS) {
            if (getLoVBoardCell(monster.getRow(), monster.getColumn()).getPiece() instanceof LoVPiece
                    && getLoVBoardCell(row, column).getPiece() instanceof LoVPiece) {
                oldPiece = (LoVPiece) getLoVBoardCell(monster.getRow(), monster.getColumn()).getPiece();
                newPiece = (LoVPiece) getLoVBoardCell(row, column).getPiece();
                LoVHero inRangeHero = getHeroInRange(monster);

                if (!newPiece.hasMonster() && (inRangeHero == null || inRangeHero.getRow() <= row)) {
                    monster.setRow(row);
                    monster.setColumn(column);
                    oldPiece.leaveLoVPiece(monster, null, monsters); // Remove monster from old piece
                    System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " +
                            monster.getId() + " has moved down." + ConsoleColours.RESET);
                    newPiece.enterLoVPiece(monster, null, monsters); // Monster enters new piece
                } else {
                    System.out.println(ConsoleColours.RED + "\n[GAME MESSAGE] Monster " + monster.getId()
                            + " cannot move down!" + ConsoleColours.RESET);
                }
            }
        } else {
            System.out.println(ConsoleColours.RED + "\n[GAME MESSAGE] Monster " + monster.getId()
                    + " cannot move outside of the board!");
        }
    }

    // Check for the presence of a monster in the row in which the hero is currently
    // present and in the row above the hero.
    public MHMonster getMonsterInRange(LoVHero hero) {
        List<MHMonster> monsters = new ArrayList<>();
        int currHeroRow = hero.getRow();
        int currHeroColumn = hero.getColumn();

        // Check left of current position
        if (getMonsterInPiece(currHeroRow, currHeroColumn - 1) != null) {
            monsters.add(getMonsterInPiece(currHeroRow, currHeroColumn - 1));
        }

        // Check right of current position
        if (getMonsterInPiece(currHeroRow, currHeroColumn + 1) != null) {
            monsters.add(getMonsterInPiece(currHeroRow, currHeroColumn + 1));
        }

        // Check top of current position
        if (getMonsterInPiece(currHeroRow - 1, currHeroColumn) != null) {
            monsters.add(getMonsterInPiece(currHeroRow - 1, currHeroColumn));
        }

        // Check top left of current position
        if (getMonsterInPiece(currHeroRow - 1, currHeroColumn - 1) != null) {
            monsters.add(getMonsterInPiece(currHeroRow - 1, currHeroColumn - 1));
        }

        // Check top right of current position
        if (getMonsterInPiece(currHeroRow - 1, currHeroColumn + 1) != null) {
            monsters.add(getMonsterInPiece(currHeroRow - 1, currHeroColumn + 1));
        }

        // Choose a random monster among the monsters in range
        if (monsters.size() > 0) {
            Random rand = new Random();
            int monsterIndex = rand.nextInt(monsters.size());
            return monsters.get(monsterIndex);
        }

        return null;
    }

    public MHMonster getMonsterInPiece(int rowToCheck, int columnToCheck) {
        // Check whether the row and/or column to be checked are within the board
        if (rowToCheck < 0 || columnToCheck < 0 || rowToCheck >= LoVBoard.NUMBER_OF_ROWS_AND_COLUMNS
                || columnToCheck >= LoVBoard.NUMBER_OF_ROWS_AND_COLUMNS) {
            return null;
        }

        // Check if the piece is an instance of `LoVPiece`
        if (getLoVBoardCell(rowToCheck, columnToCheck).getPiece() instanceof LoVPiece) {
            LoVPiece piece = (LoVPiece) getLoVBoardCell(rowToCheck, columnToCheck).getPiece();

            // Check if the piece in the cell has a monster present in it
            if (piece.hasMonster() && !(piece instanceof InvalidPiece)) {
                return piece.getMonster();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    // Check for the presence of a hero in the row in which the monster is currently
    // present and in the row below the monster.
    public LoVHero getHeroInRange(MHMonster monster) {
        LoVHero hero;
        List<LoVHero> heroes = new ArrayList<>();
        int currMonsterRow = monster.getRow();
        int currMonsterColumn = monster.getColumn();

        // Check left of current position
        if (getHeroInPiece(currMonsterRow, currMonsterColumn - 1) != null) {
            heroes.add(getHeroInPiece(currMonsterRow, currMonsterColumn - 1));
        }

        // Check right of current position
        if (getHeroInPiece(currMonsterRow, currMonsterColumn + 1) != null) {
            heroes.add(getHeroInPiece(currMonsterRow, currMonsterColumn + 1));
        }

        // Check bottom of current position
        if (getHeroInPiece(currMonsterRow + 1, currMonsterColumn) != null) {
            heroes.add(getHeroInPiece(currMonsterRow + 1, currMonsterColumn));
        }

        // Check bottom left of current position
        if (getHeroInPiece(currMonsterRow + 1, currMonsterColumn - 1) != null) {
            heroes.add(getHeroInPiece(currMonsterRow + 1, currMonsterColumn - 1));
        }

        // Check bottom right of current position
        if (getHeroInPiece(currMonsterRow + 1, currMonsterColumn + 1) != null) {
            heroes.add(getHeroInPiece(currMonsterRow + 1, currMonsterColumn + 1));
        }

        // Choose a random hero among the heroes in range
        if (heroes.size() > 0) {
            Random rand = new Random();
            int heroIndex = rand.nextInt(heroes.size());
            return heroes.get(heroIndex);
        }

        return null;
    }

    public LoVHero getHeroInPiece(int rowToCheck, int columnToCheck) {
        // Check whether the row and/or column to be checked are within the board
        if (rowToCheck < 0 || columnToCheck < 0 || rowToCheck >= LoVBoard.NUMBER_OF_ROWS_AND_COLUMNS
                || columnToCheck >= LoVBoard.NUMBER_OF_ROWS_AND_COLUMNS) {
            return null;
        }

        // Check if the piece is an instance of `LoVPiece`
        if (getLoVBoardCell(rowToCheck, columnToCheck).getPiece() instanceof LoVPiece) {
            LoVPiece piece = (LoVPiece) getLoVBoardCell(rowToCheck, columnToCheck).getPiece();

            // Check if the piece in the cell has a monster present in it
            if (piece.hasHero() && !(piece instanceof InvalidPiece)) {
                return piece.getHero();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public int getLaneNumber(int column) {
        for (int i = 0; i < LANES.size(); i++) {
            if (LANES.get(i).contains(column)) {
                return i;
            }
        }

        return 0;
    }

    public void removeHeroFromBoardIfUnconscious(LoVHero hero, Heroes heroes, int roundNumber) {
        if (hero.isUnconscious()) {
            if (getLoVBoardCell(hero.getRow(), hero.getColumn()).getPiece() instanceof LoVPiece) {
                LoVPiece piece = (LoVPiece) getLoVBoardCell(hero.getRow(), hero.getColumn()).getPiece();
                piece.leaveLoVPiece(hero, heroes, null);
                hero.setRow(-1);
                hero.setColumn(-1);
                hero.setRoundNumberWhenUnconscious(roundNumber);
            }
        }
    }

    public void removeMonsterFromBoardIfUnconscious(Monsters monsters) {
        for (int i = 0; i < monsters.getMonsters().size(); i++) {
            Monster monster = monsters.getMonsters().get(i);
            if (monster.getHitPoint() <= 0 && monster instanceof MHMonster) {
                MHMonster mhMonster = (MHMonster) monster;
                if (getLoVBoardCell(mhMonster.getRow(), mhMonster.getColumn()).getPiece() instanceof LoVPiece) {
                    LoVPiece piece = (LoVPiece) getLoVBoardCell(mhMonster.getRow(), mhMonster.getColumn()).getPiece();
                    piece.leaveLoVPiece(mhMonster, null, monsters);
                }
                monsters.removeMonster(monster);
            }
        }
    }
}
