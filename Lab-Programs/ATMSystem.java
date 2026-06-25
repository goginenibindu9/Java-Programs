class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal method");
    }
}

// Savings Account Class
class SavingsAccount extends Account {

    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amount) {
        if (amount > 25000) {
            System.out.println("Daily limit exceeded for Savings Account.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }
}

// Current Account Class
class CurrentAccount extends Account {

    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amount) {
        if (amount > 50000) {
            System.out.println("Daily limit exceeded for Current Account.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: Rs." + amount);
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }
}
// Main Class
public class ATMSystem {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, 50000);
        CurrentAccount c = new CurrentAccount(102, 100000);

        System.out.println("Savings Account Transaction");
        s.withdraw(20000);

        System.out.println();

        System.out.println("Current Account Transaction");
        c.withdraw(40000);
    }
}

