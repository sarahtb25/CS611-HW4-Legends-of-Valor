// Represents a weapon
public class Weapon extends EquippableItem {
    private int numberOfHandsRequired;
    private int damage;

    public Weapon() {}

    public Weapon(Weapon weapon) {
        super(weapon.getItemName(), weapon.getId(), weapon.getCost(), weapon.getRequiredLevel());
        this.numberOfHandsRequired = weapon.getNumberOfHandsRequired();
        this.damage = weapon.getDamage();
    }

    public Weapon(String itemName, String id, int cost, int requiredLevel, int numberOfHandsRequired, int damage) {
        super(itemName, id, cost, requiredLevel);
        this.numberOfHandsRequired = numberOfHandsRequired;
        this.damage = damage;
    }

    public int getNumberOfHandsRequired() {
        return numberOfHandsRequired;
    }

    public void setNumberOfHandsRequired(int numberOfHandsRequired) {
        this.numberOfHandsRequired = numberOfHandsRequired;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
