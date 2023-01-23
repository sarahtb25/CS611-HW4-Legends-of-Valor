import java.util.ArrayList;
import java.util.List;

// This class generates monsters as needed for a cell
public class GenerateMonsters {
    private final DragonFactory df;
    private final ExoskeletonFactory ef;
    private final SpiritFactory sf;
    public static final int NUMBER_OF_TYPES_OF_MONSTERS = 3;
    private int numberOfHeroes;

    public GenerateMonsters(int numberOfHeroes) {
        df = new DragonFactory();
        ef = new ExoskeletonFactory();
        sf = new SpiritFactory();
        this.numberOfHeroes = numberOfHeroes;
    }

    public Monsters getMonsters() {
        Monsters monsters = new Monsters();
        List<Integer> dragonIndexesAdded = new ArrayList<>();
        List<Integer> exoskeletonIndexesAdded = new ArrayList<>();
        List<Integer> spiritIndexesAdded = new ArrayList<>();

        for (int i = 0; i < numberOfHeroes; i++) {
            int index = (int) (Math.random() * NUMBER_OF_TYPES_OF_MONSTERS);
            String typeOfMonster = new String [] {"Dragon", "Exoskeleton", "Spirit"}[index];

            if (typeOfMonster.equals("Dragon")) {
                int indexOfDragon = (int) (Math.random() * df.getNumberOfMonsters());

                while(dragonIndexesAdded.contains(indexOfDragon)) {
                    indexOfDragon = (int) (Math.random() * df.getNumberOfMonsters());
                }

                dragonIndexesAdded.add(indexOfDragon);
                monsters.addMonster(new Dragon(df.getAMonster(indexOfDragon)));
            } else if (typeOfMonster.equals("Exoskeleton")) {
                int indexOfExoskeleton = (int) (Math.random() * ef.getNumberOfMonsters());

                while(exoskeletonIndexesAdded.contains(indexOfExoskeleton)) {
                    indexOfExoskeleton = (int) (Math.random() * ef.getNumberOfMonsters());
                }

                exoskeletonIndexesAdded.add(indexOfExoskeleton);
                monsters.addMonster(new Exoskeleton(ef.getAMonster(indexOfExoskeleton)));
            } else if (typeOfMonster.equals("Spirit")) {
                int indexOfSpirit = (int) (Math.random() * sf.getNumberOfMonsters());

                while(spiritIndexesAdded.contains(indexOfSpirit)) {
                    indexOfSpirit = (int) (Math.random() * sf.getNumberOfMonsters());
                }

                dragonIndexesAdded.add(indexOfSpirit);
                monsters.addMonster(new Spirit(sf.getAMonster(indexOfSpirit)));
            }
        }

        return monsters;
    }
}
