import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 *
 * Подкласс MyRectangle - описывает объекты типа "ПРЯМОУГОЛЬНИК"
 * myRectangle(double x1, double y1, double width, int height) - задать координаты ЛЕВОЙ ВЕРХНЕЙ вершины,
 *                                                                ширину и высоту (в пикселях) ПРЯМОУГОЛЬНИКА
 * getX(), getY() - возвращают координаты левой верхней вершины
 * getwidth(), getheight() - возвращают ширину и высоту
 * getLen() - возвращает периметр
 *
 * style(Color lineColor, Color fillColor, double lineWidth) - абстрактный метод, заимствованный из
 * суперкласса Draw, позволяет задать цветовой стиль (цвет линии, заливку (если это фигура), толщину линии)
 *
 */

public class MyRectangle extends Draw {

    private double x1, y1;
    private double width, height;

    @Override
    void style(Color lineColor, Color fillColor, double lineWidth) {
        this.lineColor = lineColor;
        this.fillColor = fillColor;
        this.lineWidth = lineWidth;
    }

    MyRectangle() {
        myRectangle(250,250,80,80);
    }

    public void myRectangle(double x1, double y1, double width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x1;
    }

    public double getY() {
        return y1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLen() {
        return (width+height)*2;
    }

    public double getS() {
        return width*height;
    }

}
