public class Circle {
    public double radius = 1.0;
    public String color = "red";

    public  Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * 2 * Math.PI ;
    }
}
