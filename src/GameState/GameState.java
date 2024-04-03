package GameState;

import Field.Field;

public class GameState {
    double time;

    private Field field;

    GameStateEnum state;

    int score;

    public GameStateEnum getState() {
        return state;
    }

    public double getTime() {
        return time;
    }

    public Field getField() {
        return field;
    }

    public int getScore() {
        return score;
    }

}
