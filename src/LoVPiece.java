/* Represents a game piece for Legends of Valor
   id is N (Nexus piece), I (Invalid piece), C (Cave piece), K (Koulou piece)
   B (Bush piece), P (Plain piece)
 */
public class LoVPiece extends Piece {
    private LoVHero hero;
    private MHMonster monster;

    // increase a hero's statistics by 10%, type of statistic increased depends on
    // type of piece
    public static final double STAT_INCREASE = 0.1;

    public LoVPiece() {
        super();
        hero = new LoVHero();
        monster = new MHMonster();
    }

    public LoVPiece(String name, String id) {
        super(name, id);
        hero = new LoVHero();
        monster = new MHMonster();
    }

    public LoVPiece(LoVHero hero, MHMonster monster) {
        super();
        this.hero = hero;
        this.monster = monster;
    }

    public LoVPiece(String name, String id,LoVHero hero, MHMonster monster) {
        super(name, id);
        this.hero = hero;
        this.monster = monster;
    }

    public LoVHero getHero() {
        return hero;
    }

    public void setHero(LoVHero hero) {
        this.hero = hero;
    }

    public MHMonster getMonster() {
        return monster;
    }

    public void setMonster(MHMonster monster) {
        this.monster = monster;
    }

    public void effectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
    }

    public void removeEffectOfLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
    }

    public void enterLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            setHero(hero); //LoVHero enters the piece
            effectOfLoVPiece(hero, heroes, null);
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            setMonster(monster); // Monster enters the piece
            effectOfLoVPiece(monster, null, monsters);
        }
    }

    public void leaveLoVPiece(BoardGameNonPlayerCharacter nonPlayerCharacter, Heroes heroes, Monsters monsters) {
        if (nonPlayerCharacter instanceof LoVHero) {
            LoVHero hero = (LoVHero) heroes.getHeroFromId(nonPlayerCharacter.getId());
            setHero(new LoVHero()); // Remove current hero from the piece
            removeEffectOfLoVPiece(hero, heroes, null);
        } else if (nonPlayerCharacter instanceof MHMonster) {
            MHMonster monster = (MHMonster) monsters.getMonsterFromId(nonPlayerCharacter.getId());
            setMonster(new MHMonster()); // Remove current monster from the piece
            removeEffectOfLoVPiece(monster, null, monsters);
        }
    }

    public boolean hasHero() {
        return !hero.getId().equals("   ");
    }

    public boolean hasMonster() {
        return !monster.getId().equals("   ");
    }
}
