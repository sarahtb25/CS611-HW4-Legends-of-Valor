// Represents a NonPlayerCharacter for a board game, where its position on the board can be tracked by the row and column of the cell it is in
public class BoardGameNonPlayerCharacter extends NonPlayerCharacter {
    private int row;
    private int column;

    public BoardGameNonPlayerCharacter() {
        super();
        row = 0;
        column = 0;
    }

    public BoardGameNonPlayerCharacter(String name, String id) {
        super(name, id);
        row = 0;
        column = 0;
    }

    public BoardGameNonPlayerCharacter(String name, String id, int row, int column) {
        super(name, id);
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
