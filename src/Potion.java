import java.util.List;

// Represents a potion
public class Potion extends ConsumableItem {
    private int attributeIncrease;
    private List<String> attributesAffected;

    public Potion() {}

    public Potion(Potion potion) {
        super(potion.getItemName(), potion.getId(), potion.getCost(), potion.getRequiredLevel(), potion.getNumberOfConsumptions());
        this.attributeIncrease = potion.getAttributeIncrease();
        this.attributesAffected = potion.getAttributesAffected();
    }

    public Potion(String itemName, String id, int cost, int requiredLevel, int numberOfConsumptions, int attributeIncrease, List<String> attributesAffected) {
        super(itemName, id, cost, requiredLevel, numberOfConsumptions);
        this.attributeIncrease = attributeIncrease;
        this.attributesAffected = attributesAffected;
    }

    public int getAttributeIncrease() {
        return attributeIncrease;
    }

    public void setAttributeIncrease(int attributeIncrease) {
        this.attributeIncrease = attributeIncrease;
    }

    public List<String> getAttributesAffected() {
        return attributesAffected;
    }

    public void setAttributesAffected(List<String> attributesAffected) {
        this.attributesAffected = attributesAffected;
    }
    
    public void applyPotion(MHHero hero) {
        for (int i = 0; i < attributesAffected.size(); i++) {
            if (attributesAffected.get(i).equals("health")) hero.setHitPoints(hero.getHitPoints() + attributeIncrease);
            else if (attributesAffected.get(i).equals("mana")) hero.setMana(hero.getMana() + attributeIncrease);
            else if (attributesAffected.get(i).equals("strength")) hero.setStrength(hero.getStrength() + attributeIncrease);
            else if (attributesAffected.get(i).equals("dexterity")) hero.setDexterity(hero.getDexterity() + attributeIncrease);
            else if (attributesAffected.get(i).equals("agility")) hero.setAgility(hero.getAgility() + attributeIncrease);
        }
        printPotionImpact(hero);
        consume();
    }

    public void printPotionImpact(Hero hero) {
        String print = "\n[GAME MESSAGE] Hero " + hero.getName() + " increased their ";

        for (int i = 0; i < attributesAffected.size(); i++) {
            print += attributesAffected.get(i) + ", ";
        }

        print = print.substring(0, print.length() - 2);
        print += " by " + attributeIncrease + " points!";

        System.out.println(ConsoleColours.YELLOW + print + ConsoleColours.RESET);
    }
}
