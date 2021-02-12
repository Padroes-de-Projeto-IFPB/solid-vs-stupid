package stupid.tight_coupling;

public class Traveller {

    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private Vehicle vehicle;

    public void travellerStatus() {
        vehicle.move();
    }

    public static void main(String[] args) {

        Traveller traveller = new Traveller(new Car());
        traveller.travellerStatus();

    }
}
