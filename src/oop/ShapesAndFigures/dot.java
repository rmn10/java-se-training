import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 */
class dot extends Draw {
    int x;
    int y;

    @Override
    void style(Color Col, Color fillC, double LineH) {
        lineColor = Col;
        fillColor = Color.WHITE;
        lineWidth = LineH;
    }

    dot(int xCenter, int yCenter) {
        x = xCenter;
        y = yCenter;
    }

    int getXCoord() {
        return x;
    }

    int getYCoord() {
        return y;
    }
}
