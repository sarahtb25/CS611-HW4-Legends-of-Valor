import java.util.Comparator;

// Sorts heroes based on the columns and rows they are in, to allow players to control their heroes more intuitively
public class LoVHeroLocationComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero o1, Hero o2) {
        if (o1 instanceof LoVHero && o2 instanceof LoVHero) {
            LoVHero h1 = (LoVHero) o1;
            LoVHero h2 = (LoVHero) o2;

            if (h1.getColumn() > h2.getColumn()) {
                return 1;
            } else if (h1.getColumn() < h2.getColumn()) {
                return -1;
            } else {
                if (h1.getRow() > h2.getRow()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        return 0;
    }
}
