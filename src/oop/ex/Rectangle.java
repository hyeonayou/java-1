package oop.ex;

public class Rectangle {

    int width;
    int height;
    int area;
    int perimeter;
    boolean square;

    void calculateArea() {
        area = width * height;
        System.out.println("넓이: " + area);
    }
    void calculatePerimeter()
    {
        perimeter = 2*(width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    void isSquare()
    {
        if (width == height) {
            square = true;
            System.out.println("정사각형입니다. ");
        } else {
            square = false;
            System.out.println("정사각형이 아닙니다.");
        }
    }
}
