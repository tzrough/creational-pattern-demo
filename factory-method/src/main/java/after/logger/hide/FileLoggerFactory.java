package after.logger.hide;


/**
 * 具体工厂【文件日志记录器工厂】
 */
public class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger getLogger() {
        Logger fileLogger = new FileLogger();
        fileLogger.init();
        return fileLogger;
    }
}
