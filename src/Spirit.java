// Represents a spirit
public class Spirit extends MHMonster {
    public Spirit(String name, String id, int level, int damage, int defense, int dodgeChance) {
        super(name, id, level, damage, defense, dodgeChance);
    }

    public Spirit(Spirit spirit) {
        super(spirit.getName(), spirit.getId(), spirit.getLevel(), spirit.getDamage(), spirit.getDefense(), spirit.getDodgeChance());
    }
}
