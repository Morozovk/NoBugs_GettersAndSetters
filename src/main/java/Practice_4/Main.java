package Practice_4;

public class Main {
    public static void main(String[] args) {
    BankAccount AccountPetya = new BankAccount("Петр", 5000);

    AccountPetya.deposit(2000);
    AccountPetya.withdraw(1000);

    AccountPetya.printBalance();
    }
}
