// Represents a Cave, increases hero's agility and monster's dodge chance
public class CavePiece extends LoVPiece {
    private static final String NAME = "Cave";
    public static final String ID = "C";

    public CavePiece() {
        super(NAME, ID);
    }

    @Override
    public void effectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            if (!hero.getId().equals("   ")  && hero.getHitPoints() > 0) {
                hero.setAgility(hero.getAgility() + (int) (hero.getAgility() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  "'s agility increased!" + ConsoleColours.RESET);
            }
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            if (!monster.getId().equals("   ") && monster.getHitPoint() > 0) {
                monster.setDodgeChance(monster.getDodgeChance() + (int) (monster.getDodgeChance() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  "'s dodge chance increased!" + ConsoleColours.RESET);
            }
        }
    }

    @Override
    public void removeEffectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            if (!hero.getId().equals("   ") && hero.getHitPoints() > 0) {
                hero.setAgility(hero.getAgility() - (int) (hero.getAgility() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Hero " + hero.getName() + " " + hero.getId() +  "'s agility reduced!" + ConsoleColours.RESET);
            }
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            if (!monster.getId().equals("   ") && monster.getHitPoint() > 0) {
                monster.setDodgeChance(monster.getDodgeChance() - (int) (monster.getDodgeChance() * STAT_INCREASE));
                System.out.println(ConsoleColours.YELLOW + "\n[GAME MESSAGE] Monster " + monster.getName() + " " + monster.getId() +  "'s dodge chance reduced!" + ConsoleColours.RESET);
            }
        }
    }
}
