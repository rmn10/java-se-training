import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 */
abstract class Draw {

    Color lineColor;

    Color fillColor;

    double lineWidth;

    abstract void style(Color c, Color f, double w);

}
