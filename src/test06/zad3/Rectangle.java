package test06.zad3;

public class Rectangle implements Figure {

    private double side1, side2;
    private double area;
    private double perimeter;


    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
