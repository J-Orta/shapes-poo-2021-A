package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.*;
import uaslp.ingenieria.labs.shapes.triangles.IsocelesTriangle;
import uaslp.ingenieria.labs.shapes.triangles.ScaleneTriangle;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEquilatero;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shape> shapes = new LinkedList<>();

        shapes.add(new Shape());

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(8, 3));
        shapes.add(new Rectangle(14, 10));
        shapes.add(new Square(10));
        shapes.add(new TriangleEquilatero(6));
        shapes.add(new IsocelesTriangle(5,9));
        shapes.add(new ScaleneTriangle(9,6,12));

        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + String.format("%.2f", shape.getPerimeter()));
            System.out.println("Area: " + String.format("%.2f", shape.getArea()));
            System.out.println("-----------------------------------------------");
        }


    }
}
