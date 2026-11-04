package Practice_1;

public class Car {
    String brand;
    int year;

    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    //Геттер для возраста машины
    int getYear(){
        return this.year;
    }

    //Сеттер для возраста машины
    void setYear(int newYear){
        this.year = newYear;
    }

    //Геттер для бренда машины
    String getBrand(){
        return this.brand;
    }

    //Сеттер для бренда машины
    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void print(){
        System.out.println("Бренд машины: " + this.brand + ", Возраст машины: " + this.year);
    }
}
