package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shape;

public class Circle extends Shape {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING

    @Override
    public double getPerimeter() {
        return 2*3.1416*radio;
    }

    @Override
    public double getArea() {
        return 3.1416*(radio*radio);
    }

    // Sobrecarga = Overloading // polimorfismo

    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras
    public String getName() {
        return "Circle";
    }

    public int getRadio() {
        return radio;
    }

}
