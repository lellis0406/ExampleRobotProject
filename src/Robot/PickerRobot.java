package Robot;

import Field.Pixel;

public class PickerRobot extends RobotAbstract {

    public PickerRobot() {
        speed = 3;
    }

    @Override
    public void pickup(Pixel pixel) {
        pickedPixel = pixel;
    }
}
