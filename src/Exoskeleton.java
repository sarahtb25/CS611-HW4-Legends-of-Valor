// Represents an exoskeleton
public class Exoskeleton extends MHMonster {
    public Exoskeleton(String name, String id, int level, int damage, int defense, int dodgeChance) {
        super(name, id, level, damage, defense, dodgeChance);
    }

    public Exoskeleton(Exoskeleton exoskeleton) {
        super(exoskeleton.getName(), exoskeleton.getId(), exoskeleton.getLevel(), exoskeleton.getDamage(), exoskeleton.getDefense(), exoskeleton.getDodgeChance());
    }
}
