// Prints statistics/scores of each round or game
public interface Statistics<T extends RoundHistory> {
    void addRoundHistory(T roundHistory);
    void printStatistics();
}