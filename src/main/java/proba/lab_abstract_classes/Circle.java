package proba.lab_abstract_classes;

public class Circle extends Shape {
    private final double PI = 3.14;
    int x, y, radius;

    Circle(String color, int x, int y, int radius){
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void draw() {
        System.out.println(String.format("Draw the circle with center (%d, %d) and radius %d",getX(),getY(), getRadius()));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
