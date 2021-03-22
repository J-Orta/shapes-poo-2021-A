package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

public class ScaleneTriangle extends Triangle {
    int sideA;
    int sideB;
    int sideC;

    public ScaleneTriangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getName() {
        return super.getName() + "Scalene";
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (sideA+sideB+sideC)/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    }
}
