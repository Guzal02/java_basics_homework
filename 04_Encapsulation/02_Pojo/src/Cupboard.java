public class Cupboard {
    private String name;
    private int shelf;
    private int box;
    private int door;

    public Cupboard(String name, int shelf) {
        this.name = name;
        this.shelf = shelf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
