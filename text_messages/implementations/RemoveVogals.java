package text_messages.implementations;

import text_messages.interfaces.AlterText;

public class RemoveVogals implements AlterText {
    
    private AlterText alterText;

    public RemoveVogals (AlterText alterText) { this.alterText = alterText; }

    @Override
    public String alterText() {
        String alteredText = this.alterText.alterText();
        
        if (alteredText == null)
            return null;

        return alteredText.replaceAll("[AaEeIiOoUu]", "");
    }
}
