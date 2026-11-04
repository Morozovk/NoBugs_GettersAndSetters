package Practice_7;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);

        circle.setRadius(5);

        System.out.println("Площадь: " + circle.calculateArea() + ", длина окружности: " +
                circle.calculateCircumference());
    }
}
