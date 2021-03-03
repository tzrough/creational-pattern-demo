package after.chart.lite;

/** 客户端【图表使用方】**/
public class Client {

    public static void main(String[] args) {
        Chart lineChart = Chart.get("line");
        lineChart.display();
    }

}
