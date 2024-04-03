package Robot;

import Field.Pixel;

public class PusherRobot extends RobotAbstract {
    public PusherRobot() {
        speed = 4;
    }
    @Override
    public void pickup(Pixel pixel) {
        pickedPixel = pixel;
        speed = 2;
    }
}
