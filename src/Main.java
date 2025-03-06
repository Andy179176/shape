import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        Square square = new Square(2);
        System.out.println(square);

        List<Shape> list = new ArrayList<>();
        list.add(rectangle);
        list.add(circle);
        list.add(square);

        System.out.println(list);
        System.out.printf("Общая площадь всех фигур: %.2f%n", calcAllShapesArea(list));

        System.out.println("Ищем фигуру:");
        System.out.println(contains(list, new Circle(1)));
        System.out.println("--------------------------");
        System.out.println(areaBiggerThan(list,3.5));
    }

    public static double calcAllShapesArea(List<Shape> list){
        double result=0;
        /*
        for (int i=0; i< list.size(); i++){
            Shape shape = list.get(i);
            result+=shape.calcArea();
        }

         */
        //   переменная-элемент: имя структуры
        for (Shape shape: list){
            result+=shape.calcArea();
        }

        return result;
    }

    public static boolean contains(List<Shape> list,Shape shape){
        //return list.contains(shape);
        for (Shape sh: list){
            if(sh.equals(shape)){
                return true;
            }
        }
        return false;
    }

    public static List<Shape> areaBiggerThan(List<Shape> list,double area){
        List<Shape> result = new ArrayList<>();
        for (Shape sh: list){
            if(sh.calcArea()>area){
                result.add(sh);
            }
        }
        return result;
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