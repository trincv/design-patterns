package text_messages.implementations;

import text_messages.interfaces.AlterText;

public class Text implements AlterText {
    
    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String alterText() {
        return this.text;
    }
}
