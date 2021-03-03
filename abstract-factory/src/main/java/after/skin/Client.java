package after.skin;

public class Client {

    public static void main(String[] args) {
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.getButton();
        TextField textField = skinFactory.getTextField();
        button.click();
        textField.input();
    }

}
