package after.chart.standard;

/** 客户端【图表使用方】**/
public class Client {

    public static void main(String[] args) {
        Chart lineChart = ChartFactory.getChart("line");
        lineChart.display();
    }

}
