// Represents a spell
public class Spell extends ConsumableItem {
    private int damage;
    private int manaCost;

    public Spell() {}

    public Spell(Spell spell) {
        super(spell.getItemName(), spell.getId(), spell.getCost(), spell.getRequiredLevel(), spell.getNumberOfConsumptions());
        this.damage = spell.getDamage();
        this.manaCost = spell.getManaCost();
    }
    public Spell(String itemName, String id, int cost, int requiredLevel, int numberOfConsumptions, int damage, int manaCost) {
        super(itemName, id, cost, requiredLevel, numberOfConsumptions);
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public String applySpell(MHHero hero, MHMonster monster) {
        String response = "";

        updateManaCost(hero);
        int noMoreOfAttribute = 0;

        if (hero.getAttackDamageWithSpell(damage) <= monster.calculateDodge()) {
            response = "[BATTLE MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  " managed to dodge Hero " + hero.getName() +  " " + hero.getId() + "'s spell!";
        } else {
            int damageReduceAmount = monster.getDefense();

            if (damageReduceAmount < hero.getAttackDamageWithSpell(damage)) {
                int reduceHitPoints = (int) (hero.getAttackDamageWithSpell(damage) - damageReduceAmount);

                if (monster.getHitPoint() - reduceHitPoints <= 0) {
                    monster.setHitPoint(noMoreOfAttribute);
                    response = "[BATTLE MESSAGE] Monster " + monster.getName() +  " " + monster.getId() + " has been defeated!";
                } else {
                    monster.setHitPoint(monster.getHitPoint() - reduceHitPoints);
                    response = "[BATTLE MESSAGE] Monster " + monster.getName() +  " " + monster.getId() + " was hit by Hero " + hero.getName() +  " " + hero.getId() + "'s spell and lost " + reduceHitPoints + " hitpoints!";
                }
            } else {
                response = "[BATTLE MESSAGE] Monster " + monster.getName() +  " " + monster.getId() + " has successfully defended against Hero " + hero.getName() +  " " + hero.getId() + "'s spell!";
            }

            affectMonsterSkill(monster);
        }

        consume();

        return response;
    }

    public void affectMonsterSkill(MHMonster monster) {}

    public void updateManaCost(MHHero hero) {
        hero.updateManaCost(manaCost);
    }
}
