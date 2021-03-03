package before.logger;

public class Client {

    public static void main(String[] args) {
        Logger fileLogger = LoggerFactory.getLogger("file");
        fileLogger.write();
    }
}
