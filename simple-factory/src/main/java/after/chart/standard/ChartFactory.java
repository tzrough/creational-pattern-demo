package after.chart.standard;

/** 工厂类【图表工厂类】
 *  该类的设计仍存在如下问题
 *  1. 违反【开闭原则】, 增加新类型的图表，需要修改该类已有代码
 *  2. 大量 if  else 条件判断，影响性能, 不利于维护
 **/
public class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type) {
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
