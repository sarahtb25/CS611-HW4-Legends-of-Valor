// This class represents a general monster
public class Monster extends BoardGameNonPlayerCharacter {
    private int hitPoint;

    public Monster() {
        super();
        this.hitPoint = 1;
    }

    public Monster(String name, String id) {
        super(name, id);
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
}
