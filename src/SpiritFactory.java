import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Represents all possible spirits
public class SpiritFactory implements MonsterFactory<Spirit> {
    public static final List<String> SPIRIT_NAMES = Arrays.asList("Andrealphus", "Blinky", "Andromalius", "Chiang-shih", "FallenAngel", "Ereshkigall", "Melchiresas", "Jormunngand", "Rakkshasass", "Taltecuhtli", "Casper");
    public static final List<String> SPIRIT_IDS = Arrays.asList("N0", "N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8", "N9", "N10");
    public static final List<Integer> SPIRIT_LEVELS = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1);
    public static final List<Integer> SPIRIT_DAMAGE = Arrays.asList(600, 450, 550, 700, 800, 950, 350, 600, 550, 300, 100);
    public static final List<Integer> SPIRIT_DEFENSE = Arrays.asList(500, 350, 450, 600, 700, 450, 150, 900, 600, 200, 100);
    public static final List<Integer> SPIRIT_DODGE_CHANCE = Arrays.asList(40, 35, 25, 40, 50, 35, 75, 20, 35, 50, 50);
    private List<Spirit> spirits = new ArrayList<>();

    public SpiritFactory() {
        generateMonsters();
    }

    @Override
    public void generateMonsters() {
        for (int i = 0; i < SPIRIT_NAMES.size(); i++) {
            Spirit spirit = new Spirit(SPIRIT_NAMES.get(i), SPIRIT_IDS.get(i), SPIRIT_LEVELS.get(i), SPIRIT_DAMAGE.get(i), SPIRIT_DEFENSE.get(i), SPIRIT_DODGE_CHANCE.get(i));
            spirits.add(spirit);
        }
    }

    @Override
    public Spirit getAMonster(int index) {
        return spirits.get(index);
    }

    @Override
    public int getNumberOfMonsters() {
        return spirits.size();
    }
}
