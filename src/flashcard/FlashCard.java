
package flashcard;

import flashcard.gui.UserInterface;
import javax.swing.SwingUtilities;

public class FlashCard {

    public static void main(String[] args) {
        Library library = new Library();
        TextUserInterface ui = new TextUserInterface(library);
        ui.start();
        
//        library.add(new Card("Hello", "こんにちは"));
//        library.add(new Card("Good morning", "おはようございます"));
//        library.add(new Card("Goodbye", "またね"));
        
        library.printList();
        
        System.out.println(library.translate("またね"));
        System.out.println(library.amountOfEntries());
        
        SwingUtilities.invokeLater(new UserInterface(library));
    }
    
}
