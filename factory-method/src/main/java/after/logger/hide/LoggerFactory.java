package after.logger.hide;

/**
 * 抽象工厂【日志记录器工厂接口】
 */
public abstract class LoggerFactory {

    public void write() {
        Logger logger = this.getLogger();
        logger.write();
    }

    abstract Logger getLogger();
}
