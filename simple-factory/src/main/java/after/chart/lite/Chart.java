package after.chart.lite;

/** 抽象产品类 【图表类】
 *  简化版-简单工厂模式
 *  创建对象方法，由工厂类转移至抽象产品类
 */
public abstract class Chart {

    abstract void display();

    //静态工厂方法
    public static Chart get(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        }
        else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        }
        else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
        }
        return chart;
    }
}
