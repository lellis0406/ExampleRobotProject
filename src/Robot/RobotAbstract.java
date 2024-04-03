package Robot;


import CompController.CompControllerStatic;
import Field.Pixel;

import static java.lang.Math.abs;

public abstract class RobotAbstract {

    protected static double x = 0;
    protected double y = 0;

    protected double speed = 0;

    protected double pickupDistance = 0;

    protected Pixel pickedPixel = null;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void moveTick() {
        Pixel nearestPixel = CompControllerStatic.getCurrentGameController().getField().getPixels().get(0);
        //move towards pixel <speed> units every tick
        if(x != nearestPixel.getX()) {
            if(x < nearestPixel.getX()) {
                x = Math.min(x + speed, nearestPixel.getX());
            } else {
                x = Math.max(x - speed, nearestPixel.getX());
            }
        } else if (y != nearestPixel.getY()) {
            if(y < nearestPixel.getY()) {
                y = Math.min(y + speed, nearestPixel.getY());
            } else {
                y = Math.max(y - speed, nearestPixel.getY());
            }
        }
        if(nearestPixel.checkProximity(x, y, pickupDistance) && pickedPixel == null) {
            pickup(nearestPixel);
        }
        if(pickedPixel != null) {
            pickedPixel.setX(x);
            pickedPixel.setY(y);
        }
        checkPixelScore();
    }

    public void checkPixelScore() {
        double bounds = CompControllerStatic.getCurrentGameController().getField().getFieldSize();
        if(abs(x) > bounds || abs(y) > bounds) {
            CompControllerStatic.getCurrentGameController().addScore(10);
            pickedPixel = null;
        }
    }

    public abstract void pickup(Pixel pixel);
}
