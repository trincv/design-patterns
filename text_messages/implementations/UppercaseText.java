package text_messages.implementations;

import text_messages.interfaces.AlterText;

public class UppercaseText implements AlterText {
    
    private AlterText alterText;
;

    public UppercaseText (AlterText alterText) { this.alterText = alterText; }

    @Override
    public String alterText() {
        String alteredText = this.alterText.alterText();
        
        if (alteredText == null)
            return null;

        return alteredText.toUpperCase();
    }
}
