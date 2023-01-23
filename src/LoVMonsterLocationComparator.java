import java.util.Comparator;

public class LoVMonsterLocationComparator implements Comparator<Monster> {
    @Override
    public int compare(Monster o1, Monster o2) {
        if (o1 instanceof MHMonster && o2 instanceof MHMonster) {
            MHMonster m1 = (MHMonster) o1;
            MHMonster m2 = (MHMonster) o2;

            if (m1.getColumn() > m2.getColumn()) {
                return 1;
            } else if (m1.getColumn() < m2.getColumn()) {
                return -1;
            } else {
                if (m1.getRow() < m2.getRow()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        return 0;
    }
}
