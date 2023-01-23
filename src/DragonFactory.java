import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Represents all possible dragons
public class DragonFactory implements MonsterFactory<Dragon> {
    public static final List<String> DRAGON_NAMES = Arrays.asList("Desghidorrah", "Chrysophylax", "BunsenBurner", "Natsunomeryu", "TheScaleless", "Kas-Ethelinh", "Alexstraszan", "Phaarthurnax", "D-Maleficent", "TheWeatherbe", "Igneel", "BlueEyesWhite");
    public static final List<String> DRAGON_IDS = Arrays.asList("J0", "J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9", "J10", "J11");
    public static final List<Integer> DRAGON_LEVELS = Arrays.asList(3, 2, 4, 1, 7, 5, 10, 6, 9, 8, 6, 9);
    public static final List<Integer> DRAGON_DAMAGE = Arrays.asList(300, 200, 400, 100, 700, 600, 1000, 600, 900, 800, 600, 900);
    public static final List<Integer> DRAGON_DEFENSE = Arrays.asList(400, 500, 500, 200, 600, 500, 9000, 700, 950, 900, 400, 600);
    public static final List<Integer> DRAGON_DODGE_CHANCE = Arrays.asList(35, 20, 45, 10, 75, 60, 55, 60, 85, 80, 60, 75);
    private List<Dragon> dragons = new ArrayList<>();

    public DragonFactory() {
        generateMonsters();
    }

    @Override
    public void generateMonsters() {
        for (int i = 0; i < DRAGON_NAMES.size(); i++) {
            Dragon dragon = new Dragon(DRAGON_NAMES.get(i), DRAGON_IDS.get(i), DRAGON_LEVELS.get(i), DRAGON_DAMAGE.get(i), DRAGON_DEFENSE.get(i), DRAGON_DODGE_CHANCE.get(i));
            dragons.add(dragon);
        }
    }

    @Override
    public Dragon getAMonster(int index) {
        return dragons.get(index);
    }

    @Override
    public int getNumberOfMonsters() {
        return dragons.size();
    }
}
