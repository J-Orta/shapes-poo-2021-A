package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    @Override
    public int getSidesCount() {
        return 4;
    }

    @Override
    public double getPerimeter() {
        return 2*(base+height);
    }

    @Override
    public double getArea() {
        return (base*height);
    }
}

