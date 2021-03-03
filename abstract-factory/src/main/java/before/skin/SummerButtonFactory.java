package before.skin;

/**
 * 具体工厂【夏天按键工厂】
 */
public class SummerButtonFactory implements ButtonFactory{

    @Override
    public Button getButton() {
        Button button = new SummerButton();
        return button;
    }
}
