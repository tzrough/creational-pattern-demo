package after.skin;

/**
 * 具体产品【春天风格按键】
 */
public class SpringButton implements Button {

    public SpringButton() {
        System.out.println("Spring Button Create");
    }

    @Override
    public void click() {
        System.out.println("Spring Button Click");
    }
}
