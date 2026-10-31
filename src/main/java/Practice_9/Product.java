package Practice_9;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

     void setPrice(double newPrice){
        this.price = newPrice;
     }

    double applyDiscount(double discount){
         return price * (1 - discount /100);
    }

    void printInfo(){
        System.out.println("Товар: " + this.name + "- цена товара: " + this.getPrice());
    }
}
