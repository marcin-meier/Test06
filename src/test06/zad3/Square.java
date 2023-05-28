package test06.zad3;

public class Square implements Figure {

    private double side;
    private double area;
    private double perimeter;

    public Square(double side) {
        this.side = side;
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

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
