package stupid.tight_coupling;

public class Traveller1 {

    private Car car = new Car();

    public void travellerStatus() {
        car.move();
    }

}
