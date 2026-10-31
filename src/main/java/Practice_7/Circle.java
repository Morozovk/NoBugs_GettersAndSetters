package Practice_7;

public class Circle {
    int radius;

    Circle(int someRadius) {
        this.radius = someRadius;
    }

    int getRadius() {
        return this.radius;
    }

    void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    double calculateArea(int radius){
        return Math.PI * radius * radius;
    }

    double calculateCircumference(int radius) {
        return Math.PI * 2 * radius;
    }
}

