package text_messages;

import java.util.Scanner;

import text_messages.implementations.LowercaseText;
import text_messages.implementations.RemoveBlankSpaces;
import text_messages.implementations.RemoveVogals;
import text_messages.implementations.Text;
import text_messages.implementations.UppercaseText;
import text_messages.interfaces.AlterText;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.println("Insira um texto: ");
        String text = scanner.nextLine();

        while (option >= 0) {
            
            AlterText alteredText = new Text(text);

            System.out.println("Escolha a opção: ");
            option = scanner.nextInt();

            if (option == 0)
                alteredText = new UppercaseText(new RemoveVogals(new Text(text)));
            
            if (option == 1) 
                alteredText = new RemoveVogals(new RemoveBlankSpaces(new LowercaseText(new Text(text))));
            
            if (option == 2)
                alteredText = new UppercaseText(new Text(text));
                
            System.out.println(alteredText.alterText());
        }
    }
}
