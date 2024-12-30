package com.research.service.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDesignPattern {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(25);
        circle.setColor("blue");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(40);
        rectangle.setColor("red");
        shapes.add(rectangle);

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

abstract class Shape implements Cloneable {
    private String color;
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.color = shape.color;
            this.x = shape.x;
            this.y = shape.y;
        }
    }

    public abstract Shape clone();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}

class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(Circle circle) {
        super(circle);
        if (circle != null) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "color='" + getColor() + '\'' + ", x=" + getX() + ", y=" + getY() + ", radius=" + radius + '}';
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (rectangle != null) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "color='" + getColor() + '\'' + ", x=" + getX() + ", y=" + getY() + ", width=" + width + ", height=" + height + '}';
    }
}