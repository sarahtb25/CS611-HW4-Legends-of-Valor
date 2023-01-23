/*
    Keep track of the number of times each hero respawned in a game round,
    where game round here refers to an entire game from welcome message to end of game message
 */
public class LoVRoundHistory implements RoundHistory {
    private Heroes heroes;

    public LoVRoundHistory(Heroes heroes) {
        this.heroes = heroes;
    }

    @Override
    public void printRoundScores() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%7s %21s %40s", "ID", "NAME", "NUMBER OF TIMES HERO RESPAWNED");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

        for(Hero hero : heroes.getHeroes()) {
            if (hero instanceof LoVHero) {
                System.out.format("%7s %25s %20s", hero.getId(), hero.getName(), ((LoVHero) hero).getRespawnCount());
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
    }
}
