package babu.bosco.com;

public abstract class Housing {
    private int numberOfRooms;
    private double sizeInM2;
    private double pricePerDay;
    private String address;
    private String city;
    private boolean isRented;
    private double totalIncome;

    public Housing(int numberOfRooms, double sizeInM2, double pricePerDay, String address, String city) {
        this.numberOfRooms = numberOfRooms;
        this.sizeInM2 = sizeInM2;
        this.pricePerDay = pricePerDay;
        this.address = address;
        this.city = city;
        this.isRented = false;
        this.totalIncome = 0;
    }

    public boolean isAvailable() {
        return !isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void release() {
        isRented = false;
    }

    public void addRentalIncome(int days) {
        totalIncome += pricePerDay * days;
    }

    public double getTotalIncome() {
        return totalIncome;
    }
}
