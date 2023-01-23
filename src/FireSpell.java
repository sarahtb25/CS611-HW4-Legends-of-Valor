// Represents a fire spell
public class FireSpell extends Spell {
    public FireSpell(String itemName, String id, int cost, int requiredLevel, int numberOfConsumptions, int damage, int manaCost) {
        super(itemName, id, cost, requiredLevel, numberOfConsumptions, damage, manaCost);
    }

    public FireSpell(FireSpell fireSpell) {
        super(fireSpell.getItemName(), fireSpell.getId(), fireSpell.getCost(), fireSpell.getRequiredLevel(), fireSpell.getNumberOfConsumptions(), fireSpell.getDamage(), fireSpell.getManaCost());
    }

    @Override
    public void affectMonsterSkill(MHMonster monster) {
        int noMoreOfAttribute = 0;

        if (monster.getDefense() * MHMonster.SKILL_REMAINING_AFTER_SPELL_FACTOR < 0) {
            monster.setDefense(noMoreOfAttribute);
        } else {
            monster.setDefense((int) (monster.getDefense() * MHMonster.SKILL_REMAINING_AFTER_SPELL_FACTOR));
        }
    }
}
