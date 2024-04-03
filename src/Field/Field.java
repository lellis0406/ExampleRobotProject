package Field;

import Robot.RobotAbstract;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Pixel> pixels = new ArrayList<Pixel>();

    private List<RobotAbstract> robotList = new ArrayList<RobotAbstract>();

    public List<Pixel> getPixels() {
        return pixels;
    }

    public List<RobotAbstract> getRobots() {
        return null; //placeholder
    }
}
