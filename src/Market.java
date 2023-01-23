// Provides the expected behavior of a market in any game
public interface Market<T extends Hero> {
    void printHelp();
    void printRules();
    String getUserInput(Heroes heroes);
    String getUserInput(T hero);
    void printMarketMenu();
    void buyItem(T hero, String itemId);
    void sellItem(T hero, String itemId);

}
