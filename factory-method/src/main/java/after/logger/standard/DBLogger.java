package after.logger.standard;

/**
 * 具体产品类【数据库日志记录器】
 */
public class DBLogger implements Logger {

    public DBLogger() {
        System.out.println("创建 DB Logger");
    }

    @Override
    public void init() {
        System.out.println("初始化 DB Logger");
    }

    @Override
    public void write() {
        System.out.println("DB Logger Write");
    }
}
