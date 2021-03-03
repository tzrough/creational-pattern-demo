package after.logger.standard;

/**
 * 具体产品类【文件日志记录器】
 */
public class FileLogger implements Logger {

    public FileLogger() {
        System.out.println("创建 File Logger");
    }

    @Override
    public void init() {
        System.out.println("初始化 File Logger");
    }

    @Override
    public void write() {
        System.out.println("File Logger Write");
    }
}
