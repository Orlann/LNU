package proba.lab_abstract_classes;

public class Square extends Shape {
    private int x1, y1, x2, y2;

    Square(String color, int x1, int y1, int x2, int y2){
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    protected void draw(){
        System.out.println(String.format("Draw the square with coordinates (%d, %d) and (%d, %d)",getX1(),getY1(),getX2(),getY2()));
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
}
