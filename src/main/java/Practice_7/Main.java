package Practice_7;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);

        circle.setRadius(5);

        System.out.println("Площадь: " + circle.calculateArea(circle.getRadius()) + ", длинна окружности: " +
                circle.calculateCircumference(circle.getRadius()));
    }
}
