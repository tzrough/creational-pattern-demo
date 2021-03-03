package after.skin;

/**
 * 具体工厂【春天风格皮肤】
 */
public class SpringSkinFactory implements SkinFactory{

    @Override
    public Button getButton() {
        Button button = new SpringButton();
        return button;
    }

    @Override
    public TextField getTextField() {
        TextField textField = new SpringTextField();
        return textField;
    }
}
