package after.chart.standard;

/** 具体产品类【折线图类】**/
public class LineChart implements Chart{

    public LineChart() {
        System.out.println("创建折线图");
    }

    public void display() {
        System.out.println("展示折线图");
    }
}
