import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 */

public class MyDot extends Draw {

    private int x;
    private int y;

    @Override
    void style(Color lineColor, Color fillColor, double lineWidth) {
        this.lineColor = lineColor;
        this.fillColor = Color.TRANSPARENT;
        this.lineWidth = 5;
    }

    MyDot() {
        myDot(30,30);
    }

    public void myDot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
