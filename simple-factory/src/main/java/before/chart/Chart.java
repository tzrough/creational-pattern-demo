package before.chart;


/**
 * 该类的设计存在如下问题
 * 1. 违反【单一职责原则】，负责所有类型图表的创建和展示，多种类型图表的创建、展示耦合在一起，不利于维护和扩展
 * 2. 违反【开闭原则】，增加新类型的图表，需要修改该类已有代码
 * 3. 大量 if  else 条件判断，影响性能，不利于维护
 */
class Chart {
    //图表类型
    private String type;

    public Chart(String type) {
        this.type = type;
        //初始化柱状图
        if (type.equalsIgnoreCase("histogram")) {
            System.out.println("创建柱状图");
        }
        //初始化饼状图
        else if (type.equalsIgnoreCase("pie")) {
            System.out.println("创建饼状图");
        }
        //初始化折线图
        else if (type.equalsIgnoreCase("line")) {
            System.out.println("创建折线图");
        }
    }

    public void display() {
        //显示柱状图
        if (this.type.equalsIgnoreCase("histogram")) {
            System.out.println("展示柱状图");
        }
        //显示饼状图
        else if (this.type.equalsIgnoreCase("pie")) {
            System.out.println("展示饼状图");
        }
        //显示折线图
        else if (this.type.equalsIgnoreCase("line")) {
            System.out.println("展示折线图");
        }
    }
}
