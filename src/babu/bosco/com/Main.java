package babu.bosco.com;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create housing units
        Apartment apartment = new Apartment(2, 75.5, 100.0, "123 Main St", "New York");
        Villa villa = new Villa(4, 200.0, 300.0, "456 Park Ave", "Los Angeles");

        // Create customer
        Customer customer = new Customer("John Doe", "789 Oak Rd", 30);

        // Create and process rentals
        Rental rental1 = new Rental(apartment, customer, LocalDate.now(), 5);
        rental1.processRental();

        Rental rental2 = new Rental(villa, customer, LocalDate.now().plusDays(10), 7);
        rental2.processRental();

        // Check availability
        System.out.println("Apartment available: " + apartment.isAvailable());
        System.out.println("Villa available: " + villa.isAvailable());

        // Check total income
        System.out.println("Apartment total income: $" + apartment.getTotalIncome());
        System.out.println("Villa total income: $" + villa.getTotalIncome());

        // Check customer rental history
        System.out.println("Customer rental history size: " + customer.getRentalHistory().size());
    }
}
