package before.skin;

/**
 * 具体工厂【春天按键工厂】
 */
public class SpringButtonFactory implements ButtonFactory{

    @Override
    public Button getButton() {
        Button button = new SpringButton();
        return button;
    }
}
