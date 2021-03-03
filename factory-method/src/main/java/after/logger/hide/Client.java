package after.logger.hide;

public class Client {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DBLoggerFactory();
        loggerFactory.write();
    }
}
