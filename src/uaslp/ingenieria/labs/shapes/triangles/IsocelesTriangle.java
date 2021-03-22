package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class IsocelesTriangle extends Triangle {

        int side;
        int base;

    public IsocelesTriangle(int side, int base) {
        this.side = side;
        this.base = base;
    }

    @Override
    public String getName() {
        return super.getName() + "Isoceles";
    }

    @Override
    public double getPerimeter() {
        return (side*2) + base;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt((side*side)-((double)base/4));
        return (base*height) / 2;
    }
}
