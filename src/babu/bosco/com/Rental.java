package babu.bosco.com;

import java.time.LocalDate;

public class Rental {
    private Housing housing;
    private Customer customer;
    private LocalDate startDate;
    private int numberOfDays;

    public Rental(Housing housing, Customer customer, LocalDate startDate, int numberOfDays) {
        this.housing = housing;
        this.customer = customer;
        this.startDate = startDate;
        this.numberOfDays = numberOfDays;
    }

    public void processRental() {
        housing.rent();
        housing.addRentalIncome(numberOfDays);
        customer.addRental(this);
    }
}
