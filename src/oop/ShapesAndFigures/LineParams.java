import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 */
class LineParams extends Draw {

    @Override
    void style(Color Col, Color fillC, double LineW) {
        lineColor = Col;
        fillColor = fillC;
        lineWidth = LineW;
    }

    int x1, y1, x2, y2;

    public void myLine(int startX, int startY, int endX, int endY) {
        x1 = startX;
        y1 = startY;
        x2 = endX;
        y2 = endY;
    }

    void myLine() {
        x1 = 10;
        y1 = 10;
        x2 = 20;
        y2 = 20;
    }

    int getstartX() {
        return x1;
    }

    int getstartY() {
        return y1;
    }

    int getendX() {
        return x2;
    }

    int getendY() {
        return y2;
    }

    double getLen() {
        return  Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}
