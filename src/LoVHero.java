// Represents a Legends of Valor Hero, which shares a lot of attributes with the hero in Monsters and Heroes
public class LoVHero extends MHHero {
    private int nexusRow;
    private int nexusColumn;
    private int respawnCount;
    private int roundNumberWhenUnconscious;

    public LoVHero() {
        super();
        this.nexusRow = 0;
        this.nexusColumn = 0;
        this.respawnCount = 0;
        this.roundNumberWhenUnconscious = 0;
    }

    public LoVHero(String name, String id, int mana, int strength, int agility, int dexterity, int money, int experience,
                Inventory inventory) {
        super(name, id, mana, strength, agility, dexterity, money, experience, inventory);
        this.nexusRow = 0;
        this.nexusColumn = 0;
        this.respawnCount = 0;
        this.roundNumberWhenUnconscious = 0;
    }

    public int getNexusRow() {
        return this.nexusRow;
    }

    public void setNexusRow(int nRow) {
        this.nexusRow = nRow;
    }

    public int getNexusColumn() {
        return this.nexusColumn;
    }

    public void setNexusColumn(int nColumn) {
        this.nexusColumn = nColumn;
    }

    public void incrementRespawnCount() {
        this.respawnCount++;
    }

    public int getRespawnCount() {
        return respawnCount;
    }

    public void setRespawnCount(int respawnCount) {
        this.respawnCount = respawnCount;
    }

    public int getRoundNumberWhenUnconscious() {
        return roundNumberWhenUnconscious;
    }

    public void setRoundNumberWhenUnconscious(int roundNumberWhenUnconscious) {
        this.roundNumberWhenUnconscious = roundNumberWhenUnconscious;
    }

    @Override
    public void revive(int startingHP, int startingMana) {
        if (getHitPoints() > 0) {
            setHitPoints((int) (startingHP * REVIVAL_ALIVE));
            setMana((int) (startingMana * REVIVAL_ALIVE));
        }
    }

    @Override
    public void printHero() {
        System.out.print("\nHERO " + getName() + " :" +
                "\n\tID: " + getId() +
                "\n\tType: " + getClass().toString().split(" ", 2)[1] +
                "\n\tHit Points:" + getHitPoints() +
                "\n\tMana: " + getMana() +
                "\n\tStrength: " + getStrength() +
                "\n\tAgility: " + getAgility() +
                "\n\tDexterity: " + getDexterity() +
                "\n\tMoney: " + getMoney() +
                "\n\tExperience: " + getExperience() +
                "\n\tExperience Gained: " + getExperienceGained() + " / " + experienceNeededToLevelUp() +
                "\n\tNumber of Times Hero Respawned: " + respawnCount);
        LoVUtility.pause();
        System.out.println("\n\tCurrently Equipped Items: ");
        printCurrentlyEquippedItems();
        LoVUtility.pause();
        System.out.println("\n\tInventory: ");
        getInventory().printInventory();
    }
}
