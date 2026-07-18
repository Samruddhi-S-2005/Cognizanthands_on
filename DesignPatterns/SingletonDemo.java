class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Singleton Instance Created");
    }
}

public class SingletonDemo {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.displayMessage();

        if (logger1 == logger2) {
            System.out.println("Only one instance exists.");
        }
    }
}