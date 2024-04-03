package CompController;

import GameState.GameState;

import java.util.HashMap;
import java.util.Map;

public class CompControllerStatic {
    private static Map<String, Integer> scoreMap = new HashMap<String, Integer>();

    private static GameState gameController;

    //initialisation function; populate map

    public static Map<String, AllianceEnum> getNextGame() {
        return null;
        //populate later
    }

    public static GameState getCurrentGameController() {
        return gameController;
    }
}
