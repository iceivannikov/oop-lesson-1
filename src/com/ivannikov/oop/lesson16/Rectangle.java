package com.ivannikov.lesson16;

public class Rectangle implements Figure, WithDiagonal {

    private Point leftUpperCorner;
    private Point rightLowerCorner;

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    @Override
    public double getDiagonal() {
        return leftUpperCorner.distance(rightLowerCorner);
    }

    @Override
    public double getArea() {
        return (rightLowerCorner.getX() - leftUpperCorner.getX()) * (leftUpperCorner.getY() - rightLowerCorner.getY());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftUpperCorner=" + leftUpperCorner +
                ", rightLowerCorner=" + rightLowerCorner +
                '}';
    }

    public Point getLeftUpperCorner() {
        return leftUpperCorner;
    }

    public void setLeftUpperCorner(Point leftUpperCorner) {
        this.leftUpperCorner = leftUpperCorner;
    }

    public Point getRightLowerCorner() {
        return rightLowerCorner;
    }

    public void setRightLowerCorner(Point rightLowerCorner) {
        this.rightLowerCorner = rightLowerCorner;
    }
}
