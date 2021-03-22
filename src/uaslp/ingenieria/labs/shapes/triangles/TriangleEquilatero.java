package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;


public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return super.getName() + "Equilatero";
    }

    @Override
    public double getPerimeter() {
        return 3*side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3)/4)*(side*side);
    }
}
