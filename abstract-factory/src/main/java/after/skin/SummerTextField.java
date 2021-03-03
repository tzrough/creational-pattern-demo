package after.skin;

/**
 * 具体产品【夏天风格文本输入框】
 */
public class SummerTextField implements TextField {

    public SummerTextField() {
        System.out.println("Summer Text Field Create");
    }

    @Override
    public void input() {
        System.out.println("Summer Text Field Input");
    }
}
