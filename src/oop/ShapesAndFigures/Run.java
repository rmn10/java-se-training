/**
 * Created by romario on 3/26/2017.
 *
 * This is a simple example, how to use EXTENDS
 *
 * Class Draw - is a abstract class that contains style (color, fill, lineheight) parameters of the objects
 * Classes Lineparams, CircleParams, RectangleParams - contains size and coordinates parameters for every objects
 *
 * P.S. i not release here drawing for DOT and POLIGONES classes
 *
 *
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;


public class Run extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My drawing example of the shapes");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);

        //here is i was make a drawing of the line. i complicated, because i make it from "moveTo-LineTo"
        Path path = new Path();

        LineParams fig1 = new LineParams();
        fig1.myLine(50, 50, 50, 250);
        fig1.style(Color.BLUE, Color.WHITE, 7);

        MoveTo moveTo = new MoveTo();
        moveTo.setX(fig1.getstartX());
        moveTo.setY(fig1.getstartY());

        LineTo lineTo = new LineTo();
        lineTo.setX(fig1.getendX());
        lineTo.setY(fig1.getendY());
        path.getElements().add(moveTo);
        path.getElements().add(lineTo);
        path.setStrokeWidth(fig1.lineWidth);
        path.setStroke(fig1.lineColor);

        // set the parameters of the my_circle
        CircleParams fig2 = new CircleParams();
        fig2.myCircle(150,150,60);
        fig2.style(Color.BROWN, Color.YELLOW, 3);

        //input rectangle parameters to the javaFX object
        Circle circle = new Circle();
        circle.setCenterX(fig2.getxCenter());
        circle.setCenterY(fig2.getyCenter());
        circle.setRadius(fig2.getRadius());
        circle.setFill(fig2.fillColor);
        circle.setStroke(fig2.lineColor);
        circle.setStrokeWidth(fig2.lineWidth);

        // set the parameters of the my_rectangle
        RectangleParams fig3 = new RectangleParams();
        fig3.myRectangle(250, 110, 120, 80);
        fig3.style(Color.RED, Color.CYAN, 2);

        //input rectangle parameters to the javaFX object
        Rectangle rectangle = new Rectangle();
        rectangle.setX(fig3.x1);
        rectangle.setY(fig3.y1);
        rectangle.setWidth(fig3.width);
        rectangle.setHeight(fig3.height);
        rectangle.setFill(fig3.fillColor);
        rectangle.setStroke(fig3.lineColor);
        rectangle.setStrokeWidth(fig3.lineWidth);

        // set the Annotation text
        Text text = new Text();
        text.setX(25) ;
        text.setY(280) ;
        String anno = "L = "+String.format("%.2f", fig1.getLen()) +"\t\tL = "+ String.format("%.2f", fig2.getLen()) + "\t\t\t\tL = " + String.format("%.2f", fig3.getLen());
        text.setText(anno) ;

        primaryStage.setScene(scene);

        // add my figures to the scene
        root.getChildren().add(path);
        root.getChildren().add(circle);
        root.getChildren().add(rectangle);
        root.getChildren().add(text);

        //and show the scene ...
        primaryStage.show();

    }

}
