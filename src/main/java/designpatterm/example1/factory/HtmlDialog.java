package designpatterm.example1.factory;


import designpatterm.example1.buttons.Button;
import designpatterm.example1.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
