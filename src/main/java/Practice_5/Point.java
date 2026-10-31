package Practice_5;

public class Point {
    double x;
    double y;

    Point(double someX,double someY){
        this.x = someX;
        this.y = someY;
    }

    double getX(){
        return this.x;
    }

    double getY(){
        return this.y;
    }

    void setX(double newX){
        this.x = newX;
    }

    void print(){
        System.out.println("Кординаты X: " + this.x + ", координаты Y: " + this.y);
    }
}
