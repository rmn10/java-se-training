import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 *
 * Подкласс MyCircle - описывает объекты типа "Круг"
 * myCircle(int xCenter, int yCenter, int radius) - задать координаты центра и радиус
 *
 * getxCenter(), getyCenter() - возвращают координаты центра
 * getRadius() - возвращает радиус
 * getLen() - возвращает длину окружности
 *
 * style(Color lineColor, Color fillColor, double lineWidth) - абстрактный метод, заимствованный из
 * суперкласса Draw, позволяет задать цветовой стиль (цвет линии, заливку (если это фигура), толщину линии)
 *
 *
 */


public class MyCircle extends Draw{

    @Override
    void style(Color lineColor, Color fillColor, double lineWidth) {
        this.lineColor = lineColor;
        this.fillColor = fillColor;
        this.lineWidth = lineWidth;
    }

    private double xCenter, yCenter;
    private double radius;

    MyCircle() {
        myCircle(200,200,100);
    }

    public void myCircle(int xCenter, int yCenter, int radius) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
    }

    public double getxCenter(){
        return xCenter;
    }

    public double getyCenter() {
        return yCenter;
    }

    public double getRadius() {
        return radius;
    }

    double getS() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getLen() {
        return 2*Math.PI*radius;
    }
}
