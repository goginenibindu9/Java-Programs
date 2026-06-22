abstract class BankAccount {
    abstract void calculateInterest();

    void displayBank() {
        System.out.println("ABC Bank");
    }
}

class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Savings Interest = 5%");
    }
}

class CurrentAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Current Interest = 2%");
    }
}

public class AbstractBank {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount();
        BankAccount b2 = new CurrentAccount();

        b1.displayBank();
        b1.calculateInterest();

        b2.displayBank();
        b2.calculateInterest();
    }
}