package Exam;

public class Object {
    public static void main(String[] args) {
        GeometricOnject circle = new GeometricOnject();
        circle.area = circle.radius*circle.radius*Math.PI;
        GeometricOnject rectangle = new GeometricOnject();
        rectangle.area = rectangle.width*rectangle.height;
        GeometricOnject perimeterofcircle = new GeometricOnject();
        perimeterofcircle.area = perimeterofcircle.diameter*Math.PI;
        GeometricOnject perimeterofrectangle = new GeometricOnject();
        perimeterofrectangle.area = 2*(perimeterofrectangle.width+perimeterofrectangle.height);
        System.out.println("Circle are : "+ circle.area + "rectangle are: "+rectangle.area+
                "perimeterofcircle.area :"+perimeterofcircle.area +"perimeterofrectangle: "+perimeterofrectangle.area);
    }
}