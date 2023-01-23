import java.util.ArrayList;
import java.util.List;

// Prints the statistics of each hero (the number of times hero respawned) for each game round
public class LoVStatistics implements Statistics<LoVRoundHistory> {
    private static List<LoVRoundHistory> loVRoundHistories;
    public LoVStatistics() {
        loVRoundHistories = new ArrayList<>();
    }

    @Override
    public void addRoundHistory(LoVRoundHistory loVRoundHistory) {
        loVRoundHistories.add(loVRoundHistory);
    }

    @Override
    public void printStatistics() {
        System.out.println(ConsoleColours.CYAN_BOLD + "\n################################################################################################################################");
        System.out.println("|                                                         OVERALL SCORES                                                       |");
        System.out.println("################################################################################################################################" + ConsoleColours.RESET);

        for (int i = 0; i < loVRoundHistories.size(); i++) {
            int roundNumber = i + 1;

            System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                        ROUND " + roundNumber + " SCORES");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

            loVRoundHistories.get(i).printRoundScores();
        }
    }


}
