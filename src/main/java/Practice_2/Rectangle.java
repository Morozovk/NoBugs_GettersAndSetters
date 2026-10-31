package Practice_2;

public class Rectangle {
    int width;
    int height;

    Rectangle (int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    // Геттеры для ширины и высоты
    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    //сеттер ширины
    void setWidth(int newWidth){
        this.width =newWidth;
    }

    //Метод расчета площади
    int calculateArea(){
        return width * height;
    }
}
