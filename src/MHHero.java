import java.util.ArrayList;
import java.util.List;

// Represents a hero in Monsters and Heroes
public class MHHero extends Hero {
    public static final double LEVEL_UP_RATE = 1.05;
    public static final double FAVOURED_SKILLS_LEVEL_UP_RATE = 1.10;
    public static final int EXPERIENCE_LEVEL_UP_FACTOR = 10;
    public static final double MANA_LEVEL_UP_FACTOR = 1.1;
    public static final int EXPERIENCE_GAINED_FACTOR = 20;
    public static final int HIT_POINT_FACTOR = 100;
    public static final int MANA_FACTOR = 100;
    public static final double DODGE_CHANCE_FACTOR = 0.2;
    public static final double ATTACK_DAMAGE_WITH_WEAPON = 0.5;
    public static final double ATTACK_DAMAGE_WITH_SPELL = 0.0001;
    public static final int LEVEL_UP_MONEY_FACTOR = 100;
    public static final int NUMBER_OF_MONSTER_PER_BATTLE = 1;
    public static final double REVIVAL_ALIVE = 1.1;
    public static final double REVIVAL_UNCONSCIOUS = 0.5;

    private int mana;
    private int strength;
    private int agility;
    private int dexterity;
    private int money;
    private int experience;
    private int experienceGained;
    private int numberOfTimesHeroDefeatedMonster;
    private List<EquippableItem> currentlyEquippedItems = new ArrayList<>();
    private Inventory inventory;

    public MHHero() {
        super();
        this.strength = 1;
        this.agility = 1;
        this.dexterity = 1;
        this.money = 1;
        this.experience = 1;
        this.inventory = new Inventory();
        setHitPoints(this.experience * HIT_POINT_FACTOR);
        this.mana = this.experience * MANA_FACTOR;
        // Add fists and body to currently equipped weapons
        currentlyEquippedItems.add(new WeaponFactory().getItemFromId("B6"));
        currentlyEquippedItems.add(new ArmorFactory().getItemFromId("E5"));
    }

    public MHHero(String name, String id, int mana, int strength, int agility, int dexterity, int money, int experience,
                Inventory inventory) {
        super(name, id, (experience * HIT_POINT_FACTOR));
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.money = money;
        this.experience = experience;
        this.inventory = inventory;
        this.experienceGained = 0;
        this.numberOfTimesHeroDefeatedMonster = 0;
        // Add fists and body to currently equipped weapons
        currentlyEquippedItems.add(new WeaponFactory().getItemFromId("B6"));
        currentlyEquippedItems.add(new ArmorFactory().getItemFromId("E5"));
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getExperienceGained() {
        return experienceGained;
    }

    public void setExperienceGained(int experienceGained) {
        this.experienceGained = experienceGained;
    }

    public List<EquippableItem> getCurrentlyEquippedItems() {
        return currentlyEquippedItems;
    }

    public void setCurrentlyEquippedItems(List<EquippableItem> currentlyEquippedItems) {
        this.currentlyEquippedItems = currentlyEquippedItems;
    }

    public boolean checkIfHeroWearingAnItemType(EquippableItem item) {
        for (EquippableItem itemAlreadyOnHero : currentlyEquippedItems) {
            if ((itemAlreadyOnHero.getClass().equals(item.getClass()))) {
                return true;
            }
        }

        return false;
    }

    public EquippableItem getItemWornByHero(EquippableItem item) {
        for (EquippableItem itemAlreadyOnHero : currentlyEquippedItems) {
            if ((itemAlreadyOnHero.getClass().equals(item.getClass()))) {
                item = itemAlreadyOnHero;
            }
        }

        return item;
    }

    public void wearAWeaponOrArmor(EquippableItem item) {
        currentlyEquippedItems.add(item);
        removeItemFromInventory(item);
    }

    public void removeItemFromInventory(EquippableItem item) {
        if (item instanceof Weapon) {
            inventory.removeWeapon((Weapon) item);
        } else if (item instanceof Armor) {
            inventory.removeArmor((Armor) item);
        }
    }

    public void addItemToInventory(EquippableItem item) {
        if (item instanceof Weapon) {
            inventory.addWeapon((Weapon) item);
        } else if (item instanceof Armor) {
            inventory.addArmor((Armor) item);
        }
    }

    public void replaceAWeaponOrArmor(EquippableItem item) {
        boolean isWearing = checkIfHeroWearingAnItemType(item);

        if (isWearing) {
            EquippableItem itemAlreadyOnHero = getItemWornByHero(item);
            removeAWeaponOrArmorFromBody(itemAlreadyOnHero);
            wearAWeaponOrArmor(item);
        } else {
            wearAWeaponOrArmor(item);
        }
    }

    public void removeAWeaponOrArmorFromBody(EquippableItem item) {
        currentlyEquippedItems.remove(item);
        addItemToInventory(item);
    }

    public String hit(MHMonster monster) {
        String response = "";
        int damage = 0;
        int noMore = 0;

        for (EquippableItem item : currentlyEquippedItems) {
            if (item instanceof Weapon) {
                Weapon weapon = (Weapon) item;
                damage = weapon.getDamage();
            }
        }

        if (damage > 0) {
            if (getAttackDamageWithWeapon(damage) <= monster.calculateDodge()) {
                response = "\n[BATTLE MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  " managed to dodge Hero " + getName() +
                        " " + getId() + "'s attack!";
            } else {
                int damageReduceAmount = monster.getDefense();

                if (damageReduceAmount < getAttackDamageWithWeapon(damage)) {
                    int reduceHitPoints = (int) (getAttackDamageWithWeapon(damage) - damageReduceAmount);

                    if (monster.getHitPoint() - reduceHitPoints <= 0) {
                        monster.setHitPoint(noMore);
                        response = "\n[BATTLE MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  " was hit by Hero " + getName()
                                + " " + getId() +  " and has been defeated!";
                    } else {
                        monster.setHitPoint(monster.getHitPoint() - reduceHitPoints);
                        response = "\n[BATTLE MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  " was hit by Hero "
                                + getName() + " " + getId() + " and lost " + reduceHitPoints + " hitpoints!";
                    }
                } else {
                    response = "\n[BATTLE MESSAGE] Monster " + monster.getName() + " " + monster.getId() +
                            " has successfully defended against Hero " + getName() + " " + getId() +  "'s attack!";
                }
            }
        } else {
            response = "\n[BATTLE MESSAGE]  Hero is not equipped with a weapon!";
        }

        return response;
    }

    public int defend() {
        int damageReduceAmount = 0;

        for (EquippableItem item : currentlyEquippedItems) {
            if (item instanceof Armor) {
                Armor armor = (Armor) item;
                damageReduceAmount = armor.getDamageReduction();
            }
        }

        return damageReduceAmount;
    }

    public void drinkPotion(Potion potion) {
        potion.applyPotion(this);
        inventory.removePotion();
    }

    public String castSpell(Spell spell, MHMonster monster) {
        String response = "";

        if (canUseSpell() && mana >= spell.getManaCost()) {
            response = spell.applySpell(this, monster);
            inventory.removeSpell();
        } else {
            response = "\n[ERROR] " + getName() + " has not enough mana! Unable to cast " + spell.getItemName();
        }

        return response;
    }

    public int getNumberOfTimesHeroDefeatedMonster() {
        return numberOfTimesHeroDefeatedMonster;
    }

    public void setNumberOfTimesHeroDefeatedMonster(int numberOfTimesHeroDefeatedMonster) {
        this.numberOfTimesHeroDefeatedMonster = numberOfTimesHeroDefeatedMonster;
    }

    // one-on-one battle, so if hero wins against a monster in a battle, increment
    // this
    public void updateNumberOfTimesHeroDefeatedMonster() {
        numberOfTimesHeroDefeatedMonster++;
    }

    public void levelUpSkills() {
        strength = (int) (LEVEL_UP_RATE * strength);
        agility = (int) (LEVEL_UP_RATE * agility);
        dexterity = (int) (LEVEL_UP_RATE * dexterity);
    }

    public int experienceNeededToLevelUp() {
        return experience * EXPERIENCE_LEVEL_UP_FACTOR;
    }

    // To be called after hero wins the battle
    public void updateExperienceGained() {
        experienceGained += NUMBER_OF_MONSTER_PER_BATTLE * EXPERIENCE_GAINED_FACTOR;
        checkLevelUp();
    }

    public void levelUp() {
        setHitPoints(getHitPoints() * HIT_POINT_FACTOR);
        mana = (int) (mana * MANA_LEVEL_UP_FACTOR);
        int prevExperience = experience;
        while (experienceGained >= experienceNeededToLevelUp()) {
            experienceGained -= experienceNeededToLevelUp();
            experience++;
        }

        levelUpSkills();

        System.out.println(ConsoleColours.YELLOW_BOLD + "\n[GAME MESSAGE] Congratulations! Hero " + getName()
                + " has leveled up from Experience Level " + prevExperience + " to Experience Level " + experience + "!"
                + ConsoleColours.RESET);
    }

    public void checkLevelUp() {
        if (experienceGained >= experienceNeededToLevelUp()) {
            levelUp();
        }
    }

    public double getDodgeChance() {
        return agility * DODGE_CHANCE_FACTOR;
    }

    public double getAttackDamageWithWeapon(int weapon_damage) {
        return ((strength + weapon_damage) * ATTACK_DAMAGE_WITH_WEAPON);
    }

    public int getAttackDamageWithSpell(int spell_base_damage) {
        return (int) (spell_base_damage + (dexterity * ATTACK_DAMAGE_WITH_SPELL * spell_base_damage));
    }

    // To be called after hero wins the battle
    public void updateMoneyAfterBattle(int monsterLevel) {
        if (getHitPoints() > 0) {
            money += monsterLevel * LEVEL_UP_MONEY_FACTOR;
        }
    }

    public void updateMoneyAfterBuyingItems(int cost) {
        money -= cost;
    }

    // Consumable items (potions and spells) cannot be sold
    public void updateMoneyAfterSellingItems(int price) {
        money += price;
    }

    public boolean checkMoneyAndLevelToBuyItem(int cost, int requiredLevel) {
        if (cost > money || experience < requiredLevel)
            return false;

        return true;
    }

    public boolean checkItemNotPresent(String itemId) {
        if (!inventory.checkIfItemExists(itemId) && !checkIfEquippableItemExistsInCurrentlyEquippedItems(itemId))
            return true;

        return false;
    }

    public boolean checkIfEquippableItemExistsInCurrentlyEquippedItems(String itemId) {
        for (EquippableItem equippableItem : currentlyEquippedItems) {
            if (equippableItem.getId().equals(itemId)) {
                return true;
            }
        }

        return false;
    }

    // During battle, if spells are used against a monster
    public void updateManaCost(int manaCost) {
        mana -= manaCost;
    }

    public boolean isUnconscious() {
        if (getHitPoints() <= 0) {
            return true;
        }

        return false;
    }

    public boolean canUseSpell() {
        if (mana <= 0) {
            return false;
        }

        return true;
    }

    // To be called if more heroes win the battle against the monsters i.e. monsters
    // defeated >= (int) number of heroes/2
    public void revive(int startingHP, int startingMana) {
        if (isUnconscious()) {
            setHitPoints((int) (startingHP * REVIVAL_UNCONSCIOUS));
            setMana((int) (startingMana * REVIVAL_UNCONSCIOUS));
        } else {
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
                "\n\tMana: " + mana +
                "\n\tStrength: " + strength +
                "\n\tAgility: " + agility +
                "\n\tDexterity: " + dexterity +
                "\n\tMoney: " + money +
                "\n\tExperience: " + experience +
                "\n\tExperience Gained: " + experienceGained + " / " + experienceNeededToLevelUp());
        LoVUtility.pause();
        System.out.println("\n\tCurrently Equipped Items: ");
        printCurrentlyEquippedItems();
        LoVUtility.pause();
        System.out.println("\n\tInventory: ");
        inventory.printInventory();
    }

    public void printCurrentlyEquippedItems() {
        if (currentlyEquippedItems.isEmpty()) {
            System.out.print("None");
        } else {
            LoVUtility utility = new LoVUtility();

            System.out.println(ConsoleColours.YELLOW
                    + "\n#########################################################################################");
            System.out.print(
                    "|                                  Currently Equipped Items                             |\n");
            System.out.println(
                    "#########################################################################################\n"
                            + ConsoleColours.RESET);

            List<Weapon> weapons = new ArrayList<>();
            List<Armor> armors = new ArrayList<>();
            for (EquippableItem item : currentlyEquippedItems) {
                if (item instanceof Weapon) {
                    weapons.add((Weapon) item);
                } else if (item instanceof Armor) {
                    armors.add((Armor) item);
                }
            }
            utility.printWeapons(weapons);
            utility.printArmors(armors);
        }
    }
}
