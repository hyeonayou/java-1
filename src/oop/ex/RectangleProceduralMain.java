package oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();

    }
}
