package abstractfactory.example1.factories;


import abstractfactory.example1.buttons.Button;
import abstractfactory.example1.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
