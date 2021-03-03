package before.skin;

/**
 * 具体工厂【春天文本输入框工厂】
 */
public class SpringTextFieldFactory implements TextFieldFactory{

    @Override
    public TextField getTextField() {
        TextField textField = new SpringTextField();
        return textField;
    }
}
