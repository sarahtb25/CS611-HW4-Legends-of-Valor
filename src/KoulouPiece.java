// Represents a Koulou, increases a hero's strength and a monster's damage
public class KoulouPiece extends LoVPiece {
    private static final String NAME = "Koulou";
    public static final String ID = "K";

    public KoulouPiece() {
        super(NAME, ID);
    }

    @Override
    public void effectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            if (!hero.getId().equals("   ") && hero.getHitPoints() > 0) {
                hero.setStrength(hero.getStrength() + (int) (hero.getStrength() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  "'s strength increased!" + ConsoleColours.RESET);
            }
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            if (!monster.getId().equals("   ") && monster.getHitPoint() > 0) {
                monster.setDamage(monster.getDamage() + (int) (monster.getDamage() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  "'s damage increased!" + ConsoleColours.RESET);
            }
        }
    }

    @Override
    public void removeEffectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            if (!hero.getId().equals("   ") && hero.getHitPoints() > 0) {
                hero.setStrength(hero.getStrength() - (int) (hero.getStrength() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  "'s strength reduced!" + ConsoleColours.RESET);
            }
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            if (!monster.getId().equals("   ") && monster.getHitPoint() > 0) {
                monster.setDamage(monster.getDamage() - (int) (monster.getDamage() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  "'s damage reduced!" + ConsoleColours.RESET);
            }
        }
    }
}
