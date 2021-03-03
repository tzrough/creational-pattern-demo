package before.skin;

/**
 * 具体产品【夏天风格按键】
 */
public class SummerButton implements Button{

    public SummerButton() {
        System.out.println("Summer Button Create");
    }

    @Override
    public void click() {
        System.out.println("Summer Button Click");
    }

}
