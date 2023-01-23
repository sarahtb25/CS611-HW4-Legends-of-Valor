// Represents a Lightning Spell
public class LightningSpell extends Spell{
    public LightningSpell(String itemName, String id, int cost, int requiredLevel, int numberOfConsumptions, int damage, int manaCost) {
        super(itemName, id, cost, requiredLevel, numberOfConsumptions, damage, manaCost);
    }

    public LightningSpell(LightningSpell lightningSpell) {
        super(lightningSpell.getItemName(), lightningSpell.getId(), lightningSpell.getCost(), lightningSpell.getRequiredLevel(), lightningSpell.getNumberOfConsumptions(), lightningSpell.getDamage(), lightningSpell.getManaCost());
    }

    @Override
    public void affectMonsterSkill(MHMonster monster) {
        int noMoreOfAttribute = 0;

        if (monster.getDodgeChance() * MHMonster.SKILL_REMAINING_AFTER_SPELL_FACTOR < 0) {
            monster.setDodgeChance(noMoreOfAttribute);
        } else {
            monster.setDodgeChance((int) (monster.getDodgeChance() * MHMonster.SKILL_REMAINING_AFTER_SPELL_FACTOR));
        }
    }
}
