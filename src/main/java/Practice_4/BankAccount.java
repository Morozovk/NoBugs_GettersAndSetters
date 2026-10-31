package Practice_4;

public class BankAccount {
    String owner;
    int balance;

    BankAccount (String someOwner, int someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return this.owner;
    }

    int getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void setBalance(int newBalance){
        this.balance = newBalance;
    }

    int deposit(int amount){
        balance += amount;
        return balance;
    }

    int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    void printBalance(){
        System.out.println("На счету владельца " + this.owner + " находится всего: " + this.getBalance());
    }
}
