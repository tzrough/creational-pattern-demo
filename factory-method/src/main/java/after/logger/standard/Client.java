package after.logger.standard;

public class Client {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DBLoggerFactory();
        loggerFactory.getLogger().write();
    }
}
