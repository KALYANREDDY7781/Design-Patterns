package org.example.creational.abstrcatfactory;
interface Button{
    void click();
}

interface CheckBox{
    void check();
}

class LightButton implements Button{

    @Override
    public void click() {
        System.out.println("Light Button clicked!");
    }
}

class LightCheckBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Light Checkbox checked!");
    }
}

class DarkButton implements Button{

    @Override
    public void click() {
        System.out.println("Dark Button clicked!");
    }
}

class DarkCheckBox implements CheckBox{

    @Override
    public void check() {
        System.out.println("Dark Checkbox checked!");
    }
}

interface GUIFactory{
    Button createButton();
    CheckBox createCheckBox();
}

class LightThemeFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}

class DarkThemeFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}

class Application{
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void render(){
        button.click();
        checkBox.check();
    }
}
public class AbstractFactoryMain {
    public static void main(String[] args) {
        GUIFactory factory = new DarkThemeFactory();
        Application app = new Application(factory);
        app.render();
    }
}
