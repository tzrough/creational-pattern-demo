package before.logger;

/**
 * 工厂类【日志记录器工厂】
 */
public class LoggerFactory {

    public static Logger getLogger(String type) {
        if(type.equalsIgnoreCase("db")) {
            Logger logger = new DBLogger();
            logger.init();
            return logger;
        }
        else if(type.equalsIgnoreCase("file")) {
            Logger logger = new FileLogger();
            logger.init();
            return logger;
        }
        else {
            return null;
        }
    }

}
