package after.logger.hide;


/**
 * 具体工厂【数据库日志记录器工厂】
 */
public class DBLoggerFactory extends LoggerFactory {

    @Override
    public Logger getLogger() {
        Logger dbLogger = new DBLogger();
        dbLogger.init();
        return dbLogger;
    }
}
