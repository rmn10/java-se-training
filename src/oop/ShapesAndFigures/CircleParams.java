import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 */


public class CircleParams extends Draw{

    @Override
    void style(Color Col, Color fillC, double LineW) {
        lineColor = Col;
        fillColor = fillC;
        lineWidth = LineW;
    }

    double xCenter, yCenter;
    double radius;

    void myCircle(int xC, int yC, int r) {
        xCenter = xC;
        yCenter = yC;
        radius = r;
    }

    void myCircle() {
        xCenter = 200;
        yCenter = 200;
        radius = 100;
    }

    double getxCenter(){
        return xCenter;
    }

    double getyCenter() {
        return yCenter;
    }

    double getRadius() {
        return radius;
    }

    double getS() {
        return Math.PI*Math.pow(radius,2);
    }

    double getLen() {
        return 2*Math.PI*radius;
    }
}
