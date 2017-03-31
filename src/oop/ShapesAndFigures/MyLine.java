import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 *
 * Подкласс MyLine - описывает объекты типа "ОТРЕЗОК"
 * Координаты начала и конца задаю через метод MyLine(int startX, int startY, int endX, int endY)
 *
 * getstartX(), getstartY() - возвращают координаты начальной точки
 * getendX(), getendY() - возвращают координаты конечной точки
 *
 * getLen() - возвращает длину ОТРЕЗКА (в пикселях)
 *
 * style(Color lineColor, Color fillColor, double lineWidth) - абстрактный метод, заимствованный из
 * суперкласса Draw, позволяет задать цветовой стиль (цвет линии, заливку (если это фигура), толщину линии)
 *
 */
public class MyLine extends Draw {

    @Override
    void style(Color lineColor, Color fillColor, double lineWidth) {
        this.lineColor = lineColor;
        this.fillColor = Color.TRANSPARENT;
        this.lineWidth = lineWidth;
    }

    int startX, startY, endX, endY;

    MyLine() {
        myLine(50,50,50,150);
    }

    public void myLine(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getstartX() {
        return startX;
    }

    public int getstartY() {
        return startY;
    }

    public int getendX() {
        return endX;
    }

    public int getendY() {
        return endY;
    }

    public double getLen() {
        return  Math.sqrt(Math.pow((endX-startX),2)+Math.pow((endY-startY),2));
    }
}
