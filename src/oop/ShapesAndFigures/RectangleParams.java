import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 */

public class RectangleParams extends Draw {

    double x1, y1;
    double width, height;

    @Override
    void style(Color Col, Color fillC, double LineW) {
        lineColor = Col;
        fillColor = fillC;
        lineWidth = LineW;
    }

    void myRectangle(double xLeftUp, double yLeftUp, double rectWidth, int rectHeight) {
        x1 = xLeftUp;
        y1 = yLeftUp;

        width = rectWidth;
        height = rectHeight;
    }

    void rectangle() {
        x1 = 300;
        y1 = 50;

        width = 120;
        height = 80;
    }



    double getLen() {
        return (width+height)*2;
    }

    double getS() {
        return width*height;
    }

}
