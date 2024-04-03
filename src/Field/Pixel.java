package Field;

import static java.lang.Math.abs;

public class Pixel {
    private double x;
    private double y;

    public Pixel(double setX, double setY) {
        x = setX;
        y = setY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double setX) {
        x = setX;
    }

    public void setY(double setY) {
        y = setY;
    }

    public boolean checkProximity(double inX, double inY, double distance) {
        return abs(x - inX) > distance || abs(y - inY) > distance;
    }
}
