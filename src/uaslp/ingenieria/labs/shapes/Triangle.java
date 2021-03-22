package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Triangle extends Shape {

    // No puedo crear un triángulo sin definir de qué tipo es

    public String getName() {
        return "Triangle";
    }

    @Override
    public int getSidesCount() {
        return 3;
    }
}

