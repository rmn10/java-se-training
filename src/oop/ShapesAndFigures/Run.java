/**
 * Created by romario on 3/26/2017.
 *
 * This is a simple example, how to use EXTENDS
 *
 * Класс Draw - общие для всех свойства (цветовой стиль)- цвет линий, цвет заливки (если это фигуры), толщина линий
 *
 * Классы MyLine, MyCircle, MyRectangle - описывают характеристики фигур (координаты и размерности)
 *
 * Клавиши D - dot, L - Line, C - Circle, R - Rectangle, P - Polygon, ESC - Exit
 *
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
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

        Scene scene = new Scene(root, 580, 300, Color.WHITE);

        /* fig1 - объект ТОЧКА. Координаты X,Y. Имеет свойство lineColor*/
        Path dot = new Path();

        MyDot fig1 = new MyDot();

        /* объект fig1 -  "отрезок". Координаты начала (startX,StartY), конец (endX,endY)*/
        fig1.myDot(15, 150);

        /* цветовой стиль всех моих фигур задается через абстрактный метод style из класса Draw. */
        fig1.style(Color.BLACK, Color.WHITE, 5);

        /* далее - наполняю объект dot */
        MoveTo moveTo = new MoveTo();
        moveTo.setX(fig1.getX());
        moveTo.setY(fig1.getY());

        /* чтобы можно было различить на экране - рисую с помощью прямой с координатами (x,y ; x+1,y+1)
           в myDot принудительно задал толщину этой линии больше 1пикс.*/
        LineTo lineTo = new LineTo();
        lineTo.setX(fig1.getX()+1);
        lineTo.setY(fig1.getY()+1);
        dot.getElements().add(moveTo);
        dot.getElements().add(lineTo);
        dot.setStrokeWidth(fig1.lineWidth);
        dot.setStroke(fig1.lineColor);


        /* Создаю объект fig2, который представляет из отрезок */
        MyLine fig2 = new MyLine();

        /* параметры - startX, startY, endX, endY и цветовой стиль с параметрами как у отрезка
         - цвет линий, заливка, толщина линий */
        fig2.myLine(50,50,50,250);
        fig2.style(Color.BLUE, Color.WHITE, 5);

        /* заполняю параметрами объект line */
        Line line = new Line();
        line.setStartX(fig2.getstartX());
        line.setStartY(fig2.getstartY());
        line.setEndX(fig2.getendX());
        line.setEndY(fig2.getendY());
        line.setFill(fig2.fillColor);
        line.setStroke(fig2.lineColor);
        line.setStrokeWidth(fig2.lineWidth);


        /* Создаю объект fig3, который представляет из себя круг */
        MyCircle fig3 = new MyCircle();

        /* параметры - centerX, centerY, radius и цветовой стиль с параметрами как у отрезка
         - цвет линий, заливка, толщина линий */
        fig3.myCircle(150,150,60);
        fig3.style(Color.BROWN, Color.YELLOW, 3);

        /* заполняю параметрами объект circle, который нам нужно отобразить */
        Circle circle = new Circle();
        circle.setCenterX(fig3.getxCenter());
        circle.setCenterY(fig3.getyCenter());
        circle.setRadius(fig3.getRadius());
        circle.setFill(fig3.fillColor);
        circle.setStroke(fig3.lineColor);
        circle.setStrokeWidth(fig3.lineWidth);



        /* создаю объект "прямоугольник" с параметрами - x1,y1 - координаты левой верхней вершины
            width, height - ширина и высота прямоугольника, и цветовым стилем с параметрами как ранее  */
        MyRectangle fig4 = new MyRectangle();
        fig4.myRectangle(250, 110, 120, 80);
        fig4.style(Color.RED, Color.CYAN, 2);

        /* создаю объект rectangle который будем отображать по образу и подобию нашего "прямоугольника" */
        Rectangle rectangle = new Rectangle();
        rectangle.setX(fig4.getX());
        rectangle.setY(fig4.getY());
        rectangle.setWidth(fig4.getWidth());
        rectangle.setHeight(fig4.getHeight());
        rectangle.setFill(fig4.fillColor);
        rectangle.setStroke(fig4.lineColor);
        rectangle.setStrokeWidth(fig4.lineWidth);


        MyPolygon fig5 = new MyPolygon();
        fig5.style(Color.DARKGREEN, Color.LIGHTGRAY, 2);

        Polygon polygon = new Polygon(fig5.getPolygonPoints());

        polygon.setFill(Color.SKYBLUE);
        polygon.setStrokeWidth(3);
        polygon.setStroke(Color.BLACK);


        /* текстовый объект содержит информацию которая будет выведена под фигурами,
         а именно, длина линии, и периметр фигур (измеряется в пикселях)
          */
        Text text = new Text();
        text.setX(25) ;
        text.setY(280) ;
        String anno = "L = "+String.format("%.2f", fig2.getLen()) +"\t\tP = "+ String.format("%.2f", fig3.getLen()) + "\t\t\t\tP = " + String.format("%.2f", fig4.getLen()) + "\t\t\t\tP = " + String.format("%.2f", fig5.getLen());
        text.setText(anno) ;


        /* привязываю к сцене слушатель клавиатуры */
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {         /* ESC - закрыть окно и выйти из программы */
                primaryStage.close();
            }

            KeyCode keycode = event.getCode();

            if (keycode == KeyCode.D) {                     /* D - отобразить/спрятать ТОЧКУ */
                dot.setVisible(!dot.isVisible());
            }

            if (keycode == KeyCode.L) {                     /* L - отобразить/спрятать ОТРЕЗОК */
                line.setVisible(!line.isVisible());
            }

            if (keycode == KeyCode.C) {                     /* C - отобразить/спрятать КРУГ */
                circle.setVisible(!circle.isVisible());
            }

            if (keycode == KeyCode.R) {                     /* R - отобразить/спрятать ПРЯМОУГОЛЬНИК */
                rectangle.setVisible(!rectangle.isVisible());
            }

            if (keycode == KeyCode.P) {                     /* R - отобразить/спрятать ПОЛИГОН */
                polygon.setVisible(!polygon.isVisible());
            }

        });


        primaryStage.setScene(scene);

        /* наполняю сцену фигурами */
        root.getChildren().add(dot);
        root.getChildren().add(line);
        root.getChildren().add(circle);
        root.getChildren().add(rectangle);
        root.getChildren().add(polygon);
        root.getChildren().add(text);

        /* и вывожу это все на экран */
        primaryStage.show();

    }

}
