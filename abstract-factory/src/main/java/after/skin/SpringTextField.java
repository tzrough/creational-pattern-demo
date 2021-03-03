package after.skin;

/**
 * 具体产品【春天风格文本输入框】
 */
public class SpringTextField implements TextField {

    public SpringTextField() {
        System.out.println("Spring Text Field Create");
    }

    @Override
    public void input() {
        System.out.println("Spring Text Field Input");
    }
}
