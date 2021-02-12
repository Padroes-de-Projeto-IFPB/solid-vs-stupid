package stupid.tight_coupling;

public class Traveller2 {

    private Lorry lorry = new Lorry();

    public void travellerStatus() {
        lorry.move();
    }

}
