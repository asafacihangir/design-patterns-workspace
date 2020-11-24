package designpatterm.example1.factory;


import designpatterm.example1.buttons.Button;
import designpatterm.example1.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
