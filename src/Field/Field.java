package Field;

import Robot.RobotAbstract;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Pixel> pixels = new ArrayList<Pixel>();

    private final double fieldSize = 50;

    public double getFieldSize() {
        return fieldSize;
    }

    private List<RobotAbstract> robotList = new ArrayList<RobotAbstract>();

    public List<Pixel> getPixels() {
        return pixels;
    }

    public List<RobotAbstract> getRobots() {
        return null; //placeholder
    }

    public void tick() {
        for (int i = 0; i < robotList.size(); i ++) {
            robotList.get(i).moveTick();
        }
    }
}
