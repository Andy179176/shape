public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calcArea(){
        return Math.PI * radius*radius;
    }

    @Override
    public String toString() {
        return String.format("Круг, радиус: %.2f площадь %.2f ", radius,calcArea());
    }
}
