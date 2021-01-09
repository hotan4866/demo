package demo.game.domain;

public class MoveNumber {

    private int randomNumber;
    private static final int MOVE_FORWARD = 4;

    public MoveNumber(int number) {
        this.randomNumber = number;
    }

    boolean isMovable() {
        return this.randomNumber >= MOVE_FORWARD; // 4이상  움직임 
    }
}
