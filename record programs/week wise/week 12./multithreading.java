class Reservation {
    int seats = 10;

    synchronized void reserve(String name, int req) {
        System.out.println(name + " entered.");
        System.out.println("Available seats: " + seats +
                           " Requested seats: " + req);

        if (seats >= req) {
            System.out.println("Seat Available. Reserve now :-)");
            seats -= req;
            System.out.println(req + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(name + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {
    Reservation r;
    int req;

    Person(Reservation r, String name, int req) {
        super(name);
        this.r = r;
        this.req = req;
    }

    public void run() {
        r.reserve(getName(), req);
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        Person p1 = new Person(r, "Person-1", 5);
        Person p2 = new Person(r, "Person-2", 2);
        Person p3 = new Person(r, "Person-3", 4);

        p1.start();
        try {
            p1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        p2.start();
        try {
            p2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        p3.start();
    }
}
