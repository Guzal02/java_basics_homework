public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp () {
        currentFloor += 1;
    }

    public void moveDown() {
        currentFloor -= 1;
    }

    public void move(int floor) {
        if(floor < minFloor || floor > maxFloor) {
            System.out.println("В данном доме " + floor + " этаж отсутствует!");
            return;
        }
        if (floor > currentFloor) {
            for (int i = currentFloor; i < floor; ++i) {
                if (i == 0) {
                    continue;
                }
                moveUp();
                System.out.println(currentFloor);
            } return;
         }
        if(floor < currentFloor){
            for (int i = currentFloor; i > floor; --i) {
                if (i == 0) {
                    continue;
                }
                moveDown();
                System.out.println(currentFloor);
            }
        }
    }
}

