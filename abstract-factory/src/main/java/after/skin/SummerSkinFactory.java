package after.skin;

/**
 * 具体工厂【夏天风格皮肤】
 */
public class SummerSkinFactory implements SkinFactory{

    @Override
    public Button getButton() {
        Button button = new SummerButton();
        return button;
    }

    @Override
    public TextField getTextField() {
        TextField textField = new SummerTextField();
        return textField;
    }
}
