package babu.bosco.com;

import java.util.LinkedList;
import java.util.Queue;

public class Customer {
    private String name;
    private String address;
    private int age;
    private Queue<Rental> rentalHistory;

    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.rentalHistory = new LinkedList<>();
    }

    public void addRental(Rental rental) {
        if (rentalHistory.size() >= 5) {
            rentalHistory.poll();
        }
        rentalHistory.offer(rental);
    }

    public Queue<Rental> getRentalHistory() {
        return new LinkedList<>(rentalHistory);
    }
}
