package Exam;

public class Rectangle extends Circle{
    double width;
    double height;
    public  Rectangle(){
    width=5;
    height=4;
    }
    public Rectangle(double width, double height){

    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
