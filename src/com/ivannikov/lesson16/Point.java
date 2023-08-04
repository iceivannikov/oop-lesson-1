package com.ivannikov.lesson16;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Проще всего представить две точки как вершины прямоугольного треугольника.
     * Поэтому дистанция определяется по теореме Пифагора: сумма квадратов длин катетов равна квадрату длины гипотенузы.
     * <p>
     * Следовательно необходимо просто найти расстояние между соответствующими двумя точками (это будут катеты),
     * и потом просто по теореме Пифагора извлечь корень из суммы квадратов этих катетов.
     * <p>
     * Здесь нет разницы от какой точки отнимать соответствующие координаты, потому что при возведении в квадрат
     * все равно получится положительное число.
     *
     * @param point точка, до которой нужно высчитать дистанцию
     * @return дистанция до переданной точки
     */
    public double distance(Point point) {
        double powX = Math.pow(this.x - point.x, 2.0);
        double powY = Math.pow(this.y - point.y, 2.0);
        return Math.sqrt(powX + powY);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
