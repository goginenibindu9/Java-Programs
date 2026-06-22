abstract class Payment {
    abstract void pay(int amount);

    void message() {
        System.out.println("Payment Processing...");
    }
}

class UPI extends Payment {
    void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCard extends Payment {
    void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class AbstractPayment {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();

        p1.message();
        p1.pay(1000);

        p2.message();
        p2.pay(2000);
    }
}
