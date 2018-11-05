package proba.lab_abstract_classes;

public abstract class Shape {
    String color;

    Shape(String color){
        this.color = color;
    }

    protected abstract void draw();

    protected void draw_color(){
        System.out.println("Color of "+this.getClass()+" is "+color);
    }
}
