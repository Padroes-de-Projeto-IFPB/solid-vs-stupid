package solid.DI;

public class LoggerStdout implements Logger {

    public void error(String msg) {
        System.err.println(msg);
    }

    public void debug(String msg) {
        System.out.println(msg);
    }
    
    public void info(String msg){
        System.out.println(msg);
    }

}
