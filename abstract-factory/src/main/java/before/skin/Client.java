package before.skin;

public class Client {

    public static void main(String[] args) {

        ButtonFactory buttonFactory = new SpringButtonFactory();
        TextFieldFactory textFieldFactory = new SpringTextFieldFactory();

        buttonFactory.getButton().click();
        textFieldFactory.getTextField().input();
    }

}
