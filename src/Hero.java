import java.util.ArrayList;
import java.util.List;

// This class represents a general hero
public class Hero extends BoardGameNonPlayerCharacter {

    private int hitPoints;


    public Hero() {
        super();
    }

    public Hero(String name, String id) {
        super(name, id);
    }

    public Hero(String name, String id, int hitPoints) {
        super(name, id);
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void printHero() {
        System.out.print("\nHERO " + getName() + " :" +
                "\n\tID: " + getId() +
                "\n\tType: " + getClass().toString().split(" ", 2)[1] +
                "\n\tHit Points:" + getHitPoints());
    }
}
