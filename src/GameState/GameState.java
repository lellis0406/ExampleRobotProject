package GameState;

import Field.Field;

import java.util.HashMap;
import java.util.Map;

public class GameState {
    double time;

    private Field field;

    GameStateEnum state;

    int score;

    private Map<String, Integer> robotMap = new HashMap<String, Integer>();

    public GameState() {

    }

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

    public void addScore(int scoreSum) {
        score += scoreSum;
    }

    public void tick() {
        field.tick();
    }

}
