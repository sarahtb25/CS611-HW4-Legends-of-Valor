// Represents a monster in Monsters and Heroes and Legends of Valor
public class MHMonster extends Monster {
    public static final double DODGE_CHANCE_FACTOR = 0.1;
    public static final double SKILL_REMAINING_AFTER_SPELL_FACTOR = 0.9;
    public static final int HIT_POINT_FACTOR = 100;
    private int level;
    private int damage;
    private int defense;
    private int dodgeChance;

    public MHMonster() {
        super();
        this.level = 1;
        this.damage = 1;
        this.defense = 1;
        this.dodgeChance = 1;
    }

    public MHMonster(String name, String id, int level, int damage, int defense, int dodgeChance) {
        super(name, id);
        this.level = level;
        this.damage = damage;
        this.defense = defense;
        this.dodgeChance = dodgeChance;
        setHitPoint(level * HIT_POINT_FACTOR);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public double calculateDodge() {
        return (dodgeChance * DODGE_CHANCE_FACTOR);
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public String attack(MHHero hero) {
        String response = "";
        int noMore = 0;

        // Hero can dodge
        if (hero.getDodgeChance() >= getDamage()) {
            response = "\n[BATTLE MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  " managed to dodge Monster " + getName() + " " + getId() +  "'s attack!";
        } else {
            int damageReduceAmount = hero.defend();

            if (damageReduceAmount < damage) {
                int reduceHitPoints = damage - damageReduceAmount;

                if (hero.getHitPoints() - reduceHitPoints <= 0) {
                    hero.setHitPoints(noMore);
//                    System.out.println("Hero " + hero.getId() + " " + hero.getName() + ": " + hero.getHitPoints() + ", " + hero.getMana());
                    response = "\n[BATTLE MESSAGE] Hero "  + hero.getName() + " " + hero.getId() +  " was hit by Monster " + getName() +  " " + getId() + " and has been defeated!";
                } else {
                    hero.setHitPoints(hero.getHitPoints() - reduceHitPoints);
                    response = "\n[BATTLE MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  " was hit by Monster " + getName() + " " + getId() +  " and lost " + reduceHitPoints + " hitpoints!";
                }
            } else {
                response = "\n[BATTLE MESSAGE] Hero " + hero.getName() +  " " + hero.getId() + " has successfully defended against Monster " + getName() +  " " + getId() + "'s attack!";
            }
        }

        return response;
    }

    @Override
    public String toString() {
        return "MONSTER " + getName() + " :" +
                "\n\tID: " + getId() +
                "\n\tType: " + getClass().toString().split(" ", 2)[1] +
                "\n\tHit Points: " + getHitPoint() +
                "\n\tLevel: " + level +
                "\n\tDamage: " + damage +
                "\n\tDefense: " + defense +
                "\n\tDodgeChance: " + dodgeChance;
    }
}
