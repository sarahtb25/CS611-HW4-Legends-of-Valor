// Represents a Legends of Valor player, the same as Monsters and Heroes player
public class LoVPlayer extends Player {
    private Heroes heroes;

    public LoVPlayer(String name) {
        super(name);
    }

    public LoVPlayer(String name, Heroes heroes) {
        super(name);
        this.heroes = heroes;
    }

    public Heroes getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }
}
