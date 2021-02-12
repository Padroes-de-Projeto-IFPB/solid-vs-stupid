package solid.DI;

public class User {

    public Logger log = new LoggerDatabase();

    public void someBusinessLogic() throws Exception {
        log.debug("Algum debug");
        throw new Exception();
    }

}
