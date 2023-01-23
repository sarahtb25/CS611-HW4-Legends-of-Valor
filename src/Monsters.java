import java.util.ArrayList;
import java.util.List;

// Represents a list of monsters
public class Monsters {
    private List<Monster> monsters;

    public Monsters() {
        monsters = new ArrayList<>();
    }

    public Monsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    // Used when a monster is defeated
    public void removeMonster(Monster monster) {
        monsters.remove(monster);
    }

    public Monster getMonsterFromId(String id) {
        Monster monsterWanted = new Monster();

        for (Monster monster : monsters) {
            if (monster.getId().equals(id)) {
                monsterWanted = monster;
                break;
            }
        }

        return monsterWanted;
    }
}
