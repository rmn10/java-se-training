import javafx.scene.paint.Color;

/**
 * Created by romario on 3/26/2017.
 *
 * Подкласс MyPolygon - описывает объекты типа "ПОЛИГОН"
 *
 * Координаты вершин задаются в конструкторе MyPolygon()
 * double[] getPolygonPoints() - возвращает массив из пар координат каждой вершины - {x1, y1, x2, y2, ....}
 *
 * getLen() - возвращает периметр
 *
 * style(Color lineColor, Color fillColor, double lineWidth) - абстрактный метод, заимствованный из
 * суперкласса Draw, позволяет задать цветовой стиль (цвет линии, заливку (если это фигура), толщину линии)
 *
 */

public class MyPolygon extends Draw {

    private double n[][] = new double[2][5];


    @Override
    void style(Color lineColor, Color fillColor, double lineWidth) {
        this.lineColor = lineColor;
        this.fillColor = fillColor;
        this.lineWidth = lineWidth;
    }

    MyPolygon() {
        n[0][0] = 410.0;
        n[1][0] = 100.0;

        n[0][1] = 490.0;
        n[1][1] = 70.0;

        n[0][2] = 540.0;
        n[1][2] = 160.0;

        n[0][3] = 510.0;
        n[1][3] = 210.0;

        n[0][4] = 420.0;
        n[1][4] = 180.0;
    }

    public double[] getPolygonPoints() {

        double[] points = new double[10];
        int k = 0;
        for (int j=0; j<5; j++) {
            for (int i = 0; i<2; i++) {
                points[k] = n[i][j];
                k++;
            }
        }
        return points;
    }

    public double getLen() {
        double perimetr;
        perimetr = Math.sqrt(Math.pow((n[0][0]-n[0][4]),2)+Math.pow((n[1][0]-n[1][4]),2));
        for (int i = 0; i < 4; i++) {
            perimetr = perimetr + Math.sqrt(Math.pow((n[0][i+1]-n[0][i]),2)+Math.pow((n[1][i+1]-n[1][i]),2));
        }
        return perimetr;
    }

}
