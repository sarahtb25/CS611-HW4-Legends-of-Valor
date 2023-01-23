// Represents a Bush, increases hero's dexterity and monster's defense
public class BushPiece extends LoVPiece {
    private static final String NAME = "Bush";
    public static final String ID = "B";

    public BushPiece() {
        super(NAME, ID);
    }

    @Override
    public void effectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            if (!hero.getId().equals("   ") && hero.getHitPoints() > 0) {
                hero.setDexterity(hero.getDexterity() + (int) (hero.getDexterity() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  "'s dexterity increased!" + ConsoleColours.RESET);
            }
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            if (!monster.getId().equals("   ") && monster.getHitPoint() > 0) {
                monster.setDodgeChance(monster.getDefense() + (int) (monster.getDefense() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " + monster.getId() + "'s defence increased!" + ConsoleColours.RESET);
            }
        }
    }

    @Override
    public void removeEffectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            if (!hero.getId().equals("   ") && hero.getHitPoints() > 0) {
                hero.setDexterity(hero.getDexterity() - (int) (hero.getDexterity() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  "'s dexterity reduced!" + ConsoleColours.RESET);
            }
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            if (!monster.getId().equals("   ") && monster.getHitPoint() > 0) {
                monster.setDefense(monster.getDefense() - (int) (monster.getDefense() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  "'s defence reduced!" + ConsoleColours.RESET);
            }
        }
    }
}
