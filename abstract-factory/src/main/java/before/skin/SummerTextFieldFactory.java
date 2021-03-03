package before.skin;

/**
 * 具体工厂【夏天文本输入框工厂】
 */
public class SummerTextFieldFactory implements TextFieldFactory{

    @Override
    public TextField getTextField() {
        TextField textField = new SummerTextField();
        return textField;
    }
}
