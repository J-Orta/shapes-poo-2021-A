package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public String getName() {
        return "Square";
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public int getSidesCount() {
        return 4;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
