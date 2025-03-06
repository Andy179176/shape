public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        Square square = new Square(2);
        System.out.println(square);

    }
}

/*
Реализовать 3 класса геометрических фигур: круг (Circle), квадрат(Square) и прямоугольник (Rectangle) .
У круга есть радиус, у квадрата и прямоугольника -стороны.
В каждом классе должен быть метод расчета площади фигуры calcArea().
В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
Напишите  метод, который проверит, есть ли заданная фигура в List
Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение


 */