class Transaction {
    String user;
    String item;
    double amount;
    int time; // time in seconds

    Transaction(String user, String item, double amount, int time) {
        this.user = user;
        this.item = item;
        this.amount = amount;
        this.time = time;
    }
}
public class FraudDetection {
    public static void main(String[] args) {
        Transaction t[] = {
            new Transaction("Ravi", "Mobile", 60000, 10),
            new Transaction("Anu", "Book", 500, 20),
            new Transaction("Ravi", "Headphones", 2000, 30),
            new Transaction("Sita", "Pen", 100, 40),
            new Transaction("Sita", "Pen", 100, 70),
            new Transaction("Sita", "Pen", 100, 90)
        };
        System.out.println("Suspicious Transactions:");
        // Check transactions above Rs.50000
        for (int i = 0; i < t.length; i++) {
            if (t[i].amount > 50000) {
                System.out.println( "High-value transaction by " + t[i].user +  " : Rs." +  t[i].amount );
            }
        }
        // Check for three identical purchases within one minute
        for (int i = 0; i < t.length - 2; i++) {
            if (t[i].user.equals(t[i + 1].user) &&
                t[i].user.equals(t[i + 2].user) &&
                t[i].item.equals(t[i + 1].item) &&
                t[i].item.equals(t[i + 2].item) &&
                (t[i + 2].time - t[i].time <= 60)) {
                System.out.println ( "Repeated purchases detected for user: " + t[i].user);
            }
        }
    }
}

