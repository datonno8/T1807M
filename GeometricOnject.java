package Exam;
import java.util.StringJoiner;
import java.util.Date;
public class GeometricOnject extends Rectangle {
    String color;
    boolean filled;
    java.util.Date dateCreated;
    double area;
    double perimeter;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
