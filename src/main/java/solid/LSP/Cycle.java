package solid.LSP;

public class Cycle extends Vehicle {

    public void startCycle() throws Exception {
        throw new Exception("Not implemented yet");
    }

    public Object stopCycle() throws Exception {
        throw new Exception("Not implemented yet");
    }

    @Override
    public void move() throws Exception {
        System.out.println("moving");
    }
}
