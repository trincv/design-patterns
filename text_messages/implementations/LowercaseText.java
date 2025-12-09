package text_messages.implementations;

import text_messages.interfaces.AlterText;

public class LowercaseText implements AlterText {
    
    private AlterText alterText;

    public LowercaseText (AlterText alterText) { this.alterText = alterText; }

    @Override
    public String alterText() {
        String alteredText = this.alterText.alterText();
        
        if (alteredText == null)
            return null;

        return alteredText.toLowerCase();
    }
}
