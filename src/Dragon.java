// Represents a dragon
public class Dragon extends MHMonster {
    public Dragon(String name, String id, int level, int damage, int defense, int dodgeChance) {
        super(name, id, level, damage, defense, dodgeChance);
    }

    public Dragon(Dragon dragon) {
        super(dragon.getName(), dragon.getId(), dragon.getLevel(), dragon.getDamage(), dragon.getDefense(), dragon.getDodgeChance());
    }
}
