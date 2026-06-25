class Flight {
    int seats = 1; // Last seat

    synchronized void bookSeat(String name) {
        if (seats > 0) {
            System.out.println(name + " booked the seat.");
            seats--;
        } else {
            System.out.println(name + " could not book. Seat already sold.");
        }
    }
}

class Passenger extends Thread {
    Flight f;
    String name;

    Passenger(Flight f, String name) {
        this.f = f;
        this.name = name;
    }

    public void run() {
        f.bookSeat(name);
    }
}

public class FlightBooking {
    public static void main(String[] args) {

        Flight flight = new Flight();

        Passenger p1 = new Passenger(flight, "Rahul");
        Passenger p2 = new Passenger(flight, "Anu");

        p1.start();
        p2.start();
    }
}


