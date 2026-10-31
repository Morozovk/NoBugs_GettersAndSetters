package Practice_9;

import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Product potato = new Product("Картошка", 50);

        potato.setPrice(potato.applyDiscount(10.0));
        potato.printInfo();
    }
}
