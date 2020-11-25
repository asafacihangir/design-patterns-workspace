package abstractfactory.example1.factories;


import abstractfactory.example1.buttons.Button;
import abstractfactory.example1.buttons.WindowsButton;
import abstractfactory.example1.checkboxes.Checkbox;
import abstractfactory.example1.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
