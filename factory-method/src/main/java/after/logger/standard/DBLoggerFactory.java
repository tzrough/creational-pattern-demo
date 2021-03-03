package after.logger.standard;


/**
 * 具体工厂【数据库日志记录器工厂】
 */
public class DBLoggerFactory implements LoggerFactory{

    @Override
    public Logger getLogger() {
        Logger dbLogger = new DBLogger();
        dbLogger.init();
        return dbLogger;
    }
}
