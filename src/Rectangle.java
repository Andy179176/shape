public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник [%.2f x %.2f], площадь: %.2f",sideA,sideB,calcArea());
    }

    public double calcArea() {
        return sideA*sideB;
    }
}
