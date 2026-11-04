package Practice_9;

public class Main {
    public static void main(String[] args) {
        Product potato = new Product("Картошка", 50);

        potato.applyDiscount(10.0);
        potato.printInfo();
    }
}
